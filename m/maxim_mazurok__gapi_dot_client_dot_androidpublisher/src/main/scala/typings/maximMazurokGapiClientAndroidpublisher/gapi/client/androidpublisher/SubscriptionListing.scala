package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubscriptionListing extends StObject {
  
  /** A list of benefits shown to the user on platforms such as the Play Store and in restoration flows in the language of this listing. Plain text. Ordered list of at most four benefits. */
  var benefits: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The description of this subscription in the language of this listing. Maximum length - 80 characters. Plain text. */
  var description: js.UndefOr[String] = js.undefined
  
  /** Required. The language of this listing, as defined by BCP-47, e.g. "en-US". */
  var languageCode: js.UndefOr[String] = js.undefined
  
  /** Required. The title of this subscription in the language of this listing. Plain text. */
  var title: js.UndefOr[String] = js.undefined
}
object SubscriptionListing {
  
  inline def apply(): SubscriptionListing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubscriptionListing]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubscriptionListing] (val x: Self) extends AnyVal {
    
    inline def setBenefits(value: js.Array[String]): Self = StObject.set(x, "benefits", value.asInstanceOf[js.Any])
    
    inline def setBenefitsUndefined: Self = StObject.set(x, "benefits", js.undefined)
    
    inline def setBenefitsVarargs(value: String*): Self = StObject.set(x, "benefits", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
