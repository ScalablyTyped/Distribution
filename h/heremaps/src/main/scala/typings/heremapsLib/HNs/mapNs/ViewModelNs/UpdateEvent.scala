package typings
package heremapsLib.HNs.mapNs.ViewModelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
             * Update event is fired whenever view model data is changed. It contains property which hold currently requested data
             * @property target {*} - Object which triggered the event
             * @property currentTarget {*} - Object which has listener attached
             * @property type {string} - Name of the dispatched event
             * @property defaultPrevented {boolean} - Indicates if preventDefault was called on the current event
             */
@JSGlobal("H.map.ViewModel.UpdateEvent")
@js.native
class UpdateEvent protected ()
  extends heremapsLib.HNs.utilNs.Event {
  /**
                   * Constructor
                   * @param requested {H.map.ViewModel.RequestedData}
                   */
  def this(requested: RequestedData) = this()
}

