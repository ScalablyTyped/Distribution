package typings.mangopay2NodejsSdk.mod.models

import typings.mangopay2NodejsSdk.mod.bankAccount.BaseData
import typings.mangopay2NodejsSdk.mod.bankAccount.CreationDetails
import typings.mangopay2NodejsSdk.mod.bankAccount.DataIntersection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mangopay2-nodejs-sdk", "models.BankAccount")
@js.native
class BankAccount protected ()
  extends EntityBase[BaseData]
     with DataIntersection {
  def this(data: CreationDetails) = this()
}

