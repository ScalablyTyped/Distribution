package typings.grommet

import typings.grommet.grommetStrings.avg
import typings.grommet.grommetStrings.center
import typings.grommet.grommetStrings.end
import typings.grommet.grommetStrings.max
import typings.grommet.grommetStrings.min
import typings.grommet.grommetStrings.start
import typings.grommet.grommetStrings.sum
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AggregateAlign extends js.Object {
  var aggregate: js.UndefOr[avg | max | min | sum] = js.undefined
  var align: js.UndefOr[center | start | end] = js.undefined
  var footer: js.UndefOr[ReactNode | Anon_Aggregate] = js.undefined
  var header: js.UndefOr[String | ReactNode | Anon_Aggregate] = js.undefined
  var primary: js.UndefOr[Boolean] = js.undefined
  var property: String
  var render: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var search: js.UndefOr[Boolean] = js.undefined
  var sortable: js.UndefOr[Boolean] = js.undefined
}

object Anon_AggregateAlign {
  @scala.inline
  def apply(
    property: String,
    aggregate: avg | max | min | sum = null,
    align: center | start | end = null,
    footer: ReactNode | Anon_Aggregate = null,
    header: String | ReactNode | Anon_Aggregate = null,
    primary: js.UndefOr[Boolean] = js.undefined,
    render: /* repeated */ js.Any => _ = null,
    search: js.UndefOr[Boolean] = js.undefined,
    sortable: js.UndefOr[Boolean] = js.undefined
  ): Anon_AggregateAlign = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    if (aggregate != null) __obj.updateDynamic("aggregate")(aggregate.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (!js.isUndefined(primary)) __obj.updateDynamic("primary")(primary.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    if (!js.isUndefined(search)) __obj.updateDynamic("search")(search.asInstanceOf[js.Any])
    if (!js.isUndefined(sortable)) __obj.updateDynamic("sortable")(sortable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AggregateAlign]
  }
}

