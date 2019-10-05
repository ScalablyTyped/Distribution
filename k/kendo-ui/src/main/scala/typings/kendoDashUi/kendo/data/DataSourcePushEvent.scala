package typings.kendoDashUi.kendo.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourcePushEvent extends DataSourceEvent {
  var items: js.UndefOr[js.Array[DataSourceItemOrGroup]] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object DataSourcePushEvent {
  @scala.inline
  def apply(items: js.Array[DataSourceItemOrGroup] = null, sender: DataSource = null, `type`: String = null): DataSourcePushEvent = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (sender != null) __obj.updateDynamic("sender")(sender)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DataSourcePushEvent]
  }
}

