package typings.inboxsdk.mod.Router

import typings.inboxsdk.inboxsdkStrings.destroy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SectionView extends StObject {
  
  var destroyed: Boolean = js.native
  
  @JSName("on")
  def on_destroy(name: destroy, cb: js.Function0[Unit]): Unit = js.native
  
  def remove(): Unit = js.native
}
object SectionView {
  
  @scala.inline
  def apply(destroyed: Boolean, on: (destroy, js.Function0[Unit]) => Unit, remove: () => Unit): SectionView = {
    val __obj = js.Dynamic.literal(destroyed = destroyed.asInstanceOf[js.Any], on = js.Any.fromFunction2(on), remove = js.Any.fromFunction0(remove))
    __obj.asInstanceOf[SectionView]
  }
  
  @scala.inline
  implicit class SectionViewMutableBuilder[Self <: SectionView] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestroyed(value: Boolean): Self = StObject.set(x, "destroyed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOn(value: (destroy, js.Function0[Unit]) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
  }
}
