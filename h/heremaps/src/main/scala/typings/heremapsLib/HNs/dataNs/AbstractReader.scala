package typings
package heremapsLib.HNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  extends heremapsLib.HNs.utilNs.EventTarget {
  def this(opt_url: java.lang.String) = this()
  /**
    * Method returns H.map.layer.ObjectLayer that contains parsed data, and can be added directly to the map. It returns new instance of the class with every invocation.
    * If data hasn't been parsed it will return H.map.layer.ObjectLayer that contains partial information, and reader will add new parsed objects to the layer's provider later on.
    * @returns {H.map.layer.ObjectLayer}
    */
  def getLayer(): heremapsLib.HNs.mapNs.layerNs.ObjectLayer = js.native
  /**
    * Method returns collection of currently parsed, and converted to H.map.Object data objects. Method returns only currently parsed objects if parsing is ongoing.
    * @returns {Array<H.map.Object>}
    */
  def getParsedObjects(): js.Array[heremapsLib.HNs.mapNs.Object] = js.native
  /**
    * Returns the reader's processing state for possible states see H.data.AbstractReader.State
    * @returns {H.data.AbstractReader.State}
    */
  def getState(): heremapsLib.HNs.dataNs.AbstractReaderNs.State = js.native
  /**
    * Returns URL of the current file, which is either in process of fetching/parsing or file that has been already parsed.
    * @returns {(string | undefined)} - url
    */
  def getUrl(): java.lang.String | scala.Unit = js.native
  /**
    * Method launches parsing of the data file at the current url (see H.data.AbstractReader#setUrl or H.data.AbstractReader).
    * Method uses XHR as a transport therefore same origin policy applies, or server should respond with proper CORS headers.
    */
  def parse(): scala.Unit = js.native
  /**
    * Method sets reader's URL. Method resets current Reader's state to its initial values (clears data about last parsed objects, etc.), and throws
    * InvalidState exception if Reader's state is not READY or ERROR.
    * @param url {string} - The new URL
    * @returns {H.data.AbstractReader}
    */
  def setUrl(url: java.lang.String): AbstractReader = js.native
}

