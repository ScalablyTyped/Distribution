package typings.googleapis.containerV1Mod.containerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration for the legacy Attribute Based Access Control authorization
  * mode.
  */
@js.native
trait SchemaLegacyAbac extends js.Object {
  /**
    * Whether the ABAC authorizer is enabled for this cluster. When enabled,
    * identities in the system, including service accounts, nodes, and
    * controllers, will have statically granted permissions beyond those
    * provided by the RBAC configuration or IAM.
    */
  var enabled: js.UndefOr[Boolean] = js.native
}

object SchemaLegacyAbac {
  @scala.inline
  def apply(enabled: js.UndefOr[Boolean] = js.undefined): SchemaLegacyAbac = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLegacyAbac]
  }
}

