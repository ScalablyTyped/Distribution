package typings
package kendoDashUiLib.kendoNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceErrorEvent extends DataSourceEvent {
  var errorThrown: js.Any
  var errors: js.UndefOr[js.Any] = js.undefined
  var status: java.lang.String
  var xhr: kendoDashUiLib.JQueryXHR
}

object DataSourceErrorEvent {
  @scala.inline
  def apply(
    errorThrown: js.Any,
    status: java.lang.String,
    xhr: kendoDashUiLib.JQueryXHR,
    errors: js.Any = null,
    sender: DataSource = null
  ): DataSourceErrorEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("errorThrown")(errorThrown)
    __obj.updateDynamic("status")(status)
    __obj.updateDynamic("xhr")(xhr)
    if (errors != null) __obj.updateDynamic("errors")(errors)
    if (sender != null) __obj.updateDynamic("sender")(sender)
    __obj.asInstanceOf[DataSourceErrorEvent]
  }
}

