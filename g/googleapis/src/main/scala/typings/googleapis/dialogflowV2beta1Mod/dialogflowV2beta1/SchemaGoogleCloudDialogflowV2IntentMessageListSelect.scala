package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The card for presenting a list of options to select from.
  */
trait SchemaGoogleCloudDialogflowV2IntentMessageListSelect extends StObject {
  
  /**
    * Required. List items.
    */
  var items: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2IntentMessageListSelectItem]] = js.undefined
  
  /**
    * Optional. The overall title of the list.
    */
  var title: js.UndefOr[String] = js.undefined
}
object SchemaGoogleCloudDialogflowV2IntentMessageListSelect {
  
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2IntentMessageListSelect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2IntentMessageListSelect]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2IntentMessageListSelectMutableBuilder[Self <: SchemaGoogleCloudDialogflowV2IntentMessageListSelect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[SchemaGoogleCloudDialogflowV2IntentMessageListSelectItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: SchemaGoogleCloudDialogflowV2IntentMessageListSelectItem*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
