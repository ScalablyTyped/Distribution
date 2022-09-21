package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimestampValues extends StObject {
  
  var values: js.UndefOr[js.Array[String]] = js.undefined
}
object TimestampValues {
  
  inline def apply(): TimestampValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimestampValues]
  }
  
  extension [Self <: TimestampValues](x: Self) {
    
    inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
