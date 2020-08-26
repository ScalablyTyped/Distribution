package typings.humanDate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelativeTimeOptions extends js.Object {
  var allUnits: js.UndefOr[Boolean] = js.native
  var futureSuffix: js.UndefOr[String] = js.native
  var pastSuffix: js.UndefOr[String] = js.native
  var presentText: js.UndefOr[String] = js.native
  var returnObject: js.UndefOr[Boolean] = js.native
}

object RelativeTimeOptions {
  @scala.inline
  def apply(): RelativeTimeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelativeTimeOptions]
  }
  @scala.inline
  implicit class RelativeTimeOptionsOps[Self <: RelativeTimeOptions] (val x: Self) extends AnyVal {
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
    def setAllUnits(value: Boolean): Self = this.set("allUnits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllUnits: Self = this.set("allUnits", js.undefined)
    @scala.inline
    def setFutureSuffix(value: String): Self = this.set("futureSuffix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFutureSuffix: Self = this.set("futureSuffix", js.undefined)
    @scala.inline
    def setPastSuffix(value: String): Self = this.set("pastSuffix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePastSuffix: Self = this.set("pastSuffix", js.undefined)
    @scala.inline
    def setPresentText(value: String): Self = this.set("presentText", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePresentText: Self = this.set("presentText", js.undefined)
    @scala.inline
    def setReturnObject(value: Boolean): Self = this.set("returnObject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturnObject: Self = this.set("returnObject", js.undefined)
  }
  
}

