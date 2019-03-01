package typings
package jointjsLib.jointjsMod.VectorizerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scale extends js.Object {
  var sx: scala.Double
  var sy: scala.Double
}

object Scale {
  @scala.inline
  def apply(sx: scala.Double, sy: scala.Double): Scale = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("sx")(sx)
    __obj.updateDynamic("sy")(sy)
    __obj.asInstanceOf[Scale]
  }
}

