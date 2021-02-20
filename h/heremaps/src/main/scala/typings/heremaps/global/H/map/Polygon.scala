package typings.heremaps.global.H.map

import typings.heremaps.H.geo.LineString
import typings.heremaps.H.geo.MultiPolygon
import typings.heremaps.H.map.Polygon.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class represents a polygon in geo-space. It is defined by a strip containing the vertices of a geo shape object (lat, lng, alt values) and a pen to use when rendering the polyline.
  * Polygon represents a closed plane defined by the list of verticies, projected on the map display. List of vericies which define the polygon are is a list of geo coordinates encapsulated
  * by the strip object H.geo.Strip
  */
@JSGlobal("H.map.Polygon")
@js.native
class Polygon protected ()
  extends typings.heremaps.H.map.Polygon {
  /**
    * Constructor
    * @param geometry {H.geo.LineString | H.geo.Polygon | H.geo.MultiPolygon}
    * The geometry that defines the surface of the polygon. H.geo.LineString is interpreted as an exterior ring of H.geo.Polygon object.
    * @param opt_options {H.map.Spatial.Options=} - optional initialization parameters
    */
  def this(geometry: LineString) = this()
  def this(geometry: MultiPolygon) = this()
  def this(geometry: typings.heremaps.H.geo.Polygon) = this()
  def this(geometry: LineString, opt_options: Options) = this()
  def this(geometry: MultiPolygon, opt_options: Options) = this()
  def this(geometry: typings.heremaps.H.geo.Polygon, opt_options: Options) = this()
}
