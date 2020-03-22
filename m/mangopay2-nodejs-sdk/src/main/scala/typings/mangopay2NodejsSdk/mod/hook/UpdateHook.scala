package typings.mangopay2NodejsSdk.mod.hook

import typings.mangopay2NodejsSdk.mod.event.EventType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.PickPartialRequired<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.hook.HookData, 'EventType' | 'Url' | 'Tag', 'Id'> */
trait UpdateHook extends js.Object {
  var EventType: js.UndefOr[typings.mangopay2NodejsSdk.mod.event.EventType] = js.undefined
  var Id: String
  var Tag: js.UndefOr[String] = js.undefined
  var Url: js.UndefOr[String] = js.undefined
}

object UpdateHook {
  @scala.inline
  def apply(Id: String, EventType: EventType = null, Tag: String = null, Url: String = null): UpdateHook = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    if (EventType != null) __obj.updateDynamic("EventType")(EventType.asInstanceOf[js.Any])
    if (Tag != null) __obj.updateDynamic("Tag")(Tag.asInstanceOf[js.Any])
    if (Url != null) __obj.updateDynamic("Url")(Url.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateHook]
  }
}

