package typings.grommet

import typings.grommet.grommetStrings.avg
import typings.grommet.grommetStrings.bottom
import typings.grommet.grommetStrings.center
import typings.grommet.grommetStrings.end
import typings.grommet.grommetStrings.max
import typings.grommet.grommetStrings.middle
import typings.grommet.grommetStrings.min
import typings.grommet.grommetStrings.start
import typings.grommet.grommetStrings.sum
import typings.grommet.grommetStrings.top
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAlign extends js.Object {
  var aggregate: js.UndefOr[avg | max | min | sum] = js.undefined
  var align: js.UndefOr[center | start | end] = js.undefined
  var footer: js.UndefOr[ReactNode | AnonAggregate] = js.undefined
  var header: js.UndefOr[String | ReactNode | AnonAggregate] = js.undefined
  var primary: js.UndefOr[Boolean] = js.undefined
  var property: String
  var render: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var search: js.UndefOr[Boolean] = js.undefined
  var sortable: js.UndefOr[Boolean] = js.undefined
  var verticalAlign: js.UndefOr[middle | top | bottom] = js.undefined
}

object AnonAlign {
  @scala.inline
  def apply(
    property: String,
    aggregate: avg | max | min | sum = null,
    align: center | start | end = null,
    footer: ReactNode | AnonAggregate = null,
    header: String | ReactNode | AnonAggregate = null,
    primary: js.UndefOr[Boolean] = js.undefined,
    render: /* repeated */ js.Any => _ = null,
    search: js.UndefOr[Boolean] = js.undefined,
    sortable: js.UndefOr[Boolean] = js.undefined,
    verticalAlign: middle | top | bottom = null
  ): AnonAlign = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    if (aggregate != null) __obj.updateDynamic("aggregate")(aggregate.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (!js.isUndefined(primary)) __obj.updateDynamic("primary")(primary.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    if (!js.isUndefined(search)) __obj.updateDynamic("search")(search.asInstanceOf[js.Any])
    if (!js.isUndefined(sortable)) __obj.updateDynamic("sortable")(sortable.asInstanceOf[js.Any])
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAlign]
  }
}

