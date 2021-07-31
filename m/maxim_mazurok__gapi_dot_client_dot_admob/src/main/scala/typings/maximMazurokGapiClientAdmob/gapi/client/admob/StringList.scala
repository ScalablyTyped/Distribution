package typings.maximMazurokGapiClientAdmob.gapi.client.admob

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StringList extends StObject {
  
  /** The string values. */
  var values: js.UndefOr[js.Array[String]] = js.undefined
}
object StringList {
  
  @scala.inline
  def apply(): StringList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StringList]
  }
  
  @scala.inline
  implicit class StringListMutableBuilder[Self <: StringList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
