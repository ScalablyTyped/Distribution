package typings.mangopay2NodejsSdk.typingsModelsUserMod.user

import typings.mangopay2NodejsSdk.typingsModelsEntityBaseMod.entityBase.EntityBaseData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserData
  extends StObject
     with EntityBaseData {
  
  /**
    * The person's email address (not more than 12 consecutive numbers) - must be a valid email
    */
  var Email: String
  
  /**
    * KYC Level (LIGHT or REGULAR)
    */
  var KYCLevel: typings.mangopay2NodejsSdk.typingsModelsUserMod.user.KYCLevel
  
  /**
    * Type of user
    */
  var PersonType: typings.mangopay2NodejsSdk.typingsModelsUserMod.user.PersonType
  
  /**
    * Whether or not the user has accepted the MANGOPAY Terms and Conditions.
    */
  var TermsAndConditionsAccepted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Category of the user. May take one of the following values:
    * PAYER - Users who only use MANGOPAY to give money to other users
    * OWNER - Users who use MANGOPAY to receive funds. Please note that a user needs to be KYC validated to perform payouts
    */
  var UserCategory: js.UndefOr[typings.mangopay2NodejsSdk.typingsModelsUserMod.user.UserCategory] = js.undefined
}
object UserData {
  
  inline def apply(
    CreationDate: Double,
    Email: String,
    Id: String,
    KYCLevel: KYCLevel,
    PersonType: PersonType,
    Tag: String
  ): UserData = {
    val __obj = js.Dynamic.literal(CreationDate = CreationDate.asInstanceOf[js.Any], Email = Email.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], KYCLevel = KYCLevel.asInstanceOf[js.Any], PersonType = PersonType.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UserData] (val x: Self) extends AnyVal {
    
    inline def setEmail(value: String): Self = StObject.set(x, "Email", value.asInstanceOf[js.Any])
    
    inline def setKYCLevel(value: KYCLevel): Self = StObject.set(x, "KYCLevel", value.asInstanceOf[js.Any])
    
    inline def setPersonType(value: PersonType): Self = StObject.set(x, "PersonType", value.asInstanceOf[js.Any])
    
    inline def setTermsAndConditionsAccepted(value: Boolean): Self = StObject.set(x, "TermsAndConditionsAccepted", value.asInstanceOf[js.Any])
    
    inline def setTermsAndConditionsAcceptedUndefined: Self = StObject.set(x, "TermsAndConditionsAccepted", js.undefined)
    
    inline def setUserCategory(value: UserCategory): Self = StObject.set(x, "UserCategory", value.asInstanceOf[js.Any])
    
    inline def setUserCategoryUndefined: Self = StObject.set(x, "UserCategory", js.undefined)
  }
}
