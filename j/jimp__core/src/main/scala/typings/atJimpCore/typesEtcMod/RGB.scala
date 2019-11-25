package typings.atJimpCore.typesEtcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RGB extends js.Object {
  var b: Double
  var g: Double
  var r: Double
}

object RGB {
  @scala.inline
  def apply(b: Double, g: Double, r: Double): RGB = {
    val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RGB]
  }
}

