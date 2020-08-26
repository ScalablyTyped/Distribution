package typings.grommet.dataTableMod

import typings.react.mod.Component
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.TableHTMLAttributes
import typings.std.HTMLTableElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet/es6/components/DataTable", "DataTable")
@js.native
class DataTable[TRowType] ()
  extends Component[
      DataTableProps[TRowType] with (DetailedHTMLProps[TableHTMLAttributes[HTMLTableElement], HTMLTableElement]), 
      js.Object, 
      js.Any
    ]

