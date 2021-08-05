package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParameterValidation extends StObject {
  
  /** Validation based on regular expressions. */
  var regex: js.UndefOr[RegexValidation] = js.undefined
  
  /** Validation based on a list of allowed values. */
  var values: js.UndefOr[ValueValidation] = js.undefined
}
object ParameterValidation {
  
  inline def apply(): ParameterValidation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParameterValidation]
  }
  
  extension [Self <: ParameterValidation](x: Self) {
    
    inline def setRegex(value: RegexValidation): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
    
    inline def setRegexUndefined: Self = StObject.set(x, "regex", js.undefined)
    
    inline def setValues(value: ValueValidation): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
  }
}
