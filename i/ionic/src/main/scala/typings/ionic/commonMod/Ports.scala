package typings.ionic.commonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ports extends js.Object {
  var livereloadPort: Double = js.native
  var notificationPort: Double = js.native
  var port: Double = js.native
}

object Ports {
  @scala.inline
  def apply(livereloadPort: Double, notificationPort: Double, port: Double): Ports = {
    val __obj = js.Dynamic.literal(livereloadPort = livereloadPort.asInstanceOf[js.Any], notificationPort = notificationPort.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ports]
  }
  @scala.inline
  implicit class PortsOps[Self <: Ports] (val x: Self) extends AnyVal {
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
    def setLivereloadPort(value: Double): Self = this.set("livereloadPort", value.asInstanceOf[js.Any])
    @scala.inline
    def setNotificationPort(value: Double): Self = this.set("notificationPort", value.asInstanceOf[js.Any])
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
  }
  
}

