package typings.htmlCodesniffer.mod.Util

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("html_codesniffer", "Util.isLayoutTable")
@js.native
object isLayoutTable extends js.Object {
  
  /**
    * Returns true if the table passed is a layout table.
    *
    * If the passed table contains headings - through the use of the th
    * element - HTML_CodeSniffer will assume it is a data table. This is in line
    * with most other online checkers.
    *
    * @param table The table to check.
    */
  def apply(table: Element): Boolean = js.native
}
