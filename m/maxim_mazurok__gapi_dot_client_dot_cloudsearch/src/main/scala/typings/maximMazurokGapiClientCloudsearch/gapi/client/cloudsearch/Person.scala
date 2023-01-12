package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Person extends StObject {
  
  /** The person's email addresses */
  var emailAddresses: js.UndefOr[js.Array[EmailAddress]] = js.undefined
  
  /** The resource name of the person to provide information about. See [`People.get`](https://developers.google.com/people/api/rest/v1/people/get) from the Google People API. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Obfuscated ID of a person. */
  var obfuscatedId: js.UndefOr[String] = js.undefined
  
  /** The person's name */
  var personNames: js.UndefOr[js.Array[Name]] = js.undefined
  
  /** The person's phone numbers */
  var phoneNumbers: js.UndefOr[js.Array[PhoneNumber]] = js.undefined
  
  /** A person's read-only photo. A picture shown next to the person's name to help others recognize the person in search results. */
  var photos: js.UndefOr[js.Array[Photo]] = js.undefined
}
object Person {
  
  inline def apply(): Person = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Person]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Person] (val x: Self) extends AnyVal {
    
    inline def setEmailAddresses(value: js.Array[EmailAddress]): Self = StObject.set(x, "emailAddresses", value.asInstanceOf[js.Any])
    
    inline def setEmailAddressesUndefined: Self = StObject.set(x, "emailAddresses", js.undefined)
    
    inline def setEmailAddressesVarargs(value: EmailAddress*): Self = StObject.set(x, "emailAddresses", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setObfuscatedId(value: String): Self = StObject.set(x, "obfuscatedId", value.asInstanceOf[js.Any])
    
    inline def setObfuscatedIdUndefined: Self = StObject.set(x, "obfuscatedId", js.undefined)
    
    inline def setPersonNames(value: js.Array[Name]): Self = StObject.set(x, "personNames", value.asInstanceOf[js.Any])
    
    inline def setPersonNamesUndefined: Self = StObject.set(x, "personNames", js.undefined)
    
    inline def setPersonNamesVarargs(value: Name*): Self = StObject.set(x, "personNames", js.Array(value*))
    
    inline def setPhoneNumbers(value: js.Array[PhoneNumber]): Self = StObject.set(x, "phoneNumbers", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumbersUndefined: Self = StObject.set(x, "phoneNumbers", js.undefined)
    
    inline def setPhoneNumbersVarargs(value: PhoneNumber*): Self = StObject.set(x, "phoneNumbers", js.Array(value*))
    
    inline def setPhotos(value: js.Array[Photo]): Self = StObject.set(x, "photos", value.asInstanceOf[js.Any])
    
    inline def setPhotosUndefined: Self = StObject.set(x, "photos", js.undefined)
    
    inline def setPhotosVarargs(value: Photo*): Self = StObject.set(x, "photos", js.Array(value*))
  }
}
