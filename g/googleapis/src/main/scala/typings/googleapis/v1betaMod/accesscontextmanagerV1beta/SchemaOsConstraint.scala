package typings.googleapis.v1betaMod.accesscontextmanagerV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A restriction on the OS type and version of devices making requests.
  */
@js.native
trait SchemaOsConstraint extends js.Object {
  /**
    * The minimum allowed OS version. If not set, any version of this OS
    * satisfies the constraint. Format: `&quot;major.minor.patch&quot;`.
    * Examples: `&quot;10.5.301&quot;`, `&quot;9.2.1&quot;`.
    */
  var minimumVersion: js.UndefOr[String] = js.native
  /**
    * Required. The allowed OS type.
    */
  var osType: js.UndefOr[String] = js.native
  /**
    * Only allows requests from devices with a verified Chrome OS.
    * Verifications includes requirements that the device is
    * enterprise-managed, conformant to Dasher domain policies, and the caller
    * has permission to call the API targeted by the request.
    */
  var requireVerifiedChromeOs: js.UndefOr[Boolean] = js.native
}

object SchemaOsConstraint {
  @scala.inline
  def apply(
    minimumVersion: String = null,
    osType: String = null,
    requireVerifiedChromeOs: js.UndefOr[Boolean] = js.undefined
  ): SchemaOsConstraint = {
    val __obj = js.Dynamic.literal()
    if (minimumVersion != null) __obj.updateDynamic("minimumVersion")(minimumVersion.asInstanceOf[js.Any])
    if (osType != null) __obj.updateDynamic("osType")(osType.asInstanceOf[js.Any])
    if (!js.isUndefined(requireVerifiedChromeOs)) __obj.updateDynamic("requireVerifiedChromeOs")(requireVerifiedChromeOs.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaOsConstraint]
  }
}

