package typings.googleapis.youtubereportingV1Mod.youtubereportingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGdataDiffUploadResponse extends StObject {
  
  /**
    * gdata
    */
  var objectVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * gdata
    */
  var originalObject: js.UndefOr[SchemaGdataCompositeMedia] = js.undefined
}
object SchemaGdataDiffUploadResponse {
  
  inline def apply(): SchemaGdataDiffUploadResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGdataDiffUploadResponse]
  }
  
  extension [Self <: SchemaGdataDiffUploadResponse](x: Self) {
    
    inline def setObjectVersion(value: String): Self = StObject.set(x, "objectVersion", value.asInstanceOf[js.Any])
    
    inline def setObjectVersionNull: Self = StObject.set(x, "objectVersion", null)
    
    inline def setObjectVersionUndefined: Self = StObject.set(x, "objectVersion", js.undefined)
    
    inline def setOriginalObject(value: SchemaGdataCompositeMedia): Self = StObject.set(x, "originalObject", value.asInstanceOf[js.Any])
    
    inline def setOriginalObjectUndefined: Self = StObject.set(x, "originalObject", js.undefined)
  }
}
