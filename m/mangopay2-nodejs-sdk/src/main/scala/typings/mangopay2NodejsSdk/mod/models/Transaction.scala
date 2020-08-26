package typings.mangopay2NodejsSdk.mod.models

import typings.mangopay2NodejsSdk.mod.transaction.TransactionData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mangopay2-nodejs-sdk", "models.Transaction")
@js.native
class Transaction protected ()
  extends EntityBase[TransactionData]
     with TransactionData {
  def this(data: TransactionData) = this()
}

