package typings.humanDate.anon

import typings.humanDate.humanDateBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined human-date.human-date.RelativeTimeOptions & {  returnObject :true} */
@js.native
trait RelativeTimeOptionsreturnAllUnits extends js.Object {
  var allUnits: js.UndefOr[Boolean] = js.native
  var futureSuffix: js.UndefOr[String] = js.native
  var pastSuffix: js.UndefOr[String] = js.native
  var presentText: js.UndefOr[String] = js.native
  var returnObject: js.UndefOr[Boolean] with `true` = js.native
}

object RelativeTimeOptionsreturnAllUnits {
  @scala.inline
  def apply(returnObject: js.UndefOr[Boolean] with `true`): RelativeTimeOptionsreturnAllUnits = {
    val __obj = js.Dynamic.literal(returnObject = returnObject.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelativeTimeOptionsreturnAllUnits]
  }
  @scala.inline
  implicit class RelativeTimeOptionsreturnAllUnitsOps[Self <: RelativeTimeOptionsreturnAllUnits] (val x: Self) extends AnyVal {
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
    def setReturnObject(value: js.UndefOr[Boolean] with `true`): Self = this.set("returnObject", value.asInstanceOf[js.Any])
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
  }
  
}

