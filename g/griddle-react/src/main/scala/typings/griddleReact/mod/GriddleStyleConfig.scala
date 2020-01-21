package typings.griddleReact.mod

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GriddleStyleConfig extends js.Object {
  var classNames: js.UndefOr[GriddleStyleElements[String]] = js.undefined
  var icons: js.UndefOr[GriddleStyleElements[GriddleStyleIcons]] = js.undefined
  var styles: js.UndefOr[GriddleStyleElements[CSSProperties]] = js.undefined
}

object GriddleStyleConfig {
  @scala.inline
  def apply(
    classNames: GriddleStyleElements[String] = null,
    icons: GriddleStyleElements[GriddleStyleIcons] = null,
    styles: GriddleStyleElements[CSSProperties] = null
  ): GriddleStyleConfig = {
    val __obj = js.Dynamic.literal()
    if (classNames != null) __obj.updateDynamic("classNames")(classNames.asInstanceOf[js.Any])
    if (icons != null) __obj.updateDynamic("icons")(icons.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[GriddleStyleConfig]
  }
}

