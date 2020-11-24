package typings.googleapis.dataprocV1Mod.dataprocV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration for parameter validation.
  */
@js.native
trait SchemaParameterValidation extends js.Object {
  
  /**
    * Validation based on regular expressions.
    */
  var regex: js.UndefOr[SchemaRegexValidation] = js.native
  
  /**
    * Validation based on a list of allowed values.
    */
  var values: js.UndefOr[SchemaValueValidation] = js.native
}
object SchemaParameterValidation {
  
  @scala.inline
  def apply(): SchemaParameterValidation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaParameterValidation]
  }
  
  @scala.inline
  implicit class SchemaParameterValidationOps[Self <: SchemaParameterValidation] (val x: Self) extends AnyVal {
    
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
    def setRegex(value: SchemaRegexValidation): Self = this.set("regex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegex: Self = this.set("regex", js.undefined)
    
    @scala.inline
    def setValues(value: SchemaValueValidation): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
}
