package typings.heremaps.H.clustering.Provider

import typings.heremaps.H.clustering.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options which are used to initialize the clustering Provider
  * @property min {number=} - The minimal supported zoom level, default is 0
  * @property max {number=} - The maximal supported zoom level, default is 22
  * @property clusteringOptions {H.clustering.Provider.ClusteringOptions=} - options for clustering algorithm
  * @property theme {H.clustering.ITheme=} - cluster and noise point graphical representation
  */
trait Options extends js.Object {
  var clusteringOptions: js.UndefOr[ClusteringOptions] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var theme: js.UndefOr[ITheme] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    clusteringOptions: ClusteringOptions = null,
    max: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined,
    theme: ITheme = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (clusteringOptions != null) __obj.updateDynamic("clusteringOptions")(clusteringOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

