package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSchemaConfig extends StObject {
  
  /**
    * The depth for all recursive structures in the output analytics schema. For example, `concept` in the CodeSystem resource is a recursive structure; when the depth is 2, the CodeSystem table will have a column called `concept.concept` but not `concept.concept.concept`. If not specified or set to 0, the server will use the default value 2. The maximum depth allowed is 5.
    */
  var recursiveStructureDepth: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Specifies the output schema type. Schema type is required.
    */
  var schemaType: js.UndefOr[String | Null] = js.undefined
}
object SchemaSchemaConfig {
  
  inline def apply(): SchemaSchemaConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSchemaConfig]
  }
  
  extension [Self <: SchemaSchemaConfig](x: Self) {
    
    inline def setRecursiveStructureDepth(value: String): Self = StObject.set(x, "recursiveStructureDepth", value.asInstanceOf[js.Any])
    
    inline def setRecursiveStructureDepthNull: Self = StObject.set(x, "recursiveStructureDepth", null)
    
    inline def setRecursiveStructureDepthUndefined: Self = StObject.set(x, "recursiveStructureDepth", js.undefined)
    
    inline def setSchemaType(value: String): Self = StObject.set(x, "schemaType", value.asInstanceOf[js.Any])
    
    inline def setSchemaTypeNull: Self = StObject.set(x, "schemaType", null)
    
    inline def setSchemaTypeUndefined: Self = StObject.set(x, "schemaType", js.undefined)
  }
}
