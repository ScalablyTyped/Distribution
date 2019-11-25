package typings.k6.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stage extends js.Object {
  /** Stage duration. */
  var duration: String
  /** Target number of VUs. */
  var target: Double
}

object Stage {
  @scala.inline
  def apply(duration: String, target: Double): Stage = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Stage]
  }
}

