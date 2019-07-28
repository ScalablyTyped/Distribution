package typings.jqueryDotMmenu

import typings.jqueryDotMmenu.JQueryMmenuNs.API
import typings.jqueryDotMmenu.JQueryMmenuNs.Configurations
import typings.jqueryDotMmenu.JQueryMmenuNs.Options
import typings.jqueryDotMmenu.jqueryDotMmenuStrings.mmenu
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

