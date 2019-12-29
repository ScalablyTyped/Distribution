package typings.atMaterialDashUiSystem.atMaterialDashUiSystemMod

import typings.atMaterialDashUiSystem.atMaterialDashUiSystemBooleans.`false`
import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleOptions[PropKey, Theme /* <: js.Object */] extends js.Object {
  var cssProperty: js.UndefOr[PropKey | String | `false`] = js.undefined
  var prop: PropKey
  /**
    * dot access in `Theme`
    */
  var themeKey: js.UndefOr[String] = js.undefined
  var transform: js.UndefOr[js.Function1[/* cssValue */ js.Any, Double | String | CSSProperties]] = js.undefined
}

object StyleOptions {
  @scala.inline
  def apply[PropKey, Theme /* <: js.Object */](
    prop: PropKey,
    cssProperty: PropKey | String | `false` = null,
    themeKey: String = null,
    transform: /* cssValue */ js.Any => Double | String | CSSProperties = null
  ): StyleOptions[PropKey, Theme] = {
    val __obj = js.Dynamic.literal(prop = prop.asInstanceOf[js.Any])
    if (cssProperty != null) __obj.updateDynamic("cssProperty")(cssProperty.asInstanceOf[js.Any])
    if (themeKey != null) __obj.updateDynamic("themeKey")(themeKey.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(js.Any.fromFunction1(transform))
    __obj.asInstanceOf[StyleOptions[PropKey, Theme]]
  }
}

