package typings.iconGen.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Name extends js.Object {
  var name: String
  var sizes: js.Array[Double]
}

object Name {
  @scala.inline
  def apply(name: String, sizes: js.Array[Double]): Name = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], sizes = sizes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
}

