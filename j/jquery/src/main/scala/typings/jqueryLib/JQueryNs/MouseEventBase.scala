package typings
package jqueryLib.JQueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// region MouseEvent
// #region MouseEvent
trait MouseEventBase[TDelegateTarget, TData, TCurrentTarget, TTarget] extends UIEventBase[TDelegateTarget, TData, TCurrentTarget, TTarget] {
  // MouseEvent, KeyboardEvent, TouchEvent
  @JSName("altKey")
  var altKey_MouseEventBase: scala.Boolean
  // MouseEvent
  @JSName("button")
  var button_MouseEventBase: scala.Double
  @JSName("buttons")
  var buttons_MouseEventBase: scala.Double
  // TouchEvent
  @JSName("changedTouches")
  var changedTouches_MouseEventBase: js.UndefOr[scala.Nothing]
  /** @deprecated */
  @JSName("charCode")
  var charCode_MouseEventBase: js.UndefOr[scala.Nothing]
  // KeyboardEvent
  /** @deprecated */
  @JSName("char")
  var char_MouseEventBase: js.UndefOr[scala.Nothing]
  @JSName("clientX")
  var clientX_MouseEventBase: scala.Double
  @JSName("clientY")
  var clientY_MouseEventBase: scala.Double
  @JSName("ctrlKey")
  var ctrlKey_MouseEventBase: scala.Boolean
  /** @deprecated */
  @JSName("keyCode")
  var keyCode_MouseEventBase: js.UndefOr[scala.Nothing]
  @JSName("key")
  var key_MouseEventBase: js.UndefOr[scala.Nothing]
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
  var metaKey_MouseEventBase: scala.Boolean
  @JSName("offsetX")
  var offsetX_MouseEventBase: scala.Double
  @JSName("offsetY")
  var offsetY_MouseEventBase: scala.Double
  @JSName("originalEvent")
  var originalEvent_MouseEventBase: js.UndefOr[jqueryLib._MouseEvent] = js.undefined
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
  var pageX_MouseEventBase: scala.Double
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
  var pageY_MouseEventBase: scala.Double
  // PointerEvent
  @JSName("pointerId")
  var pointerId_MouseEventBase: js.UndefOr[scala.Nothing]
  @JSName("pointerType")
  var pointerType_MouseEventBase: js.UndefOr[scala.Nothing]
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
  var relatedTarget: js.UndefOr[stdLib.EventTarget | scala.Null] = js.undefined
  @JSName("screenX")
  var screenX_MouseEventBase: scala.Double
  @JSName("screenY")
  var screenY_MouseEventBase: scala.Double
  @JSName("shiftKey")
  var shiftKey_MouseEventBase: scala.Boolean
  @JSName("targetTouches")
  var targetTouches_MouseEventBase: js.UndefOr[scala.Nothing]
  /** @deprecated */
  @JSName("toElement")
  var toElement_MouseEventBase: stdLib.Element
  @JSName("touches")
  var touches_MouseEventBase: js.UndefOr[scala.Nothing]
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
  var which_MouseEventBase: scala.Double
}

object MouseEventBase {
  @scala.inline
  def apply[TDelegateTarget, TData, TCurrentTarget, TTarget](
    altKey: scala.Boolean,
    bubbles: scala.Boolean,
    button: scala.Double,
    buttons: scala.Double,
    cancelable: scala.Boolean,
    clientX: scala.Double,
    clientY: scala.Double,
    ctrlKey: scala.Boolean,
    currentTarget: TCurrentTarget,
    data: TData,
    delegateTarget: TDelegateTarget,
    detail: scala.Double,
    eventPhase: scala.Double,
    isDefaultPrevented: js.Function0[scala.Boolean],
    isImmediatePropagationStopped: js.Function0[scala.Boolean],
    isPropagationStopped: js.Function0[scala.Boolean],
    metaKey: scala.Boolean,
    offsetX: scala.Double,
    offsetY: scala.Double,
    pageX: scala.Double,
    pageY: scala.Double,
    preventDefault: js.Function0[scala.Unit],
    screenX: scala.Double,
    screenY: scala.Double,
    shiftKey: scala.Boolean,
    stopImmediatePropagation: js.Function0[scala.Unit],
    stopPropagation: js.Function0[scala.Unit],
    target: TTarget,
    timeStamp: scala.Double,
    toElement: stdLib.Element,
    `type`: java.lang.String,
    view: stdLib.Window,
    which: scala.Double,
    changedTouches: js.UndefOr[scala.Nothing] = js.undefined,
    char: js.UndefOr[scala.Nothing] = js.undefined,
    charCode: js.UndefOr[scala.Nothing] = js.undefined,
    key: js.UndefOr[scala.Nothing] = js.undefined,
    keyCode: js.UndefOr[scala.Nothing] = js.undefined,
    namespace: java.lang.String = null,
    originalEvent: jqueryLib._MouseEvent = null,
    pointerId: js.UndefOr[scala.Nothing] = js.undefined,
    pointerType: js.UndefOr[scala.Nothing] = js.undefined,
    relatedTarget: stdLib.EventTarget = null,
    result: js.Any = null,
    targetTouches: js.UndefOr[scala.Nothing] = js.undefined,
    touches: js.UndefOr[scala.Nothing] = js.undefined
  ): MouseEventBase[TDelegateTarget, TData, TCurrentTarget, TTarget] = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("altKey")(altKey)
    __obj.updateDynamic("bubbles")(bubbles)
    __obj.updateDynamic("button")(button)
    __obj.updateDynamic("buttons")(buttons)
    __obj.updateDynamic("cancelable")(cancelable)
    __obj.updateDynamic("clientX")(clientX)
    __obj.updateDynamic("clientY")(clientY)
    __obj.updateDynamic("ctrlKey")(ctrlKey)
    __obj.updateDynamic("currentTarget")(currentTarget.asInstanceOf[js.Any])
    __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.updateDynamic("delegateTarget")(delegateTarget.asInstanceOf[js.Any])
    __obj.updateDynamic("detail")(detail)
    __obj.updateDynamic("eventPhase")(eventPhase)
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented)
    __obj.updateDynamic("isImmediatePropagationStopped")(isImmediatePropagationStopped)
    __obj.updateDynamic("isPropagationStopped")(isPropagationStopped)
    __obj.updateDynamic("metaKey")(metaKey)
    __obj.updateDynamic("offsetX")(offsetX)
    __obj.updateDynamic("offsetY")(offsetY)
    __obj.updateDynamic("pageX")(pageX)
    __obj.updateDynamic("pageY")(pageY)
    __obj.updateDynamic("preventDefault")(preventDefault)
    __obj.updateDynamic("screenX")(screenX)
    __obj.updateDynamic("screenY")(screenY)
    __obj.updateDynamic("shiftKey")(shiftKey)
    __obj.updateDynamic("stopImmediatePropagation")(stopImmediatePropagation)
    __obj.updateDynamic("stopPropagation")(stopPropagation)
    __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.updateDynamic("timeStamp")(timeStamp)
    __obj.updateDynamic("toElement")(toElement)
    __obj.updateDynamic("view")(view)
    __obj.updateDynamic("which")(which)
    if (!js.isUndefined(changedTouches)) __obj.updateDynamic("changedTouches")(changedTouches)
    if (!js.isUndefined(char)) __obj.updateDynamic("char")(char)
    if (!js.isUndefined(charCode)) __obj.updateDynamic("charCode")(charCode)
    if (!js.isUndefined(key)) __obj.updateDynamic("key")(key)
    if (!js.isUndefined(keyCode)) __obj.updateDynamic("keyCode")(keyCode)
    if (namespace != null) __obj.updateDynamic("namespace")(namespace)
    if (originalEvent != null) __obj.updateDynamic("originalEvent")(originalEvent)
    if (!js.isUndefined(pointerId)) __obj.updateDynamic("pointerId")(pointerId)
    if (!js.isUndefined(pointerType)) __obj.updateDynamic("pointerType")(pointerType)
    if (relatedTarget != null) __obj.updateDynamic("relatedTarget")(relatedTarget)
    if (result != null) __obj.updateDynamic("result")(result)
    if (!js.isUndefined(targetTouches)) __obj.updateDynamic("targetTouches")(targetTouches)
    if (!js.isUndefined(touches)) __obj.updateDynamic("touches")(touches)
    __obj.asInstanceOf[MouseEventBase[TDelegateTarget, TData, TCurrentTarget, TTarget]]
  }
}

