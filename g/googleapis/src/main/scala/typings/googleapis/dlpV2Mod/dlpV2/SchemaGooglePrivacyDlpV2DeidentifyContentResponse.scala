package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Results of de-identifying a ContentItem.
  */
trait SchemaGooglePrivacyDlpV2DeidentifyContentResponse extends StObject {
  
  /**
    * The de-identified item.
    */
  var item: js.UndefOr[SchemaGooglePrivacyDlpV2ContentItem] = js.undefined
  
  /**
    * An overview of the changes that were made on the `item`.
    */
  var overview: js.UndefOr[SchemaGooglePrivacyDlpV2TransformationOverview] = js.undefined
}
object SchemaGooglePrivacyDlpV2DeidentifyContentResponse {
  
  inline def apply(): SchemaGooglePrivacyDlpV2DeidentifyContentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2DeidentifyContentResponse]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2DeidentifyContentResponse](x: Self) {
    
    inline def setItem(value: SchemaGooglePrivacyDlpV2ContentItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    inline def setOverview(value: SchemaGooglePrivacyDlpV2TransformationOverview): Self = StObject.set(x, "overview", value.asInstanceOf[js.Any])
    
    inline def setOverviewUndefined: Self = StObject.set(x, "overview", js.undefined)
  }
}
