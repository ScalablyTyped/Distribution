package typings.mangopay2NodejsSdk.mod.models

import typings.mangopay2NodejsSdk.anon.PartialHookData
import typings.mangopay2NodejsSdk.mod.hook.HookData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mangopay2-nodejs-sdk", "models.Hook")
@js.native
class Hook ()
  extends EntityBase[HookData]
     with HookData {
  def this(data: PartialHookData) = this()
}

