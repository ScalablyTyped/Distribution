package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotVectorClusterLayoutAlgorithmOptions extends js.Object {
  /**
    * (Highcharts, Highmaps) When `type` is set to `kmeans`, `distance` is a
    * maximum distance between point and cluster center so that this point will
    * be inside the cluster. The distance is either a number defining pixels or
    * a percentage defining a percentage of the plot area width.
    */
  var distance: js.UndefOr[Double | String] = js.undefined
  /**
    * (Highcharts, Highmaps) When `type` is set to the `grid`, `gridSize` is a
    * size of a grid square element either as a number defining pixels, or a
    * percentage defining a percentage of the plot area width.
    */
  var gridSize: js.UndefOr[Double | String] = js.undefined
  /**
    * (Highcharts, Highmaps) When `type` is set to `kmeans`, `iterations` are
    * the number of iterations that this algorithm will be repeated to find
    * clusters positions.
    */
  var iterations: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highmaps) When `type` is set to `undefined` and there are
    * more visible points than the kmeansThreshold the `grid` algorithm is used
    * to find clusters, otherwise `kmeans`. It ensures good performance on
    * large datasets and better clusters arrangement after the zoom.
    */
  var kmeansThreshold: js.UndefOr[Double] = js.undefined
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
  var `type`: js.UndefOr[String | js.Function] = js.undefined
}

object PlotVectorClusterLayoutAlgorithmOptions {
  @scala.inline
  def apply(
    distance: Double | String = null,
    gridSize: Double | String = null,
    iterations: Int | Double = null,
    kmeansThreshold: Int | Double = null,
    `type`: String | js.Function = null
  ): PlotVectorClusterLayoutAlgorithmOptions = {
    val __obj = js.Dynamic.literal()
    if (distance != null) __obj.updateDynamic("distance")(distance.asInstanceOf[js.Any])
    if (gridSize != null) __obj.updateDynamic("gridSize")(gridSize.asInstanceOf[js.Any])
    if (iterations != null) __obj.updateDynamic("iterations")(iterations.asInstanceOf[js.Any])
    if (kmeansThreshold != null) __obj.updateDynamic("kmeansThreshold")(kmeansThreshold.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotVectorClusterLayoutAlgorithmOptions]
  }
}

