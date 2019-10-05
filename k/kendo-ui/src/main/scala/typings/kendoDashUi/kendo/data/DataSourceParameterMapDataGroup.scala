package typings.kendoDashUi.kendo.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceParameterMapDataGroup extends js.Object {
  var aggregate: js.UndefOr[js.Array[DataSourceParameterMapDataAggregate]] = js.undefined
  var dir: js.UndefOr[String] = js.undefined
  var field: js.UndefOr[String] = js.undefined
}

object DataSourceParameterMapDataGroup {
  @scala.inline
  def apply(
    aggregate: js.Array[DataSourceParameterMapDataAggregate] = null,
    dir: String = null,
    field: String = null
  ): DataSourceParameterMapDataGroup = {
    val __obj = js.Dynamic.literal()
    if (aggregate != null) __obj.updateDynamic("aggregate")(aggregate)
    if (dir != null) __obj.updateDynamic("dir")(dir)
    if (field != null) __obj.updateDynamic("field")(field)
    __obj.asInstanceOf[DataSourceParameterMapDataGroup]
  }
}

