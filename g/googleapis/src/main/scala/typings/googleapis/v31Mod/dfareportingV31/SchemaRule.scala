package typings.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): SchemaRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRule]
  }
  
  @scala.inline
  implicit class SchemaRuleOps[Self <: SchemaRule] (val x: Self) extends AnyVal {
    
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
    def setAssetId(value: String): Self = this.set("assetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssetId: Self = this.set("assetId", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setTargetingTemplateId(value: String): Self = this.set("targetingTemplateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetingTemplateId: Self = this.set("targetingTemplateId", js.undefined)
  }
}
