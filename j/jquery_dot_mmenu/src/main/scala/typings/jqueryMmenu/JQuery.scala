package typings.jqueryMmenu

import typings.jqueryMmenu.JQueryMmenu.API
import typings.jqueryMmenu.JQueryMmenu.Configurations
import typings.jqueryMmenu.JQueryMmenu.Options
import typings.jqueryMmenu.jqueryMmenuStrings.mmenu
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends js.Object {
  
  /**
    * Return the mmenu object
    * @param element
    */
  @JSName("data")
  def data_mmenu(element: mmenu): API = js.native
  
  /**
    * Create mmenu component
    */
  def mmenu(): JQuery = js.native
  def mmenu(options: Options): JQuery = js.native
  def mmenu(options: Options, configurations: Configurations): JQuery = js.native
}
