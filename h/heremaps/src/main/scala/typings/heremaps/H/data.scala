package typings.heremaps.H

import typings.heremaps.H.data.AbstractReader.State
import typings.heremaps.H.map.Object
import typings.heremaps.H.map.layer.ObjectLayer
import typings.heremaps.H.util.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/***** data *****/
object data {
  
  /**
    * An abstract reader class defines interface for data readers and has general functionality related to fetching data and reader events.
    */
  @js.native
  trait AbstractReader
    extends StObject
       with EventTarget {
    
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
  object AbstractReader {
    
    @js.native
    sealed trait State extends StObject
    /**
      * The state types of an Reader. Possible states are:
      */
    @JSGlobal("H.data.AbstractReader.State")
    @js.native
    object State extends StObject {
      
      @js.native
      sealed trait ERROR
        extends StObject
           with State
      
      @js.native
      sealed trait LOADING
        extends StObject
           with State
      
      @js.native
      sealed trait READY
        extends StObject
           with State
      
      @js.native
      sealed trait VISIT
        extends StObject
           with State
    }
    
    /**
      * The event class for state events that are dispatched by AbstractReader
      */
    type Event = typings.heremaps.H.util.Event
  }
  
  /**
    * This namespace provides GeoJSON functionality.
    */
  object geojson {
    
    /**
      * This class represents a GeoJSON reader responsible for fetching and interpreting GeoJSON data.
      * It creates an instance of H.map.Object that can be displayed on the map (for more details see GeoJSON documentation {@link https://geojson.org}).
      * Auxiliary data that accompanies geometries (the contents of the field properties) is bound to the map object and
      * can be fetched with the method getData() on that object. See H.map.Object#getData.
      * Note that you can load a GeoJSON file even from a different domain, if that domain supports Cross-Origin Resource Sharing.
      */
    @js.native
    trait Reader
      extends StObject
         with AbstractReader {
      
      /**
        * This method launches the parsing process on the provided data.
        * @param data {*=} A string or object containing the data to parse
        */
      def parseData(data: Any): Unit = js.native
    }
    object Reader {
      
      /**
        * This type encapsulates configuration (initialization) properties for a H.data.geojson.Reader.
        * @property style {Function=} - The optional URL of the data file.
        * @property disableLegacyMode {boolean=} - An object providing additional reader configuration parameters.
        */
      trait Options extends StObject {
        
        var disableLegacyMode: js.UndefOr[Boolean] = js.undefined
        
        var style: js.UndefOr[js.Function1[/* mapObject */ Object, Unit]] = js.undefined
      }
      object Options {
        
        inline def apply(): Options = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[Options]
        }
        
        extension [Self <: Options](x: Self) {
          
          inline def setDisableLegacyMode(value: Boolean): Self = StObject.set(x, "disableLegacyMode", value.asInstanceOf[js.Any])
          
          inline def setDisableLegacyModeUndefined: Self = StObject.set(x, "disableLegacyMode", js.undefined)
          
          inline def setStyle(value: /* mapObject */ Object => Unit): Self = StObject.set(x, "style", js.Any.fromFunction1(value))
          
          inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
        }
      }
    }
  }
}
