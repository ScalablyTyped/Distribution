package typings.heredatalens.H.datalens.HeatmapLayer

import org.scalablytyped.runtime.TopLevel
import typings.heredatalens.H.datalens.HeatmapLayer.InputScale.DB
import typings.heredatalens.H.datalens.HeatmapLayer.InputScale.LINEAR
import typings.heredatalens.H.datalens.HeatmapLayer.InputScale.LOG
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[InputScale with Double] = js.native
  /* 0 */ @js.native
  object DB extends TopLevel[DB with Double]
  
  /* 1 */ @js.native
  object LINEAR extends TopLevel[LINEAR with Double]
  
  /* 2 */ @js.native
  object LOG extends TopLevel[LOG with Double]
  
}

