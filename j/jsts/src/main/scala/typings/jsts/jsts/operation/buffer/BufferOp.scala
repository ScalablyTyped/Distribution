package typings.jsts.jsts.operation.buffer

import typings.jsts.jsts.geom.Geometry
import typings.jsts.jsts.geom.PrecisionModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferOp extends js.Object {
  /**
    * @param {PrecisionModel}
    *          fixedPM
    */
  def bufferFixedPrecision(fixedPM: PrecisionModel): Unit
  /**
    * @param {int}
    *          precisionDigits
    */
  def bufferReducedPrecision2(precisionDigits: Double): Unit
  /**
    * Returns the buffer computed for a geometry for a given buffer distance.
    *
    * @param {double}
    *          dist the buffer distance.
    * @return {Geometry} the buffer of the input geometry.
    */
  def getResultGeometry(dist: Double): Geometry
  /**
    * Specifies the end cap style of the generated buffer. The styles supported are
    * {@link #CAP_ROUND}, {@link #CAP_BUTT}, and {@link #CAP_SQUARE}. The
    * default is CAP_ROUND.
    *
    * @param {int}
    *          endCapStyle the end cap style to specify.
    */
  def setEndCapStyle(endCapStyle: Double): Unit
  /**
    * Sets the number of segments used to approximate a angle fillet
    *
    * @param {int}
    *          quadrantSegments the number of segments in a fillet for a quadrant.
    */
  def setQuadrantSegments(quadrantSegments: Double): Unit
}

object BufferOp {
  @scala.inline
  def apply(
    bufferFixedPrecision: PrecisionModel => Unit,
    bufferReducedPrecision2: Double => Unit,
    getResultGeometry: Double => Geometry,
    setEndCapStyle: Double => Unit,
    setQuadrantSegments: Double => Unit
  ): BufferOp = {
    val __obj = js.Dynamic.literal(bufferFixedPrecision = js.Any.fromFunction1(bufferFixedPrecision), bufferReducedPrecision2 = js.Any.fromFunction1(bufferReducedPrecision2), getResultGeometry = js.Any.fromFunction1(getResultGeometry), setEndCapStyle = js.Any.fromFunction1(setEndCapStyle), setQuadrantSegments = js.Any.fromFunction1(setQuadrantSegments))
    __obj.asInstanceOf[BufferOp]
  }
}

