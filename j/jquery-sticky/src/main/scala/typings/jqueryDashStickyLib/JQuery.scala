package typings
package jqueryDashStickyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  /**
  	 * Initializer. options is optional.
  	 */
  def sticky(): JQuery = js.native
  def sticky(options: JQueryStickyOptions): JQuery = js.native
  /**
  	 * Recalculates the element's position.
  	 */
  @JSName("sticky")
  def sticky_update(method: jqueryDashStickyLib.jqueryDashStickyLibStrings.update): JQuery = js.native
  /**
  	 * To unstick an object.
  	 */
  def unstick(): JQuery = js.native
}

