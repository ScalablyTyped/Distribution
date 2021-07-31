package typings.gsap.global.gsap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("gsap.Ease")
@js.native
class Ease ()
  extends StObject
     with typings.gsap.gsap.Ease {
  def this(func: js.Function1[/* repeated */ js.Any, Unit]) = this()
  def this(func: js.Function1[/* repeated */ js.Any, Unit], extraParams: js.Array[js.Any]) = this()
  def this(func: Unit, extraParams: js.Array[js.Any]) = this()
  def this(func: js.Function1[/* repeated */ js.Any, Unit], extraParams: js.Array[js.Any], `type`: Double) = this()
  def this(func: js.Function1[/* repeated */ js.Any, Unit], extraParams: Unit, `type`: Double) = this()
  def this(func: Unit, extraParams: js.Array[js.Any], `type`: Double) = this()
  def this(func: Unit, extraParams: Unit, `type`: Double) = this()
  def this(
    func: js.Function1[/* repeated */ js.Any, Unit],
    extraParams: js.Array[js.Any],
    `type`: Double,
    power: Double
  ) = this()
  def this(
    func: js.Function1[/* repeated */ js.Any, Unit],
    extraParams: js.Array[js.Any],
    `type`: Unit,
    power: Double
  ) = this()
  def this(func: js.Function1[/* repeated */ js.Any, Unit], extraParams: Unit, `type`: Double, power: Double) = this()
  def this(func: js.Function1[/* repeated */ js.Any, Unit], extraParams: Unit, `type`: Unit, power: Double) = this()
  def this(func: Unit, extraParams: js.Array[js.Any], `type`: Double, power: Double) = this()
  def this(func: Unit, extraParams: js.Array[js.Any], `type`: Unit, power: Double) = this()
  def this(func: Unit, extraParams: Unit, `type`: Double, power: Double) = this()
  def this(func: Unit, extraParams: Unit, `type`: Unit, power: Double) = this()
  
  /** Translates the tween's progress ratio into the corresponding ease ratio. */
  /* CompleteClass */
  override def getRatio(p: Double): Double = js.native
}
