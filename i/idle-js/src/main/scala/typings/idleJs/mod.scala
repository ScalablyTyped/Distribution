package typings.idleJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("idle-js", JSImport.Namespace)
  @js.native
  /**
    * Creates a new unstarted idle tracking instance.
    *
    * @param options Initial options
    * @throws
    */
  open class ^ ()
    extends StObject
       with IdleJs {
    def this(options: Options) = this()
  }
  
  @js.native
  trait IdleJs extends StObject {
    
    /**
      * Reset visible and idle state.
      *
      * @param idle The new idle state, or undefined to use the existing state.
      * @param visible The new visibility state, or undefined to use the existing state.
      * @returns this instance for call chaining
      */
    def reset(): this.type = js.native
    def reset(idle: Boolean): this.type = js.native
    def reset(idle: Boolean, visible: Boolean): this.type = js.native
    def reset(idle: Unit, visible: Boolean): this.type = js.native
    
    /**
      * Updates idle tracking options.
      */
    def set(): Unit = js.native
    def set(options: Options): Unit = js.native
    
    /**
      * Starts tracking idle state.
      *
      * @returns this instance for call chaining
      */
    def start(): this.type = js.native
    
    /**
      * Stops all tracking.
      *
      * @returns this instance for call chaining
      */
    def stop(): this.type = js.native
  }
  
  /**
    * Idle tracking options.
    */
  trait Options extends StObject {
    
    /**
      * Events that will trigger the idle resetter.
      *
      * @default ['mousemove','keydown','mousedown','touchstart']
      */
    var events: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Idle time in ms.
      *
      * @default 10000
      */
    var idle: js.UndefOr[Double] = js.undefined
    
    /**
      * Set it to false of you want to track only once.
      *
      * @default true
      */
    var keepTracking: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Callback function to be executed after back form idleness.
      */
    var onActive: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Callback function to be executed when window become hidden.
      */
    var onHide: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Callback function to be executed after idle time.
      */
    var onIdle: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Callback function to be executed when window become visible.
      */
    var onShow: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Set it to true if you want `onIdle` to be raised each time the idle period elapses, not just on idle state changes;
      * i.e.; set to true for `setInterval()` behavior, otherwise for `setTimeout()` behavior.
      *
      * @default false
      */
    var recurIdleCall: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set it to true if you want to start in the idle state.
      *
      * @default false
      */
    var startAtIdle: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setEvents(value: js.Array[String]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      inline def setEventsVarargs(value: String*): Self = StObject.set(x, "events", js.Array(value*))
      
      inline def setIdle(value: Double): Self = StObject.set(x, "idle", value.asInstanceOf[js.Any])
      
      inline def setIdleUndefined: Self = StObject.set(x, "idle", js.undefined)
      
      inline def setKeepTracking(value: Boolean): Self = StObject.set(x, "keepTracking", value.asInstanceOf[js.Any])
      
      inline def setKeepTrackingUndefined: Self = StObject.set(x, "keepTracking", js.undefined)
      
      inline def setOnActive(value: () => Unit): Self = StObject.set(x, "onActive", js.Any.fromFunction0(value))
      
      inline def setOnActiveUndefined: Self = StObject.set(x, "onActive", js.undefined)
      
      inline def setOnHide(value: () => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction0(value))
      
      inline def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
      
      inline def setOnIdle(value: () => Unit): Self = StObject.set(x, "onIdle", js.Any.fromFunction0(value))
      
      inline def setOnIdleUndefined: Self = StObject.set(x, "onIdle", js.undefined)
      
      inline def setOnShow(value: () => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction0(value))
      
      inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      inline def setRecurIdleCall(value: Boolean): Self = StObject.set(x, "recurIdleCall", value.asInstanceOf[js.Any])
      
      inline def setRecurIdleCallUndefined: Self = StObject.set(x, "recurIdleCall", js.undefined)
      
      inline def setStartAtIdle(value: Boolean): Self = StObject.set(x, "startAtIdle", value.asInstanceOf[js.Any])
      
      inline def setStartAtIdleUndefined: Self = StObject.set(x, "startAtIdle", js.undefined)
    }
  }
}
