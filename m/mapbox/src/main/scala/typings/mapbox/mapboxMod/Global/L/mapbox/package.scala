package typings.mapbox.mapboxMod.Global.L

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mapbox {
  type FilterFunction = js.Function1[/* feature */ js.Any, Boolean]
  type StyleLayer = typings.leaflet.leafletMod.TileLayer
}
