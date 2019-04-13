package typings
package griddleDashReactLib.griddleDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GriddleStyleConfig extends js.Object {
  var classNames: js.UndefOr[GriddleStyleElements[java.lang.String]] = js.undefined
  var icons: js.UndefOr[GriddleStyleElements[GriddleStyleIcons]] = js.undefined
  var styles: js.UndefOr[GriddleStyleElements[reactLib.reactMod.CSSProperties]] = js.undefined
}

object GriddleStyleConfig {
  @scala.inline
  def apply(
    classNames: GriddleStyleElements[java.lang.String] = null,
    icons: GriddleStyleElements[GriddleStyleIcons] = null,
    styles: GriddleStyleElements[reactLib.reactMod.CSSProperties] = null
  ): GriddleStyleConfig = {
    val __obj = js.Dynamic.literal()
    if (classNames != null) __obj.updateDynamic("classNames")(classNames)
    if (icons != null) __obj.updateDynamic("icons")(icons)
    if (styles != null) __obj.updateDynamic("styles")(styles)
    __obj.asInstanceOf[GriddleStyleConfig]
  }
}

