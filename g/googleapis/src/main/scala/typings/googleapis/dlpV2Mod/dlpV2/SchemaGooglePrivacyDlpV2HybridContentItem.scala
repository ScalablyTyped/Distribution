package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2HybridContentItem extends StObject {
  
  /**
    * Supplementary information that will be added to each finding.
    */
  var findingDetails: js.UndefOr[SchemaGooglePrivacyDlpV2HybridFindingDetails] = js.undefined
  
  /**
    * The item to inspect.
    */
  var item: js.UndefOr[SchemaGooglePrivacyDlpV2ContentItem] = js.undefined
}
object SchemaGooglePrivacyDlpV2HybridContentItem {
  
  inline def apply(): SchemaGooglePrivacyDlpV2HybridContentItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2HybridContentItem]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2HybridContentItem](x: Self) {
    
    inline def setFindingDetails(value: SchemaGooglePrivacyDlpV2HybridFindingDetails): Self = StObject.set(x, "findingDetails", value.asInstanceOf[js.Any])
    
    inline def setFindingDetailsUndefined: Self = StObject.set(x, "findingDetails", js.undefined)
    
    inline def setItem(value: SchemaGooglePrivacyDlpV2ContentItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
  }
}
