package typings
package jqueryDotDropotronLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * @summary Interface for "JQuery".
 * @author  Cyril Schumacher
 * @version 1.0
 */
@js.native
trait JQuery extends js.Object {
  @JSName("dropotron")
  var dropotron_Original: Dropotron = js.native
  /**
       * @summary Adds multilevel dropdown menus to jQuery.
       * @param {DropotronConfiguration} config Optional. Configuration.
       */
  def dropotron(): scala.Unit = js.native
  /**
       * @summary Adds multilevel dropdown menus to jQuery.
       * @param {DropotronConfiguration} config Optional. Configuration.
       */
  def dropotron(config: DropotronConfiguration): scala.Unit = js.native
}

