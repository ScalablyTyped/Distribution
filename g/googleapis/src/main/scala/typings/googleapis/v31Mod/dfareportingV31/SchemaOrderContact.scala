package typings.googleapis.v31Mod.dfareportingV31

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contact of an order.
  */
@js.native
trait SchemaOrderContact extends StObject {
  
  /**
    * Free-form information about this contact. It could be any information
    * related to this contact in addition to type, title, name, and signature
    * user profile ID.
    */
  var contactInfo: js.UndefOr[String] = js.native
  
  /**
    * Name of this contact.
    */
  var contactName: js.UndefOr[String] = js.native
  
  /**
    * Title of this contact.
    */
  var contactTitle: js.UndefOr[String] = js.native
  
  /**
    * Type of this contact.
    */
  var contactType: js.UndefOr[String] = js.native
  
  /**
    * ID of the user profile containing the signature that will be embedded
    * into order documents.
    */
  var signatureUserProfileId: js.UndefOr[String] = js.native
}
object SchemaOrderContact {
  
  @scala.inline
  def apply(): SchemaOrderContact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderContact]
  }
  
  @scala.inline
  implicit class SchemaOrderContactMutableBuilder[Self <: SchemaOrderContact] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContactInfo(value: String): Self = StObject.set(x, "contactInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactInfoUndefined: Self = StObject.set(x, "contactInfo", js.undefined)
    
    @scala.inline
    def setContactName(value: String): Self = StObject.set(x, "contactName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactNameUndefined: Self = StObject.set(x, "contactName", js.undefined)
    
    @scala.inline
    def setContactTitle(value: String): Self = StObject.set(x, "contactTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactTitleUndefined: Self = StObject.set(x, "contactTitle", js.undefined)
    
    @scala.inline
    def setContactType(value: String): Self = StObject.set(x, "contactType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactTypeUndefined: Self = StObject.set(x, "contactType", js.undefined)
    
    @scala.inline
    def setSignatureUserProfileId(value: String): Self = StObject.set(x, "signatureUserProfileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureUserProfileIdUndefined: Self = StObject.set(x, "signatureUserProfileId", js.undefined)
  }
}
