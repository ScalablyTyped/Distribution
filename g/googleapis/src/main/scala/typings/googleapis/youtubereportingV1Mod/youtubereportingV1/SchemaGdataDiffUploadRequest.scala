package typings.googleapis.youtubereportingV1Mod.youtubereportingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGdataDiffUploadRequest extends StObject {
  
  /**
    * gdata
    */
  var checksumsInfo: js.UndefOr[SchemaGdataCompositeMedia] = js.undefined
  
  /**
    * gdata
    */
  var objectInfo: js.UndefOr[SchemaGdataCompositeMedia] = js.undefined
  
  /**
    * gdata
    */
  var objectVersion: js.UndefOr[String | Null] = js.undefined
}
object SchemaGdataDiffUploadRequest {
  
  inline def apply(): SchemaGdataDiffUploadRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGdataDiffUploadRequest]
  }
  
  extension [Self <: SchemaGdataDiffUploadRequest](x: Self) {
    
    inline def setChecksumsInfo(value: SchemaGdataCompositeMedia): Self = StObject.set(x, "checksumsInfo", value.asInstanceOf[js.Any])
    
    inline def setChecksumsInfoUndefined: Self = StObject.set(x, "checksumsInfo", js.undefined)
    
    inline def setObjectInfo(value: SchemaGdataCompositeMedia): Self = StObject.set(x, "objectInfo", value.asInstanceOf[js.Any])
    
    inline def setObjectInfoUndefined: Self = StObject.set(x, "objectInfo", js.undefined)
    
    inline def setObjectVersion(value: String): Self = StObject.set(x, "objectVersion", value.asInstanceOf[js.Any])
    
    inline def setObjectVersionNull: Self = StObject.set(x, "objectVersion", null)
    
    inline def setObjectVersionUndefined: Self = StObject.set(x, "objectVersion", js.undefined)
  }
}
