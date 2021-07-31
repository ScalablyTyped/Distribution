package typings.mangopay2NodejsSdk.mod.user

import typings.mangopay2NodejsSdk.mod.entityBase.EntityBaseData
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
  var KYCLevel: typings.mangopay2NodejsSdk.mod.user.KYCLevel
  
  /**
    * Type of user
    */
  var PersonType: typings.mangopay2NodejsSdk.mod.user.PersonType
}
object UserData {
  
  @scala.inline
  def apply(
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
  implicit class UserDataMutableBuilder[Self <: UserData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "Email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKYCLevel(value: KYCLevel): Self = StObject.set(x, "KYCLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersonType(value: PersonType): Self = StObject.set(x, "PersonType", value.asInstanceOf[js.Any])
  }
}
