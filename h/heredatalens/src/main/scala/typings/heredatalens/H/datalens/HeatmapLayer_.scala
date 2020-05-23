package typings.heredatalens.H.datalens

import typings.heredatalens.H.datalens.HeatmapLayer.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides functionality of value-based heat map with density alpha mask.
  * Layer support different types of blending, including weighted average. Also it allows to apply alpha mask calculated by density.
  * In most cases, the layer consumes data grouped by 1x1 pixels buckets. For proper averaging it requires aggregated value and count (number of rows in bucket) for each bucket.
  * Blending of buckets is implemented via kernel density estimation (KDE) with a Gaussian kernel.
  */
@js.native
trait HeatmapLayer_ extends RasterLayer {
  /**
    * @param zoom - zoom level
    */
  def getOptionsPerZoom(zoom: Double): Options = js.native
}

