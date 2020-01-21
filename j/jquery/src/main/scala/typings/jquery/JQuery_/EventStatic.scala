package typings.jquery.JQuery_

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion
// #endregion
// region Events
// #region Events
// region Event
// #region Event
// This should be a class but doesn't work correctly under the JQuery namespace. Event should be an inner class of jQuery.
/**
  * jQuery's event system normalizes the event object according to W3C standards. The event object is guaranteed to be passed to the event handler (no checks for window.event required). It normalizes the target, relatedTarget, which, metaKey and pageX/Y properties and provides both stopPropagation() and preventDefault() methods.
  *
  * Those properties are all documented, and accompanied by examples, on the \`{@link http://api.jquery.com/category/events/event-object/ Event object}\` page.
  *
  * The standard events in the Document Object Model are: `blur`, `focus`, `load`, `resize`, `scroll`, `unload`, `beforeunload`, `click`, `dblclick`, `mousedown`, `mouseup`, `mousemove`, `mouseover`, `mouseout`, `mouseenter`, `mouseleave`, `change`, `select`, `submit`, `keydown`, `keypress`, and `keyup`. Since the DOM event names have predefined meanings for some elements, using them for other purposes is not recommended. jQuery's event model can trigger an event by any name on an element, and it is propagated up the DOM tree to which that element belongs, if any.
  * @see \`{@link https://api.jquery.com/category/events/event-object/ }\`
  */
@js.native
trait EventStatic
  extends /**
  * The jQuery.Event constructor is exposed and can be used when calling trigger. The new operator is optional.
  *
  * Check \`{@link https://api.jquery.com/trigger/ trigger}\`'s documentation to see how to combine it with your own event object.
  * @see \`{@link https://api.jquery.com/category/events/event-object/ }\`
  * @since 1.6
  * @example
```javascript
//Create a new jQuery.Event object without the "new" operator.
var e = jQuery.Event( "click" );
​
// trigger an artificial click event
jQuery( "body" ).trigger( e );
```
  * @example
```javascript
// Create a new jQuery.Event object with specified event properties.
var e = jQuery.Event( "keydown", { keyCode: 64 } );
​
// trigger an artificial keydown event with keyCode 64
jQuery( "body" ).trigger( e );
```
  */
Instantiable1[/* event */ String, Event with js.Object]
     with Instantiable2[/* event */ String, /* properties */ js.Object, Event with js.Object] {
  /**
    * The jQuery.Event constructor is exposed and can be used when calling trigger. The new operator is optional.
    *
    * Check \`{@link https://api.jquery.com/trigger/ trigger}\`'s documentation to see how to combine it with your own event object.
    * @see \`{@link https://api.jquery.com/category/events/event-object/ }\`
    * @since 1.6
    * @example
  ```javascript
  //Create a new jQuery.Event object without the "new" operator.
  var e = jQuery.Event( "click" );
  ​
  // trigger an artificial click event
  jQuery( "body" ).trigger( e );
  ```
    * @example
  ```javascript
  // Create a new jQuery.Event object with specified event properties.
  var e = jQuery.Event( "keydown", { keyCode: 64 } );
  ​
  // trigger an artificial keydown event with keyCode 64
  jQuery( "body" ).trigger( e );
  ```
    */
  def apply[T /* <: js.Object */](event: String): Event with T = js.native
  def apply[T /* <: js.Object */](event: String, properties: T): Event with T = js.native
}

