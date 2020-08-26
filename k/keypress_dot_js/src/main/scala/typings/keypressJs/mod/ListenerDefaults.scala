package typings.keypressJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListenerDefaults extends js.Object {
  var is_counting: Boolean = js.native
  var is_exclusive: Boolean = js.native
  var is_sequence: Boolean = js.native
  var is_solitary: Boolean = js.native
  var is_unordered: Boolean = js.native
  var keys: String = js.native
  var prevent_default: Boolean = js.native
  var prevent_repeat: Boolean = js.native
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
  @scala.inline
  implicit class ListenerDefaultsOps[Self <: ListenerDefaults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIs_counting(value: Boolean): Self = this.set("is_counting", value.asInstanceOf[js.Any])
    @scala.inline
    def setIs_exclusive(value: Boolean): Self = this.set("is_exclusive", value.asInstanceOf[js.Any])
    @scala.inline
    def setIs_sequence(value: Boolean): Self = this.set("is_sequence", value.asInstanceOf[js.Any])
    @scala.inline
    def setIs_solitary(value: Boolean): Self = this.set("is_solitary", value.asInstanceOf[js.Any])
    @scala.inline
    def setIs_unordered(value: Boolean): Self = this.set("is_unordered", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeys(value: String): Self = this.set("keys", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrevent_default(value: Boolean): Self = this.set("prevent_default", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrevent_repeat(value: Boolean): Self = this.set("prevent_repeat", value.asInstanceOf[js.Any])
  }
  
}

