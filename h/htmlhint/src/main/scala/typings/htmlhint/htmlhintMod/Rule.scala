package typings.htmlhint.htmlhintMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rule extends js.Object {
  var description: String
  var id: String
  var link: String
}

object Rule {
  @scala.inline
  def apply(description: String, id: String, link: String): Rule = {
    val __obj = js.Dynamic.literal(description = description, id = id, link = link)
  
    __obj.asInstanceOf[Rule]
  }
}

