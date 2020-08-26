package typings.lodashDecorators.decoratorConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DecoratorConfigOptions extends js.Object {
  var bound: js.UndefOr[Boolean] = js.native
  var getter: js.UndefOr[Boolean] = js.native
  var method: js.UndefOr[Boolean] = js.native
  var optionalParams: js.UndefOr[Boolean] = js.native
  var property: js.UndefOr[Boolean] = js.native
  var setter: js.UndefOr[Boolean] = js.native
}

object DecoratorConfigOptions {
  @scala.inline
  def apply(): DecoratorConfigOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DecoratorConfigOptions]
  }
  @scala.inline
  implicit class DecoratorConfigOptionsOps[Self <: DecoratorConfigOptions] (val x: Self) extends AnyVal {
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
    def setBound(value: Boolean): Self = this.set("bound", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBound: Self = this.set("bound", js.undefined)
    @scala.inline
    def setGetter(value: Boolean): Self = this.set("getter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGetter: Self = this.set("getter", js.undefined)
    @scala.inline
    def setMethod(value: Boolean): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    @scala.inline
    def setOptionalParams(value: Boolean): Self = this.set("optionalParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptionalParams: Self = this.set("optionalParams", js.undefined)
    @scala.inline
    def setProperty(value: Boolean): Self = this.set("property", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperty: Self = this.set("property", js.undefined)
    @scala.inline
    def setSetter(value: Boolean): Self = this.set("setter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSetter: Self = this.set("setter", js.undefined)
  }
  
}

