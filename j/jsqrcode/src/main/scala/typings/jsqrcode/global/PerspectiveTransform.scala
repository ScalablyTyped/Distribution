package typings.jsqrcode.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PerspectiveTransform")
@js.native
class PerspectiveTransform protected ()
  extends typings.jsqrcode.PerspectiveTransform {
  def this(
    a11: Double,
    a21: Double,
    a31: Double,
    a12: Double,
    a22: Double,
    a32: Double,
    a13: Double,
    a23: Double,
    a33: Double
  ) = this()
}
/* static members */
@JSGlobal("PerspectiveTransform")
@js.native
object PerspectiveTransform extends js.Object {
  
  def quadrilateralToQuadrilateral(
    x0: Double,
    y0: Double,
    x1: Double,
    y1: Double,
    x2: Double,
    y2: Double,
    x3: Double,
    y3: Double,
    x0p: Double,
    y0p: Double,
    x1p: Double,
    y1p: Double,
    x2p: Double,
    y2p: Double,
    x3p: Double,
    y3p: Double
  ): typings.jsqrcode.PerspectiveTransform = js.native
  
  def quadrilateralToSquare(x0: Double, y0: Double, x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double): typings.jsqrcode.PerspectiveTransform = js.native
  
  def squareToQuadrilateral(x0: Double, y0: Double, x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double): typings.jsqrcode.PerspectiveTransform = js.native
}
