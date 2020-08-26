package typings.kosCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WrapperConfig extends js.Object {
  var autoLoad: js.UndefOr[Boolean] = js.native
  var autoReset: js.UndefOr[Boolean] = js.native
  var model: KosModel[_] = js.native
  var namespace: js.UndefOr[String] = js.native
}

object WrapperConfig {
  @scala.inline
  def apply(model: KosModel[_]): WrapperConfig = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrapperConfig]
  }
  @scala.inline
  implicit class WrapperConfigOps[Self <: WrapperConfig] (val x: Self) extends AnyVal {
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
    def setModel(value: KosModel[_]): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutoLoad(value: Boolean): Self = this.set("autoLoad", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoLoad: Self = this.set("autoLoad", js.undefined)
    @scala.inline
    def setAutoReset(value: Boolean): Self = this.set("autoReset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoReset: Self = this.set("autoReset", js.undefined)
    @scala.inline
    def setNamespace(value: String): Self = this.set("namespace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamespace: Self = this.set("namespace", js.undefined)
  }
  
}

