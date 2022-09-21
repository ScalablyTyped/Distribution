package typings.googleapis.runV1beta1Mod.runV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaJSONSchemaPropsOrBool extends StObject {
  
  var allows: js.UndefOr[Boolean | Null] = js.undefined
  
  var schema: js.UndefOr[SchemaJSONSchemaProps] = js.undefined
}
object SchemaJSONSchemaPropsOrBool {
  
  inline def apply(): SchemaJSONSchemaPropsOrBool = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJSONSchemaPropsOrBool]
  }
  
  extension [Self <: SchemaJSONSchemaPropsOrBool](x: Self) {
    
    inline def setAllows(value: Boolean): Self = StObject.set(x, "allows", value.asInstanceOf[js.Any])
    
    inline def setAllowsNull: Self = StObject.set(x, "allows", null)
    
    inline def setAllowsUndefined: Self = StObject.set(x, "allows", js.undefined)
    
    inline def setSchema(value: SchemaJSONSchemaProps): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}
