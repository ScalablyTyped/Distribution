package typings.mangopay2NodejsSdk.mod.models

import typings.mangopay2NodejsSdk.anon.PartialDisputeData
import typings.mangopay2NodejsSdk.mod.dispute.DisputeData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mangopay2-nodejs-sdk", "models.Dispute")
@js.native
class Dispute protected ()
  extends EntityBase[DisputeData]
     with DisputeData {
  def this(data: PartialDisputeData) = this()
}

