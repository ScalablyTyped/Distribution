package typings.mangopay2NodejsSdk

import typings.mangopay2NodejsSdk.mod.event.EventType
import typings.mangopay2NodejsSdk.mod.hook.HookStatus
import typings.mangopay2NodejsSdk.mod.hook.HookValidity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.hook.HookData> */
trait PartialHookData extends js.Object {
  var CreationDate: js.UndefOr[Double] = js.undefined
  var EventType: js.UndefOr[typings.mangopay2NodejsSdk.mod.event.EventType] = js.undefined
  var Id: js.UndefOr[String] = js.undefined
  var Status: js.UndefOr[HookStatus] = js.undefined
  var Tag: js.UndefOr[String] = js.undefined
  var Url: js.UndefOr[String] = js.undefined
  var Validity: js.UndefOr[HookValidity] = js.undefined
}

object PartialHookData {
  @scala.inline
  def apply(
    CreationDate: Int | Double = null,
    EventType: EventType = null,
    Id: String = null,
    Status: HookStatus = null,
    Tag: String = null,
    Url: String = null,
    Validity: HookValidity = null
  ): PartialHookData = {
    val __obj = js.Dynamic.literal()
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate.asInstanceOf[js.Any])
    if (EventType != null) __obj.updateDynamic("EventType")(EventType.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (Tag != null) __obj.updateDynamic("Tag")(Tag.asInstanceOf[js.Any])
    if (Url != null) __obj.updateDynamic("Url")(Url.asInstanceOf[js.Any])
    if (Validity != null) __obj.updateDynamic("Validity")(Validity.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialHookData]
  }
}

