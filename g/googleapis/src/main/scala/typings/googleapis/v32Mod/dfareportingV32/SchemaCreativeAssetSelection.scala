package typings.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Encapsulates the list of rules for asset selection and a default asset in
  * case none of the rules match. Applicable to INSTREAM_VIDEO creatives.
  */
@js.native
trait SchemaCreativeAssetSelection extends js.Object {
  /**
    * A creativeAssets[].id. This should refer to one of the parent assets in
    * this creative, and will be served if none of the rules match. This is a
    * required field.
    */
  var defaultAssetId: js.UndefOr[String] = js.native
  /**
    * Rules determine which asset will be served to a viewer. Rules will be
    * evaluated in the order in which they are stored in this list. This list
    * must contain at least one rule. Applicable to INSTREAM_VIDEO creatives.
    */
  var rules: js.UndefOr[js.Array[SchemaRule]] = js.native
}

object SchemaCreativeAssetSelection {
  @scala.inline
  def apply(): SchemaCreativeAssetSelection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreativeAssetSelection]
  }
  @scala.inline
  implicit class SchemaCreativeAssetSelectionOps[Self <: SchemaCreativeAssetSelection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDefaultAssetId(value: String): Self = this.set("defaultAssetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultAssetId: Self = this.set("defaultAssetId", js.undefined)
    @scala.inline
    def setRulesVarargs(value: SchemaRule*): Self = this.set("rules", js.Array(value :_*))
    @scala.inline
    def setRules(value: js.Array[SchemaRule]): Self = this.set("rules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRules: Self = this.set("rules", js.undefined)
  }
  
}

