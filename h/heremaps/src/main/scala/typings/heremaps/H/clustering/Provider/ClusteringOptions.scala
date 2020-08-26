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
@js.native
trait ClusteringOptions extends js.Object {
  var eps: js.UndefOr[Double] = js.native
  var minWeight: js.UndefOr[Double] = js.native
  var projection: js.UndefOr[IProjection] = js.native
  var strategy: js.UndefOr[Strategy] = js.native
}

object ClusteringOptions {
  @scala.inline
  def apply(): ClusteringOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusteringOptions]
  }
  @scala.inline
  implicit class ClusteringOptionsOps[Self <: ClusteringOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEps(value: Double): Self = this.set("eps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEps: Self = this.set("eps", js.undefined)
    @scala.inline
    def setMinWeight(value: Double): Self = this.set("minWeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinWeight: Self = this.set("minWeight", js.undefined)
    @scala.inline
    def setProjection(value: IProjection): Self = this.set("projection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjection: Self = this.set("projection", js.undefined)
    @scala.inline
    def setStrategy(value: Strategy): Self = this.set("strategy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrategy: Self = this.set("strategy", js.undefined)
  }
  
}

