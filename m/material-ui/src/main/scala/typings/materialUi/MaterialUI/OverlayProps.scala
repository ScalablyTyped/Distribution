package typings.materialUi.MaterialUI

import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OverlayProps
  extends StObject
     with Props[Overlay] {
  
  var autoLockScrolling: js.UndefOr[Boolean] = js.undefined
  
  var onClick: js.UndefOr[MouseEventHandler[js.Object]] = js.undefined
  
  var show: js.UndefOr[Boolean] = js.undefined
  
  var transitionEnabled: js.UndefOr[Boolean] = js.undefined
}
object OverlayProps {
  
  inline def apply(): OverlayProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OverlayProps]
  }
  
  extension [Self <: OverlayProps](x: Self) {
    
    inline def setAutoLockScrolling(value: Boolean): Self = StObject.set(x, "autoLockScrolling", value.asInstanceOf[js.Any])
    
    inline def setAutoLockScrollingUndefined: Self = StObject.set(x, "autoLockScrolling", js.undefined)
    
    inline def setOnClick(value: MouseEvent[js.Object, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    inline def setTransitionEnabled(value: Boolean): Self = StObject.set(x, "transitionEnabled", value.asInstanceOf[js.Any])
    
    inline def setTransitionEnabledUndefined: Self = StObject.set(x, "transitionEnabled", js.undefined)
  }
}
