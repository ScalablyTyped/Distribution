package typings.googleapis.v4Mod.analyticsreportingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a group of metric filters. Set the operator value to specify how
  * the filters are logically combined.
  */
@js.native
trait SchemaMetricFilterClause extends js.Object {
  /**
    * The repeated set of filters. They are logically combined based on the
    * operator specified.
    */
  var filters: js.UndefOr[js.Array[SchemaMetricFilter]] = js.native
  /**
    * The operator for combining multiple metric filters. If unspecified, it is
    * treated as an `OR`.
    */
  var operator: js.UndefOr[String] = js.native
}

object SchemaMetricFilterClause {
  @scala.inline
  def apply(filters: js.Array[SchemaMetricFilter] = null, operator: String = null): SchemaMetricFilterClause = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (operator != null) __obj.updateDynamic("operator")(operator.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaMetricFilterClause]
  }
}

