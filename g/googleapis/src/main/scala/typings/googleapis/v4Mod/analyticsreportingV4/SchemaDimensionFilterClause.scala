package typings.googleapis.v4Mod.analyticsreportingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A group of dimension filters. Set the operator value to specify how the
  * filters are logically combined.
  */
@js.native
trait SchemaDimensionFilterClause extends js.Object {
  /**
    * The repeated set of filters. They are logically combined based on the
    * operator specified.
    */
  var filters: js.UndefOr[js.Array[SchemaDimensionFilter]] = js.native
  /**
    * The operator for combining multiple dimension filters. If unspecified, it
    * is treated as an `OR`.
    */
  var operator: js.UndefOr[String] = js.native
}

object SchemaDimensionFilterClause {
  @scala.inline
  def apply(filters: js.Array[SchemaDimensionFilter] = null, operator: String = null): SchemaDimensionFilterClause = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (operator != null) __obj.updateDynamic("operator")(operator.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDimensionFilterClause]
  }
}

