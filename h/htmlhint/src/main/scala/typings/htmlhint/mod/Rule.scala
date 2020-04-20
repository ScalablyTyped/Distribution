package typings.htmlhint.mod

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
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rule]
  }
}

