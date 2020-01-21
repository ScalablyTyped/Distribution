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
  def apply(
    accessConfigs: js.Array[SchemaAccessConfig] = null,
    network: String = null,
    networkIp: String = null
  ): SchemaNetworkInterface = {
    val __obj = js.Dynamic.literal()
    if (accessConfigs != null) __obj.updateDynamic("accessConfigs")(accessConfigs.asInstanceOf[js.Any])
    if (network != null) __obj.updateDynamic("network")(network.asInstanceOf[js.Any])
    if (networkIp != null) __obj.updateDynamic("networkIp")(networkIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaNetworkInterface]
  }
}

