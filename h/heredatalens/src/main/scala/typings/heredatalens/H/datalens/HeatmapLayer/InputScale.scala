package typings.heredatalens.H.datalens.HeatmapLayer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait InputScale extends js.Object

/**
  * Set of possible values for the inputScale option.
  * The input scale is required for proper heat map blending. If the input scale is not linear, then the TilePoint.value is converted to linear scale before calculating the sum or average.
  */
@JSGlobal("H.datalens.HeatmapLayer.InputScale")
@js.native
object InputScale extends js.Object {
  /** Decibel (dB) scale */
  @js.native
  sealed trait DB extends InputScale
  
  /** Linear scale */
  @js.native
  sealed trait LINEAR extends InputScale
  
  /** Logarithmic scale */
  @js.native
  sealed trait LOG extends InputScale
  
  /* 0 */ val DB: typings.heredatalens.H.datalens.HeatmapLayer.InputScale.DB with Double = js.native
  /* 1 */ val LINEAR: typings.heredatalens.H.datalens.HeatmapLayer.InputScale.LINEAR with Double = js.native
  /* 2 */ val LOG: typings.heredatalens.H.datalens.HeatmapLayer.InputScale.LOG with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[InputScale with Double] = js.native
}

