package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateValues extends StObject {
  
  var values: js.UndefOr[js.Array[Date]] = js.native
}
object DateValues {
  
  @scala.inline
  def apply(): DateValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateValues]
  }
  
  @scala.inline
  implicit class DateValuesMutableBuilder[Self <: DateValues] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValues(value: js.Array[Date]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: Date*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
