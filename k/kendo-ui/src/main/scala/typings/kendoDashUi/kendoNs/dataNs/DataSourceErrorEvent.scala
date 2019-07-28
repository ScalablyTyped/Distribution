package typings.kendoDashUi.kendoNs.dataNs

import typings.kendoDashUi.JQueryXHR
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
    val __obj = js.Dynamic.literal(errorThrown = errorThrown, status = status, xhr = xhr)
    if (errors != null) __obj.updateDynamic("errors")(errors)
    if (sender != null) __obj.updateDynamic("sender")(sender)
    __obj.asInstanceOf[DataSourceErrorEvent]
  }
}

