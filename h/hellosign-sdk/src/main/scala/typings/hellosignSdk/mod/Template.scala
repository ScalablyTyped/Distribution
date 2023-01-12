package typings.hellosignSdk.mod

import typings.hellosignSdk.anon.Customfields
import typings.hellosignSdk.anon.NameOrder
import typings.hellosignSdk.anon.NameString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<{  template_id :string,   title :string,   message :string,   metadata :hellosign-sdk.hellosign-sdk.GenericObject<Metadata>,   signer_roles :std.Array<{  name :string,   order :number}>,   cc_roles :std.Array<{  name :string}>,   documents :std.Array<{  name :string,   index :number,   field_groups :std.Array<{  name :string,   rule :string}>,   form_fields :std.Array<{  api_id :string,   name :string,   type :string,   x :number,   y :number,   width :number,   height :number,   required :boolean,   group :string | undefined}>,   custom_fields :std.Array<hellosign-sdk.hellosign-sdk.CustomFieldTemplate>}>,   custom_fields :std.Array<hellosign-sdk.hellosign-sdk.CustomFieldTemplate>,   accounts :std.Array<hellosign-sdk.hellosign-sdk.BaseAccount>,   is_creator :boolean,   is_embedded :boolean,   can_edit :boolean,   is_locked :boolean}> */
trait Template[Metadata] extends StObject {
  
  var accounts: js.UndefOr[js.Array[BaseAccount]] = js.undefined
  
  var can_edit: js.UndefOr[Boolean] = js.undefined
  
  var cc_roles: js.UndefOr[js.Array[NameString]] = js.undefined
  
  var custom_fields: js.UndefOr[js.Array[CustomFieldTemplate]] = js.undefined
  
  var documents: js.UndefOr[js.Array[Customfields]] = js.undefined
  
  var is_creator: js.UndefOr[Boolean] = js.undefined
  
  var is_embedded: js.UndefOr[Boolean] = js.undefined
  
  var is_locked: js.UndefOr[Boolean] = js.undefined
  
  var message: js.UndefOr[String] = js.undefined
  
  var metadata: js.UndefOr[GenericObject[Metadata]] = js.undefined
  
  var signer_roles: js.UndefOr[js.Array[NameOrder]] = js.undefined
  
  var template_id: js.UndefOr[String] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
}
object Template {
  
  inline def apply[Metadata](): Template[Metadata] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Template[Metadata]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Template[?], Metadata] (val x: Self & Template[Metadata]) extends AnyVal {
    
    inline def setAccounts(value: js.Array[BaseAccount]): Self = StObject.set(x, "accounts", value.asInstanceOf[js.Any])
    
    inline def setAccountsUndefined: Self = StObject.set(x, "accounts", js.undefined)
    
    inline def setAccountsVarargs(value: BaseAccount*): Self = StObject.set(x, "accounts", js.Array(value*))
    
    inline def setCan_edit(value: Boolean): Self = StObject.set(x, "can_edit", value.asInstanceOf[js.Any])
    
    inline def setCan_editUndefined: Self = StObject.set(x, "can_edit", js.undefined)
    
    inline def setCc_roles(value: js.Array[NameString]): Self = StObject.set(x, "cc_roles", value.asInstanceOf[js.Any])
    
    inline def setCc_rolesUndefined: Self = StObject.set(x, "cc_roles", js.undefined)
    
    inline def setCc_rolesVarargs(value: NameString*): Self = StObject.set(x, "cc_roles", js.Array(value*))
    
    inline def setCustom_fields(value: js.Array[CustomFieldTemplate]): Self = StObject.set(x, "custom_fields", value.asInstanceOf[js.Any])
    
    inline def setCustom_fieldsUndefined: Self = StObject.set(x, "custom_fields", js.undefined)
    
    inline def setCustom_fieldsVarargs(value: CustomFieldTemplate*): Self = StObject.set(x, "custom_fields", js.Array(value*))
    
    inline def setDocuments(value: js.Array[Customfields]): Self = StObject.set(x, "documents", value.asInstanceOf[js.Any])
    
    inline def setDocumentsUndefined: Self = StObject.set(x, "documents", js.undefined)
    
    inline def setDocumentsVarargs(value: Customfields*): Self = StObject.set(x, "documents", js.Array(value*))
    
    inline def setIs_creator(value: Boolean): Self = StObject.set(x, "is_creator", value.asInstanceOf[js.Any])
    
    inline def setIs_creatorUndefined: Self = StObject.set(x, "is_creator", js.undefined)
    
    inline def setIs_embedded(value: Boolean): Self = StObject.set(x, "is_embedded", value.asInstanceOf[js.Any])
    
    inline def setIs_embeddedUndefined: Self = StObject.set(x, "is_embedded", js.undefined)
    
    inline def setIs_locked(value: Boolean): Self = StObject.set(x, "is_locked", value.asInstanceOf[js.Any])
    
    inline def setIs_lockedUndefined: Self = StObject.set(x, "is_locked", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setMetadata(value: GenericObject[Metadata]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setSigner_roles(value: js.Array[NameOrder]): Self = StObject.set(x, "signer_roles", value.asInstanceOf[js.Any])
    
    inline def setSigner_rolesUndefined: Self = StObject.set(x, "signer_roles", js.undefined)
    
    inline def setSigner_rolesVarargs(value: NameOrder*): Self = StObject.set(x, "signer_roles", js.Array(value*))
    
    inline def setTemplate_id(value: String): Self = StObject.set(x, "template_id", value.asInstanceOf[js.Any])
    
    inline def setTemplate_idUndefined: Self = StObject.set(x, "template_id", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
