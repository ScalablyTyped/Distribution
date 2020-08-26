package typings.jquery.JQuery

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
@js.native
trait Event extends js.Object {
  // MouseEvent, KeyboardEvent, TouchEvent
  var altKey: js.UndefOr[Boolean] = js.native
  // region Copied properties
  // #region Copied properties
  // Event
  var bubbles: js.UndefOr[Boolean] = js.native
  // MouseEvent
  var button: js.UndefOr[Double] = js.native
  var buttons: js.UndefOr[Double] = js.native
  var cancelable: js.UndefOr[Boolean] = js.native
  // TouchEvent
  var changedTouches: js.UndefOr[TouchList] = js.native
  // KeyboardEvent
  /** @deprecated */
  var char: js.UndefOr[String] = js.native
  /** @deprecated */
  var charCode: js.UndefOr[Double] = js.native
  var clientX: js.UndefOr[Double] = js.native
  var clientY: js.UndefOr[Double] = js.native
  var ctrlKey: js.UndefOr[Boolean] = js.native
  // UIEvent
  var detail: js.UndefOr[Double] = js.native
  var eventPhase: js.UndefOr[Double] = js.native
  var key: js.UndefOr[String] = js.native
  /** @deprecated */
  var keyCode: js.UndefOr[Double] = js.native
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
  var metaKey: js.UndefOr[Boolean] = js.native
  var offsetX: js.UndefOr[Double] = js.native
  var offsetY: js.UndefOr[Double] = js.native
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
  var pageX: js.UndefOr[Double] = js.native
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
  var pageY: js.UndefOr[Double] = js.native
  // PointerEvent
  var pointerId: js.UndefOr[Double] = js.native
  var pointerType: js.UndefOr[String] = js.native
  var screenX: js.UndefOr[Double] = js.native
  var screenY: js.UndefOr[Double] = js.native
  var shiftKey: js.UndefOr[Boolean] = js.native
  var targetTouches: js.UndefOr[TouchList] = js.native
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
  var timeStamp: Double = js.native
  /** @deprecated */
  var toElement: js.UndefOr[Element] = js.native
  var touches: js.UndefOr[TouchList] = js.native
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
  var `type`: String = js.native
  var view: js.UndefOr[Window] = js.native
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
  var which: js.UndefOr[Double] = js.native
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
  def isDefaultPrevented(): Boolean = js.native
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
  def isImmediatePropagationStopped(): Boolean = js.native
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
  def isPropagationStopped(): Boolean = js.native
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
  def preventDefault(): Unit = js.native
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
  def stopImmediatePropagation(): Unit = js.native
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
  def stopPropagation(): Unit = js.native
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
    `type`: String
  ): Event = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isImmediatePropagationStopped = js.Any.fromFunction0(isImmediatePropagationStopped), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), preventDefault = js.Any.fromFunction0(preventDefault), stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  @scala.inline
  implicit class EventOps[Self <: Event] (val x: Self) extends AnyVal {
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
    def setIsDefaultPrevented(value: () => Boolean): Self = this.set("isDefaultPrevented", js.Any.fromFunction0(value))
    @scala.inline
    def setIsImmediatePropagationStopped(value: () => Boolean): Self = this.set("isImmediatePropagationStopped", js.Any.fromFunction0(value))
    @scala.inline
    def setIsPropagationStopped(value: () => Boolean): Self = this.set("isPropagationStopped", js.Any.fromFunction0(value))
    @scala.inline
    def setPreventDefault(value: () => Unit): Self = this.set("preventDefault", js.Any.fromFunction0(value))
    @scala.inline
    def setStopImmediatePropagation(value: () => Unit): Self = this.set("stopImmediatePropagation", js.Any.fromFunction0(value))
    @scala.inline
    def setStopPropagation(value: () => Unit): Self = this.set("stopPropagation", js.Any.fromFunction0(value))
    @scala.inline
    def setTimeStamp(value: Double): Self = this.set("timeStamp", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setAltKey(value: Boolean): Self = this.set("altKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAltKey: Self = this.set("altKey", js.undefined)
    @scala.inline
    def setBubbles(value: Boolean): Self = this.set("bubbles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBubbles: Self = this.set("bubbles", js.undefined)
    @scala.inline
    def setButton(value: Double): Self = this.set("button", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButton: Self = this.set("button", js.undefined)
    @scala.inline
    def setButtons(value: Double): Self = this.set("buttons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtons: Self = this.set("buttons", js.undefined)
    @scala.inline
    def setCancelable(value: Boolean): Self = this.set("cancelable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancelable: Self = this.set("cancelable", js.undefined)
    @scala.inline
    def setChangedTouches(value: TouchList): Self = this.set("changedTouches", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChangedTouches: Self = this.set("changedTouches", js.undefined)
    @scala.inline
    def setChar(value: String): Self = this.set("char", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChar: Self = this.set("char", js.undefined)
    @scala.inline
    def setCharCode(value: Double): Self = this.set("charCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCharCode: Self = this.set("charCode", js.undefined)
    @scala.inline
    def setClientX(value: Double): Self = this.set("clientX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientX: Self = this.set("clientX", js.undefined)
    @scala.inline
    def setClientY(value: Double): Self = this.set("clientY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientY: Self = this.set("clientY", js.undefined)
    @scala.inline
    def setCtrlKey(value: Boolean): Self = this.set("ctrlKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCtrlKey: Self = this.set("ctrlKey", js.undefined)
    @scala.inline
    def setDetail(value: Double): Self = this.set("detail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetail: Self = this.set("detail", js.undefined)
    @scala.inline
    def setEventPhase(value: Double): Self = this.set("eventPhase", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventPhase: Self = this.set("eventPhase", js.undefined)
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setKeyCode(value: Double): Self = this.set("keyCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyCode: Self = this.set("keyCode", js.undefined)
    @scala.inline
    def setMetaKey(value: Boolean): Self = this.set("metaKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetaKey: Self = this.set("metaKey", js.undefined)
    @scala.inline
    def setOffsetX(value: Double): Self = this.set("offsetX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetX: Self = this.set("offsetX", js.undefined)
    @scala.inline
    def setOffsetY(value: Double): Self = this.set("offsetY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetY: Self = this.set("offsetY", js.undefined)
    @scala.inline
    def setPageX(value: Double): Self = this.set("pageX", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageX: Self = this.set("pageX", js.undefined)
    @scala.inline
    def setPageY(value: Double): Self = this.set("pageY", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageY: Self = this.set("pageY", js.undefined)
    @scala.inline
    def setPointerId(value: Double): Self = this.set("pointerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePointerId: Self = this.set("pointerId", js.undefined)
    @scala.inline
    def setPointerType(value: String): Self = this.set("pointerType", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePointerType: Self = this.set("pointerType", js.undefined)
    @scala.inline
    def setScreenX(value: Double): Self = this.set("screenX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScreenX: Self = this.set("screenX", js.undefined)
    @scala.inline
    def setScreenY(value: Double): Self = this.set("screenY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScreenY: Self = this.set("screenY", js.undefined)
    @scala.inline
    def setShiftKey(value: Boolean): Self = this.set("shiftKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShiftKey: Self = this.set("shiftKey", js.undefined)
    @scala.inline
    def setTargetTouches(value: TouchList): Self = this.set("targetTouches", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetTouches: Self = this.set("targetTouches", js.undefined)
    @scala.inline
    def setToElement(value: Element): Self = this.set("toElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToElement: Self = this.set("toElement", js.undefined)
    @scala.inline
    def setTouches(value: TouchList): Self = this.set("touches", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTouches: Self = this.set("touches", js.undefined)
    @scala.inline
    def setView(value: Window): Self = this.set("view", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
    @scala.inline
    def setWhich(value: Double): Self = this.set("which", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhich: Self = this.set("which", js.undefined)
  }
  
}

