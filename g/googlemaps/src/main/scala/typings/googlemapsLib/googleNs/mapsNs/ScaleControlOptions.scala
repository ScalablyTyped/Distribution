package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Options for the rendering of the scale control. */
trait ScaleControlOptions extends js.Object {
  /** Style id. Used to select what style of scale control to display. */
  var style: js.UndefOr[ScaleControlStyle] = js.undefined
}

object ScaleControlOptions {
  @scala.inline
  def apply(style: ScaleControlStyle = null): ScaleControlOptions = {
    val __obj = js.Dynamic.literal()
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[ScaleControlOptions]
  }
}

