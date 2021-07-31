package typings.heremaps.global.H.map

import typings.heremaps.H.geo.LineString
import typings.heremaps.H.geo.MultiLineString
import typings.heremaps.H.map.Polyline.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class represents a polyline in geo-space. It is defined by a path containing the vertices of a polyline (lat, lng, alt values) and a pen to use when tracing the path on the map.
  */
@JSGlobal("H.map.Polyline")
@js.native
class Polyline protected ()
  extends StObject
     with typings.heremaps.H.map.Polyline {
  /**
    * Constructor
    * @param geometry {H.geo.LineString | H.geo.MultiLineString} - The geometry that defines the line segments of the polyline
    * @param opt_options {H.map.Polyline.Options=} - optional initialization parameters
    */
  def this(geometry: LineString) = this()
  def this(geometry: MultiLineString) = this()
  def this(geometry: LineString, opt_options: Options) = this()
  def this(geometry: MultiLineString, opt_options: Options) = this()
}
