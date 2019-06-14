package typings
package heredatalensLib.HNs.datalensNs.HeatmapLayerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Aggregation extends js.Object

/**
  * Set of possible values for the aggregation option.
  * If the heat map input data is buckets, then different types of aggregation can be applied to the rows in a bucket.
  * The aggregation type is required for proper blending mode of the heat map. For the AVERAGE aggregation type, an averaged heat map is rendered.
  */
@JSGlobal("H.datalens.HeatmapLayer.Aggregation")
@js.native
object Aggregation extends js.Object {
  /** Specifies that the average aggregation was applied to the bucket value */
  @js.native
  sealed trait AVERAGE
    extends heredatalensLib.HNs.datalensNs.HeatmapLayerNs.Aggregation
  
  /** Specifies that the sum aggregation was applied to the bucket value */
  @js.native
  sealed trait SUM
    extends heredatalensLib.HNs.datalensNs.HeatmapLayerNs.Aggregation
  
  /* 1 */ val AVERAGE: AVERAGE with scala.Double = js.native
  /* 0 */ val SUM: SUM with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[heredatalensLib.HNs.datalensNs.HeatmapLayerNs.Aggregation with scala.Double] = js.native
}

