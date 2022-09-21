package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponsiveModeChangedEventUIParam extends StObject {
  
  /**
    * Gets the newly assumed mode.
    */
  var mode: js.UndefOr[String] = js.undefined
  
  /**
    * Gets the reference to the igGridResponsive widget.
    */
  var owner: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets the previously assumed mode.
    */
  var previousMode: js.UndefOr[String] = js.undefined
}
object ResponsiveModeChangedEventUIParam {
  
  inline def apply(): ResponsiveModeChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponsiveModeChangedEventUIParam]
  }
  
  extension [Self <: ResponsiveModeChangedEventUIParam](x: Self) {
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setPreviousMode(value: String): Self = StObject.set(x, "previousMode", value.asInstanceOf[js.Any])
    
    inline def setPreviousModeUndefined: Self = StObject.set(x, "previousMode", js.undefined)
  }
}
