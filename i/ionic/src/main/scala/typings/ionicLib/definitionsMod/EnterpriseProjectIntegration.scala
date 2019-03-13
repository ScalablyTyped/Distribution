package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnterpriseProjectIntegration extends ProjectIntegration {
  var appId: js.UndefOr[java.lang.String] = js.undefined
  var keyId: js.UndefOr[scala.Double] = js.undefined
  var orgId: js.UndefOr[java.lang.String] = js.undefined
  var productKey: js.UndefOr[java.lang.String] = js.undefined
  var registries: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object EnterpriseProjectIntegration {
  @scala.inline
  def apply(
    appId: java.lang.String = null,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    keyId: scala.Int | scala.Double = null,
    orgId: java.lang.String = null,
    productKey: java.lang.String = null,
    registries: js.Array[java.lang.String] = null,
    root: java.lang.String = null
  ): EnterpriseProjectIntegration = {
    val __obj = js.Dynamic.literal()
    if (appId != null) __obj.updateDynamic("appId")(appId)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (keyId != null) __obj.updateDynamic("keyId")(keyId.asInstanceOf[js.Any])
    if (orgId != null) __obj.updateDynamic("orgId")(orgId)
    if (productKey != null) __obj.updateDynamic("productKey")(productKey)
    if (registries != null) __obj.updateDynamic("registries")(registries)
    if (root != null) __obj.updateDynamic("root")(root)
    __obj.asInstanceOf[EnterpriseProjectIntegration]
  }
}

