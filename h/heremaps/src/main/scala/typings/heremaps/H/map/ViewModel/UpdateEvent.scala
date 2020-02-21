package typings.heremaps.H.map.ViewModel

import typings.heremaps.H.util.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Update event is fired whenever view model data is changed. It contains property which hold currently requested data
  * @fixme find documentation and update constructor typings
  * @property target {*} - Object which triggered the event
  * @property currentTarget {*} - Object which has listener attached
  * @property type {string} - Name of the dispatched event
  * @property defaultPrevented {boolean} - Indicates if preventDefault was called on the current event
  */
@JSGlobal("H.map.ViewModel.UpdateEvent")
@js.native
class UpdateEvent protected () extends Event {
  /**
    * Constructor
    * @param requested {any}
    */
  def this(requested: js.Any) = this()
}

