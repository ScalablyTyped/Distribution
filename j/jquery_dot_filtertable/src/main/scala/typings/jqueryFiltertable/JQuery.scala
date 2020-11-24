package typings.jqueryFiltertable

import typings.jqueryFiltertable.FilterTable.FilterTableOptions
import typings.jqueryFiltertable.FilterTable.FilterTableStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends js.Object {
  
  /**
    * init with default options
    * @returns {JQuery}
    */
  /**
    * if this code appears after your tables; otherwise, include it in your document.ready() code.
    * $('table').filterTable()
    */
  def filterTable(): JQuery = js.native
  /**
    * init with custom options
    * @param options
    * @returns {JQuery}
    */
  /**
    * if this code appears after your tables; otherwise, include it in your document.ready() code.
    * $('table').filterTable()
    */
  def filterTable(options: FilterTableOptions): JQuery = js.native
  /**
    * if this code appears after your tables; otherwise, include it in your document.ready() code.
    * $('table').filterTable()
    */
  @JSName("filterTable")
  var filterTable_Original: FilterTableStatic = js.native
}
