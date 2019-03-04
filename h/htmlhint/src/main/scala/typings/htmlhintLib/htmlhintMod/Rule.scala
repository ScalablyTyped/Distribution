package typings
package htmlhintLib.htmlhintMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rule extends js.Object {
  var description: java.lang.String
  var id: java.lang.String
  var link: java.lang.String
}

object Rule {
  @scala.inline
  def apply(description: java.lang.String, id: java.lang.String, link: java.lang.String): Rule = {
    val __obj = js.Dynamic.literal(description = description, id = id, link = link)
  
    __obj.asInstanceOf[Rule]
  }
}

