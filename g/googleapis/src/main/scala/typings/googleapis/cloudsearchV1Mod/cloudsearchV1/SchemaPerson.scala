package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPerson extends StObject {
  
  /**
    * The person's email addresses
    */
  var emailAddresses: js.UndefOr[js.Array[SchemaEmailAddress]] = js.undefined
  
  /**
    * The resource name of the person to provide information about. See [`People.get`](https://developers.google.com/people/api/rest/v1/people/get) from the Google People API.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Obfuscated ID of a person.
    */
  var obfuscatedId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The person's name
    */
  var personNames: js.UndefOr[js.Array[SchemaName]] = js.undefined
  
  /**
    * The person's phone numbers
    */
  var phoneNumbers: js.UndefOr[js.Array[SchemaPhoneNumber]] = js.undefined
  
  /**
    * A person's read-only photo. A picture shown next to the person's name to help others recognize the person in search results.
    */
  var photos: js.UndefOr[js.Array[SchemaPhoto]] = js.undefined
}
object SchemaPerson {
  
  inline def apply(): SchemaPerson = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPerson]
  }
  
  extension [Self <: SchemaPerson](x: Self) {
    
    inline def setEmailAddresses(value: js.Array[SchemaEmailAddress]): Self = StObject.set(x, "emailAddresses", value.asInstanceOf[js.Any])
    
    inline def setEmailAddressesUndefined: Self = StObject.set(x, "emailAddresses", js.undefined)
    
    inline def setEmailAddressesVarargs(value: SchemaEmailAddress*): Self = StObject.set(x, "emailAddresses", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setObfuscatedId(value: String): Self = StObject.set(x, "obfuscatedId", value.asInstanceOf[js.Any])
    
    inline def setObfuscatedIdNull: Self = StObject.set(x, "obfuscatedId", null)
    
    inline def setObfuscatedIdUndefined: Self = StObject.set(x, "obfuscatedId", js.undefined)
    
    inline def setPersonNames(value: js.Array[SchemaName]): Self = StObject.set(x, "personNames", value.asInstanceOf[js.Any])
    
    inline def setPersonNamesUndefined: Self = StObject.set(x, "personNames", js.undefined)
    
    inline def setPersonNamesVarargs(value: SchemaName*): Self = StObject.set(x, "personNames", js.Array(value*))
    
    inline def setPhoneNumbers(value: js.Array[SchemaPhoneNumber]): Self = StObject.set(x, "phoneNumbers", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumbersUndefined: Self = StObject.set(x, "phoneNumbers", js.undefined)
    
    inline def setPhoneNumbersVarargs(value: SchemaPhoneNumber*): Self = StObject.set(x, "phoneNumbers", js.Array(value*))
    
    inline def setPhotos(value: js.Array[SchemaPhoto]): Self = StObject.set(x, "photos", value.asInstanceOf[js.Any])
    
    inline def setPhotosUndefined: Self = StObject.set(x, "photos", js.undefined)
    
    inline def setPhotosVarargs(value: SchemaPhoto*): Self = StObject.set(x, "photos", js.Array(value*))
  }
}
