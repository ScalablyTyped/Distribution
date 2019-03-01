package typings
package jointjsLib.jointjsMod.attributesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGConditionalProcessingAttributes extends js.Object {
  var requiredExtensions: js.UndefOr[scala.Boolean] = js.undefined
  var requiredFeatures: js.UndefOr[java.lang.String] = js.undefined
  var systemLanguage: js.UndefOr[java.lang.String] = js.undefined
}

object SVGConditionalProcessingAttributes {
  @scala.inline
  def apply(
    requiredExtensions: js.UndefOr[scala.Boolean] = js.undefined,
    requiredFeatures: java.lang.String = null,
    systemLanguage: java.lang.String = null
  ): SVGConditionalProcessingAttributes = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(requiredExtensions)) __obj.updateDynamic("requiredExtensions")(requiredExtensions)
    if (requiredFeatures != null) __obj.updateDynamic("requiredFeatures")(requiredFeatures)
    if (systemLanguage != null) __obj.updateDynamic("systemLanguage")(systemLanguage)
    __obj.asInstanceOf[SVGConditionalProcessingAttributes]
  }
}

