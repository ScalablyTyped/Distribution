package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateValues extends StObject {
  
  var values: js.UndefOr[js.Array[Date]] = js.undefined
}
object DateValues {
  
  inline def apply(): DateValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateValues]
  }
  
  extension [Self <: DateValues](x: Self) {
    
    inline def setValues(value: js.Array[Date]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: Date*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
