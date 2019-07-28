package typings.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnterpriseProjectIntegration extends ProjectIntegration {
  var appId: js.UndefOr[String] = js.undefined
  var keyId: js.UndefOr[Double] = js.undefined
  var orgId: js.UndefOr[String] = js.undefined
  var productKey: js.UndefOr[String] = js.undefined
  var registries: js.UndefOr[js.Array[String]] = js.undefined
}

object EnterpriseProjectIntegration {
  @scala.inline
  def apply(
    appId: String = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    keyId: Int | Double = null,
    orgId: String = null,
    productKey: String = null,
    registries: js.Array[String] = null,
    root: String = null
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

