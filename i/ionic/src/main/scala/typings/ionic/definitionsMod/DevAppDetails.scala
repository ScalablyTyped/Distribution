package typings.ionic.definitionsMod

import typings.ionic.anon.Address
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DevAppDetails extends js.Object {
  var channel: js.UndefOr[String] = js.native
  var commPort: Double = js.native
  var interfaces: js.Array[Address] = js.native
  var port: Double = js.native
}

object DevAppDetails {
  @scala.inline
  def apply(commPort: Double, interfaces: js.Array[Address], port: Double): DevAppDetails = {
    val __obj = js.Dynamic.literal(commPort = commPort.asInstanceOf[js.Any], interfaces = interfaces.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[DevAppDetails]
  }
  @scala.inline
  implicit class DevAppDetailsOps[Self <: DevAppDetails] (val x: Self) extends AnyVal {
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
    def setCommPort(value: Double): Self = this.set("commPort", value.asInstanceOf[js.Any])
    @scala.inline
    def setInterfacesVarargs(value: Address*): Self = this.set("interfaces", js.Array(value :_*))
    @scala.inline
    def setInterfaces(value: js.Array[Address]): Self = this.set("interfaces", value.asInstanceOf[js.Any])
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def setChannel(value: String): Self = this.set("channel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannel: Self = this.set("channel", js.undefined)
  }
  
}

