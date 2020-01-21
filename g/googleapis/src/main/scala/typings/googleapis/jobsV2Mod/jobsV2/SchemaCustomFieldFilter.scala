package typings.googleapis.jobsV2Mod.jobsV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Input only.  Custom field filter of the search.
  */
@js.native
trait SchemaCustomFieldFilter extends js.Object {
  /**
    * Required.  The query strings for the filter.
    */
  var queries: js.UndefOr[js.Array[String]] = js.native
  /**
    * Optional.  The type of filter. Defaults to FilterType.OR.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaCustomFieldFilter {
  @scala.inline
  def apply(queries: js.Array[String] = null, `type`: String = null): SchemaCustomFieldFilter = {
    val __obj = js.Dynamic.literal()
    if (queries != null) __obj.updateDynamic("queries")(queries.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCustomFieldFilter]
  }
}

