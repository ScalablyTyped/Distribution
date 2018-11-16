package typings
package heremapsLib.HNs.dataNs.AbstractReaderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
             * The event class for state events that are dispatched by AbstractReader
             */
@JSGlobal("H.data.AbstractReader.Event")
@js.native
class Event protected ()
  extends heremapsLib.HNs.utilNs.Event {
  /**
                   * Constructor
                   * @param target {(H.data.AbstractReader | H.map.Object)} - The target that's passed to event listeners
                   * @param type {string} - The type of the event
                   * @param state {H.data.AbstractReader.State} - The state of the target firing an event
                   * @param message {string} - The message associated with an event
                   */
  def this(target: heremapsLib.HNs.dataNs.AbstractReader, `type`: java.lang.String, state: State, message: java.lang.String) = this()
  /**
                   * Constructor
                   * @param target {(H.data.AbstractReader | H.map.Object)} - The target that's passed to event listeners
                   * @param type {string} - The type of the event
                   * @param state {H.data.AbstractReader.State} - The state of the target firing an event
                   * @param message {string} - The message associated with an event
                   */
  def this(target: heremapsLib.HNs.mapNs.Object, `type`: java.lang.String, state: State, message: java.lang.String) = this()
}

