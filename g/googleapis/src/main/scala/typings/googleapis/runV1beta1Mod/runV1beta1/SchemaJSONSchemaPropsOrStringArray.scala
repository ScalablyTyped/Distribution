package typings.googleapis.runV1beta1Mod.runV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaJSONSchemaPropsOrStringArray extends StObject {
  
  var property: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  var schema: js.UndefOr[SchemaJSONSchemaProps] = js.undefined
}
object SchemaJSONSchemaPropsOrStringArray {
  
  inline def apply(): SchemaJSONSchemaPropsOrStringArray = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJSONSchemaPropsOrStringArray]
  }
  
  extension [Self <: SchemaJSONSchemaPropsOrStringArray](x: Self) {
    
    inline def setProperty(value: js.Array[String]): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setPropertyNull: Self = StObject.set(x, "property", null)
    
    inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    
    inline def setPropertyVarargs(value: String*): Self = StObject.set(x, "property", js.Array(value*))
    
    inline def setSchema(value: SchemaJSONSchemaProps): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}
