package typings
package leafletDotPmLib.leafletMod.PMNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Draw extends js.Object {
  def getShapes(): js.Array[java.lang.String]
}

object Draw {
  @scala.inline
  def apply(getShapes: js.Function0[js.Array[java.lang.String]]): Draw = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getShapes")(getShapes)
    __obj.asInstanceOf[Draw]
  }
}

