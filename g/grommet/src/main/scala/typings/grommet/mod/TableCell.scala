package typings.grommet.mod

import org.scalablytyped.runtime.TopLevel
import typings.grommet.boxMod.BoxTypes
import typings.grommet.tableCellMod.TableCellProps
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.FC
import typings.react.mod.TdHTMLAttributes
import typings.std.HTMLTableDataCellElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet", "TableCell")
@js.native
object TableCell extends TopLevel[
      FC[
        TableCellProps with BoxTypes with (DetailedHTMLProps[TdHTMLAttributes[HTMLTableDataCellElement], HTMLTableDataCellElement])
      ]
    ]

