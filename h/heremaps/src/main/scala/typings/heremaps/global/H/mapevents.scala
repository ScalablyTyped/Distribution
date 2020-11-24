package typings.heremaps.global.H

import typings.heremaps.H.map.Object
import typings.heremaps.H.mapevents.Behavior.Options
import typings.heremaps.H.mapevents.Pointer.Button
import typings.heremaps.H.math.BitMask
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/***** mapevents *****/
@JSGlobal("H.mapevents")
@js.native
object mapevents extends js.Object {
  
  /**
    * Behavior class uses map events and adds behavior functionality to the map. This allows map panning and zooming via using mouse wheel
    * @property DRAGGING {number} - Map responds to user dragging via mouse or touch
    * @property WHEELZOOM {number} - Map zooms in or out in respond to mouse wheel events
    * @property DBLTAPZOOM {number} - Map zooms in or out in response to double click or double tap. For double tap if more that one touches are on the screen map will zoom out.
    */
  @js.native
  class Behavior protected ()
    extends typings.heremaps.H.mapevents.Behavior {
    /**
      * Constructor
      * @param mapEvents {H.mapevents.MapEvents} - previously initialized map events instance
      * @param options {H.mapevents.Behavior.Options} - additional options (i.e kinetics)
      */
    def this(mapEvents: typings.heremaps.H.mapevents.MapEvents) = this()
    def this(mapEvents: typings.heremaps.H.mapevents.MapEvents, options: Options) = this()
  }
  /* static members */
  @js.native
  object Behavior extends js.Object {
    
    var DBLTAPZOOM: Double = js.native
    
    var DRAGGING: Double = js.native
    
    var WHEELZOOM: Double = js.native
  }
  
  /**
    * ContextMenuEvent should be fired, when a user right-clicks or longpresses on a map object.
    * @property viewportX {Array<H.util.ContextItem>} - Contains ContextItems, that will be used to create context menu entries. Should be filled by listeners of the "contextmenu" event
    * @property viewportY {number} - Map viewport y position
    * @property target {(H.map.Object | H.Map)} - Target for the event
    * @property originalEvent {Event} - Original event
    * @property currentTarget {(H.map.Object | H.Map)} - Object which has listener attached
    * @property type {string} - Name of the dispatched event
    * @property defaultPrevented {boolean} - Indicates if preventDefault was called on the current event
    */
  @js.native
  class ContextMenuEvent protected ()
    extends typings.heremaps.H.mapevents.ContextMenuEvent {
    /**
      * Constructor
      * @param viewportX {number} - The x coordinate on the viewport
      * @param viewportY {number} - The y coordinate on the viewport
      * @param target {(H.Map | H.map.Object)} - The event's target element
      * @param originalEvent {Event} - target of the event
      */
    def this(
      viewportX: Double,
      viewportY: Double,
      target: typings.heremaps.H.Map_,
      originalEvent: typings.heremaps.H.mapevents.Event
    ) = this()
    def this(
      viewportX: Double,
      viewportY: Double,
      target: Object,
      originalEvent: typings.heremaps.H.mapevents.Event
    ) = this()
  }
  
  /**
    * Custom map event. Contains list of pointers on the map, list of changed pointers and original event. Inherits from H.util.Event.
    * @property pointers {Array<H.mapevents.Pointer>} - Pointers which are currently on the screen
    * @property changedPointers {Array<H.mapevents.Pointer>} - Pointers which has changed in course of event
    * @property targetPointers {Array<H.mapevents.Pointer>} - Pointers which are on same target as the current pointer
    * @property currentPointer {H.mapevents.Pointer} - Current pointer
    * @property originalEvent {Event} - Original event fired by the browser
    * @property target {(H.map.Object | H.Map)} - Object which triggered event. Can be the map object (i.e marker or polyline) or the map itself
    * @property currentTarget {(H.map.Object | H.Map)} - Object which has listener attached
    * @property type {string} - Name of the dispatched event
    * @property defaultPrevented {boolean} - Indicates if preventDefault was called on the current event
    */
  @js.native
  class Event protected ()
    extends typings.heremaps.H.mapevents.Event {
    /**
      * Constructor
      * @param type {string} - type of event
      * @param pointers {Array<H.mapevents.Pointer>} - pointers which are currently on the screen
      * @param changedPointers {Array<H.mapevents.Pointer>} - pointers which changed during event
      * @param targetPointers {Array<H.mapevents.Pointer>} - pointers on the event target
      * @param currentPointer {H.mapevents.Pointer} - pointer which triggered the event
      * @param target {(H.Map | H.map.Object)} - target map object which triggered event
      * @param originalEvent {Event} - original dom event
      */
    def this(
      `type`: String,
      pointers: js.Array[typings.heremaps.H.mapevents.Pointer],
      changedPointers: js.Array[typings.heremaps.H.mapevents.Pointer],
      targetPointers: js.Array[typings.heremaps.H.mapevents.Pointer],
      currentPointer: typings.heremaps.H.mapevents.Pointer,
      target: typings.heremaps.H.Map_,
      originalEvent: typings.heremaps.H.mapevents.Event
    ) = this()
    def this(
      `type`: String,
      pointers: js.Array[typings.heremaps.H.mapevents.Pointer],
      changedPointers: js.Array[typings.heremaps.H.mapevents.Pointer],
      targetPointers: js.Array[typings.heremaps.H.mapevents.Pointer],
      currentPointer: typings.heremaps.H.mapevents.Pointer,
      target: Object,
      originalEvent: typings.heremaps.H.mapevents.Event
    ) = this()
  }
  
  /**
    * MapEvents enable the events functionality on the map and on the map objects. By using this extension it is possible to listen to events on map objects like markers, polylines, polygons,
    * circles and on the map object itself. Events are triggered depending on user interaction. Please check the Events Summary section for the list of events fired by this class and by the map
    * objects.
    */
  @js.native
  class MapEvents protected ()
    extends typings.heremaps.H.mapevents.MapEvents {
    /**
      * Constructor
      * @param map {H.Map} - map instance which is used for firing events
      */
    def this(map: typings.heremaps.H.Map_) = this()
  }
  
  /**
    * Class representing pointer on the map surface. A pointer in platform specific definition would mean either mouse, touch, pen or any pointing device which can trigger browser events.
    * @property viewportX {number} - X coordinate on the map's viewport
    * @property viewportY {number} - Y coordinate on the map's viewport
    * @property target {(H.map.Object | H.Map)} - Map object directly under the pointer. Can be null if if pointer is out of the map viewport
    * @property id {number} - Pointer unique identifier.
    * @property type {string} - Pointer type can be: 'mouse', 'touch' or 'pen'
    * @property dragTarget {(H.map.Object | H.Map)} - Object which is currently dragged by the pointer
    * @property button {H.mapevents.Pointer.Button} - Indicates which pointer device button has changed.
    */
  @js.native
  class Pointer protected ()
    extends typings.heremaps.H.mapevents.Pointer {
    /**
      * Constructor
      * @param viewportX {number} - pointer position on x-axis
      * @param viewportY {number} - pointer position on y-axis
      * @param id {number} - unique pointer identifier among currently available pointers
      * @param type {string} - type of pointer can be i.e 'mouse', 'touch'. 'pen'
      * @param opt_button {H.mapevents.Pointer.Button=} - Indicates which pointer device button has changed.
      * @param opt_buttons {number=} - Indicates which pointer device buttons are being pressed, expressed as a bitmask. Uses the same values, as "buttons" in Pointer Events spec.
      */
    def this(viewportX: Double, viewportY: Double, id: Double, `type`: String) = this()
    def this(viewportX: Double, viewportY: Double, id: Double, `type`: String, opt_button: Button) = this()
    def this(
      viewportX: Double,
      viewportY: Double,
      id: Double,
      `type`: String,
      opt_button: js.UndefOr[scala.Nothing],
      opt_buttons: BitMask
    ) = this()
    def this(
      viewportX: Double,
      viewportY: Double,
      id: Double,
      `type`: String,
      opt_button: Button,
      opt_buttons: BitMask
    ) = this()
  }
  @js.native
  object Pointer extends js.Object {
    
    /**
      * Types of a button
      */
    @js.native
    object Button extends js.Object {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.heremaps.H.mapevents.Pointer.Button with Double] = js.native
      
      /* 1 */ val LEFT: typings.heremaps.H.mapevents.Pointer.Button.LEFT with Double = js.native
      
      /* 2 */ val MIDDLE: typings.heremaps.H.mapevents.Pointer.Button.MIDDLE with Double = js.native
      
      /* 0 */ val NONE: typings.heremaps.H.mapevents.Pointer.Button.NONE with Double = js.native
      
      /* 3 */ val RIGHT: typings.heremaps.H.mapevents.Pointer.Button.RIGHT with Double = js.native
    }
  }
  
  /**
    * WheelEvent is fired when the mouse wheel is used over the map. It contains information about cursor position and the map object which resides directly under the cursor.
    * @property delta {number} - Wheel move delta
    * @property viewportX {number} - Map viewport x position
    * @property viewportY {number} - Map viewport y position
    * @property target {(H.map.Object | H.Map)} - Target for the event
    * @property originalEvent {Event} - Original mouse wheel event
    * @property currentTarget {(H.map.Object | H.Map)} - Object which has listener attached
    * @property type {string} - Name of the dispatched event
    * @property defaultPrevented {boolean} - Indicates if preventDefault was called on the current event
    */
  @js.native
  class WheelEvent protected ()
    extends typings.heremaps.H.mapevents.WheelEvent {
    /**
      * Constructor
      * @param deltaY {number} - The wheel move delta on y-axis
      * @param viewportX {number} - The x coordinate on the viewport
      * @param viewportY {number} - The y coordinate on the viewport
      * @param target {(H.Map | H.map.Object)} - The event's target element
      * @param originalEvent {Event} - target of the event
      */
    def this(
      deltaY: Double,
      viewportX: Double,
      viewportY: Double,
      target: typings.heremaps.H.Map_,
      originalEvent: typings.heremaps.H.mapevents.Event
    ) = this()
    def this(
      deltaY: Double,
      viewportX: Double,
      viewportY: Double,
      target: Object,
      originalEvent: typings.heremaps.H.mapevents.Event
    ) = this()
  }
}
