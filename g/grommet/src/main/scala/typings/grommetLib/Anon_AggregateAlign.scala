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

