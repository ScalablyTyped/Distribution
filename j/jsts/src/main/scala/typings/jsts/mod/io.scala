package typings.jsts.mod

import typings.jsts.jsts.geom.Geometry
import typings.jsts.jsts.geom.GeometryFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object io {
  
  @JSImport("jsts", "io.GeoJSONReader")
  @js.native
  open class GeoJSONReader ()
    extends StObject
       with typings.jsts.jsts.io.GeoJSONReader {
    def this(geometryFactory: GeometryFactory) = this()
    
    /**
      * Converts a GeoJSON to its <code>Geometry</code> representation.
      *
      * @param {Object} The GeoJSON representation of the Geometry.
      * @return {jsts.geom.Geometry}
      * geometry a <code>Geometry</code> to process.
      */
    /* CompleteClass */
    override def read(geometry: js.Object): Geometry = js.native
  }
  
  @JSImport("jsts", "io.GeoJSONWriter")
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
    */
  open class GeoJSONWriter ()
    extends StObject
       with typings.jsts.jsts.io.GeoJSONWriter {
    
    /**
      * Converts a <code>Geometry</code> to its GeoJSON representation.
      *
      * @param {jsts.geom.Geometry}
      *          geometry a <code>Geometry</code> to process.
      * @return {Object} The GeoJSON representation of the Geometry.
      */
    /* CompleteClass */
    override def write(geometry: Geometry): js.Object = js.native
  }
  
  @JSImport("jsts", "io.OL3Parser")
  @js.native
  open class OL3Parser ()
    extends StObject
       with typings.jsts.jsts.io.OL3Parser {
    def this(geometryFactory: GeometryFactory) = this()
    
    /* CompleteClass */
    override def read(geometry: Any): Geometry = js.native
    
    /* CompleteClass */
    override def write(geometry: Geometry): Any = js.native
  }
  
  @JSImport("jsts", "io.WKTReader")
  @js.native
  /**
    */
  open class WKTReader ()
    extends StObject
       with typings.jsts.jsts.io.WKTReader {
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
    /* CompleteClass */
    override def read(wkt: String): Geometry = js.native
    
    /* CompleteClass */
    override def reducePrecision(geometry: Geometry): Unit = js.native
  }
  
  @JSImport("jsts", "io.WKTWriter")
  @js.native
  /**
    */
  open class WKTWriter ()
    extends StObject
       with typings.jsts.jsts.io.WKTWriter {
    def this(geometryFactory: GeometryFactory) = this()
    
    /**
      * Converts a <code>Geometry</code> to its Well-known Text representation.
      *
      * @param {Geometry} geometry a <code>Geometry</code> to process.
      * @return {string} a <Geometry Tagged Text> string (see the OpenGIS Simple
      *         Features Specification).
      */
    /* CompleteClass */
    override def write(geometry: Geometry): String = js.native
  }
}
