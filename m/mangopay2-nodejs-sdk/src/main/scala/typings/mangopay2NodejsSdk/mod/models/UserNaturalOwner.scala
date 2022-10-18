package typings.mangopay2NodejsSdk.mod.models

import typings.mangopay2NodejsSdk.anon.MakeKeysRequiredPartialUsCapacity
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DECLARATIVE
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NATURAL
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NORMAL
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OWNER
import typings.mangopay2NodejsSdk.typingsModelsAddressMod.address.AddressData
import typings.mangopay2NodejsSdk.typingsModelsUserMod.user.UserNaturalData
import typings.mangopay2NodejsSdk.typingsTypesMod.CountryISO
import typings.mangopay2NodejsSdk.typingsTypesMod.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mangopay2-nodejs-sdk", "models.UserNaturalOwner")
@js.native
open class UserNaturalOwner protected ()
  extends EntityBase[UserNaturalData]
     with UserNaturalData {
  def this(data: MakeKeysRequiredPartialUsCapacity) = this()
  
  /**
    * The user address
    */
  /* CompleteClass */
  var Address: String | AddressData = js.native
  
  /**
    * The date of birth of the user - be careful to set the right timezone (should be UTC) to avoid 00h becoming 23h (and hence interpreted as the day before)
    */
  /* CompleteClass */
  var Birthday: Timestamp = js.native
  
  /**
    * The capacity of this user - for use with UBO declarations
    */
  /* CompleteClass */
  var Capacity: NORMAL | DECLARATIVE = js.native
  
  /**
    * The user’s country of residence. ISO 3166-1 alpha-2 format is expected
    */
  /* CompleteClass */
  var CountryOfResidence: CountryISO = js.native
  
  /* CompleteClass */
  var CreationDate: Double = js.native
  
  /**
    * The person's email address (not more than 12 consecutive numbers) - must be a valid email
    */
  /* CompleteClass */
  var Email: String = js.native
  
  /**
    * The name of the user
    */
  /* CompleteClass */
  var FirstName: String = js.native
  
  /* CompleteClass */
  var Id: String = js.native
  
  /* CompleteClass */
  var IncomeRange: typings.mangopay2NodejsSdk.typingsModelsUserMod.user.IncomeRange = js.native
  
  /**
    * KYC Level (LIGHT or REGULAR)
    */
  /* CompleteClass */
  var KYCLevel: typings.mangopay2NodejsSdk.typingsModelsUserMod.user.KYCLevel = js.native
  
  /**
    * The last name of the user
    */
  /* CompleteClass */
  var LastName: String = js.native
  
  /**
    * The user’s nationality. ISO 3166-1 alpha-2 format is expected
    */
  /* CompleteClass */
  var Nationality: CountryISO = js.native
  
  /**
    * User’s occupation, ie. Work
    */
  /* CompleteClass */
  var Occupation: String = js.native
  
  /**
    * Type of user
    */
  /* CompleteClass */
  var PersonType: typings.mangopay2NodejsSdk.typingsModelsUserMod.user.PersonType = js.native
  /* CompleteClass */
  @JSName("PersonType")
  var PersonType_UserNaturalData: NATURAL = js.native
  
  /**
    * Maximum length is 255 characters
    */
  /* CompleteClass */
  var ProofOfAddress: String | Null = js.native
  
  /**
    * Maximum length is 255 characters
    */
  /* CompleteClass */
  var ProofOfIdentity: String | Null = js.native
  
  /* CompleteClass */
  var Tag: String = js.native
  
  @JSName("UserCategory")
  var UserCategory_UserNaturalOwner: OWNER = js.native
  
  /**
    * Sets the person type for the model
    * @param personType
    */
  def setPersonType(`type`: typings.mangopay2NodejsSdk.typingsModelsUserMod.user.PersonType): Unit = js.native
  
  def setUserCategory(category: typings.mangopay2NodejsSdk.typingsModelsUserMod.user.UserCategory): Unit = js.native
}
