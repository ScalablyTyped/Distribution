package typings.jquery.JQueryNs

import typings.std.Element
import typings.std.TouchList
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * jQuery's event system normalizes the event object according to W3C standards. The event object is guaranteed to be passed to the event handler (no checks for window.event required). It normalizes the target, relatedTarget, which, metaKey and pageX/Y properties and provides both stopPropagation() and preventDefault() methods.
  *
  * Those properties are all documented, and accompanied by examples, on the \`{@link http://api.jquery.com/category/events/event-object/ Event object}\` page.
  *
  * The standard events in the Document Object Model are: `blur`, `focus`, `load`, `resize`, `scroll`, `unload`, `beforeunload`, `click`, `dblclick`, `mousedown`, `mouseup`, `mousemove`, `mouseover`, `mouseout`, `mouseenter`, `mouseleave`, `change`, `select`, `submit`, `keydown`, `keypress`, and `keyup`. Since the DOM event names have predefined meanings for some elements, using them for other purposes is not recommended. jQuery's event model can trigger an event by any name on an element, and it is propagated up the DOM tree to which that element belongs, if any.
  * @see \`{@link https://api.jquery.com/category/events/event-object/ }\`
  * @see \`{@link TriggeredEvent }\`
  */
trait Event extends js.Object {
  // MouseEvent, KeyboardEvent, TouchEvent
  var altKey: js.UndefOr[Boolean] = js.undefined
  // region Copied properties
  // #region Copied properties
  // Event
  var bubbles: js.UndefOr[Boolean] = js.undefined
  // MouseEvent
  var button: js.UndefOr[Double] = js.undefined
  var buttons: js.UndefOr[Double] = js.undefined
  var cancelable: js.UndefOr[Boolean] = js.undefined
  // TouchEvent
  var changedTouches: js.UndefOr[TouchList] = js.undefined
  // KeyboardEvent
  /** @deprecated */
  var char: js.UndefOr[String] = js.undefined
  /** @deprecated */
  var charCode: js.UndefOr[Double] = js.undefined
  var clientX: js.UndefOr[Double] = js.undefined
  var clientY: js.UndefOr[Double] = js.undefined
  var ctrlKey: js.UndefOr[Boolean] = js.undefined
  // UIEvent
  var detail: js.UndefOr[Double] = js.undefined
  var eventPhase: js.UndefOr[Double] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  /** @deprecated */
  var keyCode: js.UndefOr[Double] = js.undefined
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
  var metaKey: js.UndefOr[Boolean] = js.undefined
  var offsetX: js.UndefOr[Double] = js.undefined
  var offsetY: js.UndefOr[Double] = js.undefined
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
  var pageX: js.UndefOr[Double] = js.undefined
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
  var pageY: js.UndefOr[Double] = js.undefined
  // PointerEvent
  var pointerId: js.UndefOr[Double] = js.undefined
  var pointerType: js.UndefOr[String] = js.undefined
  var screenX: js.UndefOr[Double] = js.undefined
  var screenY: js.UndefOr[Double] = js.undefined
  var shiftKey: js.UndefOr[Boolean] = js.undefined
  var targetTouches: js.UndefOr[TouchList] = js.undefined
  // #endregion
  /**
    * The difference in milliseconds between the time the browser created the event and January 1, 1970.
    * @see \`{@link https://api.jquery.com/event.timeStamp/ }\`
    * @since 1.2.6
    * @example ​ ````Display the time since the click handler last executed.
  ```html
  <!doctype html>
  <html lang="en">
  <head>
    <meta charset="utf-8">
    <title>event.timeStamp demo</title>
    <style>
    div {
    height: 100px;
    width: 300px;
    margin: 10px;
    background-color: #ffd;
    overflow: auto;
    }
    </style>
    <script src="https://code.jquery.com/jquery-3.3.1.js"></script>
  </head>
  <body>
  ​
  <div>Click.</div>
  ​
  <script>
  var last, diff;
  $( "div" ).click(function( event ) {
    if ( last ) {
    diff = event.timeStamp - last;
    $( "div" ).append( "time since last event: " + diff + "<br>" );
    } else {
    $( "div" ).append( "Click again.<br>" );
    }
    last = event.timeStamp;
  });
  </script>
  ​
  </body>
  </html>
  ```
    */
  var timeStamp: Double
  /** @deprecated */
  var toElement: js.UndefOr[Element] = js.undefined
  var touches: js.UndefOr[TouchList] = js.undefined
  /**
    * Describes the nature of the event.
    * @see \`{@link https://api.jquery.com/event.type/ }\`
    * @since 1.0
    * @example ​ ````On all anchor clicks, alert the event type.
  ```javascript
  $( "a" ).click(function( event ) {
    alert( event.type ); // "click"
  });
  ```
    */
  var `type`: String
  var view: js.UndefOr[Window] = js.undefined
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
  var which: js.UndefOr[Double] = js.undefined
  /**
    * Returns whether event.preventDefault() was ever called on this event object.
    * @see \`{@link https://api.jquery.com/event.isDefaultPrevented/ }\`
    * @since 1.3
    * @example ​ ````Checks whether event.preventDefault() was called.
  ```javascript
  $( "a" ).click(function( event ) {
    alert( event.isDefaultPrevented() ); // false
    event.preventDefault();
    alert( event.isDefaultPrevented() ); // true
  });
  ```
    */
  def isDefaultPrevented(): Boolean
  /**
    * Returns whether event.stopImmediatePropagation() was ever called on this event object.
    * @see \`{@link https://api.jquery.com/event.isImmediatePropagationStopped/ }\`
    * @since 1.3
    * @example ​ ````Checks whether event.stopImmediatePropagation() was called.
  ```html
  <!doctype html>
  <html lang="en">
  <head>
    <meta charset="utf-8">
    <title>event.isImmediatePropagationStopped demo</title>
    <script src="https://code.jquery.com/jquery-3.3.1.js"></script>
  </head>
  <body>
  ​
  <button>click me</button>
  <div id="stop-log"></div>
    ​
  <script>
  function immediatePropStopped( event ) {
    var msg = "";
    if ( event.isImmediatePropagationStopped() ) {
    msg = "called";
    } else {
    msg = "not called";
    }
    $( "#stop-log" ).append( "<div>" + msg + "</div>" );
  }
  ​
  $( "button" ).click(function( event ) {
    immediatePropStopped( event );
    event.stopImmediatePropagation();
    immediatePropStopped( event );
  });
  </script>
  ​
  </body>
  </html>
  ```
    */
  def isImmediatePropagationStopped(): Boolean
  /**
    * Returns whether event.stopPropagation() was ever called on this event object.
    * @see \`{@link https://api.jquery.com/event.isPropagationStopped/ }\`
    * @since 1.3
    * @example ​ ````Checks whether event.stopPropagation() was called
  ```html
  <!doctype html>
  <html lang="en">
  <head>
    <meta charset="utf-8">
    <title>event.isPropagationStopped demo</title>
    <script src="https://code.jquery.com/jquery-3.3.1.js"></script>
  </head>
  <body>
  ​
  <button>click me</button>
  <div id="stop-log"></div>
    ​
  <script>
  function propStopped( event ) {
    var msg = "";
    if ( event.isPropagationStopped() ) {
    msg = "called";
    } else {
    msg = "not called";
    }
    $( "#stop-log" ).append( "<div>" + msg + "</div>" );
  }
  ​
  $( "button" ).click(function(event) {
    propStopped( event );
    event.stopPropagation();
    propStopped( event );
  });
  </script>
  ​
  </body>
  </html>
  ```
    */
  def isPropagationStopped(): Boolean
  /**
    * If this method is called, the default action of the event will not be triggered.
    * @see \`{@link https://api.jquery.com/event.preventDefault/ }\`
    * @since 1.0
    * @example ​ ````Cancel the default action (navigation) of the click.
  ```html
  <!doctype html>
  <html lang="en">
  <head>
    <meta charset="utf-8">
    <title>event.preventDefault demo</title>
    <script src="https://code.jquery.com/jquery-3.3.1.js"></script>
  </head>
  <body>
  ​
  <a href="https://jquery.com">default click action is prevented</a>
  <div id="log"></div>
  ​
  <script>
  $( "a" ).click(function( event ) {
    event.preventDefault();
    $( "<div>" )
    .append( "default " + event.type + " prevented" )
    .appendTo( "#log" );
  });
  </script>
  ​
  </body>
  </html>
  ```
    */
  def preventDefault(): Unit
  /**
    * Keeps the rest of the handlers from being executed and prevents the event from bubbling up the DOM tree.
    * @see \`{@link https://api.jquery.com/event.stopImmediatePropagation/ }\`
    * @since 1.3
    * @example ​ ````Prevents other event handlers from being called.
  ```html
  <!doctype html>
  <html lang="en">
  <head>
    <meta charset="utf-8">
    <title>event.stopImmediatePropagation demo</title>
    <style>
    p {
    height: 30px;
    width: 150px;
    background-color: #ccf;
    }
    div {
    height: 30px;
    width: 150px;
    background-color: #cfc;
    }
    </style>
    <script src="https://code.jquery.com/jquery-3.3.1.js"></script>
  </head>
  <body>
  ​
  <p>paragraph</p>
  <div>division</div>
  ​
  <script>
  $( "p" ).click(function( event ) {
    event.stopImmediatePropagation();
  });
  $( "p" ).click(function( event ) {
    // This function won't be executed
    $( this ).css( "background-color", "#f00" );
  });
  $( "div" ).click(function( event ) {
    // This function will be executed
    $( this ).css( "background-color", "#f00" );
  });
  </script>
  ​
  </body>
  </html>
  ```
    */
  def stopImmediatePropagation(): Unit
  /**
    * Prevents the event from bubbling up the DOM tree, preventing any parent handlers from being notified of the event.
    * @see \`{@link https://api.jquery.com/event.stopPropagation/ }\`
    * @since 1.0
    * @example ​ ````Kill the bubbling on the click event.
  ```javascript
  $( "p" ).click(function( event ) {
    event.stopPropagation();
    // Do something
  });
  ```
    */
  def stopPropagation(): Unit
}

object Event {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    isImmediatePropagationStopped: () => Boolean,
    isPropagationStopped: () => Boolean,
    preventDefault: () => Unit,
    stopImmediatePropagation: () => Unit,
    stopPropagation: () => Unit,
    timeStamp: Double,
    `type`: String,
    altKey: js.UndefOr[Boolean] = js.undefined,
    bubbles: js.UndefOr[Boolean] = js.undefined,
    button: Int | Double = null,
    buttons: Int | Double = null,
    cancelable: js.UndefOr[Boolean] = js.undefined,
    changedTouches: TouchList = null,
    char: String = null,
    charCode: Int | Double = null,
    clientX: Int | Double = null,
    clientY: Int | Double = null,
    ctrlKey: js.UndefOr[Boolean] = js.undefined,
    detail: Int | Double = null,
    eventPhase: Int | Double = null,
    key: String = null,
    keyCode: Int | Double = null,
    metaKey: js.UndefOr[Boolean] = js.undefined,
    offsetX: Int | Double = null,
    offsetY: Int | Double = null,
    pageX: Int | Double = null,
    pageY: Int | Double = null,
    pointerId: Int | Double = null,
    pointerType: String = null,
    screenX: Int | Double = null,
    screenY: Int | Double = null,
    shiftKey: js.UndefOr[Boolean] = js.undefined,
    targetTouches: TouchList = null,
    toElement: Element = null,
    touches: TouchList = null,
    view: Window = null,
    which: Int | Double = null
  ): Event = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isImmediatePropagationStopped = js.Any.fromFunction0(isImmediatePropagationStopped), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), preventDefault = js.Any.fromFunction0(preventDefault), stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), timeStamp = timeStamp)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(altKey)) __obj.updateDynamic("altKey")(altKey)
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles)
    if (button != null) __obj.updateDynamic("button")(button.asInstanceOf[js.Any])
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable)
    if (changedTouches != null) __obj.updateDynamic("changedTouches")(changedTouches)
    if (char != null) __obj.updateDynamic("char")(char)
    if (charCode != null) __obj.updateDynamic("charCode")(charCode.asInstanceOf[js.Any])
    if (clientX != null) __obj.updateDynamic("clientX")(clientX.asInstanceOf[js.Any])
    if (clientY != null) __obj.updateDynamic("clientY")(clientY.asInstanceOf[js.Any])
    if (!js.isUndefined(ctrlKey)) __obj.updateDynamic("ctrlKey")(ctrlKey)
    if (detail != null) __obj.updateDynamic("detail")(detail.asInstanceOf[js.Any])
    if (eventPhase != null) __obj.updateDynamic("eventPhase")(eventPhase.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key)
    if (keyCode != null) __obj.updateDynamic("keyCode")(keyCode.asInstanceOf[js.Any])
    if (!js.isUndefined(metaKey)) __obj.updateDynamic("metaKey")(metaKey)
    if (offsetX != null) __obj.updateDynamic("offsetX")(offsetX.asInstanceOf[js.Any])
    if (offsetY != null) __obj.updateDynamic("offsetY")(offsetY.asInstanceOf[js.Any])
    if (pageX != null) __obj.updateDynamic("pageX")(pageX.asInstanceOf[js.Any])
    if (pageY != null) __obj.updateDynamic("pageY")(pageY.asInstanceOf[js.Any])
    if (pointerId != null) __obj.updateDynamic("pointerId")(pointerId.asInstanceOf[js.Any])
    if (pointerType != null) __obj.updateDynamic("pointerType")(pointerType)
    if (screenX != null) __obj.updateDynamic("screenX")(screenX.asInstanceOf[js.Any])
    if (screenY != null) __obj.updateDynamic("screenY")(screenY.asInstanceOf[js.Any])
    if (!js.isUndefined(shiftKey)) __obj.updateDynamic("shiftKey")(shiftKey)
    if (targetTouches != null) __obj.updateDynamic("targetTouches")(targetTouches)
    if (toElement != null) __obj.updateDynamic("toElement")(toElement)
    if (touches != null) __obj.updateDynamic("touches")(touches)
    if (view != null) __obj.updateDynamic("view")(view)
    if (which != null) __obj.updateDynamic("which")(which.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
}

