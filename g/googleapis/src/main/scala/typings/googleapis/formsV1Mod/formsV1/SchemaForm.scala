package typings.googleapis.formsV1Mod.formsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaForm extends StObject {
  
  /**
    * Output only. The form ID.
    */
  var formId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The title and description of the form.
    */
  var info: js.UndefOr[SchemaInfo] = js.undefined
  
  /**
    * Required. A list of the form's items, which can include section headers, questions, embedded media, etc.
    */
  var items: js.UndefOr[js.Array[SchemaItem]] = js.undefined
  
  /**
    * Output only. The ID of the linked Google Sheet which is accumulating responses from this Form (if such a Sheet exists).
    */
  var linkedSheetId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The form URI to share with responders. This opens a page that allows the user to submit responses but not edit the questions.
    */
  var responderUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The revision ID of the form. Used in the WriteControl in update requests to identify the revision on which the changes are based. The format of the revision ID may change over time, so it should be treated opaquely. A returned revision ID is only guaranteed to be valid for 24 hours after it has been returned and cannot be shared across users. If the revision ID is unchanged between calls, then the form has not changed. Conversely, a changed ID (for the same form and user) usually means the form has been updated; however, a changed ID can also be due to internal factors such as ID format changes.
    */
  var revisionId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The form's settings. This must be updated with UpdateSettingsRequest; it is ignored during `forms.create` and UpdateFormInfoRequest.
    */
  var settings: js.UndefOr[SchemaFormSettings] = js.undefined
}
object SchemaForm {
  
  inline def apply(): SchemaForm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaForm]
  }
  
  extension [Self <: SchemaForm](x: Self) {
    
    inline def setFormId(value: String): Self = StObject.set(x, "formId", value.asInstanceOf[js.Any])
    
    inline def setFormIdNull: Self = StObject.set(x, "formId", null)
    
    inline def setFormIdUndefined: Self = StObject.set(x, "formId", js.undefined)
    
    inline def setInfo(value: SchemaInfo): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
    
    inline def setItems(value: js.Array[SchemaItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SchemaItem*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setLinkedSheetId(value: String): Self = StObject.set(x, "linkedSheetId", value.asInstanceOf[js.Any])
    
    inline def setLinkedSheetIdNull: Self = StObject.set(x, "linkedSheetId", null)
    
    inline def setLinkedSheetIdUndefined: Self = StObject.set(x, "linkedSheetId", js.undefined)
    
    inline def setResponderUri(value: String): Self = StObject.set(x, "responderUri", value.asInstanceOf[js.Any])
    
    inline def setResponderUriNull: Self = StObject.set(x, "responderUri", null)
    
    inline def setResponderUriUndefined: Self = StObject.set(x, "responderUri", js.undefined)
    
    inline def setRevisionId(value: String): Self = StObject.set(x, "revisionId", value.asInstanceOf[js.Any])
    
    inline def setRevisionIdNull: Self = StObject.set(x, "revisionId", null)
    
    inline def setRevisionIdUndefined: Self = StObject.set(x, "revisionId", js.undefined)
    
    inline def setSettings(value: SchemaFormSettings): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
  }
}
