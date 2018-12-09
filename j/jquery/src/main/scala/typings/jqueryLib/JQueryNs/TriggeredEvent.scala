package typings
package jqueryLib.JQueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion
/**
     * Base type for jQuery events that have been triggered (including events triggered on plain objects).
     */

trait TriggeredEvent[TDelegateTarget, TData, TCurrentTarget, TTarget] extends Event {
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
  var currentTarget: TCurrentTarget
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
  var delegateTarget: TDelegateTarget
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
  var namespace: js.UndefOr[java.lang.String] = js.undefined
  var originalEvent: js.UndefOr[jqueryLib._Event] = js.undefined
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
  var result: js.UndefOr[js.Any] = js.undefined
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
}

