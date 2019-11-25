package typings.kendoDashUi.kendo.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceEvent extends js.Object {
  var sender: js.UndefOr[DataSource] = js.undefined
}

object DataSourceEvent {
  @scala.inline
  def apply(sender: DataSource = null): DataSourceEvent = {
    val __obj = js.Dynamic.literal()
    if (sender != null) __obj.updateDynamic("sender")(sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceEvent]
  }
}

