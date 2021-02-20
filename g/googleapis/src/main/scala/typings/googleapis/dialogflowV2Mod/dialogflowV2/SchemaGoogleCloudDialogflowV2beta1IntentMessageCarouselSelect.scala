package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The card for presenting a carousel of options to select from.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2beta1IntentMessageCarouselSelect extends StObject {
  
  /**
    * Required. Carousel items.
    */
  var items: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2beta1IntentMessageCarouselSelectItem]] = js.native
}
object SchemaGoogleCloudDialogflowV2beta1IntentMessageCarouselSelect {
  
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2beta1IntentMessageCarouselSelect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1IntentMessageCarouselSelect]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2beta1IntentMessageCarouselSelectMutableBuilder[Self <: SchemaGoogleCloudDialogflowV2beta1IntentMessageCarouselSelect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[SchemaGoogleCloudDialogflowV2beta1IntentMessageCarouselSelectItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: SchemaGoogleCloudDialogflowV2beta1IntentMessageCarouselSelectItem*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
