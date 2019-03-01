package typings
package hlsDotJsLib.hlsDotJsMod.HlsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait streamStateTransitionData extends js.Object {
  var nextState: js.Any
  var previousState: js.Any
}

object streamStateTransitionData {
  @scala.inline
  def apply(nextState: js.Any, previousState: js.Any): streamStateTransitionData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("nextState")(nextState)
    __obj.updateDynamic("previousState")(previousState)
    __obj.asInstanceOf[streamStateTransitionData]
  }
}

