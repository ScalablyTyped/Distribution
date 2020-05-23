package typings.materialUiStyles.anon

import typings.materialUiStyles.getThemePropsGetThemePropsMod.ThemeWithProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NameProps[Props, Name /* <: /* keyof any */ String */, Theme /* <: ThemeWithProps[_] */] extends js.Object {
  var name: Name
  var props: Props
  var theme: js.UndefOr[Theme] = js.undefined
}

object NameProps {
  @scala.inline
  def apply[Props, Name, Theme](name: Name, props: Props, theme: Theme = null): NameProps[Props, Name, Theme] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameProps[Props, Name, Theme]]
  }
}

