package typings.mangopay2NodejsSdk.mod.user

import typings.mangopay2NodejsSdk.mod.entityBase.EntityBaseData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserData extends EntityBaseData {
  
  /**
    * The person's email address (not more than 12 consecutive numbers) - must be a valid email
    */
  var Email: String = js.native
  
  /**
    * KYC Level (LIGHT or REGULAR)
    */
  var KYCLevel: typings.mangopay2NodejsSdk.mod.user.KYCLevel = js.native
  
  /**
    * Type of user
    */
  var PersonType: typings.mangopay2NodejsSdk.mod.user.PersonType = js.native
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
  implicit class UserDataOps[Self <: UserData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEmail(value: String): Self = this.set("Email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKYCLevel(value: KYCLevel): Self = this.set("KYCLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersonType(value: PersonType): Self = this.set("PersonType", value.asInstanceOf[js.Any])
  }
}
