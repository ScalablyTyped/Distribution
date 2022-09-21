package typings.mangopay2NodejsSdk.mod.models

import typings.mangopay2NodejsSdk.addressMod.address.AddressType
import typings.mangopay2NodejsSdk.anon.MakeKeysRequiredPartialUsCompanyNumber
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LEGAL
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYER
import typings.mangopay2NodejsSdk.typesMod.CountryISO
import typings.mangopay2NodejsSdk.typesMod.Timestamp
import typings.mangopay2NodejsSdk.userMod.user.UserLegalData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mangopay2-nodejs-sdk", "models.UserLegalPayer")
@js.native
open class UserLegalPayer protected ()
  extends EntityBase[UserLegalData]
     with UserLegalData {
  def this(data: MakeKeysRequiredPartialUsCompanyNumber) = this()
  
  /**
    * The official registered number of the business
    */
  /* CompleteClass */
  var CompanyNumber: String = js.native
  
  /* CompleteClass */
  var CreationDate: Double = js.native
  
  /**
    * The person's email address (not more than 12 consecutive numbers) - must be a valid email
    */
  /* CompleteClass */
  var Email: String = js.native
  
  /**
    * The address of the company’s headquarters
    */
  /* CompleteClass */
  var HeadquartersAddress: AddressType = js.native
  
  /* CompleteClass */
  var Id: String = js.native
  
  /**
    * KYC Level (LIGHT or REGULAR)
    */
  /* CompleteClass */
  var KYCLevel: typings.mangopay2NodejsSdk.userMod.user.KYCLevel = js.native
  
  /**
    * Type for legal user.
    */
  /* CompleteClass */
  var LegalPersonType: typings.mangopay2NodejsSdk.userMod.user.LegalPersonType = js.native
  
  /**
    * The address of the company’s Legal representative person
    */
  /* CompleteClass */
  var LegalRepresentativeAddress: AddressType = js.native
  
  /**
    * The date of birth of the company’s Legal representative person - be careful to set the right timezone (should be UTC) to avoid 00h becoming 23h (and hence interpreted as the day before)
    */
  /* CompleteClass */
  var LegalRepresentativeBirthday: Timestamp = js.native
  
  /**
    * The country of residence of the company’s Legal representative person
    */
  /* CompleteClass */
  var LegalRepresentativeCountryOfResidence: CountryISO = js.native
  
  /**
    * The email of the company’s Legal representative person - must be valid
    */
  /* CompleteClass */
  var LegalRepresentativeEmail: String = js.native
  
  /**
    * The first name of the company’s Legal representative person
    */
  /* CompleteClass */
  var LegalRepresentativeFirstName: String = js.native
  
  /**
    * The last name of the company’s Legal representative person
    */
  /* CompleteClass */
  var LegalRepresentativeLastName: String = js.native
  
  /**
    * The nationality of the company’s Legal representative person
    */
  /* CompleteClass */
  var LegalRepresentativeNationality: CountryISO = js.native
  
  /**
    * The name of the legal user
    */
  /* CompleteClass */
  var Name: String = js.native
  
  /**
    * Type of user
    */
  /* CompleteClass */
  var PersonType: typings.mangopay2NodejsSdk.userMod.user.PersonType = js.native
  /* CompleteClass */
  @JSName("PersonType")
  var PersonType_UserLegalData: LEGAL = js.native
  
  /* CompleteClass */
  var ProofOfIdentity: String | Null = js.native
  
  /**
    * A MANGOPAY reference to the validated document of the proof of registration of the company
    */
  /* CompleteClass */
  var ProofOfRegistration: String | Null = js.native
  
  /**
    * The shareholder declaration of the company
    */
  /* CompleteClass */
  var ShareholderDeclaration: String | Null = js.native
  
  /**
    * The business statute of the company
    */
  /* CompleteClass */
  var Statute: String | Null = js.native
  
  /* CompleteClass */
  var Tag: String = js.native
  
  @JSName("UserCategory")
  var UserCategory_UserLegalPayer: PAYER = js.native
  
  /**
    * Sets the person type for the model
    * @param personType
    */
  def setPersonType(`type`: typings.mangopay2NodejsSdk.userMod.user.PersonType): Unit = js.native
  
  def setUserCategory(category: typings.mangopay2NodejsSdk.userMod.user.UserCategory): Unit = js.native
}
