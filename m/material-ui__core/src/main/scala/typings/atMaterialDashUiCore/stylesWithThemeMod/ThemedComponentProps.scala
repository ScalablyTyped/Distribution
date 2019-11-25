package typings.atMaterialDashUiCore.stylesWithThemeMod

import typings.atMaterialDashUiCore.stylesCreateMuiThemeMod.Theme
import typings.react.reactMod.Ref
import typings.react.reactMod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@material-ui/core.@material-ui/core/styles/withTheme.WithTheme> */
trait ThemedComponentProps extends js.Object {
  var innerRef: js.UndefOr[Ref[_] | RefObject[_]] = js.undefined
  var theme: js.UndefOr[Theme] = js.undefined
}

object ThemedComponentProps {
  @scala.inline
  def apply(innerRef: Ref[_] | RefObject[_] = null, theme: Theme = null): ThemedComponentProps = {
    val __obj = js.Dynamic.literal()
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemedComponentProps]
  }
}

