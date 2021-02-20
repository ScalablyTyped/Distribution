package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Results of de-identifying a ContentItem.
  */
@js.native
trait SchemaGooglePrivacyDlpV2DeidentifyContentResponse extends StObject {
  
  /**
    * The de-identified item.
    */
  var item: js.UndefOr[SchemaGooglePrivacyDlpV2ContentItem] = js.native
  
  /**
    * An overview of the changes that were made on the `item`.
    */
  var overview: js.UndefOr[SchemaGooglePrivacyDlpV2TransformationOverview] = js.native
}
object SchemaGooglePrivacyDlpV2DeidentifyContentResponse {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2DeidentifyContentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2DeidentifyContentResponse]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2DeidentifyContentResponseMutableBuilder[Self <: SchemaGooglePrivacyDlpV2DeidentifyContentResponse] (val x: Self) extends AnyVal {
    
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
