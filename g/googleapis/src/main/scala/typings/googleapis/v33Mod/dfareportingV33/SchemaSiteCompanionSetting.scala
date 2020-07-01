package typings.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Companion Settings
  */
@js.native
trait SchemaSiteCompanionSetting extends js.Object {
  /**
    * Whether companions are disabled for this site template.
    */
  var companionsDisabled: js.UndefOr[Boolean] = js.native
  /**
    * Whitelist of companion sizes to be served via this site template. Set
    * this list to null or empty to serve all companion sizes.
    */
  var enabledSizes: js.UndefOr[js.Array[SchemaSize]] = js.native
  /**
    * Whether to serve only static images as companions.
    */
  var imageOnly: js.UndefOr[Boolean] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#siteCompanionSetting&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaSiteCompanionSetting {
  @scala.inline
  def apply(
    companionsDisabled: js.UndefOr[Boolean] = js.undefined,
    enabledSizes: js.Array[SchemaSize] = null,
    imageOnly: js.UndefOr[Boolean] = js.undefined,
    kind: String = null
  ): SchemaSiteCompanionSetting = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(companionsDisabled)) __obj.updateDynamic("companionsDisabled")(companionsDisabled.get.asInstanceOf[js.Any])
    if (enabledSizes != null) __obj.updateDynamic("enabledSizes")(enabledSizes.asInstanceOf[js.Any])
    if (!js.isUndefined(imageOnly)) __obj.updateDynamic("imageOnly")(imageOnly.get.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSiteCompanionSetting]
  }
}

