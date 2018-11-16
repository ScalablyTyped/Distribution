package typings
package heredatalensLib.HNs.datalensNs.HeatmapLayerNs

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
  sealed trait DB
    extends heredatalensLib.HNs.datalensNs.HeatmapLayerNs.InputScale
  
  /** Linear scale */
  @js.native
  sealed trait LINEAR
    extends heredatalensLib.HNs.datalensNs.HeatmapLayerNs.InputScale
  
  /** Logarithmic scale */
  @js.native
  sealed trait LOG
    extends heredatalensLib.HNs.datalensNs.HeatmapLayerNs.InputScale
  
  val DB: DB with java.lang.String = js.native
  val LINEAR: LINEAR with java.lang.String = js.native
  val LOG: LOG with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[heredatalensLib.HNs.datalensNs.HeatmapLayerNs.InputScale with java.lang.String] = js.native
}

