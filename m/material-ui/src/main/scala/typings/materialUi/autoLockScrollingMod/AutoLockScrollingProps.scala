package typings.materialUi.autoLockScrollingMod

import typings.react.mod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoLockScrollingProps extends Props[AutoLockScrolling] {
  
  var lock: Boolean = js.native
}
object AutoLockScrollingProps {
  
  @scala.inline
  def apply(lock: Boolean): AutoLockScrollingProps = {
    val __obj = js.Dynamic.literal(lock = lock.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoLockScrollingProps]
  }
  
  @scala.inline
  implicit class AutoLockScrollingPropsOps[Self <: AutoLockScrollingProps] (val x: Self) extends AnyVal {
    
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
    def setLock(value: Boolean): Self = this.set("lock", value.asInstanceOf[js.Any])
  }
}
