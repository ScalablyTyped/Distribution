package typings.maximMazurokGapiClientDatastore.gapi.client.datastore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrayValue extends StObject {
  
  /** Values in the array. The order of values in an array is preserved as long as all values have identical settings for 'exclude_from_indexes'. */
  var values: js.UndefOr[js.Array[Value]] = js.undefined
}
object ArrayValue {
  
  inline def apply(): ArrayValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArrayValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArrayValue] (val x: Self) extends AnyVal {
    
    inline def setValues(value: js.Array[Value]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: Value*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
