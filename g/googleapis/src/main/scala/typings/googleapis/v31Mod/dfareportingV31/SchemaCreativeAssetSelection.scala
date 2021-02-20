package typings.googleapis.v31Mod.dfareportingV31

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Encapsulates the list of rules for asset selection and a default asset in
  * case none of the rules match. Applicable to INSTREAM_VIDEO creatives.
  */
@js.native
trait SchemaCreativeAssetSelection extends StObject {
  
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
  implicit class SchemaCreativeAssetSelectionMutableBuilder[Self <: SchemaCreativeAssetSelection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultAssetId(value: String): Self = StObject.set(x, "defaultAssetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultAssetIdUndefined: Self = StObject.set(x, "defaultAssetId", js.undefined)
    
    @scala.inline
    def setRules(value: js.Array[SchemaRule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    @scala.inline
    def setRulesVarargs(value: SchemaRule*): Self = StObject.set(x, "rules", js.Array(value :_*))
  }
}
