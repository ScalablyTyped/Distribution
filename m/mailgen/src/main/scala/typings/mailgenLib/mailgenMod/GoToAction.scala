package typings
package mailgenLib.mailgenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoToAction extends js.Object {
  var description: java.lang.String
  var link: java.lang.String
  var text: java.lang.String
}

object GoToAction {
  @scala.inline
  def apply(description: java.lang.String, link: java.lang.String, text: java.lang.String): GoToAction = {
    val __obj = js.Dynamic.literal(description = description, link = link, text = text)
  
    __obj.asInstanceOf[GoToAction]
  }
}

