package typings.mangopay2NodejsSdk.mod.models

import typings.mangopay2NodejsSdk.mod.user.UserData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mangopay2-nodejs-sdk", "models.User")
@js.native
class User protected ()
  extends EntityBase[UserData]
     with UserData {
  def this(data: UserData) = this()
  /* CompleteClass */
  override var CreationDate: Double = js.native
  /**
    * The person's email address (not more than 12 consecutive numbers) - must be a valid email
    */
  /* CompleteClass */
  override var Email: String = js.native
  /* CompleteClass */
  override var Id: String = js.native
  /**
    * KYC Level (LIGHT or REGULAR)
    */
  /* CompleteClass */
  override var KYCLevel: typings.mangopay2NodejsSdk.mod.user.KYCLevel = js.native
  /**
    * Type of user
    */
  /* CompleteClass */
  override var PersonType: typings.mangopay2NodejsSdk.mod.user.PersonType = js.native
  /* CompleteClass */
  override var Tag: String = js.native
  /**
    * Sets the person type for the model
    * @param personType
    */
  def setPersonType(`type`: typings.mangopay2NodejsSdk.mod.user.PersonType): Unit = js.native
}

