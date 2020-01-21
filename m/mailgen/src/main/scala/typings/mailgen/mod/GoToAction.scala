package typings.mailgen.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoToAction extends js.Object {
  var description: String
  var link: String
  var text: String
}

object GoToAction {
  @scala.inline
  def apply(description: String, link: String, text: String): GoToAction = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GoToAction]
  }
}

