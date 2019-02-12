package typings
package kapellmeisterLib.kapellmeisterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Timing extends js.Object {
  var delay: scala.Double = js.native
  var duration: scala.Double = js.native
  @JSName("ease")
  var ease_Original: EasingFunction = js.native
  var time: scala.Double = js.native
  def ease(t: scala.Double): scala.Double = js.native
}

