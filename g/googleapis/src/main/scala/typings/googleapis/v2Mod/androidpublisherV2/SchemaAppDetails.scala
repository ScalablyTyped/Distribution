package typings.googleapis.v2Mod.androidpublisherV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAppDetails extends StObject {
  
  /**
    * The user-visible support email for this app.
    */
  var contactEmail: js.UndefOr[String] = js.undefined
  
  /**
    * The user-visible support telephone number for this app.
    */
  var contactPhone: js.UndefOr[String] = js.undefined
  
  /**
    * The user-visible website for this app.
    */
  var contactWebsite: js.UndefOr[String] = js.undefined
  
  /**
    * Default language code, in BCP 47 format (eg &quot;en-US&quot;).
    */
  var defaultLanguage: js.UndefOr[String] = js.undefined
}
object SchemaAppDetails {
  
  @scala.inline
  def apply(): SchemaAppDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppDetails]
  }
  
  @scala.inline
  implicit class SchemaAppDetailsMutableBuilder[Self <: SchemaAppDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContactEmail(value: String): Self = StObject.set(x, "contactEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactEmailUndefined: Self = StObject.set(x, "contactEmail", js.undefined)
    
    @scala.inline
    def setContactPhone(value: String): Self = StObject.set(x, "contactPhone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactPhoneUndefined: Self = StObject.set(x, "contactPhone", js.undefined)
    
    @scala.inline
    def setContactWebsite(value: String): Self = StObject.set(x, "contactWebsite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactWebsiteUndefined: Self = StObject.set(x, "contactWebsite", js.undefined)
    
    @scala.inline
    def setDefaultLanguage(value: String): Self = StObject.set(x, "defaultLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultLanguageUndefined: Self = StObject.set(x, "defaultLanguage", js.undefined)
  }
}
