package typings.grommet.mod

import org.scalablytyped.runtime.TopLevel
import typings.grommet.tableMod.TableProps
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.FC
import typings.react.mod.TableHTMLAttributes
import typings.std.HTMLTableElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet/es6", "Table")
@js.native
object Table extends TopLevel[
      FC[
        TableProps with (DetailedHTMLProps[TableHTMLAttributes[HTMLTableElement], HTMLTableElement])
      ]
    ]

