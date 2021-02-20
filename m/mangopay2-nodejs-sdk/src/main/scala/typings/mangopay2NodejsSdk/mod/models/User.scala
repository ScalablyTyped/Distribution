package typings.mangopay2NodejsSdk.mod.models

import typings.mangopay2NodejsSdk.mod.user.UserData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mangopay2-nodejs-sdk", "models.User")
@js.native
class User protected ()
  extends EntityBase[UserData]
     with UserData {
  def this(data: UserData) = this()
  
  /**
    * Sets the person type for the model
    * @param personType
    */
  def setPersonType(`type`: typings.mangopay2NodejsSdk.mod.user.PersonType): Unit = js.native
}
