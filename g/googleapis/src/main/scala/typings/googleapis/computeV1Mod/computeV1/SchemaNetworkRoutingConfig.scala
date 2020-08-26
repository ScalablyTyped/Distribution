package typings.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A routing configuration attached to a network resource. The message
  * includes the list of routers associated with the network, and a flag
  * indicating the type of routing behavior to enforce network-wide.
  */
@js.native
trait SchemaNetworkRoutingConfig extends js.Object {
  /**
    * The network-wide routing mode to use. If set to REGIONAL, this
    * network&#39;s cloud routers will only advertise routes with subnets of
    * this network in the same region as the router. If set to GLOBAL, this
    * network&#39;s cloud routers will advertise routes with all subnets of
    * this network, across regions.
    */
  var routingMode: js.UndefOr[String] = js.native
}

object SchemaNetworkRoutingConfig {
  @scala.inline
  def apply(): SchemaNetworkRoutingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNetworkRoutingConfig]
  }
  @scala.inline
  implicit class SchemaNetworkRoutingConfigOps[Self <: SchemaNetworkRoutingConfig] (val x: Self) extends AnyVal {
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
    def setRoutingMode(value: String): Self = this.set("routingMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoutingMode: Self = this.set("routingMode", js.undefined)
  }
  
}

