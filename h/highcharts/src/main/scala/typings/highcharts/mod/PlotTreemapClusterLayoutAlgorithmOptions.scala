package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlotTreemapClusterLayoutAlgorithmOptions extends js.Object {
  
  /**
    * (Highcharts, Highmaps) When `type` is set to `kmeans`, `distance` is a
    * maximum distance between point and cluster center so that this point will
    * be inside the cluster. The distance is either a number defining pixels or
    * a percentage defining a percentage of the plot area width.
    */
  var distance: js.UndefOr[Double | String] = js.native
  
  /**
    * (Highcharts, Highmaps) When `type` is set to the `grid`, `gridSize` is a
    * size of a grid square element either as a number defining pixels, or a
    * percentage defining a percentage of the plot area width.
    */
  var gridSize: js.UndefOr[Double | String] = js.native
  
  /**
    * (Highcharts, Highmaps) When `type` is set to `kmeans`, `iterations` are
    * the number of iterations that this algorithm will be repeated to find
    * clusters positions.
    */
  var iterations: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highmaps) When `type` is set to `undefined` and there are
    * more visible points than the kmeansThreshold the `grid` algorithm is used
    * to find clusters, otherwise `kmeans`. It ensures good performance on
    * large datasets and better clusters arrangement after the zoom.
    */
  var kmeansThreshold: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highmaps) Type of the algorithm used to combine points into
    * a cluster. There are three available algorithms:
    *
    * 1) `grid` - grid-based clustering technique. Points are assigned to
    * squares of set size depending on their position on the plot area. Points
    * inside the grid square are combined into a cluster. The grid size can be
    * controlled by `gridSize` property (grid size changes at certain zoom
    * levels).
    *
    * 2) `kmeans` - based on K-Means clustering technique. In the first step,
    * points are divided using the grid method (distance property is a grid
    * size) to find the initial amount of clusters. Next, each point is
    * classified by computing the distance between each cluster center and that
    * point. When the closest cluster distance is lower than distance property
    * set by a user the point is added to this cluster otherwise is classified
    * as `noise`. The algorithm is repeated until each cluster center not
    * change its previous position more than one pixel. This technique is more
    * accurate but also more time consuming than the `grid` algorithm,
    * especially for big datasets.
    *
    * 3) `optimizedKmeans` - based on K-Means clustering technique. This
    * algorithm uses k-means algorithm only on the chart initialization or when
    * chart extremes have greater range than on initialization. When a chart is
    * redrawn the algorithm checks only clustered points distance from the
    * cluster center and rebuild it when the point is spaced enough to be
    * outside the cluster. It provides performance improvement and more stable
    * clusters position yet can be used rather on small and sparse datasets.
    *
    * By default, the algorithm depends on visible quantity of points and
    * `kmeansThreshold`. When there are more visible points than the
    * `kmeansThreshold` the `grid` algorithm is used, otherwise `kmeans`.
    *
    * The custom clustering algorithm can be added by assigning a callback
    * function as the type property. This function takes an array of
    * `processedXData`, `processedYData`, `processedXData` indexes and
    * `layoutAlgorithm` options as arguments and should return an object with
    * grouped data.
    *
    * The algorithm should return an object like that: (see online
    * documentation for example)
    *
    * `clusterId` (example above - unique id of a cluster or noise) is an array
    * of points belonging to a cluster. If the array has only one point or
    * fewer points than set in `cluster.minimumClusterSize` it won't be
    * combined into a cluster.
    */
  var `type`: js.UndefOr[String | js.Function] = js.native
}
object PlotTreemapClusterLayoutAlgorithmOptions {
  
  @scala.inline
  def apply(): PlotTreemapClusterLayoutAlgorithmOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotTreemapClusterLayoutAlgorithmOptions]
  }
  
  @scala.inline
  implicit class PlotTreemapClusterLayoutAlgorithmOptionsOps[Self <: PlotTreemapClusterLayoutAlgorithmOptions] (val x: Self) extends AnyVal {
    
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
    def setDistance(value: Double | String): Self = this.set("distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDistance: Self = this.set("distance", js.undefined)
    
    @scala.inline
    def setGridSize(value: Double | String): Self = this.set("gridSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridSize: Self = this.set("gridSize", js.undefined)
    
    @scala.inline
    def setIterations(value: Double): Self = this.set("iterations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIterations: Self = this.set("iterations", js.undefined)
    
    @scala.inline
    def setKmeansThreshold(value: Double): Self = this.set("kmeansThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKmeansThreshold: Self = this.set("kmeansThreshold", js.undefined)
    
    @scala.inline
    def setType(value: String | js.Function): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
