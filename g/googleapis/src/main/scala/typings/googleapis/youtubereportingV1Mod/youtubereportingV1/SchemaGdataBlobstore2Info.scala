package typings.googleapis.youtubereportingV1Mod.youtubereportingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGdataBlobstore2Info extends StObject {
  
  /**
    * gdata
    */
  var blobGeneration: js.UndefOr[String | Null] = js.undefined
  
  /**
    * gdata
    */
  var blobId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * gdata
    */
  var downloadReadHandle: js.UndefOr[String | Null] = js.undefined
  
  /**
    * gdata
    */
  var readToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * gdata
    */
  var uploadMetadataContainer: js.UndefOr[String | Null] = js.undefined
}
object SchemaGdataBlobstore2Info {
  
  inline def apply(): SchemaGdataBlobstore2Info = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGdataBlobstore2Info]
  }
  
  extension [Self <: SchemaGdataBlobstore2Info](x: Self) {
    
    inline def setBlobGeneration(value: String): Self = StObject.set(x, "blobGeneration", value.asInstanceOf[js.Any])
    
    inline def setBlobGenerationNull: Self = StObject.set(x, "blobGeneration", null)
    
    inline def setBlobGenerationUndefined: Self = StObject.set(x, "blobGeneration", js.undefined)
    
    inline def setBlobId(value: String): Self = StObject.set(x, "blobId", value.asInstanceOf[js.Any])
    
    inline def setBlobIdNull: Self = StObject.set(x, "blobId", null)
    
    inline def setBlobIdUndefined: Self = StObject.set(x, "blobId", js.undefined)
    
    inline def setDownloadReadHandle(value: String): Self = StObject.set(x, "downloadReadHandle", value.asInstanceOf[js.Any])
    
    inline def setDownloadReadHandleNull: Self = StObject.set(x, "downloadReadHandle", null)
    
    inline def setDownloadReadHandleUndefined: Self = StObject.set(x, "downloadReadHandle", js.undefined)
    
    inline def setReadToken(value: String): Self = StObject.set(x, "readToken", value.asInstanceOf[js.Any])
    
    inline def setReadTokenNull: Self = StObject.set(x, "readToken", null)
    
    inline def setReadTokenUndefined: Self = StObject.set(x, "readToken", js.undefined)
    
    inline def setUploadMetadataContainer(value: String): Self = StObject.set(x, "uploadMetadataContainer", value.asInstanceOf[js.Any])
    
    inline def setUploadMetadataContainerNull: Self = StObject.set(x, "uploadMetadataContainer", null)
    
    inline def setUploadMetadataContainerUndefined: Self = StObject.set(x, "uploadMetadataContainer", js.undefined)
  }
}
