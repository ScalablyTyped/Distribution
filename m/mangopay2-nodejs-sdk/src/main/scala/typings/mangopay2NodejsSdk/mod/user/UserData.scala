package typings.mangopay2NodejsSdk.mod.user

import typings.mangopay2NodejsSdk.mod.entityBase.EntityBaseData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserData extends EntityBaseData {
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
}

