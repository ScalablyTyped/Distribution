package typings
package kendoDashUiLib.kendoNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceRequestEndEvent extends DataSourceEvent {
  var response: js.UndefOr[js.Any] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object DataSourceRequestEndEvent {
  @scala.inline
  def apply(response: js.Any = null, sender: DataSource = null, `type`: java.lang.String = null): DataSourceRequestEndEvent = {
    val __obj = js.Dynamic.literal()
    if (response != null) __obj.updateDynamic("response")(response)
    if (sender != null) __obj.updateDynamic("sender")(sender)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DataSourceRequestEndEvent]
  }
}

