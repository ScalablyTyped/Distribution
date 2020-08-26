package typings.jpushReactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectEnable extends js.Object {
  var connectEnable: Boolean = js.native
}

object ConnectEnable {
  @scala.inline
  def apply(connectEnable: Boolean): ConnectEnable = {
    val __obj = js.Dynamic.literal(connectEnable = connectEnable.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectEnable]
  }
  @scala.inline
  implicit class ConnectEnableOps[Self <: ConnectEnable] (val x: Self) extends AnyVal {
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
    def setConnectEnable(value: Boolean): Self = this.set("connectEnable", value.asInstanceOf[js.Any])
  }
  
}

