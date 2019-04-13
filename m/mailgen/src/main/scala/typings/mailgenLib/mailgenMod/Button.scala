package typings
package mailgenLib.mailgenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Button extends js.Object {
  var color: java.lang.String
  var link: java.lang.String
  var text: java.lang.String
}

object Button {
  @scala.inline
  def apply(color: java.lang.String, link: java.lang.String, text: java.lang.String): Button = {
    val __obj = js.Dynamic.literal(color = color, link = link, text = text)
  
    __obj.asInstanceOf[Button]
  }
}

