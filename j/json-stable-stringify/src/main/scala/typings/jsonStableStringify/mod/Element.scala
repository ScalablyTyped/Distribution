package typings.jsonStableStringify.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Element extends js.Object {
  var key: String
  var value: js.Any
}

object Element {
  @scala.inline
  def apply(key: String, value: js.Any): Element = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Element]
  }
}

