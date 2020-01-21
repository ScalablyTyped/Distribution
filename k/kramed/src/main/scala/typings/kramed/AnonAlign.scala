package typings.kramed

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAlign extends js.Object {
  var align: String
  var header: Boolean
}

object AnonAlign {
  @scala.inline
  def apply(align: String, header: Boolean): AnonAlign = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAlign]
  }
}

