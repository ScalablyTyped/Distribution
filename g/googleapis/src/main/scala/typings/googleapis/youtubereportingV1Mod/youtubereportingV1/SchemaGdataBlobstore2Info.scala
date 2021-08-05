package typings.googleapis.youtubereportingV1Mod.youtubereportingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * gdata
  */
trait SchemaGdataBlobstore2Info extends StObject {
  
  /**
    * gdata
    */
  var blobGeneration: js.UndefOr[String] = js.undefined
  
  /**
    * gdata
    */
  var blobId: js.UndefOr[String] = js.undefined
  
  /**
    * gdata
    */
  var downloadReadHandle: js.UndefOr[String] = js.undefined
  
  /**
    * gdata
    */
  var readToken: js.UndefOr[String] = js.undefined
  
  /**
    * gdata
    */
  var uploadMetadataContainer: js.UndefOr[String] = js.undefined
}
object SchemaGdataBlobstore2Info {
  
  inline def apply(): SchemaGdataBlobstore2Info = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGdataBlobstore2Info]
  }
  
  extension [Self <: SchemaGdataBlobstore2Info](x: Self) {
    
    inline def setBlobGeneration(value: String): Self = StObject.set(x, "blobGeneration", value.asInstanceOf[js.Any])
    
    inline def setBlobGenerationUndefined: Self = StObject.set(x, "blobGeneration", js.undefined)
    
    inline def setBlobId(value: String): Self = StObject.set(x, "blobId", value.asInstanceOf[js.Any])
    
    inline def setBlobIdUndefined: Self = StObject.set(x, "blobId", js.undefined)
    
    inline def setDownloadReadHandle(value: String): Self = StObject.set(x, "downloadReadHandle", value.asInstanceOf[js.Any])
    
    inline def setDownloadReadHandleUndefined: Self = StObject.set(x, "downloadReadHandle", js.undefined)
    
    inline def setReadToken(value: String): Self = StObject.set(x, "readToken", value.asInstanceOf[js.Any])
    
    inline def setReadTokenUndefined: Self = StObject.set(x, "readToken", js.undefined)
    
    inline def setUploadMetadataContainer(value: String): Self = StObject.set(x, "uploadMetadataContainer", value.asInstanceOf[js.Any])
    
    inline def setUploadMetadataContainerUndefined: Self = StObject.set(x, "uploadMetadataContainer", js.undefined)
  }
}
