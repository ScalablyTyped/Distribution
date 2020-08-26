package typings.knockoutAmdHelpers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutBindingHandlers extends js.Object {
  var module: KnockoutAMDModule = js.native
}

object KnockoutBindingHandlers {
  @scala.inline
  def apply(module: KnockoutAMDModule): KnockoutBindingHandlers = {
    val __obj = js.Dynamic.literal(module = module.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutBindingHandlers]
  }
  @scala.inline
  implicit class KnockoutBindingHandlersOps[Self <: KnockoutBindingHandlers] (val x: Self) extends AnyVal {
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
    def setModule(value: KnockoutAMDModule): Self = this.set("module", value.asInstanceOf[js.Any])
  }
  
}

