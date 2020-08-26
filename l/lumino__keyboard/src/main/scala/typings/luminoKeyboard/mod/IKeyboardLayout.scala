package typings.luminoKeyboard.mod

import typings.std.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IKeyboardLayout extends js.Object {
  /**
    * The human readable name of the layout.
    *
    * This value is used primarily for display and debugging purposes.
    */
  val name: String = js.native
  /**
    * Test whether the given key is a valid value for the layout.
    *
    * @param key - The user provided key to test for validity.
    *
    * @returns `true` if the key is valid, `false` otherwise.
    */
  def isValidKey(key: String): Boolean = js.native
  /**
    * Get the key for a `'keydown'` event.
    *
    * @param event - The event object for a `'keydown'` event.
    *
    * @returns The associated key value, or an empty string if the event
    *   does not represent a valid primary key.
    */
  def keyForKeydownEvent(event: KeyboardEvent): String = js.native
  /**
    * Get an array of all key values supported by the layout.
    *
    * @returns A new array of the supported key values.
    *
    * #### Notes
    * This can be useful for authoring tools and debugging, when it's
    * necessary to know which keys are available for shortcut use.
    */
  def keys(): js.Array[String] = js.native
}

object IKeyboardLayout {
  @scala.inline
  def apply(
    isValidKey: String => Boolean,
    keyForKeydownEvent: KeyboardEvent => String,
    keys: () => js.Array[String],
    name: String
  ): IKeyboardLayout = {
    val __obj = js.Dynamic.literal(isValidKey = js.Any.fromFunction1(isValidKey), keyForKeydownEvent = js.Any.fromFunction1(keyForKeydownEvent), keys = js.Any.fromFunction0(keys), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKeyboardLayout]
  }
  @scala.inline
  implicit class IKeyboardLayoutOps[Self <: IKeyboardLayout] (val x: Self) extends AnyVal {
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
    def setIsValidKey(value: String => Boolean): Self = this.set("isValidKey", js.Any.fromFunction1(value))
    @scala.inline
    def setKeyForKeydownEvent(value: KeyboardEvent => String): Self = this.set("keyForKeydownEvent", js.Any.fromFunction1(value))
    @scala.inline
    def setKeys(value: () => js.Array[String]): Self = this.set("keys", js.Any.fromFunction0(value))
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

