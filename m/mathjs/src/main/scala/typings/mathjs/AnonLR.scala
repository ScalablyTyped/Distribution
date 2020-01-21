package typings.mathjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLR extends js.Object {
  var l: String
  var r: String
}

object AnonLR {
  @scala.inline
  def apply(l: String, r: String): AnonLR = {
    val __obj = js.Dynamic.literal(l = l.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLR]
  }
}

