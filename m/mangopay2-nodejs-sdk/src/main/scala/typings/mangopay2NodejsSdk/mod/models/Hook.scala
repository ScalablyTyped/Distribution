package typings.mangopay2NodejsSdk.mod.models

import typings.mangopay2NodejsSdk.PartialHookData
import typings.mangopay2NodejsSdk.mod.hook.HookData
import typings.mangopay2NodejsSdk.mod.hook.HookStatus
import typings.mangopay2NodejsSdk.mod.hook.HookValidity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mangopay2-nodejs-sdk", "models.Hook")
@js.native
class Hook ()
  extends EntityBase[HookData]
     with HookData {
  def this(data: PartialHookData) = this()
  /* CompleteClass */
  override var CreationDate: Double = js.native
  /**
    * The event type
    */
  /* CompleteClass */
  override var EventType: typings.mangopay2NodejsSdk.mod.event.EventType = js.native
  /* CompleteClass */
  override var Id: String = js.native
  /**
    * Whether the hook is enabled or not
    */
  /* CompleteClass */
  override var Status: HookStatus = js.native
  /* CompleteClass */
  override var Tag: String = js.native
  /**
    * This is the URL where your receive notification for each EventType
    */
  /* CompleteClass */
  override var Url: String = js.native
  /**
    * Whether the hook is valid or not
    */
  /* CompleteClass */
  override var Validity: HookValidity = js.native
}

