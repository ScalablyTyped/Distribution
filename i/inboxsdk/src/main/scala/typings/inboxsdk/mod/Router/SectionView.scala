package typings.inboxsdk.mod.Router

import typings.inboxsdk.inboxsdkStrings.destroy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SectionView extends StObject {
  
  var destroyed: Boolean
  
  @JSName("on")
  def on_destroy(name: destroy, cb: js.Function0[Unit]): Unit
  
  def remove(): Unit
}
object SectionView {
  
  inline def apply(destroyed: Boolean, on: (destroy, js.Function0[Unit]) => Unit, remove: () => Unit): SectionView = {
    val __obj = js.Dynamic.literal(destroyed = destroyed.asInstanceOf[js.Any], on = js.Any.fromFunction2(on), remove = js.Any.fromFunction0(remove))
    __obj.asInstanceOf[SectionView]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SectionView] (val x: Self) extends AnyVal {
    
    inline def setDestroyed(value: Boolean): Self = StObject.set(x, "destroyed", value.asInstanceOf[js.Any])
    
    inline def setOn(value: (destroy, js.Function0[Unit]) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
    
    inline def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
  }
}
