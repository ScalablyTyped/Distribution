package typings.googleapis.cloudsupportV2betaMod.cloudsupportV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDiffUploadResponse extends StObject {
  
  /**
    * # gdata.* are outside protos with mising documentation
    */
  var objectVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * # gdata.* are outside protos with mising documentation
    */
  var originalObject: js.UndefOr[SchemaCompositeMedia] = js.undefined
}
object SchemaDiffUploadResponse {
  
  inline def apply(): SchemaDiffUploadResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDiffUploadResponse]
  }
  
  extension [Self <: SchemaDiffUploadResponse](x: Self) {
    
    inline def setObjectVersion(value: String): Self = StObject.set(x, "objectVersion", value.asInstanceOf[js.Any])
    
    inline def setObjectVersionNull: Self = StObject.set(x, "objectVersion", null)
    
    inline def setObjectVersionUndefined: Self = StObject.set(x, "objectVersion", js.undefined)
    
    inline def setOriginalObject(value: SchemaCompositeMedia): Self = StObject.set(x, "originalObject", value.asInstanceOf[js.Any])
    
    inline def setOriginalObjectUndefined: Self = StObject.set(x, "originalObject", js.undefined)
  }
}
