package typings.kendoDashUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapControlsZoom extends js.Object {
  var position: js.UndefOr[String] = js.undefined
}

object MapControlsZoom {
  @scala.inline
  def apply(position: String = null): MapControlsZoom = {
    val __obj = js.Dynamic.literal()
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[MapControlsZoom]
  }
}

