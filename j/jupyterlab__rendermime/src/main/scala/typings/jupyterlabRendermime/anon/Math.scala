package typings.jupyterlabRendermime.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Math extends js.Object {
  var math: js.Array[String]
  var text: String
}

object Math {
  @scala.inline
  def apply(math: js.Array[String], text: String): Math = {
    val __obj = js.Dynamic.literal(math = math.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Math]
  }
}

