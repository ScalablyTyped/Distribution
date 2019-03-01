package typings
package imgurDashRestDashApiLib.ImgurRestApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Vote extends js.Object {
  var downs: scala.Double
  var ups: scala.Double
}

object Vote {
  @scala.inline
  def apply(downs: scala.Double, ups: scala.Double): Vote = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("downs")(downs)
    __obj.updateDynamic("ups")(ups)
    __obj.asInstanceOf[Vote]
  }
}

