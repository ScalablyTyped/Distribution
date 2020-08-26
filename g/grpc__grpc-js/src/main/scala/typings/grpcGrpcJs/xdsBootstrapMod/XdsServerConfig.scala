package typings.grpcGrpcJs.xdsBootstrapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XdsServerConfig extends js.Object {
  var channelCreds: js.Array[ChannelCredsConfig] = js.native
  var serverUri: String = js.native
}

object XdsServerConfig {
  @scala.inline
  def apply(channelCreds: js.Array[ChannelCredsConfig], serverUri: String): XdsServerConfig = {
    val __obj = js.Dynamic.literal(channelCreds = channelCreds.asInstanceOf[js.Any], serverUri = serverUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[XdsServerConfig]
  }
  @scala.inline
  implicit class XdsServerConfigOps[Self <: XdsServerConfig] (val x: Self) extends AnyVal {
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
    def setChannelCredsVarargs(value: ChannelCredsConfig*): Self = this.set("channelCreds", js.Array(value :_*))
    @scala.inline
    def setChannelCreds(value: js.Array[ChannelCredsConfig]): Self = this.set("channelCreds", value.asInstanceOf[js.Any])
    @scala.inline
    def setServerUri(value: String): Self = this.set("serverUri", value.asInstanceOf[js.Any])
  }
  
}

