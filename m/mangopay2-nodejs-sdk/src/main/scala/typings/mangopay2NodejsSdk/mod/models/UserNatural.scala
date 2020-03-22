package typings.mangopay2NodejsSdk.mod.models

import typings.mangopay2NodejsSdk.MakeKeysRequiredPartialUsAddress
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DECLARATIVE
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NATURAL
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NORMAL
import typings.mangopay2NodejsSdk.mod.Timestamp
import typings.mangopay2NodejsSdk.mod.address.AddressData
import typings.mangopay2NodejsSdk.mod.user.UserNaturalData
import typings.mangopay2NodejsSdk.typesMod.CountryISO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mangopay2-nodejs-sdk", "models.UserNatural")
@js.native
class UserNatural protected ()
  extends EntityBase[UserNaturalData]
     with UserNaturalData {
  def this(data: MakeKeysRequiredPartialUsAddress) = this()
  /**
    * The user address
    */
  /* CompleteClass */
  override var Address: String | AddressData = js.native
  /**
    * The date of birth of the user - be careful to set the right timezone (should be UTC) to avoid 00h becoming 23h (and hence interpreted as the day before)
    */
  /* CompleteClass */
  override var Birthday: Timestamp = js.native
  /**
    * The capacity of this user - for use with UBO declarations
    */
  /* CompleteClass */
  override var Capacity: NORMAL | DECLARATIVE = js.native
  /**
    * The user’s country of residence. ISO 3166-1 alpha-2 format is expected
    */
  /* CompleteClass */
  override var CountryOfResidence: CountryISO = js.native
  /* CompleteClass */
  override var CreationDate: Double = js.native
  /**
    * The person's email address (not more than 12 consecutive numbers) - must be a valid email
    */
  /* CompleteClass */
  override var Email: String = js.native
  /**
    * The name of the user
    */
  /* CompleteClass */
  override var FirstName: String = js.native
  /* CompleteClass */
  override var Id: String = js.native
  /* CompleteClass */
  override var IncomeRange: typings.mangopay2NodejsSdk.mod.user.IncomeRange = js.native
  /**
    * KYC Level (LIGHT or REGULAR)
    */
  /* CompleteClass */
  override var KYCLevel: typings.mangopay2NodejsSdk.mod.user.KYCLevel = js.native
  /**
    * The last name of the user
    */
  /* CompleteClass */
  override var LastName: String = js.native
  /**
    * The user’s nationality. ISO 3166-1 alpha-2 format is expected
    */
  /* CompleteClass */
  override var Nationality: CountryISO = js.native
  /**
    * User’s occupation, ie. Work
    */
  /* CompleteClass */
  override var Occupation: String = js.native
  /**
    * Type of user
    */
  /* CompleteClass */
  override var PersonType: typings.mangopay2NodejsSdk.mod.user.PersonType = js.native
  /* CompleteClass */
  @JSName("PersonType")
  override var PersonType_UserNaturalData: NATURAL = js.native
  /**
    * Maximum length is 255 characters
    */
  /* CompleteClass */
  override var ProofOfAddress: String | Null = js.native
  /**
    * Maximum length is 255 characters
    */
  /* CompleteClass */
  override var ProofOfIdentity: String | Null = js.native
  /* CompleteClass */
  override var Tag: String = js.native
  /**
    * Sets the person type for the model
    * @param personType
    */
  def setPersonType(`type`: typings.mangopay2NodejsSdk.mod.user.PersonType): Unit = js.native
}

