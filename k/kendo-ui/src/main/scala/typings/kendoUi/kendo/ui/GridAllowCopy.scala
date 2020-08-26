package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridAllowCopy extends js.Object {
  var delimeter: js.UndefOr[String | js.Any] = js.native
}

object GridAllowCopy {
  @scala.inline
  def apply(): GridAllowCopy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridAllowCopy]
  }
  @scala.inline
  implicit class GridAllowCopyOps[Self <: GridAllowCopy] (val x: Self) extends AnyVal {
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
    def setDelimeter(value: String | js.Any): Self = this.set("delimeter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelimeter: Self = this.set("delimeter", js.undefined)
  }
  
}

