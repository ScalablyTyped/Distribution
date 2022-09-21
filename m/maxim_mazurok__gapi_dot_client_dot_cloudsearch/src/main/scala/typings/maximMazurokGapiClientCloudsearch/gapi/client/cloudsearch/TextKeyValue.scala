package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextKeyValue extends StObject {
  
  var key: js.UndefOr[String] = js.undefined
  
  var onClick: js.UndefOr[OnClick] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
}
object TextKeyValue {
  
  inline def apply(): TextKeyValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextKeyValue]
  }
  
  extension [Self <: TextKeyValue](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setOnClick(value: OnClick): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
