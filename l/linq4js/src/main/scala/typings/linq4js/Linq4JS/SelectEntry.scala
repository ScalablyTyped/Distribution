package typings.linq4js.Linq4JS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectEntry extends js.Object {
  var name: String
  var property: String
}

object SelectEntry {
  @scala.inline
  def apply(name: String, property: String): SelectEntry = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectEntry]
  }
}

