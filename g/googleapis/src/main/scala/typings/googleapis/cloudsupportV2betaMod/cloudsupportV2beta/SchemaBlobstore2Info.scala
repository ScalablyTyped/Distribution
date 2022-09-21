package typings.googleapis.cloudsupportV2betaMod.cloudsupportV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBlobstore2Info extends StObject {
  
  /**
    * # gdata.* are outside protos with mising documentation
    */
  var blobGeneration: js.UndefOr[String | Null] = js.undefined
  
  /**
    * # gdata.* are outside protos with mising documentation
    */
  var blobId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * # gdata.* are outside protos with mising documentation
    */
  var downloadReadHandle: js.UndefOr[String | Null] = js.undefined
  
  /**
    * # gdata.* are outside protos with mising documentation
    */
  var readToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * # gdata.* are outside protos with mising documentation
    */
  var uploadMetadataContainer: js.UndefOr[String | Null] = js.undefined
}
object SchemaBlobstore2Info {
  
  inline def apply(): SchemaBlobstore2Info = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBlobstore2Info]
  }
  
  extension [Self <: SchemaBlobstore2Info](x: Self) {
    
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
