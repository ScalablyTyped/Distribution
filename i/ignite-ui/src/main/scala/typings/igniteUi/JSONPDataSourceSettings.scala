package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSONPDataSourceSettings
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[Any] {
  
  /**
    * Override the callback function name in a jsonp request. Sets option jsonp in $.ajax functionbool Setting the jsonp option to false prevents jQuery from adding the "?callback" string to the URL or attempting to use "=?" for transformation
    *
    */
  var jsonp: js.UndefOr[String | Boolean] = js.undefined
  
  /**
    * Specify the callback function name for a JSONP request. Sets option jsonpCallback in $.ajax function
    */
  var jsonpCallback: js.UndefOr[String | js.Function] = js.undefined
  
  /**
    * Type of the data source.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object JSONPDataSourceSettings {
  
  inline def apply(): JSONPDataSourceSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JSONPDataSourceSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JSONPDataSourceSettings] (val x: Self) extends AnyVal {
    
    inline def setJsonp(value: String | Boolean): Self = StObject.set(x, "jsonp", value.asInstanceOf[js.Any])
    
    inline def setJsonpCallback(value: String | js.Function): Self = StObject.set(x, "jsonpCallback", value.asInstanceOf[js.Any])
    
    inline def setJsonpCallbackUndefined: Self = StObject.set(x, "jsonpCallback", js.undefined)
    
    inline def setJsonpUndefined: Self = StObject.set(x, "jsonp", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
