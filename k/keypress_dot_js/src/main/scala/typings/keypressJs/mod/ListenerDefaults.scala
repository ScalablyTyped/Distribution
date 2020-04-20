package typings.keypressJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListenerDefaults extends js.Object {
  var is_counting: Boolean
  var is_exclusive: Boolean
  var is_sequence: Boolean
  var is_solitary: Boolean
  var is_unordered: Boolean
  var keys: String
  var prevent_default: Boolean
  var prevent_repeat: Boolean
}

object ListenerDefaults {
  @scala.inline
  def apply(
    is_counting: Boolean,
    is_exclusive: Boolean,
    is_sequence: Boolean,
    is_solitary: Boolean,
    is_unordered: Boolean,
    keys: String,
    prevent_default: Boolean,
    prevent_repeat: Boolean
  ): ListenerDefaults = {
    val __obj = js.Dynamic.literal(is_counting = is_counting.asInstanceOf[js.Any], is_exclusive = is_exclusive.asInstanceOf[js.Any], is_sequence = is_sequence.asInstanceOf[js.Any], is_solitary = is_solitary.asInstanceOf[js.Any], is_unordered = is_unordered.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], prevent_default = prevent_default.asInstanceOf[js.Any], prevent_repeat = prevent_repeat.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerDefaults]
  }
}

