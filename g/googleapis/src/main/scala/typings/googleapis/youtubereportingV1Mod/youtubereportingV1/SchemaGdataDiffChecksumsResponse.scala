package typings.googleapis.youtubereportingV1Mod.youtubereportingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * gdata
  */
trait SchemaGdataDiffChecksumsResponse extends StObject {
  
  /**
    * gdata
    */
  var checksumsLocation: js.UndefOr[SchemaGdataCompositeMedia] = js.undefined
  
  /**
    * gdata
    */
  var chunkSizeBytes: js.UndefOr[String] = js.undefined
  
  /**
    * gdata
    */
  var objectLocation: js.UndefOr[SchemaGdataCompositeMedia] = js.undefined
  
  /**
    * gdata
    */
  var objectSizeBytes: js.UndefOr[String] = js.undefined
  
  /**
    * gdata
    */
  var objectVersion: js.UndefOr[String] = js.undefined
}
object SchemaGdataDiffChecksumsResponse {
  
  inline def apply(): SchemaGdataDiffChecksumsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGdataDiffChecksumsResponse]
  }
  
  extension [Self <: SchemaGdataDiffChecksumsResponse](x: Self) {
    
    inline def setChecksumsLocation(value: SchemaGdataCompositeMedia): Self = StObject.set(x, "checksumsLocation", value.asInstanceOf[js.Any])
    
    inline def setChecksumsLocationUndefined: Self = StObject.set(x, "checksumsLocation", js.undefined)
    
    inline def setChunkSizeBytes(value: String): Self = StObject.set(x, "chunkSizeBytes", value.asInstanceOf[js.Any])
    
    inline def setChunkSizeBytesUndefined: Self = StObject.set(x, "chunkSizeBytes", js.undefined)
    
    inline def setObjectLocation(value: SchemaGdataCompositeMedia): Self = StObject.set(x, "objectLocation", value.asInstanceOf[js.Any])
    
    inline def setObjectLocationUndefined: Self = StObject.set(x, "objectLocation", js.undefined)
    
    inline def setObjectSizeBytes(value: String): Self = StObject.set(x, "objectSizeBytes", value.asInstanceOf[js.Any])
    
    inline def setObjectSizeBytesUndefined: Self = StObject.set(x, "objectSizeBytes", js.undefined)
    
    inline def setObjectVersion(value: String): Self = StObject.set(x, "objectVersion", value.asInstanceOf[js.Any])
    
    inline def setObjectVersionUndefined: Self = StObject.set(x, "objectVersion", js.undefined)
  }
}
