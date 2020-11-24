package typings.grommet.mod

import typings.grommet.dataTableMod.DataTableProps
import typings.react.mod.Component
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.TableHTMLAttributes
import typings.std.HTMLTableElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grommet", "DataTable")
@js.native
class DataTable[TRowType] ()
  extends Component[
      DataTableProps[TRowType] with (DetailedHTMLProps[TableHTMLAttributes[HTMLTableElement], HTMLTableElement]), 
      js.Object, 
      js.Any
    ]
