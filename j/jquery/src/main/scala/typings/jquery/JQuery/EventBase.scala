package typings.jquery.JQuery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// region Event
// #region Event
@js.native
trait EventBase[TDelegateTarget, TData, TCurrentTarget, TTarget] extends TriggeredEvent[TDelegateTarget, TData, TCurrentTarget, TTarget] {
  // MouseEvent, KeyboardEvent, TouchEvent
  @JSName("altKey")
  var altKey_EventBase: js.UndefOr[scala.Nothing] = js.native
  // Event
  @JSName("bubbles")
  var bubbles_EventBase: Boolean = js.native
  // MouseEvent
  @JSName("button")
  var button_EventBase: js.UndefOr[scala.Nothing] = js.native
  @JSName("buttons")
  var buttons_EventBase: js.UndefOr[scala.Nothing] = js.native
  @JSName("cancelable")
  var cancelable_EventBase: Boolean = js.native
  // TouchEvent
  @JSName("changedTouches")
  var changedTouches_EventBase: js.UndefOr[scala.Nothing] = js.native
  /** @deprecated */
  @JSName("charCode")
  var charCode_EventBase: js.UndefOr[scala.Nothing] = js.native
  // KeyboardEvent
  /** @deprecated */
  @JSName("char")
  var char_EventBase: js.UndefOr[scala.Nothing] = js.native
  @JSName("clientX")
  var clientX_EventBase: js.UndefOr[scala.Nothing] = js.native
  @JSName("clientY")
  var clientY_EventBase: js.UndefOr[scala.Nothing] = js.native
  @JSName("ctrlKey")
  var ctrlKey_EventBase: js.UndefOr[scala.Nothing] = js.native
  // UIEvent
  @JSName("detail")
  var detail_EventBase: js.UndefOr[scala.Nothing] = js.native
  @JSName("eventPhase")
  var eventPhase_EventBase: Double = js.native
  /** @deprecated */
  @JSName("keyCode")
  var keyCode_EventBase: js.UndefOr[scala.Nothing] = js.native
  @JSName("key")
  var key_EventBase: js.UndefOr[scala.Nothing] = js.native
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
  var metaKey_EventBase: js.UndefOr[scala.Nothing] = js.native
  @JSName("offsetX")
  var offsetX_EventBase: js.UndefOr[scala.Nothing] = js.native
  @JSName("offsetY")
  var offsetY_EventBase: js.UndefOr[scala.Nothing] = js.native
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
  var pageX_EventBase: js.UndefOr[scala.Nothing] = js.native
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
  var pageY_EventBase: js.UndefOr[scala.Nothing] = js.native
  // PointerEvent
  @JSName("pointerId")
  var pointerId_EventBase: js.UndefOr[scala.Nothing] = js.native
  @JSName("pointerType")
  var pointerType_EventBase: js.UndefOr[scala.Nothing] = js.native
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
  var relatedTarget: js.UndefOr[scala.Nothing] = js.native
  @JSName("screenX")
  var screenX_EventBase: js.UndefOr[scala.Nothing] = js.native
  @JSName("screenY")
  var screenY_EventBase: js.UndefOr[scala.Nothing] = js.native
  @JSName("shiftKey")
  var shiftKey_EventBase: js.UndefOr[scala.Nothing] = js.native
  @JSName("targetTouches")
  var targetTouches_EventBase: js.UndefOr[scala.Nothing] = js.native
  /** @deprecated */
  @JSName("toElement")
  var toElement_EventBase: js.UndefOr[scala.Nothing] = js.native
  @JSName("touches")
  var touches_EventBase: js.UndefOr[scala.Nothing] = js.native
  @JSName("view")
  var view_EventBase: js.UndefOr[scala.Nothing] = js.native
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
  var which_EventBase: js.UndefOr[scala.Nothing] = js.native
}

object EventBase {
  @scala.inline
  def apply[TDelegateTarget, TData, TCurrentTarget, TTarget](
    bubbles: Boolean,
    cancelable: Boolean,
    currentTarget: TCurrentTarget,
    data: TData,
    delegateTarget: TDelegateTarget,
    eventPhase: Double,
    isDefaultPrevented: () => Boolean,
    isImmediatePropagationStopped: () => Boolean,
    isPropagationStopped: () => Boolean,
    preventDefault: () => Unit,
    stopImmediatePropagation: () => Unit,
    stopPropagation: () => Unit,
    target: TTarget,
    timeStamp: Double,
    `type`: String
  ): EventBase[TDelegateTarget, TData, TCurrentTarget, TTarget] = {
    val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], delegateTarget = delegateTarget.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isImmediatePropagationStopped = js.Any.fromFunction0(isImmediatePropagationStopped), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), preventDefault = js.Any.fromFunction0(preventDefault), stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventBase[TDelegateTarget, TData, TCurrentTarget, TTarget]]
  }
  @scala.inline
  implicit class EventBaseOps[Self <: EventBase[_, _, _, _], TDelegateTarget, TData, TCurrentTarget, TTarget] (val x: Self with (EventBase[TDelegateTarget, TData, TCurrentTarget, TTarget])) extends AnyVal {
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
    def setBubbles(value: Boolean): Self = this.set("bubbles", value.asInstanceOf[js.Any])
    @scala.inline
    def setCancelable(value: Boolean): Self = this.set("cancelable", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventPhase(value: Double): Self = this.set("eventPhase", value.asInstanceOf[js.Any])
  }
  
}

