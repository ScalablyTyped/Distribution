package typings.htmlCodesniffer.mod.Util

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("html_codesniffer", "Util.getCellHeaders")
@js.native
object getCellHeaders extends js.Object {
  
  /**
    * Return expected cell headers from a table.
    *
    * Returns null if not a table.
    *
    * Returns an array of objects with two properties:
    * - cell (Object) - the TD element referred to,
    * - headers (String) - the normalised list of expected headers.
    *
    * Cells are returned in DOM order. This may mean cells in a tfoot (which
    * normally precedes tbody if used) would come before tbody cells.
    *
    * If there are missing IDs on relevant table header (th) elements, this
    * method won't complain about it - it will just return them as empty. Its
    * job is to take the IDs it can get, not to complain about it (see, eg. the
    * test in WCAG2's sniff 1_3_1). If there are no headers for a cell, it
    * won't be included.
    *
    * @param table The table to test.
    */
  def apply(table: Element): js.Array[CellHeaderInfo] = js.native
}
