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
  
  @scala.inline
  def apply(): SchemaValidationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaValidationOptions]
  }
  
  @scala.inline
  implicit class SchemaValidationOptionsMutableBuilder[Self <: SchemaValidationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSchemaValidation(value: String): Self = StObject.set(x, "schemaValidation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaValidationUndefined: Self = StObject.set(x, "schemaValidation", js.undefined)
    
    @scala.inline
    def setUndeclaredProperties(value: String): Self = StObject.set(x, "undeclaredProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUndeclaredPropertiesUndefined: Self = StObject.set(x, "undeclaredProperties", js.undefined)
  }
}
