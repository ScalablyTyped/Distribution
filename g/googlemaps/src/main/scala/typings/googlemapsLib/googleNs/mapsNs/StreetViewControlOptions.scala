package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait StreetViewControlOptions extends js.Object {
  /**
       * Position id. Used to specify the position of the control on the map. The
       * default position is embedded within the navigation (zoom and pan)
       * controls. If this position is empty or the same as that specified in the
       * zoomControlOptions or panControlOptions, the Street View control will be
       * displayed as part of the navigation controls. Otherwise, it will be
       * displayed separately.
       */
  var position: js.UndefOr[ControlPosition] = js.undefined
}

