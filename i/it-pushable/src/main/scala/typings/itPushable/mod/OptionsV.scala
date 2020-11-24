package typings.itPushable.mod

import typings.itPushable.itPushableBooleans.`true`
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionsV extends js.Object {
  
  var onEnd: js.UndefOr[js.Function1[/* err */ js.UndefOr[Error], Unit]] = js.native
  
  var writev: `true` = js.native
}
object OptionsV {
  
  @scala.inline
  def apply(writev: `true`): OptionsV = {
    val __obj = js.Dynamic.literal(writev = writev.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsV]
  }
  
  @scala.inline
  implicit class OptionsVOps[Self <: OptionsV] (val x: Self) extends AnyVal {
    
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
    def setWritev(value: `true`): Self = this.set("writev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnEnd(value: /* err */ js.UndefOr[Error] => Unit): Self = this.set("onEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnEnd: Self = this.set("onEnd", js.undefined)
  }
}
