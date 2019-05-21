package typings
package jqueryLib.JQueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// region Event
// #region Event
trait EventBase[TDelegateTarget, TData, TCurrentTarget, TTarget] extends TriggeredEvent[TDelegateTarget, TData, TCurrentTarget, TTarget] {
  // MouseEvent, KeyboardEvent, TouchEvent
  @JSName("altKey")
  var altKey_EventBase: js.UndefOr[scala.Nothing] = js.undefined
  // Event
  @JSName("bubbles")
  var bubbles_EventBase: scala.Boolean
  // MouseEvent
  @JSName("button")
  var button_EventBase: js.UndefOr[scala.Nothing] = js.undefined
  @JSName("buttons")
  var buttons_EventBase: js.UndefOr[scala.Nothing] = js.undefined
  @JSName("cancelable")
  var cancelable_EventBase: scala.Boolean
  // TouchEvent
  @JSName("changedTouches")
  var changedTouches_EventBase: js.UndefOr[scala.Nothing] = js.undefined
  /** @deprecated */
  @JSName("charCode")
  var charCode_EventBase: js.UndefOr[scala.Nothing] = js.undefined
  // KeyboardEvent
  /** @deprecated */
  @JSName("char")
  var char_EventBase: js.UndefOr[scala.Nothing] = js.undefined
  @JSName("clientX")
  var clientX_EventBase: js.UndefOr[scala.Nothing] = js.undefined
  @JSName("clientY")
  var clientY_EventBase: js.UndefOr[scala.Nothing] = js.undefined
  @JSName("ctrlKey")
  var ctrlKey_EventBase: js.UndefOr[scala.Nothing] = js.undefined
  // UIEvent
  @JSName("detail")
  var detail_EventBase: js.UndefOr[scala.Nothing] = js.undefined
  @JSName("eventPhase")
  var eventPhase_EventBase: scala.Double
  /** @deprecated */
  @JSName("keyCode")
  var keyCode_EventBase: js.UndefOr[scala.Nothing] = js.undefined
  @JSName("key")
  var key_EventBase: js.UndefOr[scala.Nothing] = js.undefined
  /**
    * Indicates whether the META key was pressed when the event fired.
    * @see \`{@link https://api.jquery.com/event.metaKey/ }\`
    * @since 1.0.4
    * @example ​ ````Determine whether the META key was pressed when the event fired.
  ```html
  <!doctype html>
  <html lang="en">
  <head>
    <meta charset="utf-8">
    <title>event.metaKey demo</title>
    <style>
    body {
    background-color: #eef;
    }
    div {
    padding: 20px;
    }
    </style>
    <script src="https://code.jquery.com/jquery-3.3.1.js"></script>
  </head>
  <body>
  ​
  <button value="Test" name="Test" id="checkMetaKey">Click me!</button>
  <div id="display"></div>
  ​
  <script>
  $( "#checkMetaKey" ).click(function( event ) {
    $( "#display" ).text( event.metaKey );
  });
  </script>
  ​
  </body>
  </html>
  ```
    */
  @JSName("metaKey")
  var metaKey_EventBase: js.UndefOr[scala.Nothing] = js.undefined
  @JSName("offsetX")
  var offsetX_EventBase: js.UndefOr[scala.Nothing] = js.undefined
  @JSName("offsetY")
  var offsetY_EventBase: js.UndefOr[scala.Nothing] = js.undefined
  /**
    * The mouse position relative to the left edge of the document.
    * @see \`{@link https://api.jquery.com/event.pageX/ }\`
    * @since 1.0.4
    * @example ​ ````Show the mouse position relative to the left and top edges of the document (within this iframe).
  ```html
  <!doctype html>
  <html lang="en">
  <head>
    <meta charset="utf-8">
    <title>event.pageX demo</title>
    <style>
    body {
    background-color: #eef;
    }
    div {
    padding: 20px;
    }
    </style>
    <script src="https://code.jquery.com/jquery-3.3.1.js"></script>
  </head>
  <body>
  ​
  <div id="log"></div>
  ​
  <script>
  $( document ).on( "mousemove", function( event ) {
    $( "#log" ).text( "pageX: " + event.pageX + ", pageY: " + event.pageY );
  });
  </script>
  ​
  </body>
  </html>
  ```
    */
  @JSName("pageX")
  var pageX_EventBase: js.UndefOr[scala.Nothing] = js.undefined
  /**
    * The mouse position relative to the top edge of the document.
    * @see \`{@link https://api.jquery.com/event.pageY/ }\`
    * @since 1.0.4
    * @example ​ ````Show the mouse position relative to the left and top edges of the document (within this iframe).
  ```html
  <!doctype html>
  <html lang="en">
  <head>
    <meta charset="utf-8">
    <title>event.pageY demo</title>
    <style>
    body {
    background-color: #eef;
    }
    div {
    padding: 20px;
    }
    </style>
    <script src="https://code.jquery.com/jquery-3.3.1.js"></script>
  </head>
  <body>
  ​
  <div id="log"></div>
  ​
  <script>
  $( document ).on( "mousemove", function( event ) {
    $( "#log" ).text( "pageX: " + event.pageX + ", pageY: " + event.pageY );
  });
  </script>
  ​
  </body>
  </html>
  ```
    */
  @JSName("pageY")
  var pageY_EventBase: js.UndefOr[scala.Nothing] = js.undefined
  // PointerEvent
  @JSName("pointerId")
  var pointerId_EventBase: js.UndefOr[scala.Nothing] = js.undefined
  @JSName("pointerType")
  var pointerType_EventBase: js.UndefOr[scala.Nothing] = js.undefined
  /**
    * The other DOM element involved in the event, if any.
    * @see \`{@link https://api.jquery.com/event.relatedTarget/ }\`
    * @since 1.1.4
    * @example ​ ````On mouseout of anchors, alert the element type being entered.
  ```javascript
  $( "a" ).mouseout(function( event ) {
    alert( event.relatedTarget.nodeName ); // "DIV"
  });
  ```
    */
  var relatedTarget: js.UndefOr[scala.Nothing] = js.undefined
  @JSName("screenX")
  var screenX_EventBase: js.UndefOr[scala.Nothing] = js.undefined
  @JSName("screenY")
  var screenY_EventBase: js.UndefOr[scala.Nothing] = js.undefined
  @JSName("shiftKey")
  var shiftKey_EventBase: js.UndefOr[scala.Nothing] = js.undefined
  @JSName("targetTouches")
  var targetTouches_EventBase: js.UndefOr[scala.Nothing] = js.undefined
  /** @deprecated */
  @JSName("toElement")
  var toElement_EventBase: js.UndefOr[scala.Nothing] = js.undefined
  @JSName("touches")
  var touches_EventBase: js.UndefOr[scala.Nothing] = js.undefined
  @JSName("view")
  var view_EventBase: js.UndefOr[scala.Nothing] = js.undefined
  // MouseEvent, KeyboardEvent
  /**
    * For key or mouse events, this property indicates the specific key or button that was pressed.
    * @see \`{@link https://api.jquery.com/event.which/ }\`
    * @since 1.1.3
    * @deprecated ​ Deprecated since 3.3. See \`{@link https://github.com/jquery/api.jquery.com/issues/821 }\`.
    * @example ​ ````Log which key was depressed.
  ```html
  <!doctype html>
  <html lang="en">
  <head>
    <meta charset="utf-8">
    <title>event.which demo</title>
    <script src="https://code.jquery.com/jquery-3.3.1.js"></script>
  </head>
  <body>
  ​
  <input id="whichkey" value="type something">
  <div id="log"></div>
  ​
  <script>
  $( "#whichkey" ).on( "keydown", function( event ) {
    $( "#log" ).html( event.type + ": " +  event.which );
  });
  </script>
  ​
  </body>
  </html>
  ```
    * @example ​ ````Log which mouse button was depressed.
  ```html
  <!doctype html>
  <html lang="en">
  <head>
    <meta charset="utf-8">
    <title>event.which demo</title>
    <script src="https://code.jquery.com/jquery-3.3.1.js"></script>
  </head>
  <body>
  ​
  <input id="whichkey" value="click here">
  <div id="log"></div>
  ​
  <script>
  $( "#whichkey" ).on( "mousedown", function( event ) {
    $( "#log" ).html( event.type + ": " +  event.which );
  });
  </script>
  ​
  </body>
  </html>
  ```
    */
  @JSName("which")
  var which_EventBase: js.UndefOr[scala.Nothing] = js.undefined
}

object EventBase {
  @scala.inline
  def apply[TDelegateTarget, TData, TCurrentTarget, TTarget](
    bubbles: scala.Boolean,
    cancelable: scala.Boolean,
    currentTarget: TCurrentTarget,
    data: TData,
    delegateTarget: TDelegateTarget,
    eventPhase: scala.Double,
    isDefaultPrevented: () => scala.Boolean,
    isImmediatePropagationStopped: () => scala.Boolean,
    isPropagationStopped: () => scala.Boolean,
    preventDefault: () => scala.Unit,
    stopImmediatePropagation: () => scala.Unit,
    stopPropagation: () => scala.Unit,
    target: TTarget,
    timeStamp: scala.Double,
    `type`: java.lang.String,
    altKey: js.UndefOr[scala.Nothing] = js.undefined,
    button: js.UndefOr[scala.Nothing] = js.undefined,
    buttons: js.UndefOr[scala.Nothing] = js.undefined,
    changedTouches: js.UndefOr[scala.Nothing] = js.undefined,
    char: js.UndefOr[scala.Nothing] = js.undefined,
    charCode: js.UndefOr[scala.Nothing] = js.undefined,
    clientX: js.UndefOr[scala.Nothing] = js.undefined,
    clientY: js.UndefOr[scala.Nothing] = js.undefined,
    ctrlKey: js.UndefOr[scala.Nothing] = js.undefined,
    detail: js.UndefOr[scala.Nothing] = js.undefined,
    key: js.UndefOr[scala.Nothing] = js.undefined,
    keyCode: js.UndefOr[scala.Nothing] = js.undefined,
    metaKey: js.UndefOr[scala.Nothing] = js.undefined,
    namespace: java.lang.String = null,
    offsetX: js.UndefOr[scala.Nothing] = js.undefined,
    offsetY: js.UndefOr[scala.Nothing] = js.undefined,
    originalEvent: jqueryLib._Event = null,
    pageX: js.UndefOr[scala.Nothing] = js.undefined,
    pageY: js.UndefOr[scala.Nothing] = js.undefined,
    pointerId: js.UndefOr[scala.Nothing] = js.undefined,
    pointerType: js.UndefOr[scala.Nothing] = js.undefined,
    relatedTarget: js.UndefOr[scala.Nothing] = js.undefined,
    result: js.Any = null,
    screenX: js.UndefOr[scala.Nothing] = js.undefined,
    screenY: js.UndefOr[scala.Nothing] = js.undefined,
    shiftKey: js.UndefOr[scala.Nothing] = js.undefined,
    targetTouches: js.UndefOr[scala.Nothing] = js.undefined,
    toElement: js.UndefOr[scala.Nothing] = js.undefined,
    touches: js.UndefOr[scala.Nothing] = js.undefined,
    view: js.UndefOr[scala.Nothing] = js.undefined,
    which: js.UndefOr[scala.Nothing] = js.undefined
  ): EventBase[TDelegateTarget, TData, TCurrentTarget, TTarget] = {
    val __obj = js.Dynamic.literal(bubbles = bubbles, cancelable = cancelable, currentTarget = currentTarget.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], delegateTarget = delegateTarget.asInstanceOf[js.Any], eventPhase = eventPhase, isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isImmediatePropagationStopped = js.Any.fromFunction0(isImmediatePropagationStopped), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), preventDefault = js.Any.fromFunction0(preventDefault), stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(altKey)) __obj.updateDynamic("altKey")(altKey)
    if (!js.isUndefined(button)) __obj.updateDynamic("button")(button)
    if (!js.isUndefined(buttons)) __obj.updateDynamic("buttons")(buttons)
    if (!js.isUndefined(changedTouches)) __obj.updateDynamic("changedTouches")(changedTouches)
    if (!js.isUndefined(char)) __obj.updateDynamic("char")(char)
    if (!js.isUndefined(charCode)) __obj.updateDynamic("charCode")(charCode)
    if (!js.isUndefined(clientX)) __obj.updateDynamic("clientX")(clientX)
    if (!js.isUndefined(clientY)) __obj.updateDynamic("clientY")(clientY)
    if (!js.isUndefined(ctrlKey)) __obj.updateDynamic("ctrlKey")(ctrlKey)
    if (!js.isUndefined(detail)) __obj.updateDynamic("detail")(detail)
    if (!js.isUndefined(key)) __obj.updateDynamic("key")(key)
    if (!js.isUndefined(keyCode)) __obj.updateDynamic("keyCode")(keyCode)
    if (!js.isUndefined(metaKey)) __obj.updateDynamic("metaKey")(metaKey)
    if (namespace != null) __obj.updateDynamic("namespace")(namespace)
    if (!js.isUndefined(offsetX)) __obj.updateDynamic("offsetX")(offsetX)
    if (!js.isUndefined(offsetY)) __obj.updateDynamic("offsetY")(offsetY)
    if (originalEvent != null) __obj.updateDynamic("originalEvent")(originalEvent)
    if (!js.isUndefined(pageX)) __obj.updateDynamic("pageX")(pageX)
    if (!js.isUndefined(pageY)) __obj.updateDynamic("pageY")(pageY)
    if (!js.isUndefined(pointerId)) __obj.updateDynamic("pointerId")(pointerId)
    if (!js.isUndefined(pointerType)) __obj.updateDynamic("pointerType")(pointerType)
    if (!js.isUndefined(relatedTarget)) __obj.updateDynamic("relatedTarget")(relatedTarget)
    if (result != null) __obj.updateDynamic("result")(result)
    if (!js.isUndefined(screenX)) __obj.updateDynamic("screenX")(screenX)
    if (!js.isUndefined(screenY)) __obj.updateDynamic("screenY")(screenY)
    if (!js.isUndefined(shiftKey)) __obj.updateDynamic("shiftKey")(shiftKey)
    if (!js.isUndefined(targetTouches)) __obj.updateDynamic("targetTouches")(targetTouches)
    if (!js.isUndefined(toElement)) __obj.updateDynamic("toElement")(toElement)
    if (!js.isUndefined(touches)) __obj.updateDynamic("touches")(touches)
    if (!js.isUndefined(view)) __obj.updateDynamic("view")(view)
    if (!js.isUndefined(which)) __obj.updateDynamic("which")(which)
    __obj.asInstanceOf[EventBase[TDelegateTarget, TData, TCurrentTarget, TTarget]]
  }
}

