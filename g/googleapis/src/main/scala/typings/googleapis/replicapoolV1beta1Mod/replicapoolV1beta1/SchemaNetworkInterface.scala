package typings.googleapis.replicapoolV1beta1Mod.replicapoolV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Compute Engine NetworkInterface resource. Identical to the
  * NetworkInterface on the corresponding Compute Engine resource.
  */
@js.native
trait SchemaNetworkInterface extends js.Object {
  /**
    * An array of configurations for this interface. This specifies how this
    * interface is configured to interact with other network services.
    */
  var accessConfigs: js.UndefOr[js.Array[SchemaAccessConfig]] = js.native
  /**
    * Name the Network resource to which this interface applies.
    */
  var network: js.UndefOr[String] = js.native
  /**
    * An optional IPV4 internal network address to assign to the instance for
    * this network interface.
    */
  var networkIp: js.UndefOr[String] = js.native
}

object SchemaNetworkInterface {
  @scala.inline
  def apply(): SchemaNetworkInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNetworkInterface]
  }
  @scala.inline
  implicit class SchemaNetworkInterfaceOps[Self <: SchemaNetworkInterface] (val x: Self) extends AnyVal {
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
    def setAccessConfigsVarargs(value: SchemaAccessConfig*): Self = this.set("accessConfigs", js.Array(value :_*))
    @scala.inline
    def setAccessConfigs(value: js.Array[SchemaAccessConfig]): Self = this.set("accessConfigs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessConfigs: Self = this.set("accessConfigs", js.undefined)
    @scala.inline
    def setNetwork(value: String): Self = this.set("network", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetwork: Self = this.set("network", js.undefined)
    @scala.inline
    def setNetworkIp(value: String): Self = this.set("networkIp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkIp: Self = this.set("networkIp", js.undefined)
  }
  
}

