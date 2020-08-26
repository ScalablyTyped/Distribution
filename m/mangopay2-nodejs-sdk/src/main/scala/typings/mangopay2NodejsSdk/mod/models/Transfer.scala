package typings.mangopay2NodejsSdk.mod.models

import typings.mangopay2NodejsSdk.anon.PartialCreateTransfer
import typings.mangopay2NodejsSdk.mod.transfer.TransferData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mangopay2-nodejs-sdk", "models.Transfer")
@js.native
class Transfer protected ()
  extends EntityBase[TransferData]
     with TransferData {
  def this(data: PartialCreateTransfer) = this()
}

