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
  var altKey_EventBase: js.UndefOr[scala.Nothing]
  // Event
  @JSName("bubbles")
  var bubbles_EventBase: scala.Boolean
  // MouseEvent
  @JSName("button")
  var button_EventBase: js.UndefOr[scala.Nothing]
  @JSName("buttons")
  var buttons_EventBase: js.UndefOr[scala.Nothing]
  @JSName("cancelable")
  var cancelable_EventBase: scala.Boolean
  // TouchEvent
  @JSName("changedTouches")
  var changedTouches_EventBase: js.UndefOr[scala.Nothing]
  /** @deprecated */
  @JSName("charCode")
  var charCode_EventBase: js.UndefOr[scala.Nothing]
  // KeyboardEvent
  /** @deprecated */
  @JSName("char")
  var char_EventBase: js.UndefOr[scala.Nothing]
  @JSName("clientX")
  var clientX_EventBase: js.UndefOr[scala.Nothing]
  @JSName("clientY")
  var clientY_EventBase: js.UndefOr[scala.Nothing]
  @JSName("ctrlKey")
  var ctrlKey_EventBase: js.UndefOr[scala.Nothing]
  // UIEvent
  @JSName("detail")
  var detail_EventBase: js.UndefOr[scala.Nothing]
  @JSName("eventPhase")
  var eventPhase_EventBase: scala.Double
  /** @deprecated */
  @JSName("keyCode")
  var keyCode_EventBase: js.UndefOr[scala.Nothing]
  @JSName("key")
  var key_EventBase: js.UndefOr[scala.Nothing]
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
  var metaKey_EventBase: js.UndefOr[scala.Nothing]
  @JSName("offsetX")
  var offsetX_EventBase: js.UndefOr[scala.Nothing]
  @JSName("offsetY")
  var offsetY_EventBase: js.UndefOr[scala.Nothing]
  var originalEvent: js.UndefOr[jqueryLib._Event] = js.undefined
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
  var pageX_EventBase: js.UndefOr[scala.Nothing]
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
  var pageY_EventBase: js.UndefOr[scala.Nothing]
  // PointerEvent
  @JSName("pointerId")
  var pointerId_EventBase: js.UndefOr[scala.Nothing]
  @JSName("pointerType")
  var pointerType_EventBase: js.UndefOr[scala.Nothing]
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
  var screenX_EventBase: js.UndefOr[scala.Nothing]
  @JSName("screenY")
  var screenY_EventBase: js.UndefOr[scala.Nothing]
  @JSName("shiftKey")
  var shiftKey_EventBase: js.UndefOr[scala.Nothing]
  @JSName("targetTouches")
  var targetTouches_EventBase: js.UndefOr[scala.Nothing]
  /** @deprecated */
  @JSName("toElement")
  var toElement_EventBase: js.UndefOr[scala.Nothing]
  @JSName("touches")
  var touches_EventBase: js.UndefOr[scala.Nothing]
  @JSName("view")
  var view_EventBase: js.UndefOr[scala.Nothing]
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
  var which_EventBase: js.UndefOr[scala.Nothing]
}

