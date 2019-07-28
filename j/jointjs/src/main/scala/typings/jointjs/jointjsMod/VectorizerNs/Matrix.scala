package typings.jointjs.jointjsMod.VectorizerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// modifiable Matrix. SVGMatrix doesn't allow set on properties or a constructor.
trait Matrix extends js.Object {
  var a: Double
  var b: Double
  var c: Double
  var d: Double
  var e: Double
  var f: Double
}

object Matrix {
  @scala.inline
  def apply(a: Double, b: Double, c: Double, d: Double, e: Double, f: Double): Matrix = {
    val __obj = js.Dynamic.literal(a = a, b = b, c = c, d = d, e = e, f = f)
  
    __obj.asInstanceOf[Matrix]
  }
}

