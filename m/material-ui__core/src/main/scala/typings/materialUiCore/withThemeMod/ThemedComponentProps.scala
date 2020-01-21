package typings.materialUiCore.withThemeMod

import typings.materialUiCore.createMuiThemeMod.Theme
import typings.react.mod.Ref
import typings.react.mod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@material-ui/core.@material-ui/core/styles/withTheme.WithTheme> */
@js.native
trait ThemedComponentProps extends js.Object {
  var innerRef: js.UndefOr[Ref[_] | RefObject[_]] = js.native
  var theme: js.UndefOr[Theme] = js.native
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

