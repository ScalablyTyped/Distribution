package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object markerclustererplusLib {
  type Calculator = js.Function2[
    /* markers */ js.Array[googlemapsLib.googleNs.mapsNs.Marker], 
    /* clusterIconStylesCount */ scala.Double, 
    ClusterIconInfo
  ]
}
