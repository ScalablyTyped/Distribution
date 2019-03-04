package typings
package harDashFormatLib.harDashFormatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Har extends js.Object {
  /** This object represents the root of exported data. */
  var log: Log
}

object Har {
  @scala.inline
  def apply(log: Log): Har = {
    val __obj = js.Dynamic.literal(log = log)
  
    __obj.asInstanceOf[Har]
  }
}

