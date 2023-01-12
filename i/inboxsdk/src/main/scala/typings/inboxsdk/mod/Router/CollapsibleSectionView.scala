package typings.inboxsdk.mod.Router

import typings.inboxsdk.inboxsdkStrings.collapsed_
import typings.inboxsdk.inboxsdkStrings.destroy
import typings.inboxsdk.inboxsdkStrings.expanded_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollapsibleSectionView
  extends StObject
     with SectionView {
  
  def on(name: destroy | expanded_ | collapsed_, cb: js.Function0[Unit]): Unit
  
  def setCollapsed(value: Boolean): Unit
}
object CollapsibleSectionView {
  
  inline def apply(
    destroyed: Boolean,
    on: (destroy | expanded_ | collapsed_, js.Function0[Unit]) => Unit,
    remove: () => Unit,
    setCollapsed: Boolean => Unit
  ): CollapsibleSectionView = {
    val __obj = js.Dynamic.literal(destroyed = destroyed.asInstanceOf[js.Any], on = js.Any.fromFunction2(on), remove = js.Any.fromFunction0(remove), setCollapsed = js.Any.fromFunction1(setCollapsed))
    __obj.asInstanceOf[CollapsibleSectionView]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CollapsibleSectionView] (val x: Self) extends AnyVal {
    
    inline def setOn(value: (destroy | expanded_ | collapsed_, js.Function0[Unit]) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
    
    inline def setSetCollapsed(value: Boolean => Unit): Self = StObject.set(x, "setCollapsed", js.Any.fromFunction1(value))
  }
}
