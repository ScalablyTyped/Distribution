package typings
package jqueryLib.JQueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion
// region KeyboardEvent
// #region KeyboardEvent

trait KeyboardEventBase[TDelegateTarget, TData, TCurrentTarget, TTarget] extends UIEventBase[TDelegateTarget, TData, TCurrentTarget, TTarget] {
  // MouseEvent, KeyboardEvent, TouchEvent
  @JSName("altKey")
  var altKey_KeyboardEventBase: scala.Boolean
  // MouseEvent
  @JSName("button")
  var button_KeyboardEventBase: js.UndefOr[scala.Nothing]
  @JSName("buttons")
  var buttons_KeyboardEventBase: js.UndefOr[scala.Nothing]
  // TouchEvent
  @JSName("changedTouches")
  var changedTouches_KeyboardEventBase: js.UndefOr[scala.Nothing]
  /** @deprecated */
  @JSName("charCode")
  var charCode_KeyboardEventBase: scala.Double
  @JSName("clientX")
  var clientX_KeyboardEventBase: js.UndefOr[scala.Nothing]
  @JSName("clientY")
  var clientY_KeyboardEventBase: js.UndefOr[scala.Nothing]
  @JSName("ctrlKey")
  var ctrlKey_KeyboardEventBase: scala.Boolean
  /** @deprecated */
  @JSName("keyCode")
  var keyCode_KeyboardEventBase: scala.Double
  @JSName("key")
  var key_KeyboardEventBase: java.lang.String
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
  var metaKey_KeyboardEventBase: scala.Boolean
  @JSName("offsetX")
  var offsetX_KeyboardEventBase: js.UndefOr[scala.Nothing]
  @JSName("offsetY")
  var offsetY_KeyboardEventBase: js.UndefOr[scala.Nothing]
  @JSName("originalEvent")
  var originalEvent_KeyboardEventBase: js.UndefOr[jqueryLib._KeyboardEvent] = js.undefined
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
  var pageX_KeyboardEventBase: js.UndefOr[scala.Nothing]
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
  var pageY_KeyboardEventBase: js.UndefOr[scala.Nothing]
  // PointerEvent
  @JSName("pointerId")
  var pointerId_KeyboardEventBase: js.UndefOr[scala.Nothing]
  @JSName("pointerType")
  var pointerType_KeyboardEventBase: js.UndefOr[scala.Nothing]
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
  var screenX_KeyboardEventBase: js.UndefOr[scala.Nothing]
  @JSName("screenY")
  var screenY_KeyboardEventBase: js.UndefOr[scala.Nothing]
  @JSName("shiftKey")
  var shiftKey_KeyboardEventBase: scala.Boolean
  @JSName("targetTouches")
  var targetTouches_KeyboardEventBase: js.UndefOr[scala.Nothing]
  /** @deprecated */
  @JSName("toElement")
  var toElement_KeyboardEventBase: js.UndefOr[scala.Nothing]
  @JSName("touches")
  var touches_KeyboardEventBase: js.UndefOr[scala.Nothing]
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
  var which_KeyboardEventBase: scala.Double
}

