package typings
package kendoDashUiLib.kendoNs.datavizNs.mapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BingLayerOptions extends js.Object {
  var baseUrl: js.UndefOr[java.lang.String] = js.undefined
  var imagerySet: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object BingLayerOptions {
  @scala.inline
  def apply(
    baseUrl: java.lang.String = null,
    imagerySet: java.lang.String = null,
    name: java.lang.String = null
  ): BingLayerOptions = {
    val __obj = js.Dynamic.literal()
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl)
    if (imagerySet != null) __obj.updateDynamic("imagerySet")(imagerySet)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[BingLayerOptions]
  }
}

