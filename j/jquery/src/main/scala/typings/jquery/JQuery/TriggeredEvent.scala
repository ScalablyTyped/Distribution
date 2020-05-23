package typings.jquery.JQuery

import typings.std.Element
import typings.std.TouchList
import typings.std.Window
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
  var namespace: js.UndefOr[String] = js.undefined
  var originalEvent: js.UndefOr[typings.jquery.Event] = js.undefined
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
    `type`: String,
    altKey: js.UndefOr[Boolean] = js.undefined,
    bubbles: js.UndefOr[Boolean] = js.undefined,
    button: js.UndefOr[Double] = js.undefined,
    buttons: js.UndefOr[Double] = js.undefined,
    cancelable: js.UndefOr[Boolean] = js.undefined,
    changedTouches: TouchList = null,
    char: String = null,
    charCode: js.UndefOr[Double] = js.undefined,
    clientX: js.UndefOr[Double] = js.undefined,
    clientY: js.UndefOr[Double] = js.undefined,
    ctrlKey: js.UndefOr[Boolean] = js.undefined,
    detail: js.UndefOr[Double] = js.undefined,
    eventPhase: js.UndefOr[Double] = js.undefined,
    key: String = null,
    keyCode: js.UndefOr[Double] = js.undefined,
    metaKey: js.UndefOr[Boolean] = js.undefined,
    namespace: String = null,
    offsetX: js.UndefOr[Double] = js.undefined,
    offsetY: js.UndefOr[Double] = js.undefined,
    originalEvent: typings.jquery.Event = null,
    pageX: js.UndefOr[Double] = js.undefined,
    pageY: js.UndefOr[Double] = js.undefined,
    pointerId: js.UndefOr[Double] = js.undefined,
    pointerType: String = null,
    result: js.Any = null,
    screenX: js.UndefOr[Double] = js.undefined,
    screenY: js.UndefOr[Double] = js.undefined,
    shiftKey: js.UndefOr[Boolean] = js.undefined,
    targetTouches: TouchList = null,
    toElement: Element = null,
    touches: TouchList = null,
    view: Window = null,
    which: js.UndefOr[Double] = js.undefined
  ): TriggeredEvent[TDelegateTarget, TData, TCurrentTarget, TTarget] = {
    val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], delegateTarget = delegateTarget.asInstanceOf[js.Any], isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isImmediatePropagationStopped = js.Any.fromFunction0(isImmediatePropagationStopped), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), preventDefault = js.Any.fromFunction0(preventDefault), stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(altKey)) __obj.updateDynamic("altKey")(altKey.get.asInstanceOf[js.Any])
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles.get.asInstanceOf[js.Any])
    if (!js.isUndefined(button)) __obj.updateDynamic("button")(button.get.asInstanceOf[js.Any])
    if (!js.isUndefined(buttons)) __obj.updateDynamic("buttons")(buttons.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable.get.asInstanceOf[js.Any])
    if (changedTouches != null) __obj.updateDynamic("changedTouches")(changedTouches.asInstanceOf[js.Any])
    if (char != null) __obj.updateDynamic("char")(char.asInstanceOf[js.Any])
    if (!js.isUndefined(charCode)) __obj.updateDynamic("charCode")(charCode.get.asInstanceOf[js.Any])
    if (!js.isUndefined(clientX)) __obj.updateDynamic("clientX")(clientX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(clientY)) __obj.updateDynamic("clientY")(clientY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ctrlKey)) __obj.updateDynamic("ctrlKey")(ctrlKey.get.asInstanceOf[js.Any])
    if (!js.isUndefined(detail)) __obj.updateDynamic("detail")(detail.get.asInstanceOf[js.Any])
    if (!js.isUndefined(eventPhase)) __obj.updateDynamic("eventPhase")(eventPhase.get.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(keyCode)) __obj.updateDynamic("keyCode")(keyCode.get.asInstanceOf[js.Any])
    if (!js.isUndefined(metaKey)) __obj.updateDynamic("metaKey")(metaKey.get.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (!js.isUndefined(offsetX)) __obj.updateDynamic("offsetX")(offsetX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offsetY)) __obj.updateDynamic("offsetY")(offsetY.get.asInstanceOf[js.Any])
    if (originalEvent != null) __obj.updateDynamic("originalEvent")(originalEvent.asInstanceOf[js.Any])
    if (!js.isUndefined(pageX)) __obj.updateDynamic("pageX")(pageX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pageY)) __obj.updateDynamic("pageY")(pageY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pointerId)) __obj.updateDynamic("pointerId")(pointerId.get.asInstanceOf[js.Any])
    if (pointerType != null) __obj.updateDynamic("pointerType")(pointerType.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    if (!js.isUndefined(screenX)) __obj.updateDynamic("screenX")(screenX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(screenY)) __obj.updateDynamic("screenY")(screenY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shiftKey)) __obj.updateDynamic("shiftKey")(shiftKey.get.asInstanceOf[js.Any])
    if (targetTouches != null) __obj.updateDynamic("targetTouches")(targetTouches.asInstanceOf[js.Any])
    if (toElement != null) __obj.updateDynamic("toElement")(toElement.asInstanceOf[js.Any])
    if (touches != null) __obj.updateDynamic("touches")(touches.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    if (!js.isUndefined(which)) __obj.updateDynamic("which")(which.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggeredEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]]
  }
}

