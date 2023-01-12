package typings.maximMazurokGapiClientAdmob.gapi.client.admob

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StringList extends StObject {
  
  /** The string values. */
  var values: js.UndefOr[js.Array[String]] = js.undefined
}
object StringList {
  
  inline def apply(): StringList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StringList]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StringList] (val x: Self) extends AnyVal {
    
    inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
