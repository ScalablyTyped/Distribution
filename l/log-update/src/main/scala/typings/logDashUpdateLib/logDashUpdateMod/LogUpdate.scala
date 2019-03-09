package typings
package logDashUpdateLib.logDashUpdateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogUpdate extends js.Object {
  def apply(text: java.lang.String*): scala.Unit = js.native
  /**
  	 * Clear the logged output.
  	 */
  def clear(): scala.Unit = js.native
  /**
  	 * Persist the logged output. Useful if you want to start a new log session below the current one.
  	 */
  def done(): scala.Unit = js.native
}

