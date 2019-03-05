package typings
package gsapLib.gsapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gsap.Ease")
@js.native
class Ease () extends js.Object {
  def this(func: js.Function1[/* repeated */ js.Any, scala.Unit]) = this()
  def this(func: js.Function1[/* repeated */ js.Any, scala.Unit], extraParams: js.Array[_]) = this()
  def this(func: js.Function1[/* repeated */ js.Any, scala.Unit], extraParams: js.Array[_], `type`: scala.Double) = this()
  def this(func: js.Function1[/* repeated */ js.Any, scala.Unit], extraParams: js.Array[_], `type`: scala.Double, power: scala.Double) = this()
  /** Translates the tween's progress ratio into the corresponding ease ratio. */
  def getRatio(p: scala.Double): scala.Double = js.native
}

