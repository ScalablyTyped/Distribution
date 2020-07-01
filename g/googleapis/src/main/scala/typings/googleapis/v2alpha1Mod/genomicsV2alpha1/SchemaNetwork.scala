package typings.googleapis.v2alpha1Mod.genomicsV2alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * VM networking options.
  */
@js.native
trait SchemaNetwork extends js.Object {
  /**
    * The network name to attach the VM&#39;s network interface to. The value
    * will be prefixed with `global/networks/` unless it contains a `/`, in
    * which case it is assumed to be a fully specified network resource URL. If
    * unspecified, the global default network is used.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * If the specified network is configured for custom subnet creation, the
    * name of the subnetwork to attach the instance to must be specified here.
    * The value is prefixed with `regions/x/subnetworks/` unless it contains a
    * `/`, in which case it is assumed to be a fully specified subnetwork
    * resource URL.  If the `*` character appears in the value, it is replaced
    * with the region that the virtual machine has been allocated in.
    */
  var subnetwork: js.UndefOr[String] = js.native
  /**
    * If set to true, do not attach a public IP address to the VM. Note that
    * without a public IP address, additional configuration is required to
    * allow the VM to access Google services.  See
    * https://cloud.google.com/vpc/docs/configure-private-google-access for
    * more information.
    */
  var usePrivateAddress: js.UndefOr[Boolean] = js.native
}

object SchemaNetwork {
  @scala.inline
  def apply(
    name: String = null,
    subnetwork: String = null,
    usePrivateAddress: js.UndefOr[Boolean] = js.undefined
  ): SchemaNetwork = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (subnetwork != null) __obj.updateDynamic("subnetwork")(subnetwork.asInstanceOf[js.Any])
    if (!js.isUndefined(usePrivateAddress)) __obj.updateDynamic("usePrivateAddress")(usePrivateAddress.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaNetwork]
  }
}

