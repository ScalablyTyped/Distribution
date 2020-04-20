package typings.jsts.mod.geom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsts", "geom.Envelope")
@js.native
class Envelope protected ()
  extends typings.jsts.jsts.geom.Envelope {
  /**
    * Initialize an <code>Envelope</code> from an existing Envelope.
    *
    * @param {jsts.geom.Envelope} env the Envelope to initialize from.
    */
  def this(env: typings.jsts.jsts.geom.Envelope) = this()
  /**
    * Initialize an <code>Envelope</code> to a region defined by a single
    * Coordinate.
    *
    * @param {jsts.geom.Coordinate} p the Coordinate.
    */
  def this(p: typings.jsts.jsts.geom.Coordinate) = this()
  /**
    * Initialize an <code>Envelope</code> to a region defined by two Coordinates.
    *
    * @param {jsts.geom.Coordinate} p1 the first Coordinate.
    * @param {jsts.geom.Coordinate} p2 the second Coordinate.
    */
  def this(p1: typings.jsts.jsts.geom.Coordinate, p2: typings.jsts.jsts.geom.Coordinate) = this()
  /**
    * Creates an <code>Envelope</code> for a region defined by maximum and
    * minimum values.
    *
    * @param {number} x1 the first x-value.
    * @param {number} x2 the second x-value.
    * @param {number} y1 the first y-value.
    * @param {number} y2 the second y-value.
    */
  def this(x1: Double, x2: Double, y1: Double, y2: Double) = this()
}

/* static members */
@JSImport("jsts", "geom.Envelope")
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
    p1: typings.jsts.jsts.geom.Coordinate,
    p2: typings.jsts.jsts.geom.Coordinate,
    q: typings.jsts.jsts.geom.Coordinate
  ): Boolean = js.native
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
    p1: typings.jsts.jsts.geom.Coordinate,
    p2: typings.jsts.jsts.geom.Coordinate,
    q1: typings.jsts.jsts.geom.Coordinate,
    q2: typings.jsts.jsts.geom.Coordinate
  ): Boolean = js.native
}

