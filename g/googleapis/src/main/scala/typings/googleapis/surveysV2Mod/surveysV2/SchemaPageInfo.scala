package typings.googleapis.surveysV2Mod.surveysV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaPageInfo extends js.Object {
  var resultPerPage: js.UndefOr[Double] = js.native
  var startIndex: js.UndefOr[Double] = js.native
  var totalResults: js.UndefOr[Double] = js.native
}

object SchemaPageInfo {
  @scala.inline
  def apply(): SchemaPageInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPageInfo]
  }
  @scala.inline
  implicit class SchemaPageInfoOps[Self <: SchemaPageInfo] (val x: Self) extends AnyVal {
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
    def setResultPerPage(value: Double): Self = this.set("resultPerPage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResultPerPage: Self = this.set("resultPerPage", js.undefined)
    @scala.inline
    def setStartIndex(value: Double): Self = this.set("startIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartIndex: Self = this.set("startIndex", js.undefined)
    @scala.inline
    def setTotalResults(value: Double): Self = this.set("totalResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalResults: Self = this.set("totalResults", js.undefined)
  }
  
}

