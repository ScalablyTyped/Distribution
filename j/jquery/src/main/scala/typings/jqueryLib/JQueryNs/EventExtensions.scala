package typings
package jqueryLib.JQueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// region Event extensions
// #region Event extensions

trait EventExtensions extends js.Object {
  /**
           * The `fixHooks` interface provides a per-event-type way to extend or normalize the event object that jQuery creates when it processes a _native_ browser event.
           * @see \`{@link https://learn.jquery.com/events/event-extensions/#jquery-event-fixhooks-object }\`
           */
  var fixHooks: FixHooks
  /**
           * jQuery defines an \`{@link https://api.jquery.com/category/events/event-object/ Event object}\` that represents a cross-browser subset of the information available when an event occurs. The `jQuery.event.props` property is an array of string names for properties that are always copied when jQuery processes a native browser event. (Events fired in code by `.trigger()` do not use this list, since the code can construct a `jQuery.Event` object with the needed values and trigger using that object.)
           *
           * To add a property name to this list, use `jQuery.event.props.push( "newPropertyName" )`. However, be aware that every event processed by jQuery will now attempt to copy this property name from the native browser event to jQuery's constructed event. If the property does not exist for that event type, it will get an undefined value. Adding many properties to this list can significantly reduce event delivery performance, so for infrequently-needed properties it is more efficient to use the value directly from `event.originalEvent` instead. If properties must be copied, you are strongly advised to use `jQuery.event.fixHooks` as of version 1.7.
           * @see \`{@link https://learn.jquery.com/events/event-extensions/#jquery-event-props-array }\`
           */
  var props: js.Array[java.lang.String]
  /**
           * The jQuery special event hooks are a set of per-event-name functions and properties that allow code to control the behavior of event processing within jQuery. The mechanism is similar to `fixHooks` in that the special event information is stored in `jQuery.event.special.NAME`, where `NAME` is the name of the special event. Event names are case sensitive.
           *
           * As with `fixHooks`, the special event hooks design assumes it will be very rare that two unrelated pieces of code want to process the same event name. Special event authors who need to modify events with existing hooks will need to take precautions to avoid introducing unwanted side-effects by clobbering those hooks.
           * @see \`{@link https://learn.jquery.com/events/event-extensions/#special-event-hooks }\`
           */
  var special: SpecialEventHooks
}

