package typings.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for how to validate and process properties on a resource.
  */
trait SchemaValidationOptions extends StObject {
  
  /**
    * Customize how deployment manager will validate the resource against
    * schema errors.
    */
  var schemaValidation: js.UndefOr[String] = js.undefined
  
  /**
    * Specify what to do with extra properties when executing a request.
    */
  var undeclaredProperties: js.UndefOr[String] = js.undefined
}
object SchemaValidationOptions {
  
  inline def apply(): SchemaValidationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaValidationOptions]
  }
  
  extension [Self <: SchemaValidationOptions](x: Self) {
    
    inline def setSchemaValidation(value: String): Self = StObject.set(x, "schemaValidation", value.asInstanceOf[js.Any])
    
    inline def setSchemaValidationUndefined: Self = StObject.set(x, "schemaValidation", js.undefined)
    
    inline def setUndeclaredProperties(value: String): Self = StObject.set(x, "undeclaredProperties", value.asInstanceOf[js.Any])
    
    inline def setUndeclaredPropertiesUndefined: Self = StObject.set(x, "undeclaredProperties", js.undefined)
  }
}
