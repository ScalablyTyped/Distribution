package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValues extends StObject {
  
  /** The maximum allowable length for string values is 32 characters. */
  var values: js.UndefOr[js.Array[String]] = js.undefined
}
object EnumValues {
  
  @scala.inline
  def apply(): EnumValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnumValues]
  }
  
  @scala.inline
  implicit class EnumValuesMutableBuilder[Self <: EnumValues] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
