package typings
package heremapsLib.HNs.mapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * A marker with a visual representation in the form of a bitmap icon. Marker are predestinated if large amounts of markers with static icons should be displayed om the map.
         */
@JSGlobal("H.map.Marker")
@js.native
class Marker protected () extends AbstractMarker {
  /**
               * Constructor
               * @param position {H.geo.IPoint} - The location of this marker
               * @param opt_options {H.map.Marker.Options=} - The values to initialize this marker
               */
  def this(position: heremapsLib.HNs.geoNs.IPoint) = this()
  /**
               * Constructor
               * @param position {H.geo.IPoint} - The location of this marker
               * @param opt_options {H.map.Marker.Options=} - The values to initialize this marker
               */
  def this(position: heremapsLib.HNs.geoNs.IPoint, opt_options: heremapsLib.HNs.mapNs.MarkerNs.Options) = this()
}

