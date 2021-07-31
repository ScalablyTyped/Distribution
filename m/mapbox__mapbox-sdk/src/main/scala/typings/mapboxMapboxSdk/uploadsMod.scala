package typings.mapboxMapboxSdk

import typings.mapboxMapboxSdk.anon.MapId
import typings.mapboxMapboxSdk.anon.Reverse
import typings.mapboxMapboxSdk.anon.UploadId
import typings.mapboxMapboxSdk.mapiRequestMod.MapiRequest
import typings.mapboxMapboxSdk.mod.SdkConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uploadsMod {
  
  @JSImport("@mapbox/mapbox-sdk/services/uploads", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(config: SdkConfig): UploadsService = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(config.asInstanceOf[js.Any]).asInstanceOf[UploadsService]
  @scala.inline
  def default(config: typings.mapboxMapboxSdk.mod.default): UploadsService = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(config.asInstanceOf[js.Any]).asInstanceOf[UploadsService]
  
  trait S3Credentials extends StObject {
    
    var accessKeyId: String
    
    var bucket: String
    
    var key: String
    
    var secretAccessKey: String
    
    var sessionToken: String
    
    var url: String
  }
  object S3Credentials {
    
    @scala.inline
    def apply(
      accessKeyId: String,
      bucket: String,
      key: String,
      secretAccessKey: String,
      sessionToken: String,
      url: String
    ): S3Credentials = {
      val __obj = js.Dynamic.literal(accessKeyId = accessKeyId.asInstanceOf[js.Any], bucket = bucket.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], secretAccessKey = secretAccessKey.asInstanceOf[js.Any], sessionToken = sessionToken.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[S3Credentials]
    }
    
    @scala.inline
    implicit class S3CredentialsMutableBuilder[Self <: S3Credentials] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessKeyId(value: String): Self = StObject.set(x, "accessKeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBucket(value: String): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecretAccessKey(value: String): Self = StObject.set(x, "secretAccessKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionToken(value: String): Self = StObject.set(x, "sessionToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait UploadResponse extends StObject {
    
    var complete: Boolean
    
    var created: String
    
    var error: js.UndefOr[js.Any] = js.undefined
    
    var id: String
    
    var modified: String
    
    var name: String
    
    var owner: String
    
    var progress: Double
    
    var tileset: String
  }
  object UploadResponse {
    
    @scala.inline
    def apply(
      complete: Boolean,
      created: String,
      id: String,
      modified: String,
      name: String,
      owner: String,
      progress: Double,
      tileset: String
    ): UploadResponse = {
      val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], tileset = tileset.asInstanceOf[js.Any])
      __obj.asInstanceOf[UploadResponse]
    }
    
    @scala.inline
    implicit class UploadResponseMutableBuilder[Self <: UploadResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComplete(value: Boolean): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setError(value: js.Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModified(value: String): Self = StObject.set(x, "modified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTileset(value: String): Self = StObject.set(x, "tileset", value.asInstanceOf[js.Any])
    }
  }
  
  trait UploadsService extends StObject {
    
    /**
      * Create an upload.
      * @param config
      */
    def createUpload(config: MapId): MapiRequest
    
    /**
      * Create S3 credentials.
      */
    def createUploadCredentials(): MapiRequest
    
    /**
      * Delete an upload.
      * @param config
      */
    // implicit any
    def deleteUpload(config: UploadId): js.Any
    
    /**
      * Get an upload's status.
      * @param config
      */
    // implicit any
    def getUpload(config: UploadId): js.Any
    
    /**
      * List the statuses of all recent uploads.
      * @param config
      */
    def listUploads(config: Reverse): MapiRequest
  }
  object UploadsService {
    
    @scala.inline
    def apply(
      createUpload: MapId => MapiRequest,
      createUploadCredentials: () => MapiRequest,
      deleteUpload: UploadId => js.Any,
      getUpload: UploadId => js.Any,
      listUploads: Reverse => MapiRequest
    ): UploadsService = {
      val __obj = js.Dynamic.literal(createUpload = js.Any.fromFunction1(createUpload), createUploadCredentials = js.Any.fromFunction0(createUploadCredentials), deleteUpload = js.Any.fromFunction1(deleteUpload), getUpload = js.Any.fromFunction1(getUpload), listUploads = js.Any.fromFunction1(listUploads))
      __obj.asInstanceOf[UploadsService]
    }
    
    @scala.inline
    implicit class UploadsServiceMutableBuilder[Self <: UploadsService] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreateUpload(value: MapId => MapiRequest): Self = StObject.set(x, "createUpload", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCreateUploadCredentials(value: () => MapiRequest): Self = StObject.set(x, "createUploadCredentials", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDeleteUpload(value: UploadId => js.Any): Self = StObject.set(x, "deleteUpload", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetUpload(value: UploadId => js.Any): Self = StObject.set(x, "getUpload", js.Any.fromFunction1(value))
      
      @scala.inline
      def setListUploads(value: Reverse => MapiRequest): Self = StObject.set(x, "listUploads", js.Any.fromFunction1(value))
    }
  }
}
