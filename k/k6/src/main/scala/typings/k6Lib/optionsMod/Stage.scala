package typings
package k6Lib.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stage extends js.Object {
  /** Stage duration. */
  var duration: java.lang.String
  /** Target number of VUs. */
  var target: scala.Double
}

object Stage {
  @scala.inline
  def apply(duration: java.lang.String, target: scala.Double): Stage = {
    val __obj = js.Dynamic.literal(duration = duration, target = target)
  
    __obj.asInstanceOf[Stage]
  }
}

