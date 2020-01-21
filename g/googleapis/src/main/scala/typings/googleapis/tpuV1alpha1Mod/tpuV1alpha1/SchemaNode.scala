package typings.googleapis.tpuV1alpha1Mod.tpuV1alpha1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A TPU instance.
  */
@js.native
trait SchemaNode extends js.Object {
  /**
    * The type of hardware accelerators associated with this node. Required.
    */
  var acceleratorType: js.UndefOr[String] = js.native
  /**
    * The CIDR block that the TPU node will use when selecting an IP address.
    * This CIDR block must be a /29 block; the Compute Engine networks API
    * forbids a smaller block, and using a larger block would be wasteful (a
    * node can only consume one IP address). Errors will occur if the CIDR
    * block has already been used for a currently existing TPU node, the CIDR
    * block conflicts with any subnetworks in the user&#39;s provided network,
    * or the provided network is peered with another network that is using that
    * CIDR block. Required.
    */
  var cidrBlock: js.UndefOr[String] = js.native
  /**
    * Output only. The time when the node was created.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * The user-supplied description of the TPU. Maximum of 512 characters.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The health status of the TPU node.
    */
  var health: js.UndefOr[String] = js.native
  /**
    * Output only. If this field is populated, it contains a description of why
    * the TPU Node is unhealthy.
    */
  var healthDescription: js.UndefOr[String] = js.native
  /**
    * Output only. DEPRECATED! Use network_endpoints instead. The network
    * address for the TPU Node as visible to Compute Engine instances.
    */
  var ipAddress: js.UndefOr[String] = js.native
  /**
    * Resource labels to represent user-provided metadata.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Output only. The immutable name of the TPU
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The name of a network they wish to peer the TPU node to. It must be a
    * preexisting Compute Engine network inside of the project on which this
    * API has been activated. If none is provided, &quot;default&quot; will be
    * used.
    */
  var network: js.UndefOr[String] = js.native
  /**
    * Output only. The network endpoints where TPU workers can be accessed and
    * sent work. It is recommended that Tensorflow clients of the node reach
    * out to the 0th entry in this map first.
    */
  var networkEndpoints: js.UndefOr[js.Array[SchemaNetworkEndpoint]] = js.native
  /**
    * Output only. DEPRECATED! Use network_endpoints instead. The network port
    * for the TPU Node as visible to Compute Engine instances.
    */
  var port: js.UndefOr[String] = js.native
  var schedulingConfig: js.UndefOr[SchemaSchedulingConfig] = js.native
  /**
    * Output only. The service account used to run the tensor flow services
    * within the node. To share resources, including Google Cloud Storage data,
    * with the Tensorflow job running in the Node, this account must have
    * permissions to that data.
    */
  var serviceAccount: js.UndefOr[String] = js.native
  /**
    * Output only. The current state for the TPU Node.
    */
  var state: js.UndefOr[String] = js.native
  /**
    * The version of Tensorflow running in the Node. Required.
    */
  var tensorflowVersion: js.UndefOr[String] = js.native
}

object SchemaNode {
  @scala.inline
  def apply(
    acceleratorType: String = null,
    cidrBlock: String = null,
    createTime: String = null,
    description: String = null,
    health: String = null,
    healthDescription: String = null,
    ipAddress: String = null,
    labels: StringDictionary[String] = null,
    name: String = null,
    network: String = null,
    networkEndpoints: js.Array[SchemaNetworkEndpoint] = null,
    port: String = null,
    schedulingConfig: SchemaSchedulingConfig = null,
    serviceAccount: String = null,
    state: String = null,
    tensorflowVersion: String = null
  ): SchemaNode = {
    val __obj = js.Dynamic.literal()
    if (acceleratorType != null) __obj.updateDynamic("acceleratorType")(acceleratorType.asInstanceOf[js.Any])
    if (cidrBlock != null) __obj.updateDynamic("cidrBlock")(cidrBlock.asInstanceOf[js.Any])
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (health != null) __obj.updateDynamic("health")(health.asInstanceOf[js.Any])
    if (healthDescription != null) __obj.updateDynamic("healthDescription")(healthDescription.asInstanceOf[js.Any])
    if (ipAddress != null) __obj.updateDynamic("ipAddress")(ipAddress.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (network != null) __obj.updateDynamic("network")(network.asInstanceOf[js.Any])
    if (networkEndpoints != null) __obj.updateDynamic("networkEndpoints")(networkEndpoints.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (schedulingConfig != null) __obj.updateDynamic("schedulingConfig")(schedulingConfig.asInstanceOf[js.Any])
    if (serviceAccount != null) __obj.updateDynamic("serviceAccount")(serviceAccount.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (tensorflowVersion != null) __obj.updateDynamic("tensorflowVersion")(tensorflowVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaNode]
  }
}

