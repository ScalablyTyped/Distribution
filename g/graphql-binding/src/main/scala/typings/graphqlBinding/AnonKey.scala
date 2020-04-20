package typings.graphqlBinding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKey extends js.Object {
  var key: js.Any
  var prev: js.Any
}

object AnonKey {
  @scala.inline
  def apply(key: js.Any, prev: js.Any): AnonKey = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKey]
  }
}

