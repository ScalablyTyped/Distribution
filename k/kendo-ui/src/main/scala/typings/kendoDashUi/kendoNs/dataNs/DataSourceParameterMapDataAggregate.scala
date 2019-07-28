package typings.kendoDashUi.kendoNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceParameterMapDataAggregate extends js.Object {
  var aggregate: js.UndefOr[String] = js.undefined
  var field: js.UndefOr[String] = js.undefined
}

object DataSourceParameterMapDataAggregate {
  @scala.inline
  def apply(aggregate: String = null, field: String = null): DataSourceParameterMapDataAggregate = {
    val __obj = js.Dynamic.literal()
    if (aggregate != null) __obj.updateDynamic("aggregate")(aggregate)
    if (field != null) __obj.updateDynamic("field")(field)
    __obj.asInstanceOf[DataSourceParameterMapDataAggregate]
  }
}

