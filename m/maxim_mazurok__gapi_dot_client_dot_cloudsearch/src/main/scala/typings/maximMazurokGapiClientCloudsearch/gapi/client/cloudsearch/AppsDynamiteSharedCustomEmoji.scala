package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteSharedCustomEmoji extends StObject {
  
  /** ID for the underlying image data in Blobstore. This field should *only* be present in Spanner or within the server, but should not be exposed in public APIs. */
  var blobId: js.UndefOr[String] = js.undefined
  
  /** Content type of the file used to upload the emoji. Used for takeout. Written to Spanner when the emoji is created. */
  var contentType: js.UndefOr[String] = js.undefined
  
  /** Time when the Emoji was created, in microseconds. This field may be present in Spanner, within the server, or in public APIs. */
  var createTimeMicros: js.UndefOr[String] = js.undefined
  
  /** This field should *never* be persisted to Spanner. */
  var creatorUserId: js.UndefOr[AppsDynamiteUserId] = js.undefined
  
  /** Time when the emoji was deleted, in microseconds. This field may be present in Spanner, within the server, or in public APIs. Only present if the emoji has been deleted. */
  var deleteTimeMicros: js.UndefOr[String] = js.undefined
  
  /** Output only. A short-lived URL clients can use for directly accessing a custom emoji image. This field is intended for API consumption, and should *never* be persisted to Spanner. */
  var ephemeralUrl: js.UndefOr[String] = js.undefined
  
  /** This field should *never* be persisted to Spanner. */
  var ownerCustomerId: js.UndefOr[AppsDynamiteCustomerId] = js.undefined
  
  /**
    * Opaque token that clients use to construct the URL for accessing the custom emoji’s image data. This field is intended for API consumption, and should *never* be persisted to
    * Spanner.
    */
  var readToken: js.UndefOr[String] = js.undefined
  
  /**
    * User-provided, human-readable ID for the custom emoji. Users are expected to observe this field in the UI instead of the UUID. This shortcode should be unique within an
    * organization, but has no global uniqueness guarantees, unlike the UUID. This field should *never* be persisted to Spanner.
    */
  var shortcode: js.UndefOr[String] = js.undefined
  
  /** Snapshot of the current state of the emoji, which may differ from the source-of-truth in the CustomEmojis table. This field should *never* be persisted to Spanner. */
  var state: js.UndefOr[String] = js.undefined
  
  var updateTimeMicros: js.UndefOr[String] = js.undefined
  
  /** Unique key for a custom emoji resource. Required. This field is *always* populated. */
  var uuid: js.UndefOr[String] = js.undefined
}
object AppsDynamiteSharedCustomEmoji {
  
  inline def apply(): AppsDynamiteSharedCustomEmoji = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteSharedCustomEmoji]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppsDynamiteSharedCustomEmoji] (val x: Self) extends AnyVal {
    
    inline def setBlobId(value: String): Self = StObject.set(x, "blobId", value.asInstanceOf[js.Any])
    
    inline def setBlobIdUndefined: Self = StObject.set(x, "blobId", js.undefined)
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setCreateTimeMicros(value: String): Self = StObject.set(x, "createTimeMicros", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeMicrosUndefined: Self = StObject.set(x, "createTimeMicros", js.undefined)
    
    inline def setCreatorUserId(value: AppsDynamiteUserId): Self = StObject.set(x, "creatorUserId", value.asInstanceOf[js.Any])
    
    inline def setCreatorUserIdUndefined: Self = StObject.set(x, "creatorUserId", js.undefined)
    
    inline def setDeleteTimeMicros(value: String): Self = StObject.set(x, "deleteTimeMicros", value.asInstanceOf[js.Any])
    
    inline def setDeleteTimeMicrosUndefined: Self = StObject.set(x, "deleteTimeMicros", js.undefined)
    
    inline def setEphemeralUrl(value: String): Self = StObject.set(x, "ephemeralUrl", value.asInstanceOf[js.Any])
    
    inline def setEphemeralUrlUndefined: Self = StObject.set(x, "ephemeralUrl", js.undefined)
    
    inline def setOwnerCustomerId(value: AppsDynamiteCustomerId): Self = StObject.set(x, "ownerCustomerId", value.asInstanceOf[js.Any])
    
    inline def setOwnerCustomerIdUndefined: Self = StObject.set(x, "ownerCustomerId", js.undefined)
    
    inline def setReadToken(value: String): Self = StObject.set(x, "readToken", value.asInstanceOf[js.Any])
    
    inline def setReadTokenUndefined: Self = StObject.set(x, "readToken", js.undefined)
    
    inline def setShortcode(value: String): Self = StObject.set(x, "shortcode", value.asInstanceOf[js.Any])
    
    inline def setShortcodeUndefined: Self = StObject.set(x, "shortcode", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setUpdateTimeMicros(value: String): Self = StObject.set(x, "updateTimeMicros", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeMicrosUndefined: Self = StObject.set(x, "updateTimeMicros", js.undefined)
    
    inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    
    inline def setUuidUndefined: Self = StObject.set(x, "uuid", js.undefined)
  }
}
