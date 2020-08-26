package typings.ipAddress.mod

import typings.ipAddress.anon.GroupIndividual
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TeredoProperties extends js.Object {
  var client4: Address4 = js.native
  var coneNat: Boolean = js.native
  var flags: String = js.native
  var microsoft: GroupIndividual = js.native
  var prefix: String = js.native
  var server4: Address4 = js.native
  var udpPort: String = js.native
}

object TeredoProperties {
  @scala.inline
  def apply(
    client4: Address4,
    coneNat: Boolean,
    flags: String,
    microsoft: GroupIndividual,
    prefix: String,
    server4: Address4,
    udpPort: String
  ): TeredoProperties = {
    val __obj = js.Dynamic.literal(client4 = client4.asInstanceOf[js.Any], coneNat = coneNat.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], microsoft = microsoft.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], server4 = server4.asInstanceOf[js.Any], udpPort = udpPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeredoProperties]
  }
  @scala.inline
  implicit class TeredoPropertiesOps[Self <: TeredoProperties] (val x: Self) extends AnyVal {
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
    def setClient4(value: Address4): Self = this.set("client4", value.asInstanceOf[js.Any])
    @scala.inline
    def setConeNat(value: Boolean): Self = this.set("coneNat", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlags(value: String): Self = this.set("flags", value.asInstanceOf[js.Any])
    @scala.inline
    def setMicrosoft(value: GroupIndividual): Self = this.set("microsoft", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def setServer4(value: Address4): Self = this.set("server4", value.asInstanceOf[js.Any])
    @scala.inline
    def setUdpPort(value: String): Self = this.set("udpPort", value.asInstanceOf[js.Any])
  }
  
}

