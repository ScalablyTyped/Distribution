package typings
package kapellmeisterLib.kapellmeisterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transition extends js.Object {
  var events: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Events */ js.Any
  var stateKey: java.lang.String
  var status: scala.Double
  var timer: js.UndefOr[d3DashTimerLib.d3DashTimerMod.Timer] = js.undefined
  var timing: Timing
  var tweens: js.Array[js.Function0[Interpolator]]
}

object Transition {
  @scala.inline
  def apply(
    events: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Events */ js.Any,
    stateKey: java.lang.String,
    status: scala.Double,
    timing: Timing,
    tweens: js.Array[js.Function0[Interpolator]],
    timer: d3DashTimerLib.d3DashTimerMod.Timer = null
  ): Transition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("events")(events)
    __obj.updateDynamic("stateKey")(stateKey)
    __obj.updateDynamic("status")(status)
    __obj.updateDynamic("timing")(timing)
    __obj.updateDynamic("tweens")(tweens)
    if (timer != null) __obj.updateDynamic("timer")(timer)
    __obj.asInstanceOf[Transition]
  }
}

