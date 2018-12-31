package typings
package jqueryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @deprecated ​ Deprecated. Use \`{@link JQuery.Event }\`.
  */
@js.native
trait BaseJQueryEventObject
  extends stdLib.Event {
  /**
    * The current DOM element within the event bubbling phase.
    * @see \`{@link https://api.jquery.com/event.currentTarget/ }\`
    */
  @JSName("currentTarget")
  var currentTarget_BaseJQueryEventObject: stdLib.Element = js.native
  /**
    * An optional object of data passed to an event method when the current executing handler is bound.
    * @see \`{@link https://api.jquery.com/event.data/ }\`
    */
  var data: js.Any = js.native
  /**
    * The element where the currently-called jQuery event handler was attached.
    * @see \`{@link https://api.jquery.com/event.delegateTarget/ }\`
    */
  var delegateTarget: stdLib.Element = js.native
  /**
    * Indicates whether the META key was pressed when the event fired.
    * @see \`{@link https://api.jquery.com/event.metaKey/ }\`
    */
  var metaKey: scala.Boolean = js.native
  /**
    * The namespace specified when the event was triggered.
    * @see \`{@link https://api.jquery.com/event.namespace/ }\`
    */
  var namespace: java.lang.String = js.native
  /**
    * The browser's original Event object.
    * @see \`{@link https://api.jquery.com/category/events/event-object/ }\`
    */
  var originalEvent: stdLib.Event = js.native
  /**
    * The mouse position relative to the left edge of the document.
    * @see \`{@link https://api.jquery.com/event.pageX/ }\`
    */
  var pageX: scala.Double = js.native
  /**
    * The mouse position relative to the top edge of the document.
    * @see \`{@link https://api.jquery.com/event.pageY/ }\`
    */
  var pageY: scala.Double = js.native
  /**
    * The other DOM element involved in the event, if any.
    * @see \`{@link https://api.jquery.com/event.relatedTarget/ }\`
    */
  var relatedTarget: stdLib.Element = js.native
  /**
    * The last value returned by an event handler that was triggered by this event, unless the value was undefined.
    * @see \`{@link https://api.jquery.com/event.result/ }\`
    */
  var result: js.Any = js.native
  /**
    * The DOM element that initiated the event.
    * @see \`{@link https://api.jquery.com/event.target/ }\`
    */
  @JSName("target")
  var target_BaseJQueryEventObject: stdLib.Element = js.native
  /**
    * For key or mouse events, this property indicates the specific key or button that was pressed.
    * @see \`{@link https://api.jquery.com/event.which/ }\`
    */
  var which: scala.Double = js.native
  /**
    * Returns whether event.preventDefault() was ever called on this event object.
    * @see \`{@link https://api.jquery.com/event.isDefaultPrevented/ }\`
    */
  def isDefaultPrevented(): scala.Boolean = js.native
  /**
    * Returns whether event.stopImmediatePropagation() was ever called on this event object.
    * @see \`{@link https://api.jquery.com/event.isImmediatePropagationStopped/ }\`
    */
  def isImmediatePropagationStopped(): scala.Boolean = js.native
  /**
    * Returns whether event.stopPropagation() was ever called on this event object.
    * @see \`{@link https://api.jquery.com/event.isPropagationStopped/ }\`
    */
  def isPropagationStopped(): scala.Boolean = js.native
}

