package typings.googleapis.cloudsupportV2betaMod.cloudsupportV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDiffUploadRequest extends StObject {
  
  /**
    * # gdata.* are outside protos with mising documentation
    */
  var checksumsInfo: js.UndefOr[SchemaCompositeMedia] = js.undefined
  
  /**
    * # gdata.* are outside protos with mising documentation
    */
  var objectInfo: js.UndefOr[SchemaCompositeMedia] = js.undefined
  
  /**
    * # gdata.* are outside protos with mising documentation
    */
  var objectVersion: js.UndefOr[String | Null] = js.undefined
}
object SchemaDiffUploadRequest {
  
  inline def apply(): SchemaDiffUploadRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDiffUploadRequest]
  }
  
  extension [Self <: SchemaDiffUploadRequest](x: Self) {
    
    inline def setChecksumsInfo(value: SchemaCompositeMedia): Self = StObject.set(x, "checksumsInfo", value.asInstanceOf[js.Any])
    
    inline def setChecksumsInfoUndefined: Self = StObject.set(x, "checksumsInfo", js.undefined)
    
    inline def setObjectInfo(value: SchemaCompositeMedia): Self = StObject.set(x, "objectInfo", value.asInstanceOf[js.Any])
    
    inline def setObjectInfoUndefined: Self = StObject.set(x, "objectInfo", js.undefined)
    
    inline def setObjectVersion(value: String): Self = StObject.set(x, "objectVersion", value.asInstanceOf[js.Any])
    
    inline def setObjectVersionNull: Self = StObject.set(x, "objectVersion", null)
    
    inline def setObjectVersionUndefined: Self = StObject.set(x, "objectVersion", js.undefined)
  }
}
