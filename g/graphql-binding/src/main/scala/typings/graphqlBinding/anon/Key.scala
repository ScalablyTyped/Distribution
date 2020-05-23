package typings.graphqlBinding.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Key extends js.Object {
  var key: js.Any
  var prev: js.Any
}

object Key {
  @scala.inline
  def apply(key: js.Any, prev: js.Any): Key = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key]
  }
}

