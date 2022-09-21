package typings.googleapis.essentialcontactsV1Mod.essentialcontactsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudEssentialcontactsV1Contact extends StObject {
  
  /**
    * Required. The email address to send notifications to. This does not need to be a Google account.
    */
  var email: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The preferred language for notifications, as a ISO 639-1 language code. See [Supported languages](https://cloud.google.com/resource-manager/docs/managing-notification-contacts#supported-languages) for a list of supported languages.
    */
  var languageTag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The identifier for the contact. Format: {resource_type\}/{resource_id\}/contacts/{contact_id\}
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The categories of notifications that the contact will receive communications for.
    */
  var notificationCategorySubscriptions: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The last time the validation_state was updated, either manually or automatically. A contact is considered stale if its validation state was updated more than 1 year ago.
    */
  var validateTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The validity of the contact. A contact is considered valid if it is the correct recipient for notifications for a particular resource.
    */
  var validationState: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudEssentialcontactsV1Contact {
  
  inline def apply(): SchemaGoogleCloudEssentialcontactsV1Contact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudEssentialcontactsV1Contact]
  }
  
  extension [Self <: SchemaGoogleCloudEssentialcontactsV1Contact](x: Self) {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailNull: Self = StObject.set(x, "email", null)
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setLanguageTag(value: String): Self = StObject.set(x, "languageTag", value.asInstanceOf[js.Any])
    
    inline def setLanguageTagNull: Self = StObject.set(x, "languageTag", null)
    
    inline def setLanguageTagUndefined: Self = StObject.set(x, "languageTag", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNotificationCategorySubscriptions(value: js.Array[String]): Self = StObject.set(x, "notificationCategorySubscriptions", value.asInstanceOf[js.Any])
    
    inline def setNotificationCategorySubscriptionsNull: Self = StObject.set(x, "notificationCategorySubscriptions", null)
    
    inline def setNotificationCategorySubscriptionsUndefined: Self = StObject.set(x, "notificationCategorySubscriptions", js.undefined)
    
    inline def setNotificationCategorySubscriptionsVarargs(value: String*): Self = StObject.set(x, "notificationCategorySubscriptions", js.Array(value*))
    
    inline def setValidateTime(value: String): Self = StObject.set(x, "validateTime", value.asInstanceOf[js.Any])
    
    inline def setValidateTimeNull: Self = StObject.set(x, "validateTime", null)
    
    inline def setValidateTimeUndefined: Self = StObject.set(x, "validateTime", js.undefined)
    
    inline def setValidationState(value: String): Self = StObject.set(x, "validationState", value.asInstanceOf[js.Any])
    
    inline def setValidationStateNull: Self = StObject.set(x, "validationState", null)
    
    inline def setValidationStateUndefined: Self = StObject.set(x, "validationState", js.undefined)
  }
}
