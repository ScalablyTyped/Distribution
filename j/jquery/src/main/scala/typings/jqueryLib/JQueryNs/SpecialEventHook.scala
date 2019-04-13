package typings
package jqueryLib.JQueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// region Special event hooks
// #region Special event hooks
/**
  * The jQuery special event hooks are a set of per-event-name functions and properties that allow code to control the behavior of event processing within jQuery. The mechanism is similar to `fixHooks` in that the special event information is stored in `jQuery.event.special.NAME`, where `NAME` is the name of the special event. Event names are case sensitive.
  *
  * As with `fixHooks`, the special event hooks design assumes it will be very rare that two unrelated pieces of code want to process the same event name. Special event authors who need to modify events with existing hooks will need to take precautions to avoid introducing unwanted side-effects by clobbering those hooks.
  * @see \`{@link https://learn.jquery.com/events/event-extensions/#special-event-hooks }\`
  */
// Workaround for TypeScript 2.3 which does not have support for weak types handling.
trait SpecialEventHook[TTarget, TData]
  extends /* key */ org.scalablytyped.runtime.StringDictionary[scala.Nothing] {
  /**
    * When the `.trigger()` method finishes running all the event handlers for an event, it also looks for and runs any method on the target object by the same name unless of the handlers called `event.preventDefault()`. So, `.trigger( "submit" )` will execute the `submit()` method on the element if one exists. When a `_default` hook is specified, the hook is called just prior to checking for and executing the element's default method. If this hook returns the value `false` the element's default method will be called; otherwise it is not.
    * @see \`{@link https://learn.jquery.com/events/event-extensions/#_default-function-event-jquery-event-data-object }\`
    */
  var _default: js.UndefOr[
    js.Function2[
      /* event */ TriggeredEvent[TTarget, TData, _, _], 
      /* data */ TData, 
      scala.Unit | jqueryLib.jqueryLibNumbers.`false`
    ]
  ] = js.undefined
  /**
    * Each time an event handler is added to an element through an API such as `.on()`, jQuery calls this hook. The `this` keyword will be the element to which the event handler is being added, and the `handleObj` argument is as described in the section above. The return value of this hook is ignored.
    * @see \`{@link https://learn.jquery.com/events/event-extensions/#add-function-handleobj }\`
    */
  var add: js.UndefOr[
    js.ThisFunction1[/* this */ TTarget, /* handleObj */ HandleObject[TTarget, TData], scala.Unit]
  ] = js.undefined
  /**
    * When defined, these string properties specify that a special event should be handled like another event type until the event is delivered. The `bindType` is used if the event is attached directly, and the `delegateType` is used for delegated events. These types are generally DOM event types, and _should not_ be a special event themselves.
    * @see \`{@link https://learn.jquery.com/events/event-extensions/#bindtype-string-delegatetype-string }\`
    */
  var bindType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * When defined, these string properties specify that a special event should be handled like another event type until the event is delivered. The `bindType` is used if the event is attached directly, and the `delegateType` is used for delegated events. These types are generally DOM event types, and _should not_ be a special event themselves.
    * @see \`{@link https://learn.jquery.com/events/event-extensions/#bindtype-string-delegatetype-string }\`
    */
  var delegateType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * jQuery calls a handle hook when the event has occurred and jQuery would normally call the user's event handler specified by `.on()` or another event binding method. If the hook exists, jQuery calls it _instead_ of that event handler, passing it the event and any data passed from `.trigger()` if it was not a native event. The `this` keyword is the DOM element being handled, and `event.handleObj` property has the detailed event information.
    *
    * Based in the information it has, the handle hook should decide whether to call the original handler function which is in `event.handleObj.handler`. It can modify information in the event object before calling the original handler, but _must restore_ that data before returning or subsequent unrelated event handlers may act unpredictably. In most cases, the handle hook should return the result of the original handler, but that is at the discretion of the hook. The handle hook is unique in that it is the only special event function hook that is called under its original special event name when the type is mapped using `bindType` and `delegateType`. For that reason, it is almost always an error to have anything other than a handle hook present if the special event defines a `bindType` and `delegateType`, since those other hooks will never be called.
    * @see \`{@link https://learn.jquery.com/events/event-extensions/#handle-function-event-jquery-event-data-object }\`
    */
  var handle: js.UndefOr[
    js.ThisFunction2[
      /* this */ TTarget, 
      /* event */ (TriggeredEvent[TTarget, TData, _, _]) with (jqueryLib.Anon_HandleObj[TTarget, TData]), 
      /* repeated */ TData, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Indicates whether this event type should be bubbled when the `.trigger()` method is called; by default it is `false`, meaning that a triggered event will bubble to the element's parents up to the document (if attached to a document) and then to the window. Note that defining `noBubble` on an event will effectively prevent that event from being used for delegated events with `.trigger()`.
    * @see \`{@link https://learn.jquery.com/events/event-extensions/#nobubble-boolean }\`
    */
  var noBubble: js.UndefOr[scala.Boolean] = js.undefined
  var postDispatch: js.UndefOr[js.ThisFunction1[/* this */ TTarget, /* event */ Event, scala.Unit]] = js.undefined
  var preDispatch: js.UndefOr[
    js.ThisFunction1[
      /* this */ TTarget, 
      /* event */ Event, 
      jqueryLib.jqueryLibNumbers.`false` | scala.Unit
    ]
  ] = js.undefined
  /**
    * When an event handler is removed from an element using an API such as `.off()`, this hook is called. The `this` keyword will be the element where the handler is being removed, and the `handleObj` argument is as described in the section above. The return value of this hook is ignored.
    * @see \`{@link https://learn.jquery.com/events/event-extensions/#remove-function-handleobj }\`
    */
  var remove: js.UndefOr[
    js.ThisFunction1[/* this */ TTarget, /* handleObj */ HandleObject[TTarget, TData], scala.Unit]
  ] = js.undefined
  /**
    * The setup hook is called the first time an event of a particular type is attached to an element; this provides the hook an opportunity to do processing that will apply to all events of this type on this element. The `this` keyword will be a reference to the element where the event is being attached and `eventHandle` is jQuery's event handler function. In most cases the `namespaces` argument should not be used, since it only represents the namespaces of the _first_ event being attached; subsequent events may not have this same namespaces.
    *
    * This hook can perform whatever processing it desires, including attaching its own event handlers to the element or to other elements and recording setup information on the element using the `jQuery.data()` method. If the setup hook wants jQuery to add a browser event (via `addEventListener` or `attachEvent`, depending on browser) it should return `false`. In all other cases, jQuery will not add the browser event, but will continue all its other bookkeeping for the event. This would be appropriate, for example, if the event was never fired by the browser but invoked by `.trigger()`. To attach the jQuery event handler in the setup hook, use the `eventHandle` argument.
    * @see \`{@link https://learn.jquery.com/events/event-extensions/#setup-function-data-object-namespaces-eventhandle-function }\`
    */
  var setup: js.UndefOr[
    js.ThisFunction3[
      /* this */ TTarget, 
      /* data */ TData, 
      /* namespaces */ java.lang.String, 
      /* eventHandle */ EventHandler[TTarget, TData], 
      scala.Unit | jqueryLib.jqueryLibNumbers.`false`
    ]
  ] = js.undefined
  /**
    * The teardown hook is called when the final event of a particular type is removed from an element. The `this` keyword will be a reference to the element where the event is being cleaned up. This hook should return `false` if it wants jQuery to remove the event from the browser's event system (via `removeEventListener` or `detachEvent`). In most cases, the setup and teardown hooks should return the same value.
    *
    * If the setup hook attached event handlers or added data to an element through a mechanism such as `jQuery.data()`, the teardown hook should reverse the process and remove them. jQuery will generally remove the data and events when an element is totally removed from the document, but failing to remove data or events on teardown will cause a memory leak if the element stays in the document.
    * @see \`{@link https://learn.jquery.com/events/event-extensions/#teardown-function }\`
    */
  var teardown: js.UndefOr[
    js.ThisFunction0[/* this */ TTarget, scala.Unit | jqueryLib.jqueryLibNumbers.`false`]
  ] = js.undefined
  /**
    * Called when the `.trigger()` or `.triggerHandler()` methods are used to trigger an event for the special type from code, as opposed to events that originate from within the browser. The `this` keyword will be the element being triggered, and the event argument will be a `jQuery.Event` object constructed from the caller's input. At minimum, the event type, data, namespace, and target properties are set on the event. The data argument represents additional data passed by `.trigger()` if present.
    *
    * The trigger hook is called early in the process of triggering an event, just after the `jQuery.Event` object is constructed and before any handlers have been called. It can process the triggered event in any way, for example by calling `event.stopPropagation()` or `event.preventDefault()` before returning. If the hook returns `false`, jQuery does not perform any further event triggering actions and returns immediately. Otherwise, it performs the normal trigger processing, calling any event handlers for the element and bubbling the event (unless propagation is stopped in advance or `noBubble` was specified for the special event) to call event handlers attached to parent elements.
    * @see \`{@link https://learn.jquery.com/events/event-extensions/#trigger-function-event-jquery-event-data-object }\`
    */
  var trigger: js.UndefOr[
    js.ThisFunction2[
      /* this */ TTarget, 
      /* event */ Event, 
      /* data */ TData, 
      scala.Unit | jqueryLib.jqueryLibNumbers.`false`
    ]
  ] = js.undefined
}

object SpecialEventHook {
  @scala.inline
  def apply[TTarget, TData](
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[scala.Nothing] = null,
    _default: (/* event */ TriggeredEvent[TTarget, TData, _, _], /* data */ TData) => scala.Unit | jqueryLib.jqueryLibNumbers.`false` = null,
    add: js.ThisFunction1[/* this */ TTarget, /* handleObj */ HandleObject[TTarget, TData], scala.Unit] = null,
    bindType: java.lang.String = null,
    delegateType: java.lang.String = null,
    handle: js.ThisFunction2[
      /* this */ TTarget, 
      /* event */ (TriggeredEvent[TTarget, TData, _, _]) with (jqueryLib.Anon_HandleObj[TTarget, TData]), 
      /* repeated */ TData, 
      scala.Unit
    ] = null,
    noBubble: js.UndefOr[scala.Boolean] = js.undefined,
    postDispatch: js.ThisFunction1[/* this */ TTarget, /* event */ Event, scala.Unit] = null,
    preDispatch: js.ThisFunction1[
      /* this */ TTarget, 
      /* event */ Event, 
      jqueryLib.jqueryLibNumbers.`false` | scala.Unit
    ] = null,
    remove: js.ThisFunction1[/* this */ TTarget, /* handleObj */ HandleObject[TTarget, TData], scala.Unit] = null,
    setup: js.ThisFunction3[
      /* this */ TTarget, 
      /* data */ TData, 
      /* namespaces */ java.lang.String, 
      /* eventHandle */ EventHandler[TTarget, TData], 
      scala.Unit | jqueryLib.jqueryLibNumbers.`false`
    ] = null,
    teardown: js.ThisFunction0[/* this */ TTarget, scala.Unit | jqueryLib.jqueryLibNumbers.`false`] = null,
    trigger: js.ThisFunction2[
      /* this */ TTarget, 
      /* event */ Event, 
      /* data */ TData, 
      scala.Unit | jqueryLib.jqueryLibNumbers.`false`
    ] = null
  ): SpecialEventHook[TTarget, TData] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (_default != null) __obj.updateDynamic("_default")(js.Any.fromFunction2(_default))
    if (add != null) __obj.updateDynamic("add")(add)
    if (bindType != null) __obj.updateDynamic("bindType")(bindType)
    if (delegateType != null) __obj.updateDynamic("delegateType")(delegateType)
    if (handle != null) __obj.updateDynamic("handle")(handle)
    if (!js.isUndefined(noBubble)) __obj.updateDynamic("noBubble")(noBubble)
    if (postDispatch != null) __obj.updateDynamic("postDispatch")(postDispatch)
    if (preDispatch != null) __obj.updateDynamic("preDispatch")(preDispatch)
    if (remove != null) __obj.updateDynamic("remove")(remove)
    if (setup != null) __obj.updateDynamic("setup")(setup)
    if (teardown != null) __obj.updateDynamic("teardown")(teardown)
    if (trigger != null) __obj.updateDynamic("trigger")(trigger)
    __obj.asInstanceOf[SpecialEventHook[TTarget, TData]]
  }
}

