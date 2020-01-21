package typings.leafletGeosearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type BingProviderOptions = typings.leafletGeosearch.Anon0 with typings.leafletGeosearch.mod.BingProviderCultureOptions with typings.leafletGeosearch.mod.BingProviderUserContextOptions
  type BoundsTuple = js.Tuple2[js.Tuple2[scala.Double, scala.Double], js.Tuple2[scala.Double, scala.Double]]
  type Omit[T, K /* <: java.lang.String */] = typings.std.Pick[T, typings.std.Exclude[java.lang.String, K]]
  type OpenStreetMapProviderOptions = typings.leafletGeosearch.mod.OpenStreetMapProviderOptionsOutputFormat with typings.leafletGeosearch.mod.OpenStreetMapProviderOptionsOutputDetails with typings.leafletGeosearch.mod.OpenStreetMapProviderOptionsResultLanguage with typings.leafletGeosearch.mod.OpenStreetMapProviderOptionsResultLimitation with typings.leafletGeosearch.mod.OpenStreetMapProviderOptionsPolygonOutput with typings.leafletGeosearch.mod.OpenStreetMapProviderOptionsOther
  type OpenStreetMapProviderReverseResult = (typings.leafletGeosearch.mod.Omit[
    typings.leafletGeosearch.mod.SearchResult[typings.leafletGeosearch.mod.OpenStreetMapProviderResultRaw], 
    typings.leafletGeosearch.leafletGeosearchStrings.raw
  ]) with typings.leafletGeosearch.AnonRaw
  type PointTuple = js.Tuple2[scala.Double, scala.Double]
}
