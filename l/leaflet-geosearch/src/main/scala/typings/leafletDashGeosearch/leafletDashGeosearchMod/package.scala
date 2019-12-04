package typings.leafletDashGeosearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object leafletDashGeosearchMod {
  import typings.leafletDashGeosearch.Anon_0
  import typings.leafletDashGeosearch.Anon_Raw
  import typings.leafletDashGeosearch.leafletDashGeosearchStrings.raw
  import typings.std.Exclude
  import typings.std.Pick

  type BingProviderOptions = Anon_0 with BingProviderCultureOptions with BingProviderUserContextOptions
  type BoundsTuple = js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]]
  type Omit[T, K /* <: String */] = Pick[T, Exclude[String, K]]
  type OpenStreetMapProviderOptions = OpenStreetMapProviderOptionsOutputFormat with OpenStreetMapProviderOptionsOutputDetails with OpenStreetMapProviderOptionsResultLanguage with OpenStreetMapProviderOptionsResultLimitation with OpenStreetMapProviderOptionsPolygonOutput with OpenStreetMapProviderOptionsOther
  type OpenStreetMapProviderReverseResult = (Omit[SearchResult[OpenStreetMapProviderResultRaw], raw]) with Anon_Raw
  type PointTuple = js.Tuple2[Double, Double]
}
