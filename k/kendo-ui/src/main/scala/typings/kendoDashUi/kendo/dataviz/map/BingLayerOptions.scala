package typings.kendoDashUi.kendo.dataviz.map

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BingLayerOptions extends js.Object {
  var baseUrl: js.UndefOr[String] = js.undefined
  var imagerySet: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
}

object BingLayerOptions {
  @scala.inline
  def apply(baseUrl: String = null, imagerySet: String = null, name: String = null): BingLayerOptions = {
    val __obj = js.Dynamic.literal()
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl.asInstanceOf[js.Any])
    if (imagerySet != null) __obj.updateDynamic("imagerySet")(imagerySet.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BingLayerOptions]
  }
}

