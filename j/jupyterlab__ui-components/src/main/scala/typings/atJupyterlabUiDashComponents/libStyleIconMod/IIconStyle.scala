package typings.atJupyterlabUiDashComponents.libStyleIconMod

import typings.typestyle.libTypesMod.NestedCSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IIconStyle extends NestedCSSProperties {
  /**
    * center the icon svg in its container
    */
  var center: js.UndefOr[Boolean] = js.undefined
  /**
    * the kind of the icon, associated with a default stylesheet
    */
  var kind: js.UndefOr[IconKindType] = js.undefined
}

object IIconStyle {
  @scala.inline
  def apply(
    NestedCSSProperties: NestedCSSProperties = null,
    center: js.UndefOr[Boolean] = js.undefined,
    kind: IconKindType = null
  ): IIconStyle = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, NestedCSSProperties)
    if (!js.isUndefined(center)) __obj.updateDynamic("center")(center)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[IIconStyle]
  }
}

