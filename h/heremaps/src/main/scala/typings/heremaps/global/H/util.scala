package typings.heremaps.global.H

import typings.heremaps.H.util.ContextItem.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/***** util *****/
@JSGlobal("H.util")
@js.native
object util extends js.Object {
  
  /**
    * The cache represents a in-memory LRU-cache with a fixed size. It stores any data that is added until the cache's content exceeds a maximum size. Once the size of all content elements
    * exceeds the maximum size the cache will drop the least recently retrieved elements until the size of the cache is within the bounds of its maximum size. Data elements are always
    * associated with an identifier that allow to retrieve them at a later stage and their content size.
    */
  @js.native
  class Cache protected ()
    extends typings.heremaps.H.util.Cache {
    /**
      * Constructor
      * @param maxSize {number} - the maximum size of the cache
      * @param opt_onDrop {function(string, ?, number)=} - A callback to be invoked when a data element is dropped from the cache
      * @param opt_filter {(function(string, ?, number): boolean)=} - A function to filter data elements that are not to be cached
      */
    def this(maxSize: Double) = this()
    def this(maxSize: Double, opt_onDrop: js.Function3[/* s */ String, /* i */ js.Any, /* n */ Double, Unit]) = this()
    def this(
      maxSize: Double,
      opt_onDrop: js.UndefOr[scala.Nothing],
      opt_filter: js.Function3[/* s */ String, /* i */ js.Any, /* n */ Double, Boolean]
    ) = this()
    def this(
      maxSize: Double,
      opt_onDrop: js.Function3[/* s */ String, /* i */ js.Any, /* n */ Double, Unit],
      opt_filter: js.Function3[/* s */ String, /* i */ js.Any, /* n */ Double, Boolean]
    ) = this()
  }
  
  /**
    * This event indicates a change. It contains the old and the new value.
    * @property target {*} - Object which triggered the event
    * @property currentTarget {*} - Object which has listener attached
    * @property type {string} - Name of the dispatched event
    * @property defaultPrevented {boolean} - Indicates if preventDefault was called on the current event
    */
  @js.native
  class ChangeEvent protected ()
    extends typings.heremaps.H.util.ChangeEvent {
    /**
      * Constructor
      * @param type {string} - The type of the event
      * @param newValue {*} - The new value of the property
      * @param oldValue {*} - The previous value of the property
      */
    def this(`type`: String, newValue: js.Any, oldValue: js.Any) = this()
  }
  
  /**
    * This class represents a contextual information/action.
    * @property SEPARATOR {H.util.ContextItem} - Separator for the context items
    */
  @js.native
  /**
    * Constructor
    * @param opt_options {H.util.ContextItem.Options=} - The values to initialize this context item
    */
  class ContextItem ()
    extends typings.heremaps.H.util.ContextItem {
    def this(opt_options: Options) = this()
  }
  /* static members */
  @js.native
  object ContextItem extends js.Object {
    
    var SEPARATOR: typings.heremaps.H.util.ContextItem = js.native
  }
  
  /**
    * Object which can be safely disposed.
    */
  @js.native
  /**
    * Constructor
    */
  class Disposable ()
    extends typings.heremaps.H.util.Disposable
  
  /**
    * Base Event class which is used for all events dispatched by any EventTarget within the api.
    * @property target {*} - Object which triggered the event
    * @property currentTarget {*} - Object which has listener attached
    * @property type {string} - Name of the dispatched event
    * @property defaultPrevented {boolean} - Indicates if preventDefault was called on the current event
    */
  @js.native
  class Event protected ()
    extends typings.heremaps.H.util.Event {
    /**
      * Constructor
      * @param type {string} - Event Type.
      * @param opt_target {Object=} - Reference to the object that is the target of this event. It has to implement the {@link EventTargetInstance} interface.
      */
    def this(`type`: String) = this()
    def this(`type`: String, opt_target: js.Any) = this()
  }
  
  /**
    * EventTarget enabled listening and dispatching events on all instances and derived classes.
    */
  @js.native
  /**
    * Constructor
    */
  class EventTarget ()
    extends typings.heremaps.H.util.EventTarget
  
  /**
    * There is no documentation about this API
    */
  @js.native
  object Job extends js.Object
  
  /**
    * This class represents an list of ordered entries which dispatches events when the list is modified.
    * @event add {H.util.OList.Event} - Fired when an entry was added to the list.
    * @event remove {H.util.OList.Event} - Fired when an entry was removed from the list.
    * @event set {H.util.OList.Event} - Fired when an entry was set in the list.
    * @event move {H.util.OList.Event} - Fired when an entry was moved within the list.
    */
  @js.native
  class OList ()
    extends typings.heremaps.H.util.OList
  @js.native
  object OList extends js.Object {
    
    /**
      * The event class for events that are dispatched by OList
      * @property target {*} - Object which triggered the event
      * @property currentTarget {*} - Object which has listener attached
      * @property type {string} - Name of the dispatched event
      * @property defaultPrevented {boolean} - Indicates if preventDefault was called on the current event
      */
    @js.native
    class Event protected ()
      extends typings.heremaps.H.util.OList.Event {
      /**
        * Constructor
        * @param list {H.util.OList} - The OList instance which is emitting the event
        * @param type {H.util.OList.prototype.EventType} - The type of the event
        * @param idx {number} - The affected index within this list
        * @param added {?*} - The value of the entry which was added or set
        * @param removed {?*} - The value of the entry which was removed or replaced
        * @param moved {?*} - The value of the entry which was moved
        */
      def this(
        list: typings.heremaps.H.util.OList,
        `type`: String,
        idx: Double,
        added: js.Any,
        removed: js.Any,
        moved: js.Any
      ) = this()
    }
  }
  
  /**
    * A generic class to represent a handle for any kind of asynchronous processed requests
    */
  @js.native
  /**
    * Constructor
    * @param opt_onprogress {function(H.util.Request)=} - A callback to invoke every time when the request's progress state changes
    * @param opt_total {number=} - The total number of processing steps to complete this request, default is 1
    */
  class Request ()
    extends typings.heremaps.H.util.Request {
    def this(opt_onprogress: js.Function1[/* req */ typings.heremaps.H.util.Request, Unit]) = this()
    def this(opt_onprogress: js.UndefOr[scala.Nothing], opt_total: Double) = this()
    def this(opt_onprogress: js.Function1[/* req */ typings.heremaps.H.util.Request, Unit], opt_total: Double) = this()
  }
  @js.native
  object Request extends js.Object {
    
    /**
      * The supported states of an request
      */
    @js.native
    object State extends js.Object {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.heremaps.H.util.Request.State with Double] = js.native
      
      /* 3 */ val CANCELLED: typings.heremaps.H.util.Request.State.CANCELLED with Double = js.native
      
      /* 2 */ val COMPLETE: typings.heremaps.H.util.Request.State.COMPLETE with Double = js.native
      
      /* 4 */ val ERROR: typings.heremaps.H.util.Request.State.ERROR with Double = js.native
      
      /* 0 */ val PENDING: typings.heremaps.H.util.Request.State.PENDING with Double = js.native
      
      /* 1 */ val PROCESSING: typings.heremaps.H.util.Request.State.PROCESSING with Double = js.native
    }
  }
  
  @js.native
  object animation extends js.Object {
    
    /**
      * This mamespace contains easing functions used for Animation class.
      */
    @js.native
    class ease ()
      extends typings.heremaps.H.util.animation.ease
    /* static members */
    @js.native
    object ease extends js.Object {
      
      /**
        * This function defines ease in and out with slope.
        * @param val {number} - A value in range [0..1] to translate
        * @returns {number} - the translated value
        */
      def EASE_IN_OUT_QUINT(`val`: Double): Double = js.native
      
      /**
        * This function defines quadratic ease in.
        * @param val {number} - A value in range [0..1] to translate
        * @returns {number} - the translated value
        */
      def EASE_IN_QUAD(`val`: Double): Double = js.native
      
      /**
        * This function defines ease out with circ function.
        * @param val {number} - A value in range [0..1] to translate
        * @returns {number} - the translated value
        */
      def EASE_OUT_CIRC(`val`: Double): Double = js.native
      
      /**
        * This function defines quadratic ease out.
        * @param val {number} - A value in range [0..1] to translate
        * @returns {number} - the translated value
        */
      def EASE_OUT_QUAD(`val`: Double): Double = js.native
      
      /**
        * This function defines linear ease.
        * @param val {number} - A value in range [0..1] to translate
        * @returns {number} - the translated value
        */
      def LINEAR(`val`: Double): Double = js.native
    }
  }
}
