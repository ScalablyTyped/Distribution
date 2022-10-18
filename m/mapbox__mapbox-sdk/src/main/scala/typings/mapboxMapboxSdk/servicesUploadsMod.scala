package typings.mapboxMapboxSdk

import typings.mapboxMapboxSdk.anon.Reverse
import typings.mapboxMapboxSdk.anon.Tileset
import typings.mapboxMapboxSdk.anon.UploadId
import typings.mapboxMapboxSdk.libClassesMapiClientMod.SdkConfig
import typings.mapboxMapboxSdk.libClassesMapiRequestMod.MapiRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object servicesUploadsMod {
  
  @JSImport("@mapbox/mapbox-sdk/services/uploads", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(config: SdkConfig): UploadsService = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(config.asInstanceOf[js.Any]).asInstanceOf[UploadsService]
  inline def default(config: typings.mapboxMapboxSdk.libClassesMapiClientMod.default): UploadsService = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(config.asInstanceOf[js.Any]).asInstanceOf[UploadsService]
  
  trait S3Credentials extends StObject {
    
    var accessKeyId: String
    
    var bucket: String
    
    var key: String
    
    var secretAccessKey: String
    
    var sessionToken: String
    
    var url: String
  }
  object S3Credentials {
    
    inline def apply(
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
    
    extension [Self <: S3Credentials](x: Self) {
      
      inline def setAccessKeyId(value: String): Self = StObject.set(x, "accessKeyId", value.asInstanceOf[js.Any])
      
      inline def setBucket(value: String): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setSecretAccessKey(value: String): Self = StObject.set(x, "secretAccessKey", value.asInstanceOf[js.Any])
      
      inline def setSessionToken(value: String): Self = StObject.set(x, "sessionToken", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait UploadResponse extends StObject {
    
    var complete: Boolean
    
    var created: String
    
    var error: js.UndefOr[Any] = js.undefined
    
    var id: String
    
    var modified: String
    
    var name: String
    
    var owner: String
    
    var progress: Double
    
    var tileset: String
  }
  object UploadResponse {
    
    inline def apply(
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
    
    extension [Self <: UploadResponse](x: Self) {
      
      inline def setComplete(value: Boolean): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
      
      inline def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setModified(value: String): Self = StObject.set(x, "modified", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
      
      inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      inline def setTileset(value: String): Self = StObject.set(x, "tileset", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UploadsService extends StObject {
    
    /**
      * Create an upload.
      * @param config
      */
    def createUpload(config: Tileset): MapiRequest[Any] = js.native
    
    /**
      * Create S3 credentials.
      */
    def createUploadCredentials(): MapiRequest[Any] = js.native
    
    /**
      * Delete an upload.
      * @param config
      */
    // implicit any
    def deleteUpload(config: UploadId): Any = js.native
    
    /**
      * Get an upload's status.
      * @param config
      */
    // implicit any
    def getUpload(config: UploadId): Any = js.native
    
    /**
      * List the statuses of all recent uploads.
      * @param config
      */
    def listUploads(): MapiRequest[Any] = js.native
    def listUploads(config: Reverse): MapiRequest[Any] = js.native
  }
}
