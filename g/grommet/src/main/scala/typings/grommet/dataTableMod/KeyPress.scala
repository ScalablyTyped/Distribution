package typings.grommet.dataTableMod

import typings.react.mod.NativeKeyboardEvent
import typings.std.Element
import typings.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.KeyboardEvent<std.Element> & {  datum  :TRowType} */
trait KeyPress[TRowType] extends js.Object {
  var altKey: Boolean
  var bubbles: Boolean
  var cancelable: Boolean
  var charCode: Double
  var ctrlKey: Boolean
  var currentTarget: EventTarget with Element
  var datum: TRowType
  var defaultPrevented: Boolean
  var eventPhase: Double
  var isTrusted: Boolean
  /**
    * See the [DOM Level 3 Events spec](https://www.w3.org/TR/uievents-key/#named-key-attribute-values). for possible values
    */
  var key: String
  var keyCode: Double
  var locale: String
  var location: Double
  var metaKey: Boolean
  var nativeEvent: NativeKeyboardEvent
  var repeat: Boolean
  var shiftKey: Boolean
  var target: EventTarget
  var timeStamp: Double
  var `type`: String
  /** @deprecated */
  var which: Double
  /**
    * See [DOM Level 3 Events spec](https://www.w3.org/TR/uievents-key/#keys-modifier). for a list of valid (case-sensitive) arguments to this method.
    */
  def getModifierState(key: String): Boolean
  def isDefaultPrevented(): Boolean
  def isPropagationStopped(): Boolean
  def persist(): Unit
  def preventDefault(): Unit
  def stopPropagation(): Unit
}

object KeyPress {
  @scala.inline
  def apply[TRowType](
    altKey: Boolean,
    bubbles: Boolean,
    cancelable: Boolean,
    charCode: Double,
    ctrlKey: Boolean,
    currentTarget: EventTarget with Element,
    datum: TRowType,
    defaultPrevented: Boolean,
    eventPhase: Double,
    getModifierState: String => Boolean,
    isDefaultPrevented: () => Boolean,
    isPropagationStopped: () => Boolean,
    isTrusted: Boolean,
    key: String,
    keyCode: Double,
    locale: String,
    location: Double,
    metaKey: Boolean,
    nativeEvent: NativeKeyboardEvent,
    persist: () => Unit,
    preventDefault: () => Unit,
    repeat: Boolean,
    shiftKey: Boolean,
    stopPropagation: () => Unit,
    target: EventTarget,
    timeStamp: Double,
    `type`: String,
    which: Double
  ): KeyPress[TRowType] = {
    val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], charCode = charCode.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], datum = datum.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], getModifierState = js.Any.fromFunction1(getModifierState), isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), isTrusted = isTrusted.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], keyCode = keyCode.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], nativeEvent = nativeEvent.asInstanceOf[js.Any], persist = js.Any.fromFunction0(persist), preventDefault = js.Any.fromFunction0(preventDefault), repeat = repeat.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any], stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], which = which.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyPress[TRowType]]
  }
}

