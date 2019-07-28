package typings.heremaps.HNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This event indicates a change. It contains the old and the new value.
  * @property target {*} - Object which triggered the event
  * @property currentTarget {*} - Object which has listener attached
  * @property type {string} - Name of the dispatched event
  * @property defaultPrevented {boolean} - Indicates if preventDefault was called on the current event
  */
@JSGlobal("H.util.ChangeEvent")
@js.native
class ChangeEvent protected () extends Event {
  /**
    * Constructor
    * @param type {string} - The type of the event
    * @param newValue {*} - The new value of the property
    * @param oldValue {*} - The previous value of the property
    */
  def this(`type`: String, newValue: js.Any, oldValue: js.Any) = this()
}

