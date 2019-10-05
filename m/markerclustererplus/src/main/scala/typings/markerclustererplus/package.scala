package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object markerclustererplus {
  import typings.googlemaps.google.maps.Marker

  type Calculator = js.Function2[/* markers */ js.Array[Marker], /* clusterIconStylesCount */ Double, ClusterIconInfo]
}
