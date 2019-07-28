package typings.gsap.gsapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gsap.Ease")
@js.native
class Ease () extends js.Object {
  def this(func: js.Function1[/* repeated */ js.Any, Unit]) = this()
  def this(func: js.Function1[/* repeated */ js.Any, Unit], extraParams: js.Array[_]) = this()
  def this(func: js.Function1[/* repeated */ js.Any, Unit], extraParams: js.Array[_], `type`: Double) = this()
  def this(
    func: js.Function1[/* repeated */ js.Any, Unit],
    extraParams: js.Array[_],
    `type`: Double,
    power: Double
  ) = this()
  /** Translates the tween's progress ratio into the corresponding ease ratio. */
  def getRatio(p: Double): Double = js.native
}

