package typings
package jstsLib.jstsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsts", "geom")
@js.native
object geomNs extends js.Object {
  @js.native
  class Coordinate protected ()
    extends jstsLib.jstsNs.geomNs.Coordinate {
    /**
      * @constructor
      */
    def this(c: jstsLib.jstsNs.geomNs.Coordinate) = this()
    /**
      * @constructor
      */
    def this(x: scala.Double, y: scala.Double) = this()
  }
  
  @js.native
  class Envelope protected ()
    extends jstsLib.jstsNs.geomNs.Envelope {
    /**
      * Initialize an <code>Envelope</code> from an existing Envelope.
      *
      * @param {jsts.geom.Envelope} env the Envelope to initialize from.
      */
    def this(env: jstsLib.jstsNs.geomNs.Envelope) = this()
    /**
      * Initialize an <code>Envelope</code> to a region defined by a single
      * Coordinate.
      *
      * @param {jsts.geom.Coordinate} p the Coordinate.
      */
    def this(p: jstsLib.jstsNs.geomNs.Coordinate) = this()
    /**
      * Initialize an <code>Envelope</code> to a region defined by two Coordinates.
      *
      * @param {jsts.geom.Coordinate} p1 the first Coordinate.
      * @param {jsts.geom.Coordinate} p2 the second Coordinate.
      */
    def this(p1: jstsLib.jstsNs.geomNs.Coordinate, p2: jstsLib.jstsNs.geomNs.Coordinate) = this()
    /**
      * Creates an <code>Envelope</code> for a region defined by maximum and
      * minimum values.
      *
      * @param {number} x1 the first x-value.
      * @param {number} x2 the second x-value.
      * @param {number} y1 the first y-value.
      * @param {number} y2 the second y-value.
      */
    def this(x1: scala.Double, x2: scala.Double, y1: scala.Double, y2: scala.Double) = this()
  }
  
  @js.native
  /**
    * Creates a new <tt>Geometry</tt> via the specified GeometryFactory.
    */
  class Geometry ()
    extends jstsLib.jstsNs.geomNs.Geometry {
    def this(factory: js.Any) = this()
  }
  
  @js.native
  class GeometryCollection ()
    extends jstsLib.jstsNs.geomNs.GeometryCollection {
    def this(geometries: js.Array[jstsLib.jstsNs.geomNs.Geometry]) = this()
    def this(geometries: js.Array[jstsLib.jstsNs.geomNs.Geometry], factory: jstsLib.jstsNs.geomNs.GeometryFactory) = this()
  }
  
  @js.native
  /**
    * Constructs a GeometryFactory that generates Geometries having a floating PrecisionModel and a spatial-reference ID of 0.
    */
  class GeometryFactory ()
    extends jstsLib.jstsNs.geomNs.GeometryFactory {
    def this(precisionModel: jstsLib.jstsNs.geomNs.PrecisionModel) = this()
  }
  
  @js.native
  class LineString protected ()
    extends jstsLib.jstsNs.geomNs.LineString {
    /**
      * @constructor
      */
    def this(points: js.Array[jstsLib.jstsNs.geomNs.Coordinate]) = this()
    def this(points: js.Array[jstsLib.jstsNs.geomNs.Coordinate], factory: js.Any) = this()
  }
  
  @js.native
  class LinearRing ()
    extends jstsLib.jstsNs.geomNs.LinearRing
  
  @js.native
  class Point protected ()
    extends jstsLib.jstsNs.geomNs.Point {
    /**
      * @constructor
      */
    def this(coordinate: jstsLib.jstsNs.geomNs.Coordinate) = this()
    def this(coordinate: jstsLib.jstsNs.geomNs.Coordinate, factory: js.Any) = this()
  }
  
  @js.native
  class Polygon protected ()
    extends jstsLib.jstsNs.geomNs.Polygon {
    /**
      * @constructor
      */
    def this(shell: jstsLib.jstsNs.geomNs.LinearRing) = this()
    def this(shell: jstsLib.jstsNs.geomNs.LinearRing, holes: js.Array[jstsLib.jstsNs.geomNs.LinearRing]) = this()
    def this(shell: jstsLib.jstsNs.geomNs.LinearRing, holes: js.Array[jstsLib.jstsNs.geomNs.LinearRing], factory: js.Any) = this()
  }
  
  @js.native
  /**
    * 
    * @param modelType
    */
  class PrecisionModel ()
    extends jstsLib.jstsNs.geomNs.PrecisionModel {
    def this(modelType: java.lang.String) = this()
    def this(modelType: scala.Double) = this()
  }
  
  @js.native
  object Envelope extends js.Object {
    /**
      * Test the point q to see whether it intersects the Envelope defined by p1-p2
      *
      * NOTE: calls intersectsEnvelope if four arguments are given to simulate
      * overloaded function
      *
      * @param {jsts.geom.Coordinate}
      *          p1 one extremal point of the envelope.
      * @param {jsts.geom.Coordinate}
      *          p2 another extremal point of the envelope.
      * @param {jsts.geom.Coordinate}
      *          q the point to test for intersection.
      * @return {boolean} <code>true</code> if q intersects the envelope p1-p2.
      */
    def intersects(
      p1: jstsLib.jstsNs.geomNs.Coordinate,
      p2: jstsLib.jstsNs.geomNs.Coordinate,
      q: jstsLib.jstsNs.geomNs.Coordinate
    ): scala.Boolean = js.native
    /**
      * Test the envelope defined by p1-p2 for intersection with the envelope defined
      * by q1-q2
      *
      * @param {jsts.geom.Coordinate}
      *          p1 one extremal point of the envelope P.
      * @param {jsts.geom.Coordinate}
      *          p2 another extremal point of the envelope P.
      * @param {jsts.geom.Coordinate}
      *          q1 one extremal point of the envelope Q.
      * @param {jsts.geom.Coordinate}
      *          q2 another extremal point of the envelope Q.
      * @return {boolean} <code>true</code> if Q intersects P.
      */
    def intersectsEnvelope(
      p1: jstsLib.jstsNs.geomNs.Coordinate,
      p2: jstsLib.jstsNs.geomNs.Coordinate,
      q1: jstsLib.jstsNs.geomNs.Coordinate,
      q2: jstsLib.jstsNs.geomNs.Coordinate
    ): scala.Boolean = js.native
  }
  
  @js.native
  object PrecisionModel extends js.Object {
    var FIXED: java.lang.String = js.native
    var FLOATING: java.lang.String = js.native
    var FLOATING_SINGLE: java.lang.String = js.native
  }
  
}

