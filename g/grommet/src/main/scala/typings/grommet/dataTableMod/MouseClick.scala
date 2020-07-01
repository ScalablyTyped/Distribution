package typings.grommet.dataTableMod

import typings.react.mod.AbstractView
import typings.react.mod.NativeMouseEvent
import typings.std.EventTarget
import typings.std.HTMLTableRowElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.MouseEvent<std.HTMLTableRowElement, react.react.NativeMouseEvent> & {  datum  :TRowType,   index  :number} */
trait MouseClick[TRowType] extends js.Object {
  var altKey: Boolean
  var bubbles: Boolean
  var button: Double
  var buttons: Double
  var cancelable: Boolean
  var clientX: Double
  var clientY: Double
  var ctrlKey: Boolean
  var currentTarget: EventTarget with HTMLTableRowElement
  var datum: TRowType
  var defaultPrevented: Boolean
  var detail: Double
  var eventPhase: Double
  var index: Double
  var isTrusted: Boolean
  var metaKey: Boolean
  var movementX: Double
  var movementY: Double
  var nativeEvent: NativeMouseEvent
  var pageX: Double
  var pageY: Double
  var relatedTarget: EventTarget | Null
  var screenX: Double
  var screenY: Double
  var shiftKey: Boolean
  var target: EventTarget
  var timeStamp: Double
  var `type`: String
  var view: AbstractView
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

object MouseClick {
  @scala.inline
  def apply[TRowType](
    altKey: Boolean,
    bubbles: Boolean,
    button: Double,
    buttons: Double,
    cancelable: Boolean,
    clientX: Double,
    clientY: Double,
    ctrlKey: Boolean,
    currentTarget: EventTarget with HTMLTableRowElement,
    datum: TRowType,
    defaultPrevented: Boolean,
    detail: Double,
    eventPhase: Double,
    getModifierState: String => Boolean,
    index: Double,
    isDefaultPrevented: () => Boolean,
    isPropagationStopped: () => Boolean,
    isTrusted: Boolean,
    metaKey: Boolean,
    movementX: Double,
    movementY: Double,
    nativeEvent: NativeMouseEvent,
    pageX: Double,
    pageY: Double,
    persist: () => Unit,
    preventDefault: () => Unit,
    screenX: Double,
    screenY: Double,
    shiftKey: Boolean,
    stopPropagation: () => Unit,
    target: EventTarget,
    timeStamp: Double,
    `type`: String,
    view: AbstractView,
    relatedTarget: EventTarget = null
  ): MouseClick[TRowType] = {
    val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], datum = datum.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], getModifierState = js.Any.fromFunction1(getModifierState), index = index.asInstanceOf[js.Any], isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), isTrusted = isTrusted.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], movementX = movementX.asInstanceOf[js.Any], movementY = movementY.asInstanceOf[js.Any], nativeEvent = nativeEvent.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any], persist = js.Any.fromFunction0(persist), preventDefault = js.Any.fromFunction0(preventDefault), screenX = screenX.asInstanceOf[js.Any], screenY = screenY.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any], stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any], relatedTarget = relatedTarget.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MouseClick[TRowType]]
  }
}

