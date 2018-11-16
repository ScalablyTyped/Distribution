package typings
package jqueryDotMmenuLib

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
  def data_mmenu(element: jqueryDotMmenuLib.jqueryDotMmenuLibStrings.mmenu): jqueryDotMmenuLib.JQueryMmenuNs.API = js.native
  /**
       * Create mmenu component
       */
  def mmenu(): JQuery = js.native
  def mmenu(options: jqueryDotMmenuLib.JQueryMmenuNs.Options): JQuery = js.native
  def mmenu(
    options: jqueryDotMmenuLib.JQueryMmenuNs.Options,
    configurations: jqueryDotMmenuLib.JQueryMmenuNs.Configurations
  ): JQuery = js.native
}

