package typings.googleapis.v2betaMod.deploymentmanagerV2beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for how to validate and process properties on a resource.
  */
@js.native
trait SchemaValidationOptions extends js.Object {
  
  /**
    * Customize how deployment manager will validate the resource against
    * schema errors.
    */
  var schemaValidation: js.UndefOr[String] = js.native
  
  /**
    * Specify what to do with extra properties when executing a request.
    */
  var undeclaredProperties: js.UndefOr[String] = js.native
}
object SchemaValidationOptions {
  
  @scala.inline
  def apply(): SchemaValidationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaValidationOptions]
  }
  
  @scala.inline
  implicit class SchemaValidationOptionsOps[Self <: SchemaValidationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSchemaValidation(value: String): Self = this.set("schemaValidation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchemaValidation: Self = this.set("schemaValidation", js.undefined)
    
    @scala.inline
    def setUndeclaredProperties(value: String): Self = this.set("undeclaredProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUndeclaredProperties: Self = this.set("undeclaredProperties", js.undefined)
  }
}
