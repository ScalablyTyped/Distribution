package typings.heremaps.global.H

import typings.heremaps.H.data.AbstractReader.State
import typings.heremaps.H.map.Object
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/***** data *****/
object data {
  
  /**
    * An abstract reader class defines interface for data readers and has general functionality related to fetching data and reader events.
    */
  @JSGlobal("H.data.AbstractReader")
  @js.native
  /**
    * Constructor
    * @param opt_url {string=}
    */
  class AbstractReader ()
    extends StObject
       with typings.heremaps.H.data.AbstractReader {
    def this(opt_url: String) = this()
  }
  object AbstractReader {
    
    /**
      * The event class for state events that are dispatched by AbstractReader
      */
    @JSGlobal("H.data.AbstractReader.Event")
    @js.native
    class Event protected ()
      extends StObject
         with typings.heremaps.H.util.Event {
      /**
        * Constructor
        * @param target {(H.data.AbstractReader | H.map.Object)} - The target that's passed to event listeners
        * @param type {string} - The type of the event
        * @param state {H.data.AbstractReader.State} - The state of the target firing an event
        * @param message {string} - The message associated with an event
        */
      def this(target: typings.heremaps.H.data.AbstractReader, `type`: String, state: State, message: String) = this()
      def this(target: Object, `type`: String, state: State, message: String) = this()
      
      /* CompleteClass */
      var currentTarget: js.Any = js.native
      
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
      var target: js.Any = js.native
      
      /* CompleteClass */
      var `type`: String = js.native
    }
    
    /**
      * The state types of an Reader. Possible states are:
      */
    @JSGlobal("H.data.AbstractReader.State")
    @js.native
    object State extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.heremaps.H.data.AbstractReader.State & Double] = js.native
      
      /* 0 */ val ERROR: typings.heremaps.H.data.AbstractReader.State.ERROR & Double = js.native
      
      /* 1 */ val LOADING: typings.heremaps.H.data.AbstractReader.State.LOADING & Double = js.native
      
      /* 3 */ val READY: typings.heremaps.H.data.AbstractReader.State.READY & Double = js.native
      
      /* 2 */ val VISIT: typings.heremaps.H.data.AbstractReader.State.VISIT & Double = js.native
    }
  }
}
