package typings.materialUi.MaterialUI

import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnackbarProps extends StObject {
  
  var action: js.UndefOr[ReactNode] = js.undefined
  
  var autoHideDuration: js.UndefOr[Double] = js.undefined
  
  var bodyStyle: js.UndefOr[CSSProperties] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var contentStyle: js.UndefOr[CSSProperties] = js.undefined
  
  var message: ReactNode
  
  var onActionClick: js.UndefOr[MouseEventHandler[js.Object]] = js.undefined
  
  var onRequestClose: js.UndefOr[js.Function1[/* reason */ String, Unit]] = js.undefined
  
  var open: Boolean
  
  var style: js.UndefOr[CSSProperties] = js.undefined
}
object SnackbarProps {
  
  inline def apply(open: Boolean): SnackbarProps = {
    val __obj = js.Dynamic.literal(open = open.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnackbarProps]
  }
  
  extension [Self <: SnackbarProps](x: Self) {
    
    inline def setAction(value: ReactNode): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setAutoHideDuration(value: Double): Self = StObject.set(x, "autoHideDuration", value.asInstanceOf[js.Any])
    
    inline def setAutoHideDurationUndefined: Self = StObject.set(x, "autoHideDuration", js.undefined)
    
    inline def setBodyStyle(value: CSSProperties): Self = StObject.set(x, "bodyStyle", value.asInstanceOf[js.Any])
    
    inline def setBodyStyleUndefined: Self = StObject.set(x, "bodyStyle", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setContentStyle(value: CSSProperties): Self = StObject.set(x, "contentStyle", value.asInstanceOf[js.Any])
    
    inline def setContentStyleUndefined: Self = StObject.set(x, "contentStyle", js.undefined)
    
    inline def setMessage(value: ReactNode): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setOnActionClick(value: MouseEvent[js.Object, NativeMouseEvent] => Unit): Self = StObject.set(x, "onActionClick", js.Any.fromFunction1(value))
    
    inline def setOnActionClickUndefined: Self = StObject.set(x, "onActionClick", js.undefined)
    
    inline def setOnRequestClose(value: /* reason */ String => Unit): Self = StObject.set(x, "onRequestClose", js.Any.fromFunction1(value))
    
    inline def setOnRequestCloseUndefined: Self = StObject.set(x, "onRequestClose", js.undefined)
    
    inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
