package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZoombarProviderDefaultSettings
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Contains the target component's instance
    */
  var targetObject: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Expects two parameters
    * a jQuery Event to pass as original for Zoombar's own zoomChanged event
    * an object with the following structure:
    * {
    * oldLeft: number,
    * oldWidth: number,
    * newLeft: number,
    * newWdith: number
    * }
    * The values should represent the fractions of the total width of the zoomed component in a number ranging from 0 to 1
    */
  var zoomChangedCallback: js.UndefOr[js.Any] = js.undefined
}
object ZoombarProviderDefaultSettings {
  
  inline def apply(): ZoombarProviderDefaultSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZoombarProviderDefaultSettings]
  }
  
  extension [Self <: ZoombarProviderDefaultSettings](x: Self) {
    
    inline def setTargetObject(value: js.Any): Self = StObject.set(x, "targetObject", value.asInstanceOf[js.Any])
    
    inline def setTargetObjectUndefined: Self = StObject.set(x, "targetObject", js.undefined)
    
    inline def setZoomChangedCallback(value: js.Any): Self = StObject.set(x, "zoomChangedCallback", value.asInstanceOf[js.Any])
    
    inline def setZoomChangedCallbackUndefined: Self = StObject.set(x, "zoomChangedCallback", js.undefined)
  }
}
