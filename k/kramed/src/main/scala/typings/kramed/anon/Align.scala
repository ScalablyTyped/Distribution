package typings.kramed.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Align extends js.Object {
  var align: String
  var header: Boolean
}

object Align {
  @scala.inline
  def apply(align: String, header: Boolean): Align = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any])
    __obj.asInstanceOf[Align]
  }
}

