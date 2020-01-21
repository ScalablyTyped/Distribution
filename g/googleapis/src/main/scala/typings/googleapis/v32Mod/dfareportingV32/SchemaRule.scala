package typings.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A rule associates an asset with a targeting template for asset-level
  * targeting. Applicable to INSTREAM_VIDEO creatives.
  */
@js.native
trait SchemaRule extends js.Object {
  /**
    * A creativeAssets[].id. This should refer to one of the parent assets in
    * this creative. This is a required field.
    */
  var assetId: js.UndefOr[String] = js.native
  /**
    * A user-friendly name for this rule. This is a required field.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * A targeting template ID. The targeting from the targeting template will
    * be used to determine whether this asset should be served. This is a
    * required field.
    */
  var targetingTemplateId: js.UndefOr[String] = js.native
}

object SchemaRule {
  @scala.inline
  def apply(assetId: String = null, name: String = null, targetingTemplateId: String = null): SchemaRule = {
    val __obj = js.Dynamic.literal()
    if (assetId != null) __obj.updateDynamic("assetId")(assetId.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (targetingTemplateId != null) __obj.updateDynamic("targetingTemplateId")(targetingTemplateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRule]
  }
}

