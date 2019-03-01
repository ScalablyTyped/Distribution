package typings
package leafletDotPmLib.leafletMod.PMNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawOptions extends js.Object {
  var hintlineStyle: js.UndefOr[leafletLib.leafletMod.PathOptions] = js.undefined
  var pathOptions: js.UndefOr[leafletLib.leafletMod.PathOptions] = js.undefined
  var templineStyle: js.UndefOr[leafletLib.leafletMod.PathOptions] = js.undefined
}

object DrawOptions {
  @scala.inline
  def apply(
    hintlineStyle: leafletLib.leafletMod.PathOptions = null,
    pathOptions: leafletLib.leafletMod.PathOptions = null,
    templineStyle: leafletLib.leafletMod.PathOptions = null
  ): DrawOptions = {
    val __obj = js.Dynamic.literal()
    if (hintlineStyle != null) __obj.updateDynamic("hintlineStyle")(hintlineStyle)
    if (pathOptions != null) __obj.updateDynamic("pathOptions")(pathOptions)
    if (templineStyle != null) __obj.updateDynamic("templineStyle")(templineStyle)
    __obj.asInstanceOf[DrawOptions]
  }
}

