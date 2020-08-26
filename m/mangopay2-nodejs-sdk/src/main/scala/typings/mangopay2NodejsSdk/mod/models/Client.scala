package typings.mangopay2NodejsSdk.mod.models

import typings.mangopay2NodejsSdk.anon.PartialClientData
import typings.mangopay2NodejsSdk.mod.client.ClientData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mangopay2-nodejs-sdk", "models.Client")
@js.native
class Client ()
  extends EntityBase[ClientData]
     with ClientData {
  def this(data: PartialClientData) = this()
}

