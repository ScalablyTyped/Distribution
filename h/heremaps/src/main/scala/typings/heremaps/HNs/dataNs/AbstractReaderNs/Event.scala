package typings.heremaps.HNs.dataNs.AbstractReaderNs

import typings.heremaps.HNs.dataNs.AbstractReader
import typings.heremaps.HNs.mapNs.Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The event class for state events that are dispatched by AbstractReader
  */
@JSGlobal("H.data.AbstractReader.Event")
@js.native
class Event protected ()
  extends typings.heremaps.HNs.utilNs.Event {
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

