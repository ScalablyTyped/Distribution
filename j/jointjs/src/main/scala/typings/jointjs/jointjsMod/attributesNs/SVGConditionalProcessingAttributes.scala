package typings.jointjs.jointjsMod.attributesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGConditionalProcessingAttributes extends js.Object {
  var requiredExtensions: js.UndefOr[Boolean] = js.undefined
  var requiredFeatures: js.UndefOr[String] = js.undefined
  var systemLanguage: js.UndefOr[String] = js.undefined
}

object SVGConditionalProcessingAttributes {
  @scala.inline
  def apply(
    requiredExtensions: js.UndefOr[Boolean] = js.undefined,
    requiredFeatures: String = null,
    systemLanguage: String = null
  ): SVGConditionalProcessingAttributes = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(requiredExtensions)) __obj.updateDynamic("requiredExtensions")(requiredExtensions)
    if (requiredFeatures != null) __obj.updateDynamic("requiredFeatures")(requiredFeatures)
    if (systemLanguage != null) __obj.updateDynamic("systemLanguage")(systemLanguage)
    __obj.asInstanceOf[SVGConditionalProcessingAttributes]
  }
}

