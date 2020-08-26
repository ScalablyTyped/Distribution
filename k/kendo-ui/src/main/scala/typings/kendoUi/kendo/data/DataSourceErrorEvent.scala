package typings.kendoUi.kendo.data

import typings.kendoUi.JQueryXHR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourceErrorEvent extends DataSourceEvent {
  var errorThrown: js.Any = js.native
  var errors: js.UndefOr[js.Any] = js.native
  var status: String = js.native
  var xhr: JQueryXHR = js.native
}

object DataSourceErrorEvent {
  @scala.inline
  def apply(errorThrown: js.Any, status: String, xhr: JQueryXHR): DataSourceErrorEvent = {
    val __obj = js.Dynamic.literal(errorThrown = errorThrown.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], xhr = xhr.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceErrorEvent]
  }
  @scala.inline
  implicit class DataSourceErrorEventOps[Self <: DataSourceErrorEvent] (val x: Self) extends AnyVal {
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
    def setErrorThrown(value: js.Any): Self = this.set("errorThrown", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setXhr(value: JQueryXHR): Self = this.set("xhr", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrors(value: js.Any): Self = this.set("errors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrors: Self = this.set("errors", js.undefined)
  }
  
}

