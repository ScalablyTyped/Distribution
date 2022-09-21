package typings.googleapis.runV1beta1Mod.runV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCustomResourceValidation extends StObject {
  
  /**
    * OpenAPIV3Schema is the OpenAPI v3 schema to be validated against. +optional
    */
  var openAPIV3Schema: js.UndefOr[SchemaJSONSchemaProps] = js.undefined
}
object SchemaCustomResourceValidation {
  
  inline def apply(): SchemaCustomResourceValidation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomResourceValidation]
  }
  
  extension [Self <: SchemaCustomResourceValidation](x: Self) {
    
    inline def setOpenAPIV3Schema(value: SchemaJSONSchemaProps): Self = StObject.set(x, "openAPIV3Schema", value.asInstanceOf[js.Any])
    
    inline def setOpenAPIV3SchemaUndefined: Self = StObject.set(x, "openAPIV3Schema", js.undefined)
  }
}
