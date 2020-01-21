package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object markerclustererplus {
  type Calculator = js.Function2[
    /* markers */ js.Array[typings.googlemaps.google.maps.Marker], 
    /* clusterIconStylesCount */ scala.Double, 
    typings.markerclustererplus.ClusterIconInfo
  ]
}
