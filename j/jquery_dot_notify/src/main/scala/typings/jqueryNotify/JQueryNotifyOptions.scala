package typings.jqueryNotify

import typings.jqueryNotify.jqueryNotifyStrings.above
import typings.jqueryNotify.jqueryNotifyStrings.below
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryNotifyOptions extends StObject {
  
  var close: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var custom: js.UndefOr[Boolean] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var expires: js.UndefOr[Double] = js.undefined
  
  var open: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var queue: js.UndefOr[Boolean] = js.undefined
  
  var speed: js.UndefOr[Double] = js.undefined
  
  var stack: js.UndefOr[below | above] = js.undefined
}
object JQueryNotifyOptions {
  
  @scala.inline
  def apply(): JQueryNotifyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQueryNotifyOptions]
  }
  
  @scala.inline
  implicit class JQueryNotifyOptionsMutableBuilder[Self <: JQueryNotifyOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    @scala.inline
    def setCustom(value: Boolean): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setExpires(value: Double): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
    
    @scala.inline
    def setOpen(value: () => Unit): Self = StObject.set(x, "open", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    @scala.inline
    def setQueue(value: Boolean): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueueUndefined: Self = StObject.set(x, "queue", js.undefined)
    
    @scala.inline
    def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
    
    @scala.inline
    def setStack(value: below | above): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
  }
}
