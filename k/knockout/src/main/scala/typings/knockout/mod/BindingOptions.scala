package typings.knockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BindingOptions extends js.Object {
  var bindingParams: js.UndefOr[Boolean] = js.native
  var valueAccessors: js.UndefOr[Boolean] = js.native
}

object BindingOptions {
  @scala.inline
  def apply(): BindingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BindingOptions]
  }
  @scala.inline
  implicit class BindingOptionsOps[Self <: BindingOptions] (val x: Self) extends AnyVal {
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
    def setBindingParams(value: Boolean): Self = this.set("bindingParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBindingParams: Self = this.set("bindingParams", js.undefined)
    @scala.inline
    def setValueAccessors(value: Boolean): Self = this.set("valueAccessors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueAccessors: Self = this.set("valueAccessors", js.undefined)
  }
  
}

