package typings.heremaps.HNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UnitSystem extends js.Object

/**
  * This enumeration holds the possible unit systems for the UI to display distances.
  */
@JSGlobal("H.ui.UnitSystem")
@js.native
object UnitSystem extends js.Object {
  /** This value represents the imperial unit system using miles and feet (value: 'imperial'). */
  @js.native
  sealed trait IMPERIAL extends UnitSystem
  
  /** This value represents the metric unit system using meters and kilometers, etc (value: 'metric'). */
  @js.native
  sealed trait METRIC extends UnitSystem
  
  /* 0 */ val IMPERIAL: typings.heremaps.HNs.uiNs.UnitSystem.IMPERIAL with Double = js.native
  /* 1 */ val METRIC: typings.heremaps.HNs.uiNs.UnitSystem.METRIC with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UnitSystem with Double] = js.native
}

