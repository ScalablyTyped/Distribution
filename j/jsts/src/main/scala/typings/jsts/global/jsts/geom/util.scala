package typings.jsts.global.jsts.geom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("jsts.geom.util")
@js.native
object util extends js.Object {
  
  @js.native
  class AffineTransformation ()
    extends typings.jsts.jsts.geom.util.AffineTransformation {
    def this(trans: typings.jsts.jsts.geom.util.AffineTransformation) = this()
    def this(m00: Double, m01: Double, m02: Double, m10: Double, m11: Double, m12: Double) = this()
    def this(
      src0: typings.jsts.jsts.geom.Coordinate,
      src1: typings.jsts.jsts.geom.Coordinate,
      src2: typings.jsts.jsts.geom.Coordinate,
      dest0: typings.jsts.jsts.geom.Coordinate,
      dest1: typings.jsts.jsts.geom.Coordinate,
      dest2: typings.jsts.jsts.geom.Coordinate
    ) = this()
  }
  /* static members */
  @js.native
  object AffineTransformation extends js.Object {
    
    def reflectionInstance(x0: Double, y0: Double): typings.jsts.jsts.geom.util.AffineTransformation = js.native
    def reflectionInstance(x0: Double, y0: Double, x1: js.UndefOr[scala.Nothing], y1: Double): typings.jsts.jsts.geom.util.AffineTransformation = js.native
    def reflectionInstance(x0: Double, y0: Double, x1: Double): typings.jsts.jsts.geom.util.AffineTransformation = js.native
    def reflectionInstance(x0: Double, y0: Double, x1: Double, y1: Double): typings.jsts.jsts.geom.util.AffineTransformation = js.native
    
    def rotationInstance(sinTheta: Double, cosTheta: Double): typings.jsts.jsts.geom.util.AffineTransformation = js.native
    def rotationInstance(sinTheta: Double, cosTheta: Double, x: Double, y: Double): typings.jsts.jsts.geom.util.AffineTransformation = js.native
    def rotationInstance(theta: Double): typings.jsts.jsts.geom.util.AffineTransformation = js.native
    def rotationInstance(theta: Double, x: Double, y: Double): typings.jsts.jsts.geom.util.AffineTransformation = js.native
    
    def scaleInstance(xScale: Double, yScale: Double): typings.jsts.jsts.geom.util.AffineTransformation = js.native
    def scaleInstance(xScale: Double, yScale: Double, x: js.UndefOr[scala.Nothing], y: Double): typings.jsts.jsts.geom.util.AffineTransformation = js.native
    def scaleInstance(xScale: Double, yScale: Double, x: Double): typings.jsts.jsts.geom.util.AffineTransformation = js.native
    def scaleInstance(xScale: Double, yScale: Double, x: Double, y: Double): typings.jsts.jsts.geom.util.AffineTransformation = js.native
    
    def shearInstance(xShear: Double, yShear: Double): typings.jsts.jsts.geom.util.AffineTransformation = js.native
    
    def translationInstance(x: Double, y: Double): typings.jsts.jsts.geom.util.AffineTransformation = js.native
  }
}
