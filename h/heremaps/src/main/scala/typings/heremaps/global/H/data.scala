package typings.heremaps.global.H

import typings.heremaps.H.data.AbstractReader.State
import typings.heremaps.H.map.Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/***** data *****/
@JSGlobal("H.data")
@js.native
object data extends js.Object {
  /**
    * An abstract reader class defines interface for data readers and has general functionality related to fetching data and reader events.
    */
  @js.native
  /**
    * Constructor
    * @param opt_url {string=}
    */
  class AbstractReader ()
    extends typings.heremaps.H.data.AbstractReader {
    def this(opt_url: String) = this()
  }
  
  @js.native
  object AbstractReader extends js.Object {
    /**
      * The event class for state events that are dispatched by AbstractReader
      */
    @js.native
    class Event protected ()
      extends typings.heremaps.H.util.Event {
      /**
        * Constructor
        * @param target {(H.data.AbstractReader | H.map.Object)} - The target that's passed to event listeners
        * @param type {string} - The type of the event
        * @param state {H.data.AbstractReader.State} - The state of the target firing an event
        * @param message {string} - The message associated with an event
        */
      def this(target: typings.heremaps.H.data.AbstractReader, `type`: String, state: State, message: String) = this()
      def this(target: Object, `type`: String, state: State, message: String) = this()
    }
    
    /**
      * The state types of an Reader. Possible states are:
      */
    @js.native
    object State extends js.Object {
      /* 0 */ val ERROR: typings.heremaps.H.data.AbstractReader.State.ERROR with Double = js.native
      /* 1 */ val LOADING: typings.heremaps.H.data.AbstractReader.State.LOADING with Double = js.native
      /* 3 */ val READY: typings.heremaps.H.data.AbstractReader.State.READY with Double = js.native
      /* 2 */ val VISIT: typings.heremaps.H.data.AbstractReader.State.VISIT with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.heremaps.H.data.AbstractReader.State with Double] = js.native
    }
    
  }
  
}

