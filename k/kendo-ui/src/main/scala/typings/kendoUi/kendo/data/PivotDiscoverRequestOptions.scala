package typings.kendoUi.kendo.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PivotDiscoverRequestOptions extends js.Object {
  var data: PivotDiscoverRequestDataOptions = js.native
}

object PivotDiscoverRequestOptions {
  @scala.inline
  def apply(data: PivotDiscoverRequestDataOptions): PivotDiscoverRequestOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotDiscoverRequestOptions]
  }
  @scala.inline
  implicit class PivotDiscoverRequestOptionsOps[Self <: PivotDiscoverRequestOptions] (val x: Self) extends AnyVal {
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
    def setData(value: PivotDiscoverRequestDataOptions): Self = this.set("data", value.asInstanceOf[js.Any])
  }
  
}

