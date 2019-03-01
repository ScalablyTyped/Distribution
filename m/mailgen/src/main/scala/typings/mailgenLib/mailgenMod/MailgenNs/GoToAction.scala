package typings
package mailgenLib.mailgenMod.MailgenNs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("link")(link)
    __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[GoToAction]
  }
}

