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

