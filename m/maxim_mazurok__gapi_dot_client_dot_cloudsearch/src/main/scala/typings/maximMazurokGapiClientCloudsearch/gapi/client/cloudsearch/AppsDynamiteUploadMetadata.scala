package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteUploadMetadata extends StObject {
  
  /** Opaque token. Clients shall simply pass it back to the Backend. This field will NOT be saved into storage. */
  var attachmentToken: js.UndefOr[String] = js.undefined
  
  /** Information about the uploaded attachment that is only used in Backend. This field will NOT be sent out of Google. */
  var backendUploadMetadata: js.UndefOr[AppsDynamiteSharedBackendUploadMetadata] = js.undefined
  
  /**
    * The "new" secure identifier for Drive files. Should be used instead of the deprecated string drive_id field above. This should only be set if the upload file has been added to
    * Drive. Note that older Drive files that do not have a ResourceKey should still use this field, with the resource_key field unset.
    */
  var clonedAuthorizedItemId: js.UndefOr[AuthorizedItemId] = js.undefined
  
  /**
    * DriveAction for organizing the cloned version of this upload in Drive, if the file has been added to Drive. This field is not set if the file has not been added to Drive.
    * Additionally, this field is only set when part of a FileResult in a ListFilesResponse.
    */
  var clonedDriveAction: js.UndefOr[String] = js.undefined
  
  /** Reference to a Drive ID, if this upload file has been previously cloned to Drive. Note: this is deprecated in favor of the AuthorizedItemId below. */
  var clonedDriveId: js.UndefOr[String] = js.undefined
  
  /** The original file name for the content, not the full path. */
  var contentName: js.UndefOr[String] = js.undefined
  
  /** Type is from Scotty's best_guess by default: http://google3/uploader/agent/scotty_agent.proto?l=51&rcl=140889785 */
  var contentType: js.UndefOr[String] = js.undefined
  
  /** The metrics metadata of the Data Loss Prevention attachment scan. */
  var dlpMetricsMetadata: js.UndefOr[AppsDynamiteSharedDlpMetricsMetadata] = js.undefined
  
  /** A copy of the LocalId in Annotation. This field is supposed to be filled by server only. */
  var localId: js.UndefOr[String] = js.undefined
  
  /** Original dimension of the content. Only set for image attachments. */
  var originalDimension: js.UndefOr[AppsDynamiteSharedDimension] = js.undefined
  
  /** Reference to a transcoded video attachment. Only set for video attachments. */
  var videoReference: js.UndefOr[AppsDynamiteSharedVideoReference] = js.undefined
  
  /** Result for a virus scan. It's duplicated in the above field apps.dynamite.shared.BackendUploadMetadata */
  var virusScanResult: js.UndefOr[String] = js.undefined
}
object AppsDynamiteUploadMetadata {
  
  inline def apply(): AppsDynamiteUploadMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteUploadMetadata]
  }
  
  extension [Self <: AppsDynamiteUploadMetadata](x: Self) {
    
    inline def setAttachmentToken(value: String): Self = StObject.set(x, "attachmentToken", value.asInstanceOf[js.Any])
    
    inline def setAttachmentTokenUndefined: Self = StObject.set(x, "attachmentToken", js.undefined)
    
    inline def setBackendUploadMetadata(value: AppsDynamiteSharedBackendUploadMetadata): Self = StObject.set(x, "backendUploadMetadata", value.asInstanceOf[js.Any])
    
    inline def setBackendUploadMetadataUndefined: Self = StObject.set(x, "backendUploadMetadata", js.undefined)
    
    inline def setClonedAuthorizedItemId(value: AuthorizedItemId): Self = StObject.set(x, "clonedAuthorizedItemId", value.asInstanceOf[js.Any])
    
    inline def setClonedAuthorizedItemIdUndefined: Self = StObject.set(x, "clonedAuthorizedItemId", js.undefined)
    
    inline def setClonedDriveAction(value: String): Self = StObject.set(x, "clonedDriveAction", value.asInstanceOf[js.Any])
    
    inline def setClonedDriveActionUndefined: Self = StObject.set(x, "clonedDriveAction", js.undefined)
    
    inline def setClonedDriveId(value: String): Self = StObject.set(x, "clonedDriveId", value.asInstanceOf[js.Any])
    
    inline def setClonedDriveIdUndefined: Self = StObject.set(x, "clonedDriveId", js.undefined)
    
    inline def setContentName(value: String): Self = StObject.set(x, "contentName", value.asInstanceOf[js.Any])
    
    inline def setContentNameUndefined: Self = StObject.set(x, "contentName", js.undefined)
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setDlpMetricsMetadata(value: AppsDynamiteSharedDlpMetricsMetadata): Self = StObject.set(x, "dlpMetricsMetadata", value.asInstanceOf[js.Any])
    
    inline def setDlpMetricsMetadataUndefined: Self = StObject.set(x, "dlpMetricsMetadata", js.undefined)
    
    inline def setLocalId(value: String): Self = StObject.set(x, "localId", value.asInstanceOf[js.Any])
    
    inline def setLocalIdUndefined: Self = StObject.set(x, "localId", js.undefined)
    
    inline def setOriginalDimension(value: AppsDynamiteSharedDimension): Self = StObject.set(x, "originalDimension", value.asInstanceOf[js.Any])
    
    inline def setOriginalDimensionUndefined: Self = StObject.set(x, "originalDimension", js.undefined)
    
    inline def setVideoReference(value: AppsDynamiteSharedVideoReference): Self = StObject.set(x, "videoReference", value.asInstanceOf[js.Any])
    
    inline def setVideoReferenceUndefined: Self = StObject.set(x, "videoReference", js.undefined)
    
    inline def setVirusScanResult(value: String): Self = StObject.set(x, "virusScanResult", value.asInstanceOf[js.Any])
    
    inline def setVirusScanResultUndefined: Self = StObject.set(x, "virusScanResult", js.undefined)
  }
}
