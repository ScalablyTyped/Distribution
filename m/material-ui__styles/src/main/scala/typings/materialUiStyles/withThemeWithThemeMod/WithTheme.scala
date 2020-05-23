package typings.materialUiStyles.withThemeWithThemeMod

import typings.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WithTheme[Theme] extends js.Object {
  /**
    * Deprecated. Will be removed in v5. Refs are now automatically forwarded to
    * the inner component.
    * @deprecated since version 4.0
    */
  var innerRef: js.UndefOr[Ref[_]] = js.undefined
  var theme: Theme
}

object WithTheme {
  @scala.inline
  def apply[Theme](theme: Theme, innerRef: js.UndefOr[Null | Ref[_]] = js.undefined): WithTheme[Theme] = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    if (!js.isUndefined(innerRef)) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithTheme[Theme]]
  }
}

