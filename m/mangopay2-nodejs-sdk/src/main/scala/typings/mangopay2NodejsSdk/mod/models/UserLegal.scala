package typings.mangopay2NodejsSdk.mod.models

import typings.mangopay2NodejsSdk.anon.MakeKeysRequiredPartialUs
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LEGAL
import typings.mangopay2NodejsSdk.mod.Timestamp
import typings.mangopay2NodejsSdk.mod.address.AddressType
import typings.mangopay2NodejsSdk.mod.user.UserLegalData
import typings.mangopay2NodejsSdk.typesMod.CountryISO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mangopay2-nodejs-sdk", "models.UserLegal")
@js.native
class UserLegal protected ()
  extends EntityBase[UserLegalData]
     with UserLegalData {
  def this(data: MakeKeysRequiredPartialUs) = this()
  /**
    * The official registered number of the business
    */
  /* CompleteClass */
  override var CompanyNumber: String = js.native
  /* CompleteClass */
  override var CreationDate: Double = js.native
  /**
    * The person's email address (not more than 12 consecutive numbers) - must be a valid email
    */
  /* CompleteClass */
  override var Email: String = js.native
  /**
    * The address of the company’s headquarters
    */
  /* CompleteClass */
  override var HeadquartersAddress: AddressType = js.native
  /* CompleteClass */
  override var Id: String = js.native
  /**
    * KYC Level (LIGHT or REGULAR)
    */
  /* CompleteClass */
  override var KYCLevel: typings.mangopay2NodejsSdk.mod.user.KYCLevel = js.native
  /**
    * Type for legal user.
    */
  /* CompleteClass */
  override var LegalPersonType: typings.mangopay2NodejsSdk.mod.user.LegalPersonType = js.native
  /**
    * The address of the company’s Legal representative person
    */
  /* CompleteClass */
  override var LegalRepresentativeAddress: AddressType = js.native
  /**
    * The date of birth of the company’s Legal representative person - be careful to set the right timezone (should be UTC) to avoid 00h becoming 23h (and hence interpreted as the day before)
    */
  /* CompleteClass */
  override var LegalRepresentativeBirthday: Timestamp = js.native
  /**
    * The country of residence of the company’s Legal representative person
    */
  /* CompleteClass */
  override var LegalRepresentativeCountryOfResidence: CountryISO = js.native
  /**
    * The email of the company’s Legal representative person - must be valid
    */
  /* CompleteClass */
  override var LegalRepresentativeEmail: String = js.native
  /**
    * The first name of the company’s Legal representative person
    */
  /* CompleteClass */
  override var LegalRepresentativeFirstName: String = js.native
  /**
    * The last name of the company’s Legal representative person
    */
  /* CompleteClass */
  override var LegalRepresentativeLastName: String = js.native
  /**
    * The nationality of the company’s Legal representative person
    */
  /* CompleteClass */
  override var LegalRepresentativeNationality: CountryISO = js.native
  /**
    * The name of the legal user
    */
  /* CompleteClass */
  override var Name: String = js.native
  /**
    * Type of user
    */
  /* CompleteClass */
  override var PersonType: typings.mangopay2NodejsSdk.mod.user.PersonType = js.native
  /* CompleteClass */
  @JSName("PersonType")
  override var PersonType_UserLegalData: LEGAL = js.native
  /* CompleteClass */
  override var ProofOfIdentity: String | Null = js.native
  /**
    * A MANGOPAY reference to the validated document of the proof of registration of the company
    */
  /* CompleteClass */
  override var ProofOfRegistration: String | Null = js.native
  /**
    * The shareholder declaration of the company
    */
  /* CompleteClass */
  override var ShareholderDeclaration: String | Null = js.native
  /**
    * The business statute of the company
    */
  /* CompleteClass */
  override var Statute: String | Null = js.native
  /* CompleteClass */
  override var Tag: String = js.native
  /**
    * Sets the person type for the model
    * @param personType
    */
  def setPersonType(`type`: typings.mangopay2NodejsSdk.mod.user.PersonType): Unit = js.native
}

