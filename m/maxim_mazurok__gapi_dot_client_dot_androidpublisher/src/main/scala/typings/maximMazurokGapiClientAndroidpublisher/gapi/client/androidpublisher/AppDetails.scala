package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppDetails extends StObject {
  
  /** The user-visible support email for this app. */
  var contactEmail: js.UndefOr[String] = js.undefined
  
  /** The user-visible support telephone number for this app. */
  var contactPhone: js.UndefOr[String] = js.undefined
  
  /** The user-visible website for this app. */
  var contactWebsite: js.UndefOr[String] = js.undefined
  
  /** Default language code, in BCP 47 format (eg "en-US"). */
  var defaultLanguage: js.UndefOr[String] = js.undefined
}
object AppDetails {
  
  inline def apply(): AppDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppDetails] (val x: Self) extends AnyVal {
    
    inline def setContactEmail(value: String): Self = StObject.set(x, "contactEmail", value.asInstanceOf[js.Any])
    
    inline def setContactEmailUndefined: Self = StObject.set(x, "contactEmail", js.undefined)
    
    inline def setContactPhone(value: String): Self = StObject.set(x, "contactPhone", value.asInstanceOf[js.Any])
    
    inline def setContactPhoneUndefined: Self = StObject.set(x, "contactPhone", js.undefined)
    
    inline def setContactWebsite(value: String): Self = StObject.set(x, "contactWebsite", value.asInstanceOf[js.Any])
    
    inline def setContactWebsiteUndefined: Self = StObject.set(x, "contactWebsite", js.undefined)
    
    inline def setDefaultLanguage(value: String): Self = StObject.set(x, "defaultLanguage", value.asInstanceOf[js.Any])
    
    inline def setDefaultLanguageUndefined: Self = StObject.set(x, "defaultLanguage", js.undefined)
  }
}
