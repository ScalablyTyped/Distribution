package typings
package heremapsLib.HNs.mapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * A marker with a visual representation in the form of a full styleable and scripteable DOM element. DomMarker are predestinated if small amounts of markers with dynamic styled and/or
         * scripted icons should be displayed om the map (e.g. animated interactive SVG).
         */
@JSGlobal("H.map.DomMarker")
@js.native
class DomMarker protected () extends AbstractMarker {
  /**
               * Constructor
               * @param position {H.geo.IPoint}
               * @param opt_options {H.map.DomMarker.Options=}
               */
  def this(position: heremapsLib.HNs.geoNs.IPoint) = this()
  /**
               * Constructor
               * @param position {H.geo.IPoint}
               * @param opt_options {H.map.DomMarker.Options=}
               */
  def this(position: heremapsLib.HNs.geoNs.IPoint, opt_options: heremapsLib.HNs.mapNs.DomMarkerNs.Options) = this()
}

