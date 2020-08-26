package typings.mangopay2NodejsSdk.anon

import typings.mangopay2NodejsSdk.mod.event.EventType
import typings.mangopay2NodejsSdk.mod.hook.HookStatus
import typings.mangopay2NodejsSdk.mod.hook.HookValidity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.hook.HookData> */
@js.native
trait PartialHookData extends js.Object {
  var CreationDate: js.UndefOr[Double] = js.native
  var EventType: js.UndefOr[typings.mangopay2NodejsSdk.mod.event.EventType] = js.native
  var Id: js.UndefOr[String] = js.native
  var Status: js.UndefOr[HookStatus] = js.native
  var Tag: js.UndefOr[String] = js.native
  var Url: js.UndefOr[String] = js.native
  var Validity: js.UndefOr[HookValidity] = js.native
}

object PartialHookData {
  @scala.inline
  def apply(): PartialHookData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialHookData]
  }
  @scala.inline
  implicit class PartialHookDataOps[Self <: PartialHookData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreationDate(value: Double): Self = this.set("CreationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationDate: Self = this.set("CreationDate", js.undefined)
    @scala.inline
    def setEventType(value: EventType): Self = this.set("EventType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventType: Self = this.set("EventType", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    @scala.inline
    def setStatus(value: HookStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setTag(value: String): Self = this.set("Tag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTag: Self = this.set("Tag", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("Url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("Url", js.undefined)
    @scala.inline
    def setValidity(value: HookValidity): Self = this.set("Validity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidity: Self = this.set("Validity", js.undefined)
  }
  
}

