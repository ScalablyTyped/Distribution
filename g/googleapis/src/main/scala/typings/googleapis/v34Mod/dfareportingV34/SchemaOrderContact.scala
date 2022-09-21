package typings.googleapis.v34Mod.dfareportingV34

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrderContact extends StObject {
  
  /**
    * Free-form information about this contact. It could be any information related to this contact in addition to type, title, name, and signature user profile ID.
    */
  var contactInfo: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name of this contact.
    */
  var contactName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Title of this contact.
    */
  var contactTitle: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Type of this contact.
    */
  var contactType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * ID of the user profile containing the signature that will be embedded into order documents.
    */
  var signatureUserProfileId: js.UndefOr[String | Null] = js.undefined
}
object SchemaOrderContact {
  
  inline def apply(): SchemaOrderContact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderContact]
  }
  
  extension [Self <: SchemaOrderContact](x: Self) {
    
    inline def setContactInfo(value: String): Self = StObject.set(x, "contactInfo", value.asInstanceOf[js.Any])
    
    inline def setContactInfoNull: Self = StObject.set(x, "contactInfo", null)
    
    inline def setContactInfoUndefined: Self = StObject.set(x, "contactInfo", js.undefined)
    
    inline def setContactName(value: String): Self = StObject.set(x, "contactName", value.asInstanceOf[js.Any])
    
    inline def setContactNameNull: Self = StObject.set(x, "contactName", null)
    
    inline def setContactNameUndefined: Self = StObject.set(x, "contactName", js.undefined)
    
    inline def setContactTitle(value: String): Self = StObject.set(x, "contactTitle", value.asInstanceOf[js.Any])
    
    inline def setContactTitleNull: Self = StObject.set(x, "contactTitle", null)
    
    inline def setContactTitleUndefined: Self = StObject.set(x, "contactTitle", js.undefined)
    
    inline def setContactType(value: String): Self = StObject.set(x, "contactType", value.asInstanceOf[js.Any])
    
    inline def setContactTypeNull: Self = StObject.set(x, "contactType", null)
    
    inline def setContactTypeUndefined: Self = StObject.set(x, "contactType", js.undefined)
    
    inline def setSignatureUserProfileId(value: String): Self = StObject.set(x, "signatureUserProfileId", value.asInstanceOf[js.Any])
    
    inline def setSignatureUserProfileIdNull: Self = StObject.set(x, "signatureUserProfileId", null)
    
    inline def setSignatureUserProfileIdUndefined: Self = StObject.set(x, "signatureUserProfileId", js.undefined)
  }
}
