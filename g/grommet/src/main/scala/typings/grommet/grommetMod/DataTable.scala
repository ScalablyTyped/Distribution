package typings.grommet.grommetMod

import org.scalablytyped.runtime.TopLevel
import typings.grommet.componentsDataTableMod.DataTableProps
import typings.react.HTMLTableElement
import typings.react.reactMod.Component
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.DetailedHTMLProps
import typings.react.reactMod.TableHTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet", "DataTable")
@js.native
class DataTable protected ()
  extends Component[
      DataTableProps with (DetailedHTMLProps[TableHTMLAttributes[HTMLTableElement], HTMLTableElement]), 
      ComponentState, 
      js.Any
    ] {
  def this(props: DataTableProps with (DetailedHTMLProps[TableHTMLAttributes[HTMLTableElement], HTMLTableElement])) = this()
  def this(
    props: DataTableProps with (DetailedHTMLProps[TableHTMLAttributes[HTMLTableElement], HTMLTableElement]),
    context: js.Any
  ) = this()
}

@JSImport("grommet", "DataTable")
@js.native
object DataTable extends TopLevel[
      ComponentClass[
        DataTableProps with (DetailedHTMLProps[TableHTMLAttributes[HTMLTableElement], HTMLTableElement]), 
        ComponentState
      ]
    ]

