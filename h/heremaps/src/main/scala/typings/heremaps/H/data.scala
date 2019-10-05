package typings.heremaps.H

import typings.heremaps.H.data.AbstractReader
import typings.heremaps.H.data.AbstractReader.State
import typings.heremaps.H.map.Object
import typings.heremaps.H.map.layer.ObjectLayer
import typings.heremaps.H.util.EventTarget
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
  class AbstractReader () extends EventTarget {
    def this(opt_url: String) = this()
    /**
      * Method returns H.map.layer.ObjectLayer that contains parsed data, and can be added directly to the map. It returns new instance of the class with every invocation.
      * If data hasn't been parsed it will return H.map.layer.ObjectLayer that contains partial information, and reader will add new parsed objects to the layer's provider later on.
      * @returns {H.map.layer.ObjectLayer}
      */
    def getLayer(): ObjectLayer = js.native
    /**
      * Method returns collection of currently parsed, and converted to H.map.Object data objects. Method returns only currently parsed objects if parsing is ongoing.
      * @returns {Array<H.map.Object>}
      */
    def getParsedObjects(): js.Array[Object] = js.native
    /**
      * Returns the reader's processing state for possible states see H.data.AbstractReader.State
      * @returns {H.data.AbstractReader.State}
      */
    def getState(): State = js.native
    /**
      * Returns URL of the current file, which is either in process of fetching/parsing or file that has been already parsed.
      * @returns {(string | undefined)} - url
      */
    def getUrl(): String | Unit = js.native
    /**
      * Method launches parsing of the data file at the current url (see H.data.AbstractReader#setUrl or H.data.AbstractReader).
      * Method uses XHR as a transport therefore same origin policy applies, or server should respond with proper CORS headers.
      */
    def parse(): Unit = js.native
    /**
      * Method sets reader's URL. Method resets current Reader's state to its initial values (clears data about last parsed objects, etc.), and throws
      * InvalidState exception if Reader's state is not READY or ERROR.
      * @param url {string} - The new URL
      * @returns {H.data.AbstractReader}
      */
    def setUrl(url: String): AbstractReader = js.native
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
      def this(target: AbstractReader, `type`: String, state: State, message: String) = this()
      def this(target: Object, `type`: String, state: State, message: String) = this()
    }
    
    @js.native
    sealed trait State extends js.Object
    
    /**
      * The state types of an Reader. Possible states are:
      */
    @js.native
    object State extends js.Object {
      @js.native
      sealed trait ERROR extends State
      
      @js.native
      sealed trait LOADING extends State
      
      @js.native
      sealed trait READY extends State
      
      @js.native
      sealed trait VISIT extends State
      
      /* 0 */ val ERROR: typings.heremaps.H.data.AbstractReader.State.ERROR with Double = js.native
      /* 1 */ val LOADING: typings.heremaps.H.data.AbstractReader.State.LOADING with Double = js.native
      /* 3 */ val READY: typings.heremaps.H.data.AbstractReader.State.READY with Double = js.native
      /* 2 */ val VISIT: typings.heremaps.H.data.AbstractReader.State.VISIT with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[State with Double] = js.native
    }
    
  }
  
}

