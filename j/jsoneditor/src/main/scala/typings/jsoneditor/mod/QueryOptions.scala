package typings.jsoneditor.mod

import typings.jsoneditor.anon.Direction
import typings.jsoneditor.anon.Field
import typings.jsoneditor.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryOptions extends js.Object {
  var filter: js.UndefOr[Field] = js.undefined
  var projection: js.UndefOr[Fields] = js.undefined
  var sort: js.UndefOr[Direction] = js.undefined
}

object QueryOptions {
  @scala.inline
  def apply(filter: Field = null, projection: Fields = null, sort: Direction = null): QueryOptions = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryOptions]
  }
}

