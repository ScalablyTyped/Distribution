package typings.knockoutPunches

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnockoutPunchesStatic extends js.Object {
  
  def enableAll(): Unit = js.native
}
object KnockoutPunchesStatic {
  
  @scala.inline
  def apply(enableAll: () => Unit): KnockoutPunchesStatic = {
    val __obj = js.Dynamic.literal(enableAll = js.Any.fromFunction0(enableAll))
    __obj.asInstanceOf[KnockoutPunchesStatic]
  }
  
  @scala.inline
  implicit class KnockoutPunchesStaticOps[Self <: KnockoutPunchesStatic] (val x: Self) extends AnyVal {
    
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
    def setEnableAll(value: () => Unit): Self = this.set("enableAll", js.Any.fromFunction0(value))
  }
}
