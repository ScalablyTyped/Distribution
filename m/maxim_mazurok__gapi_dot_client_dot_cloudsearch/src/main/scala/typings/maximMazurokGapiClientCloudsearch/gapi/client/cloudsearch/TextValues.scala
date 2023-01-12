package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextValues extends StObject {
  
  /** The maximum allowable length for text values is 2048 characters. */
  var values: js.UndefOr[js.Array[String]] = js.undefined
}
object TextValues {
  
  inline def apply(): TextValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextValues]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextValues] (val x: Self) extends AnyVal {
    
    inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
