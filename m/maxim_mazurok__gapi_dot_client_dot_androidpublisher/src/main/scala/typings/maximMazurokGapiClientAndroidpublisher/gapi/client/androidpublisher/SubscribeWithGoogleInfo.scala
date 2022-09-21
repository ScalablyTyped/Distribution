package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubscribeWithGoogleInfo extends StObject {
  
  /** The email address of the user when the subscription was purchased. */
  var emailAddress: js.UndefOr[String] = js.undefined
  
  /** The family name of the user when the subscription was purchased. */
  var familyName: js.UndefOr[String] = js.undefined
  
  /** The given name of the user when the subscription was purchased. */
  var givenName: js.UndefOr[String] = js.undefined
  
  /** The Google profile id of the user when the subscription was purchased. */
  var profileId: js.UndefOr[String] = js.undefined
  
  /** The profile name of the user when the subscription was purchased. */
  var profileName: js.UndefOr[String] = js.undefined
}
object SubscribeWithGoogleInfo {
  
  inline def apply(): SubscribeWithGoogleInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubscribeWithGoogleInfo]
  }
  
  extension [Self <: SubscribeWithGoogleInfo](x: Self) {
    
    inline def setEmailAddress(value: String): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
    
    inline def setEmailAddressUndefined: Self = StObject.set(x, "emailAddress", js.undefined)
    
    inline def setFamilyName(value: String): Self = StObject.set(x, "familyName", value.asInstanceOf[js.Any])
    
    inline def setFamilyNameUndefined: Self = StObject.set(x, "familyName", js.undefined)
    
    inline def setGivenName(value: String): Self = StObject.set(x, "givenName", value.asInstanceOf[js.Any])
    
    inline def setGivenNameUndefined: Self = StObject.set(x, "givenName", js.undefined)
    
    inline def setProfileId(value: String): Self = StObject.set(x, "profileId", value.asInstanceOf[js.Any])
    
    inline def setProfileIdUndefined: Self = StObject.set(x, "profileId", js.undefined)
    
    inline def setProfileName(value: String): Self = StObject.set(x, "profileName", value.asInstanceOf[js.Any])
    
    inline def setProfileNameUndefined: Self = StObject.set(x, "profileName", js.undefined)
  }
}
