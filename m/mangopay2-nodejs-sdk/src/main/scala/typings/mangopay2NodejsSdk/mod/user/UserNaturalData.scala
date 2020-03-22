package typings.mangopay2NodejsSdk.mod.user

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DECLARATIVE
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NATURAL
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NORMAL
import typings.mangopay2NodejsSdk.mod.Timestamp
import typings.mangopay2NodejsSdk.mod.address.AddressData
import typings.mangopay2NodejsSdk.typesMod.CountryISO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserNaturalData extends UserData {
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
  var IncomeRange: typings.mangopay2NodejsSdk.mod.user.IncomeRange
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
  @scala.inline
  def apply(
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
    PersonType: NATURAL,
    Tag: String,
    ProofOfAddress: String = null,
    ProofOfIdentity: String = null
  ): UserNaturalData = {
    val __obj = js.Dynamic.literal(Address = Address.asInstanceOf[js.Any], Birthday = Birthday.asInstanceOf[js.Any], Capacity = Capacity.asInstanceOf[js.Any], CountryOfResidence = CountryOfResidence.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], Email = Email.asInstanceOf[js.Any], FirstName = FirstName.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], IncomeRange = IncomeRange.asInstanceOf[js.Any], KYCLevel = KYCLevel.asInstanceOf[js.Any], LastName = LastName.asInstanceOf[js.Any], Nationality = Nationality.asInstanceOf[js.Any], Occupation = Occupation.asInstanceOf[js.Any], PersonType = PersonType.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any])
    if (ProofOfAddress != null) __obj.updateDynamic("ProofOfAddress")(ProofOfAddress.asInstanceOf[js.Any])
    if (ProofOfIdentity != null) __obj.updateDynamic("ProofOfIdentity")(ProofOfIdentity.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserNaturalData]
  }
}

