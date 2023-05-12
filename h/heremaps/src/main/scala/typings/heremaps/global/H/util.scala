package typings.heremaps.global.H

import typings.heremaps.H.util.ContextItem.Options
import typings.heremaps.H.util.Request.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/***** util *****/
object util {
  
  /**
    * The cache represents a in-memory LRU-cache with a fixed size. It stores any data that is added until the cache's content exceeds a maximum size. Once the size of all content elements
    * exceeds the maximum size the cache will drop the least recently retrieved elements until the size of the cache is within the bounds of its maximum size. Data elements are always
    * associated with an identifier that allow to retrieve them at a later stage and their content size.
    */
  @JSGlobal("H.util.Cache")
  @js.native
  open class Cache protected ()
    extends StObject
       with typings.heremaps.H.util.Cache {
    /**
      * Constructor
      * @param maxSize {number} - the maximum size of the cache
      * @param opt_onDrop {function(string, ?, number)=} - A callback to be invoked when a data element is dropped from the cache
      * @param opt_filter {(function(string, ?, number): boolean)=} - A function to filter data elements that are not to be cached
      */
    def this(maxSize: Double) = this()
    def this(maxSize: Double, opt_onDrop: js.Function3[/* s */ String, /* i */ Any, /* n */ Double, Unit]) = this()
    def this(
      maxSize: Double,
      opt_onDrop: js.Function3[/* s */ String, /* i */ Any, /* n */ Double, Unit],
      opt_filter: js.Function3[/* s */ String, /* i */ Any, /* n */ Double, Boolean]
    ) = this()
    def this(
      maxSize: Double,
      opt_onDrop: Unit,
      opt_filter: js.Function3[/* s */ String, /* i */ Any, /* n */ Double, Boolean]
    ) = this()
  }
  
  /**
    * This event indicates a change. It contains the old and the new value.
    * target {*} - Object which triggered the event
    * currentTarget {*} - Object which has listener attached
    * type {string} - Name of the dispatched event
    * defaultPrevented {boolean} - Indicates if preventDefault was called on the current event
    */
  @JSGlobal("H.util.ChangeEvent")
  @js.native
  open class ChangeEvent protected ()
    extends StObject
       with typings.heremaps.H.util.ChangeEvent {
    /**
      * Constructor
      * @param type {string} - The type of the event
      * @param newValue {*} - The new value of the property
      * @param oldValue {*} - The previous value of the property
      */
    def this(`type`: String, newValue: Any, oldValue: Any) = this()
    
    /* CompleteClass */
    var currentTarget: Any = js.native
    
    /* CompleteClass */
    var defaultPrevented: Boolean = js.native
    
    /**
      * Sets defaultPrevented to true. Which can be used to prevent some default behavior.
      */
    /* CompleteClass */
    override def preventDefault(): Unit = js.native
    
    /**
      * Stops propagation for current event.
      */
    /* CompleteClass */
    override def stopPropagation(): Unit = js.native
    
    /* CompleteClass */
    var target: Any = js.native
    
    /* CompleteClass */
    var `type`: String = js.native
  }
  
  /**
    * This class represents a contextual information/action.
    * SEPARATOR {H.util.ContextItem} - Separator for the context items
    */
  @JSGlobal("H.util.ContextItem")
  @js.native
  /**
    * Constructor
    * @param opt_options {H.util.ContextItem.Options=} - The values to initialize this context item
    */
  open class ContextItem ()
    extends StObject
       with typings.heremaps.H.util.ContextItem {
    def this(opt_options: Options) = this()
  }
  object ContextItem {
    
    @JSGlobal("H.util.ContextItem")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("H.util.ContextItem.SEPARATOR")
    @js.native
    def SEPARATOR: typings.heremaps.H.util.ContextItem = js.native
    inline def SEPARATOR_=(x: typings.heremaps.H.util.ContextItem): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SEPARATOR")(x.asInstanceOf[js.Any])
  }
  
  /**
    * Object which can be safely disposed.
    */
  @JSGlobal("H.util.Disposable")
  @js.native
  /**
    * Constructor
    */
  open class Disposable ()
    extends StObject
       with typings.heremaps.H.util.Disposable
  
  /**
    * Base Event class which is used for all events dispatched by any EventTarget within the api.
    * target {*} - Object which triggered the event
    * currentTarget {*} - Object which has listener attached
    * type {string} - Name of the dispatched event
    * defaultPrevented {boolean} - Indicates if preventDefault was called on the current event
    */
  @JSGlobal("H.util.Event")
  @js.native
  open class Event protected ()
    extends StObject
       with typings.heremaps.H.util.Event {
    /**
      * Constructor
      * @param type {string} - Event Type.
      * @param opt_target {Object=} - Reference to the object that is the target of this event. It has to implement the {@link EventTargetInstance} interface.
      */
    def this(`type`: String) = this()
    def this(`type`: String, opt_target: Any) = this()
    
    /* CompleteClass */
    var currentTarget: Any = js.native
    
    /* CompleteClass */
    var defaultPrevented: Boolean = js.native
    
    /**
      * Sets defaultPrevented to true. Which can be used to prevent some default behavior.
      */
    /* CompleteClass */
    override def preventDefault(): Unit = js.native
    
    /**
      * Stops propagation for current event.
      */
    /* CompleteClass */
    override def stopPropagation(): Unit = js.native
    
    /* CompleteClass */
    var target: Any = js.native
    
    /* CompleteClass */
    var `type`: String = js.native
  }
  
  /**
    * EventTarget enabled listening and dispatching events on all instances and derived classes.
    */
  @JSGlobal("H.util.EventTarget")
  @js.native
  /**
    * Constructor
    */
  open class EventTarget ()
    extends StObject
       with typings.heremaps.H.util.EventTarget
  
  /**
    * This class represents an list of ordered entries which dispatches events when the list is modified.
    * @event add {H.util.OList.Event} - Fired when an entry was added to the list.
    * @event remove {H.util.OList.Event} - Fired when an entry was removed from the list.
    * @event set {H.util.OList.Event} - Fired when an entry was set in the list.
    * @event move {H.util.OList.Event} - Fired when an entry was moved within the list.
    */
  @JSGlobal("H.util.OList")
  @js.native
  open class OList ()
    extends StObject
       with typings.heremaps.H.util.OList
  object OList {
    
    /**
      * The event class for events that are dispatched by OList
      * target {*} - Object which triggered the event
      * currentTarget {*} - Object which has listener attached
      * type {string} - Name of the dispatched event
      * defaultPrevented {boolean} - Indicates if preventDefault was called on the current event
      */
    @JSGlobal("H.util.OList.Event")
    @js.native
    open class Event protected ()
      extends StObject
         with typings.heremaps.H.util.OList.Event {
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
        added: Any,
        removed: Any,
        moved: Any
      ) = this()
      
      /* CompleteClass */
      var currentTarget: Any = js.native
      
      /* CompleteClass */
      var defaultPrevented: Boolean = js.native
      
      /**
        * Sets defaultPrevented to true. Which can be used to prevent some default behavior.
        */
      /* CompleteClass */
      override def preventDefault(): Unit = js.native
      
      /**
        * Stops propagation for current event.
        */
      /* CompleteClass */
      override def stopPropagation(): Unit = js.native
      
      /* CompleteClass */
      var target: Any = js.native
      
      /* CompleteClass */
      var `type`: String = js.native
    }
  }
  
  /**
    * A generic class to represent a handle for any kind of asynchronous processed requests
    */
  @JSGlobal("H.util.Request")
  @js.native
  /**
    * Constructor
    * @param opt_onprogress {function(H.util.Request)=} - A callback to invoke every time when the request's progress state changes
    * @param opt_total {number=} - The total number of processing steps to complete this request, default is 1
    */
  open class Request ()
    extends StObject
       with typings.heremaps.H.util.Request {
    def this(opt_onprogress: js.Function1[/* req */ typings.heremaps.H.util.Request, Unit]) = this()
    def this(opt_onprogress: js.Function1[/* req */ typings.heremaps.H.util.Request, Unit], opt_total: Double) = this()
    def this(opt_onprogress: Unit, opt_total: Double) = this()
    
    /**
      * Returns the number of processingsteps which have been failed
      * @returns {number}
      */
    /* CompleteClass */
    override def getFailed(): Double = js.native
    
    /**
      * Returns the number of steps which are already processed by this request
      * @returns {number}
      */
    /* CompleteClass */
    override def getProcessed(): Double = js.native
    
    /**
      * Returns the state of this request
      * @returns {H.util.Request.State}
      */
    /* CompleteClass */
    override def getState(): State = js.native
    
    /**
      * Returns the number of processing steps to complete this request
      * @returns {number}
      */
    /* CompleteClass */
    override def getTotal(): Double = js.native
  }
  object Request {
    
    /**
      * The supported states of an request
      */
    @JSGlobal("H.util.Request.State")
    @js.native
    object State extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.heremaps.H.util.Request.State & Double] = js.native
      
      /* 3 */ val CANCELLED: typings.heremaps.H.util.Request.State.CANCELLED & Double = js.native
      
      /* 2 */ val COMPLETE: typings.heremaps.H.util.Request.State.COMPLETE & Double = js.native
      
      /* 4 */ val ERROR: typings.heremaps.H.util.Request.State.ERROR & Double = js.native
      
      /* 0 */ val PENDING: typings.heremaps.H.util.Request.State.PENDING & Double = js.native
      
      /* 1 */ val PROCESSING: typings.heremaps.H.util.Request.State.PROCESSING & Double = js.native
    }
  }
  
  object animation {
    
    /**
      * This mamespace contains easing functions used for Animation class.
      */
    @JSGlobal("H.util.animation.ease")
    @js.native
    open class ease ()
      extends StObject
         with typings.heremaps.H.util.animation.ease
    object ease {
      
      @JSGlobal("H.util.animation.ease")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * This function defines ease in and out with slope.
        * @param val {number} - A value in range [0..1] to translate
        * @returns {number} - the translated value
        */
      /* static member */
      inline def EASE_IN_OUT_QUINT(`val`: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("EASE_IN_OUT_QUINT")(`val`.asInstanceOf[js.Any]).asInstanceOf[Double]
      
      /**
        * This function defines quadratic ease in.
        * @param val {number} - A value in range [0..1] to translate
        * @returns {number} - the translated value
        */
      /* static member */
      inline def EASE_IN_QUAD(`val`: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("EASE_IN_QUAD")(`val`.asInstanceOf[js.Any]).asInstanceOf[Double]
      
      /**
        * This function defines ease out with circ function.
        * @param val {number} - A value in range [0..1] to translate
        * @returns {number} - the translated value
        */
      /* static member */
      inline def EASE_OUT_CIRC(`val`: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("EASE_OUT_CIRC")(`val`.asInstanceOf[js.Any]).asInstanceOf[Double]
      
      /**
        * This function defines quadratic ease out.
        * @param val {number} - A value in range [0..1] to translate
        * @returns {number} - the translated value
        */
      /* static member */
      inline def EASE_OUT_QUAD(`val`: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("EASE_OUT_QUAD")(`val`.asInstanceOf[js.Any]).asInstanceOf[Double]
      
      /**
        * This function defines linear ease.
        * @param val {number} - A value in range [0..1] to translate
        * @returns {number} - the translated value
        */
      /* static member */
      inline def LINEAR(`val`: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("LINEAR")(`val`.asInstanceOf[js.Any]).asInstanceOf[Double]
    }
  }
}
