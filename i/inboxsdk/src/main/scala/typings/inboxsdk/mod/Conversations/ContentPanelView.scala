package typings.inboxsdk.mod.Conversations

import typings.inboxsdk.inboxsdkStrings.activate
import typings.inboxsdk.inboxsdkStrings.deactivate
import typings.inboxsdk.inboxsdkStrings.destroy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentPanelView extends StObject {
  
  /**
    * Undocumented method, no guarantee it will always work.
    */
  def close(): Unit
  
  var destroyed: Boolean
  
  def isActive(): Boolean
  
  def on(name: destroy | activate | deactivate, cb: js.Function0[Unit]): Unit
  
  def open(): Unit
  
  def remove(): Unit
}
object ContentPanelView {
  
  inline def apply(
    close: () => Unit,
    destroyed: Boolean,
    isActive: () => Boolean,
    on: (destroy | activate | deactivate, js.Function0[Unit]) => Unit,
    open: () => Unit,
    remove: () => Unit
  ): ContentPanelView = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), destroyed = destroyed.asInstanceOf[js.Any], isActive = js.Any.fromFunction0(isActive), on = js.Any.fromFunction2(on), open = js.Any.fromFunction0(open), remove = js.Any.fromFunction0(remove))
    __obj.asInstanceOf[ContentPanelView]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentPanelView] (val x: Self) extends AnyVal {
    
    inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    inline def setDestroyed(value: Boolean): Self = StObject.set(x, "destroyed", value.asInstanceOf[js.Any])
    
    inline def setIsActive(value: () => Boolean): Self = StObject.set(x, "isActive", js.Any.fromFunction0(value))
    
    inline def setOn(value: (destroy | activate | deactivate, js.Function0[Unit]) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
    
    inline def setOpen(value: () => Unit): Self = StObject.set(x, "open", js.Any.fromFunction0(value))
    
    inline def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
  }
}
