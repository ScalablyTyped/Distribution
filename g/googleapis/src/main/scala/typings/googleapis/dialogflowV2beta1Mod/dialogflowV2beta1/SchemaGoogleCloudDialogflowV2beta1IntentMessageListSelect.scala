package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The card for presenting a list of options to select from.
  */
trait SchemaGoogleCloudDialogflowV2beta1IntentMessageListSelect extends StObject {
  
  /**
    * Required. List items.
    */
  var items: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2beta1IntentMessageListSelectItem]] = js.undefined
  
  /**
    * Optional. The overall title of the list.
    */
  var title: js.UndefOr[String] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1IntentMessageListSelect {
  
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2beta1IntentMessageListSelect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1IntentMessageListSelect]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2beta1IntentMessageListSelectMutableBuilder[Self <: SchemaGoogleCloudDialogflowV2beta1IntentMessageListSelect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[SchemaGoogleCloudDialogflowV2beta1IntentMessageListSelectItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: SchemaGoogleCloudDialogflowV2beta1IntentMessageListSelectItem*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
