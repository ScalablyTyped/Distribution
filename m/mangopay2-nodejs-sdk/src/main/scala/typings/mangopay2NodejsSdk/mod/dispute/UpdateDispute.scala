package typings.mangopay2NodejsSdk.mod.dispute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.PickPartial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.dispute.DisputeData, 'Tag'> */
@js.native
trait UpdateDispute extends js.Object {
  var Tag: js.UndefOr[String] = js.native
}

object UpdateDispute {
  @scala.inline
  def apply(): UpdateDispute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDispute]
  }
  @scala.inline
  implicit class UpdateDisputeOps[Self <: UpdateDispute] (val x: Self) extends AnyVal {
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
    def setTag(value: String): Self = this.set("Tag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTag: Self = this.set("Tag", js.undefined)
  }
  
}

