package typings.jsts.jsts.operation.buffer

import typings.jsts.jsts.geom.Geometry
import typings.jsts.jsts.geom.PrecisionModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BufferOp extends js.Object {
  
  /**
    * @param {PrecisionModel}
    *          fixedPM
    */
  def bufferFixedPrecision(fixedPM: PrecisionModel): Unit = js.native
  
  /**
    * @param {int}
    *          precisionDigits
    */
  def bufferReducedPrecision2(precisionDigits: Double): Unit = js.native
  
  /**
    * Returns the buffer computed for a geometry for a given buffer distance.
    *
    * @param {double}
    *          dist the buffer distance.
    * @return {Geometry} the buffer of the input geometry.
    */
  def getResultGeometry(dist: Double): Geometry = js.native
  
  /**
    * Specifies the end cap style of the generated buffer. The styles supported are
    * {@link #CAP_ROUND}, {@link #CAP_BUTT}, and {@link #CAP_SQUARE}. The
    * default is CAP_ROUND.
    *
    * @param {int}
    *          endCapStyle the end cap style to specify.
    */
  def setEndCapStyle(endCapStyle: Double): Unit = js.native
  
  /**
    * Sets the number of segments used to approximate a angle fillet
    *
    * @param {int}
    *          quadrantSegments the number of segments in a fillet for a quadrant.
    */
  def setQuadrantSegments(quadrantSegments: Double): Unit = js.native
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
  
  @scala.inline
  implicit class BufferOpOps[Self <: BufferOp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBufferFixedPrecision(value: PrecisionModel => Unit): Self = this.set("bufferFixedPrecision", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBufferReducedPrecision2(value: Double => Unit): Self = this.set("bufferReducedPrecision2", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetResultGeometry(value: Double => Geometry): Self = this.set("getResultGeometry", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetEndCapStyle(value: Double => Unit): Self = this.set("setEndCapStyle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetQuadrantSegments(value: Double => Unit): Self = this.set("setQuadrantSegments", js.Any.fromFunction1(value))
  }
}
