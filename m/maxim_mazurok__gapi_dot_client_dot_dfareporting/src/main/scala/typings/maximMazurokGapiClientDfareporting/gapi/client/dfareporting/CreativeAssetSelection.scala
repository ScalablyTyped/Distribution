package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreativeAssetSelection extends StObject {
  
  /** A creativeAssets[].id. This should refer to one of the parent assets in this creative, and will be served if none of the rules match. This is a required field. */
  var defaultAssetId: js.UndefOr[String] = js.native
  
  /**
    * Rules determine which asset will be served to a viewer. Rules will be evaluated in the order in which they are stored in this list. This list must contain at least one rule.
    * Applicable to INSTREAM_VIDEO creatives.
    */
  var rules: js.UndefOr[js.Array[Rule]] = js.native
}
object CreativeAssetSelection {
  
  @scala.inline
  def apply(): CreativeAssetSelection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreativeAssetSelection]
  }
  
  @scala.inline
  implicit class CreativeAssetSelectionMutableBuilder[Self <: CreativeAssetSelection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultAssetId(value: String): Self = StObject.set(x, "defaultAssetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultAssetIdUndefined: Self = StObject.set(x, "defaultAssetId", js.undefined)
    
    @scala.inline
    def setRules(value: js.Array[Rule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    @scala.inline
    def setRulesVarargs(value: Rule*): Self = StObject.set(x, "rules", js.Array(value :_*))
  }
}
