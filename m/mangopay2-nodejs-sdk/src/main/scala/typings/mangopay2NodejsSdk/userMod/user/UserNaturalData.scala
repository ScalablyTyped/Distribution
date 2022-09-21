package typings.mangopay2NodejsSdk.userMod.user

import typings.mangopay2NodejsSdk.addressMod.address.AddressData
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DECLARATIVE
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NATURAL
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NORMAL
import typings.mangopay2NodejsSdk.typesMod.CountryISO
import typings.mangopay2NodejsSdk.typesMod.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserNaturalData
  extends StObject
     with UserData {
  
  /**
    * The user address
    */
  var Address: String | AddressData
  
  /**
    * The date of birth of the user - be careful to set the right timezone (should be UTC) to avoid 00h becoming 23h (and hence interpreted as the day before)
    */
  var Birthday: Timestamp
  
  /**
    * The capacity of this user - for use with UBO declarations
    */
  var Capacity: NORMAL | DECLARATIVE
  
  /**
    * The user’s country of residence. ISO 3166-1 alpha-2 format is expected
    */
  var CountryOfResidence: CountryISO
  
  /**
    * The name of the user
    */
  var FirstName: String
  
  var IncomeRange: typings.mangopay2NodejsSdk.userMod.user.IncomeRange
  
  /**
    * The last name of the user
    */
  var LastName: String
  
  /**
    * The user’s nationality. ISO 3166-1 alpha-2 format is expected
    */
  var Nationality: CountryISO
  
  /**
    * User’s occupation, ie. Work
    */
  var Occupation: String
  
  @JSName("PersonType")
  var PersonType_UserNaturalData: NATURAL
  
  /**
    * Maximum length is 255 characters
    */
  var ProofOfAddress: String | Null
  
  /**
    * Maximum length is 255 characters
    */
  var ProofOfIdentity: String | Null
}
object UserNaturalData {
  
  inline def apply(
    Address: String | AddressData,
    Birthday: Timestamp,
    Capacity: NORMAL | DECLARATIVE,
    CountryOfResidence: CountryISO,
    CreationDate: Double,
    Email: String,
    FirstName: String,
    Id: String,
    IncomeRange: IncomeRange,
    KYCLevel: KYCLevel,
    LastName: String,
    Nationality: CountryISO,
    Occupation: String,
    Tag: String
  ): UserNaturalData = {
    val __obj = js.Dynamic.literal(Address = Address.asInstanceOf[js.Any], Birthday = Birthday.asInstanceOf[js.Any], Capacity = Capacity.asInstanceOf[js.Any], CountryOfResidence = CountryOfResidence.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], Email = Email.asInstanceOf[js.Any], FirstName = FirstName.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], IncomeRange = IncomeRange.asInstanceOf[js.Any], KYCLevel = KYCLevel.asInstanceOf[js.Any], LastName = LastName.asInstanceOf[js.Any], Nationality = Nationality.asInstanceOf[js.Any], Occupation = Occupation.asInstanceOf[js.Any], PersonType = "NATURAL", Tag = Tag.asInstanceOf[js.Any], ProofOfAddress = null, ProofOfIdentity = null)
    __obj.asInstanceOf[UserNaturalData]
  }
  
  extension [Self <: UserNaturalData](x: Self) {
    
    inline def setAddress(value: String | AddressData): Self = StObject.set(x, "Address", value.asInstanceOf[js.Any])
    
    inline def setBirthday(value: Timestamp): Self = StObject.set(x, "Birthday", value.asInstanceOf[js.Any])
    
    inline def setCapacity(value: NORMAL | DECLARATIVE): Self = StObject.set(x, "Capacity", value.asInstanceOf[js.Any])
    
    inline def setCountryOfResidence(value: CountryISO): Self = StObject.set(x, "CountryOfResidence", value.asInstanceOf[js.Any])
    
    inline def setFirstName(value: String): Self = StObject.set(x, "FirstName", value.asInstanceOf[js.Any])
    
    inline def setIncomeRange(value: IncomeRange): Self = StObject.set(x, "IncomeRange", value.asInstanceOf[js.Any])
    
    inline def setLastName(value: String): Self = StObject.set(x, "LastName", value.asInstanceOf[js.Any])
    
    inline def setNationality(value: CountryISO): Self = StObject.set(x, "Nationality", value.asInstanceOf[js.Any])
    
    inline def setOccupation(value: String): Self = StObject.set(x, "Occupation", value.asInstanceOf[js.Any])
    
    inline def setPersonType(value: NATURAL): Self = StObject.set(x, "PersonType", value.asInstanceOf[js.Any])
    
    inline def setProofOfAddress(value: String): Self = StObject.set(x, "ProofOfAddress", value.asInstanceOf[js.Any])
    
    inline def setProofOfAddressNull: Self = StObject.set(x, "ProofOfAddress", null)
    
    inline def setProofOfIdentity(value: String): Self = StObject.set(x, "ProofOfIdentity", value.asInstanceOf[js.Any])
    
    inline def setProofOfIdentityNull: Self = StObject.set(x, "ProofOfIdentity", null)
  }
}
