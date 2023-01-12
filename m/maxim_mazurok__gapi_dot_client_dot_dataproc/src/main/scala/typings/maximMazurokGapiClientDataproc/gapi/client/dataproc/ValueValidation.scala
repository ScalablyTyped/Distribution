package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueValidation extends StObject {
  
  /** Required. List of allowed values for the parameter. */
  var values: js.UndefOr[js.Array[String]] = js.undefined
}
object ValueValidation {
  
  inline def apply(): ValueValidation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValueValidation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValueValidation] (val x: Self) extends AnyVal {
    
    inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
