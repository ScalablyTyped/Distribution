package typings.googleapis.v32Mod.dfareportingV32

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A rule associates an asset with a targeting template for asset-level
  * targeting. Applicable to INSTREAM_VIDEO creatives.
  */
@js.native
trait SchemaRule extends StObject {
  
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
  implicit class SchemaRuleMutableBuilder[Self <: SchemaRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssetId(value: String): Self = StObject.set(x, "assetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetIdUndefined: Self = StObject.set(x, "assetId", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setTargetingTemplateId(value: String): Self = StObject.set(x, "targetingTemplateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetingTemplateIdUndefined: Self = StObject.set(x, "targetingTemplateId", js.undefined)
  }
}
