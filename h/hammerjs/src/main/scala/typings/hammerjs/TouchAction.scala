package typings.hammerjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TouchAction extends js.Object {
  
  def compute(): String = js.native
  
  def preventDefaults(input: HammerInput): Unit = js.native
  
  def preventSrc(srcEvent: js.Any): Unit = js.native
  
  def set(value: String): Unit = js.native
  
  def update(): Unit = js.native
}
object TouchAction {
  
  @scala.inline
  def apply(
    compute: () => String,
    preventDefaults: HammerInput => Unit,
    preventSrc: js.Any => Unit,
    set: String => Unit,
    update: () => Unit
  ): TouchAction = {
    val __obj = js.Dynamic.literal(compute = js.Any.fromFunction0(compute), preventDefaults = js.Any.fromFunction1(preventDefaults), preventSrc = js.Any.fromFunction1(preventSrc), set = js.Any.fromFunction1(set), update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[TouchAction]
  }
  
  @scala.inline
  implicit class TouchActionOps[Self <: TouchAction] (val x: Self) extends AnyVal {
    
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
    def setCompute(value: () => String): Self = this.set("compute", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPreventDefaults(value: HammerInput => Unit): Self = this.set("preventDefaults", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPreventSrc(value: js.Any => Unit): Self = this.set("preventSrc", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet(value: String => Unit): Self = this.set("set", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdate(value: () => Unit): Self = this.set("update", js.Any.fromFunction0(value))
  }
}
