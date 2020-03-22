package typings.mangopay2NodejsSdk.mod.hook

import typings.mangopay2NodejsSdk.mod.event.EventType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.PickPartialRequired<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.hook.HookData, 'Tag', 'EventType' | 'Url'> */
trait CreateHook extends js.Object {
  var EventType: typings.mangopay2NodejsSdk.mod.event.EventType
  var Tag: js.UndefOr[String] = js.undefined
  var Url: String
}

object CreateHook {
  @scala.inline
  def apply(EventType: EventType, Url: String, Tag: String = null): CreateHook = {
    val __obj = js.Dynamic.literal(EventType = EventType.asInstanceOf[js.Any], Url = Url.asInstanceOf[js.Any])
    if (Tag != null) __obj.updateDynamic("Tag")(Tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateHook]
  }
}

