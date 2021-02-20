package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParameterValidation extends StObject {
  
  /** Validation based on regular expressions. */
  var regex: js.UndefOr[RegexValidation] = js.native
  
  /** Validation based on a list of allowed values. */
  var values: js.UndefOr[ValueValidation] = js.native
}
object ParameterValidation {
  
  @scala.inline
  def apply(): ParameterValidation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParameterValidation]
  }
  
  @scala.inline
  implicit class ParameterValidationMutableBuilder[Self <: ParameterValidation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRegex(value: RegexValidation): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegexUndefined: Self = StObject.set(x, "regex", js.undefined)
    
    @scala.inline
    def setValues(value: ValueValidation): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
  }
}
