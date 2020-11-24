package typings.htmlCodesniffer.mod.Util

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("html_codesniffer", "Util.testTableHeaders")
@js.native
object testTableHeaders extends js.Object {
  
  /**
    * Test for the correct headers attributes on table cell elements.
    *
    * Return value contains the following elements:
    * - required (Boolean): Whether header association at all is required.
    * - used (Boolean):  Whether headers attribute has been used on at least
    *  one table data (td) cell.
    * - allowScope (Boolean): Whether scope is allowed to satisfy the association
    *  requirement (ie. max one row/one column).
    * - correct (Boolean): Whether headers have been correctly used.
    * - missingThId (Array): Array of th elements without IDs.
    * - missingTd (Array): Array of elements without headers attribute.
    * - wrongHeaders (Array): Array of elements where headers attr is incorrect.
    *  Each is a structure with following keys: element,
    *  expected [headers attr], actual [headers attr].
    *
    * @param element Table element to test upon.
    */
  def apply(element: Node): TestTableHeadersResult = js.native
}
