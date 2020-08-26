package typings.knockoutViewmodel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Extend ko global
@js.native
trait KnockoutStatic extends js.Object {
  var viewmodel: KnockoutViewModelStatic = js.native
}

object KnockoutStatic {
  @scala.inline
  def apply(viewmodel: KnockoutViewModelStatic): KnockoutStatic = {
    val __obj = js.Dynamic.literal(viewmodel = viewmodel.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutStatic]
  }
  @scala.inline
  implicit class KnockoutStaticOps[Self <: KnockoutStatic] (val x: Self) extends AnyVal {
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
    def setViewmodel(value: KnockoutViewModelStatic): Self = this.set("viewmodel", value.asInstanceOf[js.Any])
  }
  
}

