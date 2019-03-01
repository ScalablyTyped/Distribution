package typings
package kendoDashUiLib.kendoNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceParameterMapDataGroup extends js.Object {
  var aggregate: js.UndefOr[js.Array[DataSourceParameterMapDataAggregate]] = js.undefined
  var dir: js.UndefOr[java.lang.String] = js.undefined
  var field: js.UndefOr[java.lang.String] = js.undefined
}

object DataSourceParameterMapDataGroup {
  @scala.inline
  def apply(
    aggregate: js.Array[DataSourceParameterMapDataAggregate] = null,
    dir: java.lang.String = null,
    field: java.lang.String = null
  ): DataSourceParameterMapDataGroup = {
    val __obj = js.Dynamic.literal()
    if (aggregate != null) __obj.updateDynamic("aggregate")(aggregate)
    if (dir != null) __obj.updateDynamic("dir")(dir)
    if (field != null) __obj.updateDynamic("field")(field)
    __obj.asInstanceOf[DataSourceParameterMapDataGroup]
  }
}

