package typings.inboxsdk.mod.Compose

import typings.inboxsdk.inboxsdkStrings.destroy
import typings.inboxsdk.mod.Common.SimpleElementView
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StatusBarView extends SimpleElementView {
  
  def setHeight(height: Double): Unit = js.native
}
object StatusBarView {
  
  @scala.inline
  def apply(
    destroy: () => Unit,
    destroyed: Boolean,
    el: HTMLElement,
    on: (destroy, js.Function0[Unit]) => Unit,
    setHeight: Double => Unit
  ): StatusBarView = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), destroyed = destroyed.asInstanceOf[js.Any], el = el.asInstanceOf[js.Any], on = js.Any.fromFunction2(on), setHeight = js.Any.fromFunction1(setHeight))
    __obj.asInstanceOf[StatusBarView]
  }
  
  @scala.inline
  implicit class StatusBarViewOps[Self <: StatusBarView] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSetHeight(value: Double => Unit): Self = this.set("setHeight", js.Any.fromFunction1(value))
  }
}
