package typings.heremaps.HNs.mapNs

import typings.heremaps.HNs.geoNs.IPoint
import typings.heremaps.HNs.mapNs.DomMarkerNs.Options
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
  def this(position: IPoint) = this()
  def this(position: IPoint, opt_options: Options) = this()
}

