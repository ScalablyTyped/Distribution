package typings.mangopay2NodejsSdk.mod.models

import typings.mangopay2NodejsSdk.anon.MakeKeysRequiredPartialUs
import typings.mangopay2NodejsSdk.mod.user.UserLegalData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mangopay2-nodejs-sdk", "models.UserLegal")
@js.native
class UserLegal protected ()
  extends EntityBase[UserLegalData]
     with UserLegalData {
  def this(data: MakeKeysRequiredPartialUs) = this()
  
  /**
    * Sets the person type for the model
    * @param personType
    */
  def setPersonType(`type`: typings.mangopay2NodejsSdk.mod.user.PersonType): Unit = js.native
}
