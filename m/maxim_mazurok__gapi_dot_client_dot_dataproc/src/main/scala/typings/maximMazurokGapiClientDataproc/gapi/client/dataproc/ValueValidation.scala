package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueValidation extends StObject {
  
  /** Required. List of allowed values for the parameter. */
  var values: js.UndefOr[js.Array[String]] = js.undefined
}
object ValueValidation {
  
  @scala.inline
  def apply(): ValueValidation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValueValidation]
  }
  
  @scala.inline
  implicit class ValueValidationMutableBuilder[Self <: ValueValidation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
