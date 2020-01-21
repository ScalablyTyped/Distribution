package typings.jupyterlabRendermime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMath extends js.Object {
  var math: js.Array[String]
  var text: String
}

object AnonMath {
  @scala.inline
  def apply(math: js.Array[String], text: String): AnonMath = {
    val __obj = js.Dynamic.literal(math = math.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonMath]
  }
}

