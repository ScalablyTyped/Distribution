package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapLayerDefaultsBing extends js.Object {
  var attribution: js.UndefOr[java.lang.String] = js.undefined
  var culture: js.UndefOr[java.lang.String] = js.undefined
  var imagerySet: js.UndefOr[java.lang.String] = js.undefined
  var key: js.UndefOr[java.lang.String] = js.undefined
  var opacity: js.UndefOr[scala.Double] = js.undefined
}

object MapLayerDefaultsBing {
  @scala.inline
  def apply(
    attribution: java.lang.String = null,
    culture: java.lang.String = null,
    imagerySet: java.lang.String = null,
    key: java.lang.String = null,
    opacity: scala.Int | scala.Double = null
  ): MapLayerDefaultsBing = {
    val __obj = js.Dynamic.literal()
    if (attribution != null) __obj.updateDynamic("attribution")(attribution)
    if (culture != null) __obj.updateDynamic("culture")(culture)
    if (imagerySet != null) __obj.updateDynamic("imagerySet")(imagerySet)
    if (key != null) __obj.updateDynamic("key")(key)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapLayerDefaultsBing]
  }
}

