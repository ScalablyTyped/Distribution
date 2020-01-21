package typings.mapboxGl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mapbox-gl", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var accessToken: String = js.native
  var baseApiUrl: String = js.native
  /**
    * Maximum number of images (raster tiles, sprites, icons) to load in parallel, which affects performance in raster-heavy maps.
    * 16 by default.
    */
  var maxParallelImageRequests: Double = js.native
  var version: String = js.native
  /**
    * Number of web workers instantiated on a page with GL JS maps.
    * By default, it is set to half the number of CPU cores (capped at 6).
    */
  var workerCount: Double = js.native
}

