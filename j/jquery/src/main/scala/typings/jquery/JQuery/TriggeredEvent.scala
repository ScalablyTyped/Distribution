package typings.jquery.JQuery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion
/**
  * Base type for jQuery events that have been triggered (including events triggered on plain objects).
  */
@js.native
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
  var currentTarget: TCurrentTarget = js.native
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
  var data: TData = js.native
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
  var delegateTarget: TDelegateTarget = js.native
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
  var namespace: js.UndefOr[String] = js.native
  var originalEvent: js.UndefOr[typings.jquery.Event] = js.native
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
  var result: js.UndefOr[js.Any] = js.native
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
  var target: TTarget = js.native
}

object TriggeredEvent {
  @scala.inline
  def apply[TDelegateTarget, TData, TCurrentTarget, TTarget](
    currentTarget: TCurrentTarget,
    data: TData,
    delegateTarget: TDelegateTarget,
    isDefaultPrevented: () => Boolean,
    isImmediatePropagationStopped: () => Boolean,
    isPropagationStopped: () => Boolean,
    preventDefault: () => Unit,
    stopImmediatePropagation: () => Unit,
    stopPropagation: () => Unit,
    target: TTarget,
    timeStamp: Double,
    `type`: String
  ): TriggeredEvent[TDelegateTarget, TData, TCurrentTarget, TTarget] = {
    val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], delegateTarget = delegateTarget.asInstanceOf[js.Any], isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isImmediatePropagationStopped = js.Any.fromFunction0(isImmediatePropagationStopped), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), preventDefault = js.Any.fromFunction0(preventDefault), stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggeredEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]]
  }
  @scala.inline
  implicit class TriggeredEventOps[Self <: TriggeredEvent[_, _, _, _], TDelegateTarget, TData, TCurrentTarget, TTarget] (val x: Self with (TriggeredEvent[TDelegateTarget, TData, TCurrentTarget, TTarget])) extends AnyVal {
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
    def setCurrentTarget(value: TCurrentTarget): Self = this.set("currentTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: TData): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelegateTarget(value: TDelegateTarget): Self = this.set("delegateTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: TTarget): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def setNamespace(value: String): Self = this.set("namespace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamespace: Self = this.set("namespace", js.undefined)
    @scala.inline
    def setOriginalEvent(value: typings.jquery.Event): Self = this.set("originalEvent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginalEvent: Self = this.set("originalEvent", js.undefined)
    @scala.inline
    def setResult(value: js.Any): Self = this.set("result", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResult: Self = this.set("result", js.undefined)
  }
  
}

