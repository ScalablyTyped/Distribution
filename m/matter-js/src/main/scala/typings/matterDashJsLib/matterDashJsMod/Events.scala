package typings
package matterDashJsLib.matterDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("matter-js", "Events")
@js.native
class Events () extends js.Object

/* static members */
@JSImport("matter-js", "Events")
@js.native
object Events extends js.Object {
  /**
    * Removes the given event callback. If no callback, clears all callbacks in eventNames. If no eventNames, clears all events.
    *
    * @param obj
    * @param eventName
    * @param callback
    */
  def off(obj: js.Any, eventName: java.lang.String, callback: js.Function1[/* e */ js.Any, scala.Unit]): scala.Unit = js.native
  def on(obj: js.Any, name: java.lang.String, callback: js.Function1[/* e */ js.Any, scala.Unit]): scala.Unit = js.native
  /**
    * Fired when a call to `Composite.add` is made, after objects have been added.
    *
    * @event afterAdd
    * @param {} event An event object
    * @param {} event.object The object(s) that have been added (may be a single body, constraint, composite or a mixed array of these)
    * @param {} event.source The source object of the event
    * @param {} event.name The name of the event
    */
  @JSName("on")
  def on_afterAdd(
    obj: matterDashJsLib.matterDashJsMod.Engine,
    name: matterDashJsLib.matterDashJsLibStrings.afterAdd,
    callback: js.Function1[
      /* e */ matterDashJsLib.matterDashJsMod.IEventComposite[matterDashJsLib.matterDashJsMod.Composite], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Fired when a call to `Composite.remove` is made, after objects have been removed.
    *
    * @event afterRemove
    * @param {} event An event object
    * @param {} event.object The object(s) that have been removed (may be a single body, constraint, composite or a mixed array of these)
    * @param {} event.source The source object of the event
    * @param {} event.name The name of the event
    */
  @JSName("on")
  def on_afterRemove(
    obj: matterDashJsLib.matterDashJsMod.Engine,
    name: matterDashJsLib.matterDashJsLibStrings.afterRemove,
    callback: js.Function1[
      /* e */ matterDashJsLib.matterDashJsMod.IEventComposite[matterDashJsLib.matterDashJsMod.Composite], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Fired after rendering
    *
    * @event afterRender
    * @param {} event An event object
    * @param {number} event.timestamp The engine.timing.timestamp of the event
    * @param {} event.source The source object of the event
    * @param {} event.name The name of the event
    */
  @JSName("on")
  def on_afterRender(
    obj: matterDashJsLib.matterDashJsMod.Engine,
    name: matterDashJsLib.matterDashJsLibStrings.afterRender,
    callback: js.Function1[
      /* e */ matterDashJsLib.matterDashJsMod.IEventTimestamped[matterDashJsLib.matterDashJsMod.Render | matterDashJsLib.matterDashJsMod.Runner], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Fired at the end of a tick, after engine update and after rendering
    *
    * @event afterTick
    * @param {} event An event object
    * @param {number} event.timestamp The engine.timing.timestamp of the event
    * @param {} event.source The source object of the event
    * @param {} event.name The name of the event
    */
  @JSName("on")
  def on_afterTick(
    obj: matterDashJsLib.matterDashJsMod.Engine,
    name: matterDashJsLib.matterDashJsLibStrings.afterTick,
    callback: js.Function1[
      /* e */ matterDashJsLib.matterDashJsMod.IEventTimestamped[matterDashJsLib.matterDashJsMod.Runner], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Fired after engine update and all collision events
    *
    * @event afterUpdate
    * @param {} event An event object
    * @param {number} event.timestamp The engine.timing.timestamp of the event
    * @param {} event.source The source object of the event
    * @param {} event.name The name of the event
    */
  @JSName("on")
  def on_afterUpdate(
    obj: matterDashJsLib.matterDashJsMod.Engine,
    name: matterDashJsLib.matterDashJsLibStrings.afterUpdate,
    callback: js.Function1[
      /* e */ matterDashJsLib.matterDashJsMod.IEventTimestamped[matterDashJsLib.matterDashJsMod.Engine], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Fired when a call to `Composite.add` is made, before objects have been added.
    *
    * @event beforeAdd
    * @param {} event An event object
    * @param {} event.object The object(s) to be added (may be a single body, constraint, composite or a mixed array of these)
    * @param {} event.source The source object of the event
    * @param {} event.name The name of the event
    */
  @JSName("on")
  def on_beforeAdd(
    obj: matterDashJsLib.matterDashJsMod.Engine,
    name: matterDashJsLib.matterDashJsLibStrings.beforeAdd,
    callback: js.Function1[
      /* e */ matterDashJsLib.matterDashJsMod.IEventComposite[matterDashJsLib.matterDashJsMod.Composite], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Fired when a call to `Composite.remove` is made, before objects have been removed.
    *
    * @event beforeRemove
    * @param {} event An event object
    * @param {} event.object The object(s) to be removed (may be a single body, constraint, composite or a mixed array of these)
    * @param {} event.source The source object of the event
    * @param {} event.name The name of the event
    */
  @JSName("on")
  def on_beforeRemove(
    obj: matterDashJsLib.matterDashJsMod.Engine,
    name: matterDashJsLib.matterDashJsLibStrings.beforeRemove,
    callback: js.Function1[
      /* e */ matterDashJsLib.matterDashJsMod.IEventComposite[matterDashJsLib.matterDashJsMod.Composite], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Fired before rendering
    *
    * @event beforeRender
    * @param {} event An event object
    * @param {number} event.timestamp The engine.timing.timestamp of the event
    * @param {} event.source The source object of the event
    * @param {} event.name The name of the event
    */
  @JSName("on")
  def on_beforeRender(
    obj: matterDashJsLib.matterDashJsMod.Engine,
    name: matterDashJsLib.matterDashJsLibStrings.beforeRender,
    callback: js.Function1[
      /* e */ matterDashJsLib.matterDashJsMod.IEventTimestamped[matterDashJsLib.matterDashJsMod.Render | matterDashJsLib.matterDashJsMod.Runner], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Fired at the start of a tick, before any updates to the engine or timing
    *
    * @event beforeTick
    * @param {} event An event object
    * @param {number} event.timestamp The engine.timing.timestamp of the event
    * @param {} event.source The source object of the event
    * @param {} event.name The name of the event
    */
  @JSName("on")
  def on_beforeTick(
    obj: matterDashJsLib.matterDashJsMod.Engine,
    name: matterDashJsLib.matterDashJsLibStrings.beforeTick,
    callback: js.Function1[
      /* e */ matterDashJsLib.matterDashJsMod.IEventTimestamped[matterDashJsLib.matterDashJsMod.Runner], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Fired just before an update
    *
    * @event beforeUpdate
    * @param {} event An event object
    * @param {number} event.timestamp The engine.timing.timestamp of the event
    * @param {} event.source The source object of the event
    * @param {} event.name The name of the event
    */
  @JSName("on")
  def on_beforeUpdate(
    obj: matterDashJsLib.matterDashJsMod.Engine,
    name: matterDashJsLib.matterDashJsLibStrings.beforeUpdate,
    callback: js.Function1[
      /* e */ matterDashJsLib.matterDashJsMod.IEventTimestamped[matterDashJsLib.matterDashJsMod.Engine], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Fired after engine update, provides a list of all pairs that are colliding in the current tick (if any)
    *
    * @event collisionActive
    * @param {} event An event object
    * @param {} event.pairs List of affected pairs
    * @param {number} event.timestamp The engine.timing.timestamp of the event
    * @param {} event.source The source object of the event
    * @param {} event.name The name of the event
    */
  @JSName("on")
  def on_collisionActive(
    obj: matterDashJsLib.matterDashJsMod.Engine,
    name: matterDashJsLib.matterDashJsLibStrings.collisionActive,
    callback: js.Function1[
      /* e */ matterDashJsLib.matterDashJsMod.IEventCollision[matterDashJsLib.matterDashJsMod.Engine], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Fired after engine update, provides a list of all pairs that have ended collision in the current tick (if any)
    *
    * @event collisionEnd
    * @param {} event An event object
    * @param {} event.pairs List of affected pairs
    * @param {number} event.timestamp The engine.timing.timestamp of the event
    * @param {} event.source The source object of the event
    * @param {} event.name The name of the event
    */
  @JSName("on")
  def on_collisionEnd(
    obj: matterDashJsLib.matterDashJsMod.Engine,
    name: matterDashJsLib.matterDashJsLibStrings.collisionEnd,
    callback: js.Function1[
      /* e */ matterDashJsLib.matterDashJsMod.IEventCollision[matterDashJsLib.matterDashJsMod.Engine], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Fired after engine update, provides a list of all pairs that have started to collide in the current tick (if any)
    *
    * @event collisionStart
    * @param {} event An event object
    * @param {} event.pairs List of affected pairs
    * @param {number} event.timestamp The engine.timing.timestamp of the event
    * @param {} event.source The source object of the event
    * @param {} event.name The name of the event
    */
  @JSName("on")
  def on_collisionStart(
    obj: matterDashJsLib.matterDashJsMod.Engine,
    name: matterDashJsLib.matterDashJsLibStrings.collisionStart,
    callback: js.Function1[
      /* e */ matterDashJsLib.matterDashJsMod.IEventCollision[matterDashJsLib.matterDashJsMod.Engine], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Fired when the mouse is down (or a touch has started) during the last step
    * @param obj
    * @param name
    * @param callback
    */
  @JSName("on")
  def on_mousedown(
    obj: matterDashJsLib.matterDashJsMod.MouseConstraint,
    name: matterDashJsLib.matterDashJsLibStrings.mousedown,
    callback: js.Function1[/* e */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Fired when the mouse has moved (or a touch moves) during the last step
    * @param obj
    * @param name
    * @param callback
    */
  @JSName("on")
  def on_mousemove(
    obj: matterDashJsLib.matterDashJsMod.MouseConstraint,
    name: matterDashJsLib.matterDashJsLibStrings.mousemove,
    callback: js.Function1[/* e */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Fired when the mouse is up (or a touch has ended) during the last step
    * @param obj
    * @param name
    * @param callback
    */
  @JSName("on")
  def on_mouseup(
    obj: matterDashJsLib.matterDashJsMod.MouseConstraint,
    name: matterDashJsLib.matterDashJsLibStrings.mouseup,
    callback: js.Function1[/* e */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Fired when a body ends sleeping (where `this` is the body).
    *
    * @event sleepEnd
    * @this {body} The body that has ended sleeping
    * @param {} event An event object
    * @param {} event.source The source object of the event
    * @param {} event.name The name of the event
    */
  @JSName("on")
  def on_sleepEnd(
    obj: matterDashJsLib.matterDashJsMod.Body,
    name: matterDashJsLib.matterDashJsLibStrings.sleepEnd,
    callback: js.Function1[
      /* e */ matterDashJsLib.matterDashJsMod.IEvent[matterDashJsLib.matterDashJsMod.Body], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Fired when a body starts sleeping (where `this` is the body).
    *
    * @event sleepStart
    * @this {body} The body that has started sleeping
    * @param {} event An event object
    * @param {} event.source The source object of the event
    * @param {} event.name The name of the event
    */
  @JSName("on")
  def on_sleepStart(
    obj: matterDashJsLib.matterDashJsMod.Body,
    name: matterDashJsLib.matterDashJsLibStrings.sleepStart,
    callback: js.Function1[
      /* e */ matterDashJsLib.matterDashJsMod.IEvent[matterDashJsLib.matterDashJsMod.Body], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Fired after engine timing updated, but just before update
    *
    * @event tick
    * @param {} event An event object
    * @param {number} event.timestamp The engine.timing.timestamp of the event
    * @param {} event.source The source object of the event
    * @param {} event.name The name of the event
    */
  @JSName("on")
  def on_tick(
    obj: matterDashJsLib.matterDashJsMod.Engine,
    name: matterDashJsLib.matterDashJsLibStrings.tick,
    callback: js.Function1[
      /* e */ matterDashJsLib.matterDashJsMod.IEventTimestamped[matterDashJsLib.matterDashJsMod.Runner], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Fires all the callbacks subscribed to the given object's eventName, in the order they subscribed, if any.
    *
    * @param object
    * @param eventNames
    * @param event
    */
  def trigger(`object`: js.Any, eventNames: java.lang.String): scala.Unit = js.native
  def trigger(`object`: js.Any, eventNames: java.lang.String, event: js.Function1[/* e */ js.Any, scala.Unit]): scala.Unit = js.native
}

