package typings.heremaps.H.clustering.Provider

import typings.heremaps.H.geo.IProjection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options which are used within cluster calculations.
  * @property eps {number=} - epsilon parameter for cluster calculation. For the FASTGRID strategy it must not exceed 256 and must take values that are power of 2.
  * For the GRID and DYNAMICGRID strategies it can take values from 10 to 127. Default is 32.
  * @property minWeight {number=} - the minimum points weight sum to form a cluster, default is 2
  * @property projection {H.geo.IProjection=} - projection to use for clustering, default is H.geo.mercator
  * @property strategy {H.clustering.Provider.Strategy=} - clustering stretegy, defaults to H.clustering.Provider.Strategy.FASTGRID
  */
trait ClusteringOptions extends js.Object {
  var eps: js.UndefOr[Double] = js.undefined
  var minWeight: js.UndefOr[Double] = js.undefined
  var projection: js.UndefOr[IProjection] = js.undefined
  var strategy: js.UndefOr[Strategy] = js.undefined
}

object ClusteringOptions {
  @scala.inline
  def apply(
    eps: Int | Double = null,
    minWeight: Int | Double = null,
    projection: IProjection = null,
    strategy: Strategy = null
  ): ClusteringOptions = {
    val __obj = js.Dynamic.literal()
    if (eps != null) __obj.updateDynamic("eps")(eps.asInstanceOf[js.Any])
    if (minWeight != null) __obj.updateDynamic("minWeight")(minWeight.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection)
    if (strategy != null) __obj.updateDynamic("strategy")(strategy)
    __obj.asInstanceOf[ClusteringOptions]
  }
}

