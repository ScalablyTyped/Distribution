package typings.googleapis.composerV1beta1Mod.composerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration options for the private GKE cluster in a Cloud Composer
  * environment.
  */
@js.native
trait SchemaPrivateClusterConfig extends js.Object {
  /**
    * Optional. If `true`, access to the public endpoint of the GKE cluster is
    * denied.
    */
  var enablePrivateEndpoint: js.UndefOr[Boolean] = js.native
  /**
    * The IP range in CIDR notation to use for the hosted master network. This
    * range is used for assigning internal IP addresses to the cluster master
    * or set of masters and to the internal load balancer virtual IP. This
    * range must not overlap with any other ranges in use within the
    * cluster&#39;s network. If left blank, the default value of
    * &#39;172.16.0.0/28&#39; is used.
    */
  var masterIpv4CidrBlock: js.UndefOr[String] = js.native
}

object SchemaPrivateClusterConfig {
  @scala.inline
  def apply(enablePrivateEndpoint: js.UndefOr[Boolean] = js.undefined, masterIpv4CidrBlock: String = null): SchemaPrivateClusterConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enablePrivateEndpoint)) __obj.updateDynamic("enablePrivateEndpoint")(enablePrivateEndpoint.get.asInstanceOf[js.Any])
    if (masterIpv4CidrBlock != null) __obj.updateDynamic("masterIpv4CidrBlock")(masterIpv4CidrBlock.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPrivateClusterConfig]
  }
}

