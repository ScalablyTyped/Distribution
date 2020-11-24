package typings.leafletGeosearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type BoundsTuple = js.Tuple2[js.Tuple2[scala.Double, scala.Double], js.Tuple2[scala.Double, scala.Double]]
  
  type Omit[T, K /* <: /* keyof T */ java.lang.String */] = typings.std.Pick[T, typings.std.Exclude[/* keyof T */ java.lang.String, K]]
  
  type OpenStreetMapProviderOptions = typings.leafletGeosearch.mod.OpenStreetMapProviderOptionsOutputFormat with typings.leafletGeosearch.mod.OpenStreetMapProviderOptionsOutputDetails with typings.leafletGeosearch.mod.OpenStreetMapProviderOptionsResultLanguage with typings.leafletGeosearch.mod.OpenStreetMapProviderOptionsResultLimitation with typings.leafletGeosearch.mod.OpenStreetMapProviderOptionsPolygonOutput with typings.leafletGeosearch.mod.OpenStreetMapProviderOptionsOther
  
  type PointTuple = js.Tuple2[scala.Double, scala.Double]
}
