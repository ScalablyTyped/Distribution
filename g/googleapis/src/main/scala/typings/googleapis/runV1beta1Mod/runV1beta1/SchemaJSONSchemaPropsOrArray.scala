package typings.googleapis.runV1beta1Mod.runV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaJSONSchemaPropsOrArray extends StObject {
  
  var jsonSchemas: js.UndefOr[js.Array[SchemaJSONSchemaProps]] = js.undefined
  
  var schema: js.UndefOr[SchemaJSONSchemaProps] = js.undefined
}
object SchemaJSONSchemaPropsOrArray {
  
  inline def apply(): SchemaJSONSchemaPropsOrArray = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJSONSchemaPropsOrArray]
  }
  
  extension [Self <: SchemaJSONSchemaPropsOrArray](x: Self) {
    
    inline def setJsonSchemas(value: js.Array[SchemaJSONSchemaProps]): Self = StObject.set(x, "jsonSchemas", value.asInstanceOf[js.Any])
    
    inline def setJsonSchemasUndefined: Self = StObject.set(x, "jsonSchemas", js.undefined)
    
    inline def setJsonSchemasVarargs(value: SchemaJSONSchemaProps*): Self = StObject.set(x, "jsonSchemas", js.Array(value*))
    
    inline def setSchema(value: SchemaJSONSchemaProps): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}
