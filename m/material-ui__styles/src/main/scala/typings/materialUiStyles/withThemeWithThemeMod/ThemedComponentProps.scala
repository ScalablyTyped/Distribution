package typings.materialUiStyles.withThemeWithThemeMod

import typings.materialUiStyles.defaultThemeMod.DefaultTheme
import typings.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@material-ui/styles.@material-ui/styles/withTheme/withTheme.WithTheme<@material-ui/styles.@material-ui/styles/defaultTheme.DefaultTheme>> */
trait ThemedComponentProps extends js.Object {
  var innerRef: js.UndefOr[Ref[_]] = js.undefined
  var ref: js.UndefOr[Ref[_]] = js.undefined
  var theme: js.UndefOr[DefaultTheme] = js.undefined
}

object ThemedComponentProps {
  @scala.inline
  def apply(
    innerRef: js.UndefOr[Null | Ref[_]] = js.undefined,
    ref: js.UndefOr[Null | Ref[_]] = js.undefined,
    theme: DefaultTheme = null
  ): ThemedComponentProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(innerRef)) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (!js.isUndefined(ref)) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemedComponentProps]
  }
}

