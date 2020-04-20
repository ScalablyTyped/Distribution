package typings.jsts.jsts.geom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jsts.geom.util")
@js.native
object util extends js.Object {
  @js.native
  class AffineTransformation () extends js.Object {
    def this(trans: AffineTransformation) = this()
    def this(m00: Double, m01: Double, m02: Double, m10: Double, m11: Double, m12: Double) = this()
    def this(
      src0: Coordinate,
      src1: Coordinate,
      src2: Coordinate,
      dest0: Coordinate,
      dest1: Coordinate,
      dest2: Coordinate
    ) = this()
    def compose(trans: AffineTransformation): AffineTransformation = js.native
    def composeBefore(trans: AffineTransformation): AffineTransformation = js.native
    def equals(obj: AffineTransformation): Boolean = js.native
    def filter(seq: CoordinateSequence, i: Double): Unit = js.native
    def getDeterminant(): Double = js.native
    def getInverse(): AffineTransformation = js.native
    def getMatrixEntries(): js.Tuple6[Double, Double, Double, Double, Double, Double] = js.native
    def isDone(): Boolean = js.native
    def isGeometryChanged(): Boolean = js.native
    def isIdentity(): Boolean = js.native
    def reflect(x0: Double, y0: Double): AffineTransformation = js.native
    def reflect(x0: Double, y0: Double, x1: Double): AffineTransformation = js.native
    def reflect(x0: Double, y0: Double, x1: Double, y1: Double): AffineTransformation = js.native
    def rotate(sinTheta: Double, cosTheta: Double): AffineTransformation = js.native
    def rotate(sinTheta: Double, cosTheta: Double, x: Double, y: Double): AffineTransformation = js.native
    def rotate(theta: Double): AffineTransformation = js.native
    def rotate(theta: Double, x: Double, y: Double): AffineTransformation = js.native
    def scale(xScale: Double, yScale: Double): AffineTransformation = js.native
    def setToIdentity(): AffineTransformation = js.native
    def setToReflection(x0: Double, y0: Double, x1: Double, y1: Double): AffineTransformation = js.native
    def setToReflection(x: Double, y: Double): AffineTransformation = js.native
    def setToReflectionBasic(x0: Double, y0: Double, x1: Double, y1: Double): AffineTransformation = js.native
    def setToRotation(sinTheta: Double, cosTheta: Double): AffineTransformation = js.native
    def setToRotation(sinTheta: Double, cosTheta: Double, x: Double, y: Double): AffineTransformation = js.native
    def setToRotation(theta: Double): AffineTransformation = js.native
    def setToRotation(theta: Double, x: Double, y: Double): AffineTransformation = js.native
    def setToScale(xScale: Double, yScale: Double): AffineTransformation = js.native
    def setToShear(xShear: Double, yShear: Double): AffineTransformation = js.native
    def setToTranslation(dx: Double, dy: Double): AffineTransformation = js.native
    def setTransformation(m00: Double, m01: Double, m02: Double, m10: Double, m11: Double, m12: Double): AffineTransformation = js.native
    def setTransformation(trans: AffineTransformation): AffineTransformation = js.native
    def shear(xShear: Double, yShear: Double): AffineTransformation = js.native
    def transform(seq: CoordinateSequence, i: Double): Unit = js.native
    def transform(src: Coordinate, dest: Coordinate): Coordinate = js.native
    def transform[T /* <: Geometry */](g: T): T = js.native
    def translate(x: Double, y: Double): AffineTransformation = js.native
  }
  
  /* static members */
  @js.native
  object AffineTransformation extends js.Object {
    def reflectionInstance(x0: Double, y0: Double): AffineTransformation = js.native
    def reflectionInstance(x0: Double, y0: Double, x1: Double): AffineTransformation = js.native
    def reflectionInstance(x0: Double, y0: Double, x1: Double, y1: Double): AffineTransformation = js.native
    def rotationInstance(sinTheta: Double, cosTheta: Double): AffineTransformation = js.native
    def rotationInstance(sinTheta: Double, cosTheta: Double, x: Double, y: Double): AffineTransformation = js.native
    def rotationInstance(theta: Double): AffineTransformation = js.native
    def rotationInstance(theta: Double, x: Double, y: Double): AffineTransformation = js.native
    def scaleInstance(xScale: Double, yScale: Double): AffineTransformation = js.native
    def scaleInstance(xScale: Double, yScale: Double, x: Double): AffineTransformation = js.native
    def scaleInstance(xScale: Double, yScale: Double, x: Double, y: Double): AffineTransformation = js.native
    def shearInstance(xShear: Double, yShear: Double): AffineTransformation = js.native
    def translationInstance(x: Double, y: Double): AffineTransformation = js.native
  }
  
}

