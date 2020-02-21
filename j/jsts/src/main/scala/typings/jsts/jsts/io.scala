package typings.jsts.jsts

import typings.jsts.jsts.geom.Geometry
import typings.jsts.jsts.geom.GeometryFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jsts.io")
@js.native
object io extends js.Object {
  @js.native
  class GeoJSONReader () extends js.Object {
    /**
      * Converts a GeoJSON to its <code>Geometry</code> representation.
      *
      * @param {Object} The GeoJSON representation of the Geometry.
      * @return {jsts.geom.Geometry}
      * geometry a <code>Geometry</code> to process.
      */
    def read(geometry: js.Object): Geometry = js.native
  }
  
  @js.native
  /**
    * Writes the GeoJSON representation of a {@link Geometry}. The
    * The GeoJSON format is defined <A
    * HREF="http://geojson.org/geojson-spec.html">here</A>.
    * <p>
    * The <code>GeoJSONWriter</code> outputs coordinates rounded to the precision
    * model. Only the maximum number of decimal places necessary to represent the
    * ordinates to the required precision will be output.
    * <p>
    *
    * @see WKTReader
    * @constructor
    */
  class GeoJSONWriter () extends js.Object {
    /**
      * Converts a <code>Geometry</code> to its GeoJSON representation.
      *
      * @param {jsts.geom.Geometry}
      *          geometry a <code>Geometry</code> to process.
      * @return {Object} The GeoJSON representation of the Geometry.
      */
    def write(geometry: Geometry): js.Object = js.native
  }
  
  @js.native
  class OL3Parser () extends js.Object {
    def this(geometryFactory: GeometryFactory) = this()
    def read(geometry: js.Any): Geometry = js.native
    def write(geometry: Geometry): js.Any = js.native
  }
  
  @js.native
  /**
    * @constructor
    */
  class WKTReader () extends js.Object {
    def this(geometryFactory: GeometryFactory) = this()
    /**
      * Reads a Well-Known Text representation of a {@link Geometry}
      *
      * @param {string}
      *          wkt a <Geometry Tagged Text> string (see the OpenGIS Simple Features
      *          Specification).
      * @return {jsts.geom.Geometry} a <code>Geometry</code> read from
      *         <code>string.</code>
      */
    def read(wkt: String): Geometry = js.native
    def reducePrecision(geometry: Geometry): Unit = js.native
  }
  
  @js.native
  /**
    * @constructor
    */
  class WKTWriter () extends js.Object {
    def this(geometryFactory: GeometryFactory) = this()
  }
  
}

