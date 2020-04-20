package typings.iconGen

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIco extends js.Object {
  var ico: js.Array[Double]
  var name: String
  var sizes: js.Array[Double]
}

object AnonIco {
  @scala.inline
  def apply(ico: js.Array[Double], name: String, sizes: js.Array[Double]): AnonIco = {
    val __obj = js.Dynamic.literal(ico = ico.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sizes = sizes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIco]
  }
}

