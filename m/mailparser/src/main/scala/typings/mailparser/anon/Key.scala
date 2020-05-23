package typings.mailparser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Key extends js.Object {
  var key: String
  var line: String
}

object Key {
  @scala.inline
  def apply(key: String, line: String): Key = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key]
  }
}

