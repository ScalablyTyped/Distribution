package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a Zone&#39;s type restrictions.
  */
@js.native
trait SchemaZoneTypeRestriction extends js.Object {
  /**
    * True if type restrictions have been enabled for this Zone.
    */
  var enable: js.UndefOr[Boolean] = js.native
  /**
    * List of type public ids that have been whitelisted for use in this Zone.
    */
  var whitelistedTypeId: js.UndefOr[js.Array[String]] = js.native
}

object SchemaZoneTypeRestriction {
  @scala.inline
  def apply(enable: js.UndefOr[Boolean] = js.undefined, whitelistedTypeId: js.Array[String] = null): SchemaZoneTypeRestriction = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enable)) __obj.updateDynamic("enable")(enable.asInstanceOf[js.Any])
    if (whitelistedTypeId != null) __obj.updateDynamic("whitelistedTypeId")(whitelistedTypeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaZoneTypeRestriction]
  }
}

