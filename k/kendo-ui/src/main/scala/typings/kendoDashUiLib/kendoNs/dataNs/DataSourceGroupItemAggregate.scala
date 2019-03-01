package typings
package kendoDashUiLib.kendoNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceGroupItemAggregate extends js.Object {
  var aggregate: js.UndefOr[java.lang.String] = js.undefined
  var field: js.UndefOr[java.lang.String] = js.undefined
}

object DataSourceGroupItemAggregate {
  @scala.inline
  def apply(aggregate: java.lang.String = null, field: java.lang.String = null): DataSourceGroupItemAggregate = {
    val __obj = js.Dynamic.literal()
    if (aggregate != null) __obj.updateDynamic("aggregate")(aggregate)
    if (field != null) __obj.updateDynamic("field")(field)
    __obj.asInstanceOf[DataSourceGroupItemAggregate]
  }
}

