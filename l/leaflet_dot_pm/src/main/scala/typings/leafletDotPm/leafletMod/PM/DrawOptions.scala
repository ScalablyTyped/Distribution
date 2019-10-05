package typings.leafletDotPm.leafletMod.PM

import typings.leaflet.leafletMod.PathOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawOptions extends js.Object {
  var hintlineStyle: js.UndefOr[PathOptions] = js.undefined
  var pathOptions: js.UndefOr[PathOptions] = js.undefined
  var templineStyle: js.UndefOr[PathOptions] = js.undefined
}

object DrawOptions {
  @scala.inline
  def apply(
    hintlineStyle: PathOptions = null,
    pathOptions: PathOptions = null,
    templineStyle: PathOptions = null
  ): DrawOptions = {
    val __obj = js.Dynamic.literal()
    if (hintlineStyle != null) __obj.updateDynamic("hintlineStyle")(hintlineStyle)
    if (pathOptions != null) __obj.updateDynamic("pathOptions")(pathOptions)
    if (templineStyle != null) __obj.updateDynamic("templineStyle")(templineStyle)
    __obj.asInstanceOf[DrawOptions]
  }
}

