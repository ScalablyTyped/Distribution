package typings.jsoneditor.mod

import typings.jsoneditor.AnonDirection
import typings.jsoneditor.AnonField
import typings.jsoneditor.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryOptions extends js.Object {
  var filter: js.UndefOr[AnonField] = js.undefined
  var projection: js.UndefOr[AnonFields] = js.undefined
  var sort: js.UndefOr[AnonDirection] = js.undefined
}

object QueryOptions {
  @scala.inline
  def apply(filter: AnonField = null, projection: AnonFields = null, sort: AnonDirection = null): QueryOptions = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryOptions]
  }
}

