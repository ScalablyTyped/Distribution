package typings.guacamoleClient.onScreenKeyboardMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a single key, or a single possible behavior of a key. Each key
  * on the on-screen keyboard must have at least one associated
  * Guacamole.OnScreenKeyboard.Key, whether that key is explicitly defined or
  * implied, and may have multiple Guacamole.OnScreenKeyboard.Key if behavior
  * depends on modifier states.
  */
@js.native
trait Key extends js.Object {
  /**
    * The keysym to be pressed/released when this key is pressed/released. If
    * not provided, this will be derived from the title if the title is a
    * single character.
    */
  var keysym: Double = js.native
  /**
    * The name of the modifier set when the key is pressed and cleared when
    * this key is released, if any. The names of modifiers are distinct from
    * the names of keys; both the "RightShift" and "LeftShift" keys may set
    * the "shift" modifier, for example. By default, the key will affect no
    * modifiers.
    */
  var modifier: String = js.native
  /**
    * The unique name identifying this key within the keyboard layout.
    */
  var name: String = js.native
  /**
    * An array containing the names of each modifier required for this key to
    * have an effect. For example, a lowercase letter may require nothing,
    * while an uppercase letter would require "shift", assuming the Shift key
    * is named "shift" within the layout. By default, the key will require
    * no modifiers.
    */
  var requires: js.Array[String] = js.native
  /**
    * The human-readable title that will be displayed to the user within the
    * key. If not provided, this will be derived from the key name.
    */
  var title: String = js.native
}

object Key {
  @scala.inline
  def apply(keysym: Double, modifier: String, name: String, requires: js.Array[String], title: String): Key = {
    val __obj = js.Dynamic.literal(keysym = keysym.asInstanceOf[js.Any], modifier = modifier.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], requires = requires.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key]
  }
  @scala.inline
  implicit class KeyOps[Self <: Key] (val x: Self) extends AnyVal {
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
    def setKeysym(value: Double): Self = this.set("keysym", value.asInstanceOf[js.Any])
    @scala.inline
    def setModifier(value: String): Self = this.set("modifier", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequiresVarargs(value: String*): Self = this.set("requires", js.Array(value :_*))
    @scala.inline
    def setRequires(value: js.Array[String]): Self = this.set("requires", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
  
}

