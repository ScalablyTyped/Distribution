package typings.kendoUi.kendo.data

import typings.kendoUi.JQueryXHR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceErrorEvent extends DataSourceEvent {
  var errorThrown: js.Any
  var errors: js.UndefOr[js.Any] = js.undefined
  var status: String
  var xhr: JQueryXHR
}

object DataSourceErrorEvent {
  @scala.inline
  def apply(
    errorThrown: js.Any,
    status: String,
    xhr: JQueryXHR,
    errors: js.Any = null,
    sender: DataSource = null
  ): DataSourceErrorEvent = {
    val __obj = js.Dynamic.literal(errorThrown = errorThrown.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], xhr = xhr.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (sender != null) __obj.updateDynamic("sender")(sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceErrorEvent]
  }
}

