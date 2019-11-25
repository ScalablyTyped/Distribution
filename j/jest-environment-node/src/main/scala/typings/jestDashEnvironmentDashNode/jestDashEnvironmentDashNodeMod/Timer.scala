package typings.jestDashEnvironmentDashNode.jestDashEnvironmentDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Timer extends js.Object {
  var id: Double
  def ref(): Timer
  def unref(): Timer
}

object Timer {
  @scala.inline
  def apply(id: Double, ref: () => Timer, unref: () => Timer): Timer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ref = js.Any.fromFunction0(ref), unref = js.Any.fromFunction0(unref))
  
    __obj.asInstanceOf[Timer]
  }
}

