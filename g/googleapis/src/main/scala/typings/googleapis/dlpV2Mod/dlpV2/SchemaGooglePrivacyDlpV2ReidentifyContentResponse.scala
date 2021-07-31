package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Results of re-identifying a item.
  */
trait SchemaGooglePrivacyDlpV2ReidentifyContentResponse extends StObject {
  
  /**
    * The re-identified item.
    */
  var item: js.UndefOr[SchemaGooglePrivacyDlpV2ContentItem] = js.undefined
  
  /**
    * An overview of the changes that were made to the `item`.
    */
  var overview: js.UndefOr[SchemaGooglePrivacyDlpV2TransformationOverview] = js.undefined
}
object SchemaGooglePrivacyDlpV2ReidentifyContentResponse {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2ReidentifyContentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2ReidentifyContentResponse]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2ReidentifyContentResponseMutableBuilder[Self <: SchemaGooglePrivacyDlpV2ReidentifyContentResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItem(value: SchemaGooglePrivacyDlpV2ContentItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    @scala.inline
    def setOverview(value: SchemaGooglePrivacyDlpV2TransformationOverview): Self = StObject.set(x, "overview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverviewUndefined: Self = StObject.set(x, "overview", js.undefined)
  }
}
