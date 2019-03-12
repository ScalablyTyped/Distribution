package typings
package grommetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AggregateAlign extends js.Object {
  var aggregate: js.UndefOr[
    grommetLib.grommetLibStrings.avg | grommetLib.grommetLibStrings.max | grommetLib.grommetLibStrings.min | grommetLib.grommetLibStrings.sum
  ] = js.undefined
  var align: js.UndefOr[
    grommetLib.grommetLibStrings.center | grommetLib.grommetLibStrings.start | grommetLib.grommetLibStrings.end
  ] = js.undefined
  var footer: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode | Anon_Aggregate] = js.undefined
  var header: js.UndefOr[java.lang.String | reactLib.reactMod.ReactNs.ReactNode | Anon_Aggregate] = js.undefined
  var primary: js.UndefOr[scala.Boolean] = js.undefined
  var property: java.lang.String
  var render: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var search: js.UndefOr[scala.Boolean] = js.undefined
  var sortable: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_AggregateAlign {
  @scala.inline
  def apply(
    property: java.lang.String,
    aggregate: grommetLib.grommetLibStrings.avg | grommetLib.grommetLibStrings.max | grommetLib.grommetLibStrings.min | grommetLib.grommetLibStrings.sum = null,
    align: grommetLib.grommetLibStrings.center | grommetLib.grommetLibStrings.start | grommetLib.grommetLibStrings.end = null,
    footer: reactLib.reactMod.ReactNs.ReactNode | Anon_Aggregate = null,
    header: java.lang.String | reactLib.reactMod.ReactNs.ReactNode | Anon_Aggregate = null,
    primary: js.UndefOr[scala.Boolean] = js.undefined,
    render: /* repeated */ js.Any => _ = null,
    search: js.UndefOr[scala.Boolean] = js.undefined,
    sortable: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_AggregateAlign = {
    val __obj = js.Dynamic.literal(property = property)
    if (aggregate != null) __obj.updateDynamic("aggregate")(aggregate.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (!js.isUndefined(primary)) __obj.updateDynamic("primary")(primary)
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    if (!js.isUndefined(search)) __obj.updateDynamic("search")(search)
    if (!js.isUndefined(sortable)) __obj.updateDynamic("sortable")(sortable)
    __obj.asInstanceOf[Anon_AggregateAlign]
  }
}

