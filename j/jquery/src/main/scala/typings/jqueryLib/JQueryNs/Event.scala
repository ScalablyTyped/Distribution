package typings
package jqueryLib.JQueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Instance members
// Generic members

trait Event[TTarget, TData] extends js.Object {
  // #endregion
  // region MouseEvent, KeyboardEvent, TouchEvent
  // #region MouseEvent, KeyboardEvent, TouchEvent
  var altKey: js.UndefOr[scala.Boolean] = js.undefined
  // region Copied properties
  // #region Copied properties
  // region Event
  // #region Event
  var bubbles: js.UndefOr[scala.Boolean] = js.undefined
  // #endregion
  // region MouseEvent
  // #region MouseEvent
  var button: js.UndefOr[scala.Double] = js.undefined
  var buttons: js.UndefOr[scala.Double] = js.undefined
  var cancelable: js.UndefOr[scala.Boolean] = js.undefined
  // #endregion
  // region TouchEvent
  // #region TouchEvent
  var changedTouches: js.UndefOr[stdLib.TouchList] = js.undefined
  // #endregion
  // region KeyboardEvent
  // #region KeyboardEvent
  /** @deprecated */
  var char: js.UndefOr[java.lang.String] = js.undefined
  /** @deprecated */
  var charCode: js.UndefOr[scala.Double] = js.undefined
  var clientX: js.UndefOr[scala.Double] = js.undefined
  var clientY: js.UndefOr[scala.Double] = js.undefined
  var ctrlKey: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * The current DOM element within the event bubbling phase.
           * @see \`{@link https://api.jquery.com/event.currentTarget/ }\`
           * @since 1.3
           * @example ​ ````Alert that currentTarget matches the `this` keyword.
  ```javascript
  $( "p" ).click(function( event ) {
    alert( event.currentTarget === this ); // true
  });
  ```
           */
  var currentTarget: TTarget
  /**
           * An optional object of data passed to an event method when the current executing handler is bound.
           * @see \`{@link https://api.jquery.com/event.data/ }\`
           * @since 1.1
           * @example ​ ````Within a for loop, pass the value of i to the .on() method so that the current iteration&#39;s value is preserved.
  ```html
  <!doctype html>
  <html lang="en">
  <head>
    <meta charset="utf-8">
    <title>event.data demo</title>
    <script src="https://code.jquery.com/jquery-3.3.1.js"></script>
  </head>
  <body>
  ​
  <button> 0 </button>
  <button> 1 </button>
  <button> 2 </button>
  <button> 3 </button>
  <button> 4 </button>
  ​
  <div id="log"></div>
  ​
  <script>
  var logDiv = $( "#log" );
  ​
  for ( var i = 0; i < 5; i++ ) {
    $( "button" ).eq( i ).on( "click", { value: i }, function( event ) {
      var msgs = [
        "button = " + $( this ).index(),
        "event.data.value = " + event.data.value,
        "i = " + i
      ];
      logDiv.append( msgs.join( ", " ) + "<br>" );
    });
  }
  </script>
  ​
  </body>
  </html>
  ```
           */
  var data: TData
  /**
           * The element where the currently-called jQuery event handler was attached.
           * @see \`{@link https://api.jquery.com/event.delegateTarget/ }\`
           * @since 1.7
           * @example ​ ````When a button in any box class is clicked, change the box&#39;s background color to red.
  ```javascript
  $( ".box" ).on( "click", "button", function( event ) {
    $( event.delegateTarget ).css( "background-color", "red" );
  });
  ```
           */
  var delegateTarget: TTarget
  // #endregion
  // region UIEvent
  // #region UIEvent
  var detail: js.UndefOr[scala.Double] = js.undefined
  var eventPhase: js.UndefOr[scala.Double] = js.undefined
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** @deprecated */
  var keyCode: js.UndefOr[scala.Double] = js.undefined
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
  var metaKey: scala.Boolean
  // #endregion
  // #endregion
  /**
           * The namespace specified when the event was triggered.
           * @see \`{@link https://api.jquery.com/event.namespace/ }\`
           * @since 1.4.3
           * @example ​ ````Determine the event namespace used.
  ```html
  <!doctype html>
  <html lang="en">
  <head>
    <meta charset="utf-8">
    <title>event.namespace demo</title>
    <script src="https://code.jquery.com/jquery-3.3.1.js"></script>
  </head>
  <body>
  ​
  <button>display event.namespace</button>
  <p></p>
  ​
  <script>
  $( "p" ).on( "test.something", function( event ) {
    alert( event.namespace );
  });
  $( "button" ).click(function( event ) {
    $( "p" ).trigger( "test.something" );
  });
  </script>
  ​
  </body>
  </html>
  ```
           */
  var namespace: java.lang.String
  var offsetX: js.UndefOr[scala.Double] = js.undefined
  var offsetY: js.UndefOr[scala.Double] = js.undefined
  var originalEvent: jqueryLib._Event
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
  var pageX: scala.Double
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
  var pageY: scala.Double
  // #endregion
  // region PointerEvent
  // #region PointerEvent
  var pointerId: js.UndefOr[scala.Double] = js.undefined
  var pointerType: js.UndefOr[java.lang.String] = js.undefined
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
  var relatedTarget: TTarget | scala.Null
  /**
           * The last value returned by an event handler that was triggered by this event, unless the value was undefined.
           * @see \`{@link https://api.jquery.com/event.result/ }\`
           * @since 1.3
           * @example ​ ````Display previous handler&#39;s return value
  ```html
  <!doctype html>
  <html lang="en">
  <head>
    <meta charset="utf-8">
    <title>event.result demo</title>
    <script src="https://code.jquery.com/jquery-3.3.1.js"></script>
  </head>
  <body>
  ​
  <button>display event.result</button>
  <p></p>
  ​
  <script>
  $( "button" ).click(function( event ) {
    return "hey";
  });
  $( "button" ).click(function( event ) {
    $( "p" ).html( event.result );
  });
  </script>
  ​
  </body>
  </html>
  ```
           */
  var result: js.Any
  var screenX: js.UndefOr[scala.Double] = js.undefined
  var screenY: js.UndefOr[scala.Double] = js.undefined
  var shiftKey: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * The DOM element that initiated the event.
           * @see \`{@link https://api.jquery.com/event.target/ }\`
           * @since 1.0
           * @example ​ ````Display the tag&#39;s name on click
  ```html
  <!doctype html>
  <html lang="en">
  <head>
    <meta charset="utf-8">
    <title>event.target demo</title>
    <style>
    span, strong, p {
      padding: 8px;
      display: block;
      border: 1px solid #999;
    }
    </style>
    <script src="https://code.jquery.com/jquery-3.3.1.js"></script>
  </head>
  <body>
  ​
  <div id="log"></div>
  <div>
    <p>
      <strong><span>click</span></strong>
    </p>
  </div>
  ​
  <script>
  $( "body" ).click(function( event ) {
    $( "#log" ).html( "clicked: " + event.target.nodeName );
  });
  </script>
  ​
  </body>
  </html>
  ```
           * @example ​ ````Implements a simple event delegation: The click handler is added to an unordered list, and the children of its li children are hidden. Clicking one of the li children toggles (see toggle()) their children.
  ```html
  <!doctype html>
  <html lang="en">
  <head>
    <meta charset="utf-8">
    <title>event.target demo</title>
    <script src="https://code.jquery.com/jquery-3.3.1.js"></script>
  </head>
  <body>
  ​
  <ul>
    <li>item 1
      <ul>
        <li>sub item 1-a</li>
        <li>sub item 1-b</li>
      </ul>
    </li>
    <li>item 2
      <ul>
        <li>sub item 2-a</li>
        <li>sub item 2-b</li>
      </ul>
    </li>
  </ul>
  ​
  <script>
  function handler( event ) {
    var target = $( event.target );
    if ( target.is( "li" ) ) {
      target.children().toggle();
    }
  }
  $( "ul" ).click( handler ).find( "ul" ).hide();
  </script>
  ​
  </body>
  </html>
  ```
           */
  var target: TTarget
  var targetTouches: js.UndefOr[stdLib.TouchList] = js.undefined
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
  var timeStamp: scala.Double
  /** @deprecated */
  var toElement: js.UndefOr[stdLib.Element] = js.undefined
  var touches: js.UndefOr[stdLib.TouchList] = js.undefined
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
  var `type`: java.lang.String
  var view: js.UndefOr[stdLib.Window] = js.undefined
  /**
           * For key or mouse events, this property indicates the specific key or button that was pressed.
           * @see \`{@link https://api.jquery.com/event.which/ }\`
           * @since 1.1.3
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
  var which: scala.Double
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
  def isDefaultPrevented(): scala.Boolean
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
  def isImmediatePropagationStopped(): scala.Boolean
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
  def isPropagationStopped(): scala.Boolean
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
  def preventDefault(): scala.Unit
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
  def stopImmediatePropagation(): scala.Unit
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
  def stopPropagation(): scala.Unit
}

