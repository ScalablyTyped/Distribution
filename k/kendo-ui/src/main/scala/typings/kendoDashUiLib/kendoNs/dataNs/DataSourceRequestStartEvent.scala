package typings
package kendoDashUiLib.kendoNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceRequestStartEvent extends DataSourceEvent {
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  def preventDefault(): scala.Unit
}

object DataSourceRequestStartEvent {
  @scala.inline
  def apply(
    preventDefault: js.Function0[scala.Unit],
    sender: DataSource = null,
    `type`: java.lang.String = null
  ): DataSourceRequestStartEvent = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault)
    if (sender != null) __obj.updateDynamic("sender")(sender)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DataSourceRequestStartEvent]
  }
}

