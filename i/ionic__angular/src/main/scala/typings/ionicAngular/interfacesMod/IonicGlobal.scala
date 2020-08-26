package typings.ionicAngular.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonicGlobal extends js.Object {
  var asyncQueue: js.UndefOr[Boolean] = js.native
  var config: js.UndefOr[js.Any] = js.native
}

object IonicGlobal {
  @scala.inline
  def apply(): IonicGlobal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonicGlobal]
  }
  @scala.inline
  implicit class IonicGlobalOps[Self <: IonicGlobal] (val x: Self) extends AnyVal {
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
    def setAsyncQueue(value: Boolean): Self = this.set("asyncQueue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsyncQueue: Self = this.set("asyncQueue", js.undefined)
    @scala.inline
    def setConfig(value: js.Any): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
  }
  
}

