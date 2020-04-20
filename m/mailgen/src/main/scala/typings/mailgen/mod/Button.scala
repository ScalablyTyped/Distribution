package typings.mailgen.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Button extends js.Object {
  var color: String
  var link: String
  var text: String
}

object Button {
  @scala.inline
  def apply(color: String, link: String, text: String): Button = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Button]
  }
}

