package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Rule extends StObject {
  
  /** A creativeAssets[].id. This should refer to one of the parent assets in this creative. This is a required field. */
  var assetId: js.UndefOr[String] = js.native
  
  /** A user-friendly name for this rule. This is a required field. */
  var name: js.UndefOr[String] = js.native
  
  /** A targeting template ID. The targeting from the targeting template will be used to determine whether this asset should be served. This is a required field. */
  var targetingTemplateId: js.UndefOr[String] = js.native
}
object Rule {
  
  @scala.inline
  def apply(): Rule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Rule]
  }
  
  @scala.inline
  implicit class RuleMutableBuilder[Self <: Rule] (val x: Self) extends AnyVal {
    
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
