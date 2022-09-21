package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FixedFooter extends StObject {
  
  var buttons: js.UndefOr[js.Array[Button]] = js.undefined
  
  var primaryButton: js.UndefOr[TextButton] = js.undefined
  
  var secondaryButton: js.UndefOr[TextButton] = js.undefined
}
object FixedFooter {
  
  inline def apply(): FixedFooter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FixedFooter]
  }
  
  extension [Self <: FixedFooter](x: Self) {
    
    inline def setButtons(value: js.Array[Button]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    inline def setButtonsVarargs(value: Button*): Self = StObject.set(x, "buttons", js.Array(value*))
    
    inline def setPrimaryButton(value: TextButton): Self = StObject.set(x, "primaryButton", value.asInstanceOf[js.Any])
    
    inline def setPrimaryButtonUndefined: Self = StObject.set(x, "primaryButton", js.undefined)
    
    inline def setSecondaryButton(value: TextButton): Self = StObject.set(x, "secondaryButton", value.asInstanceOf[js.Any])
    
    inline def setSecondaryButtonUndefined: Self = StObject.set(x, "secondaryButton", js.undefined)
  }
}
