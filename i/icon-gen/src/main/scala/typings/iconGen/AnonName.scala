package typings.iconGen

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonName extends js.Object {
  var name: String
  var sizes: js.Array[Double]
}

object AnonName {
  @scala.inline
  def apply(name: String, sizes: js.Array[Double]): AnonName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], sizes = sizes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonName]
  }
}

