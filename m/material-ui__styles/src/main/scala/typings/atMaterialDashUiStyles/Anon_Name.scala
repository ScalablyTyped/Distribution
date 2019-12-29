package typings.atMaterialDashUiStyles

import typings.atMaterialDashUiStyles.getThemePropsGetThemePropsMod.ThemeWithProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name[Props, Name /* <: String */, Theme /* <: ThemeWithProps[_] */] extends js.Object {
  var name: Name
  var props: Props
  var theme: js.UndefOr[Theme] = js.undefined
}

object Anon_Name {
  @scala.inline
  def apply[Props, Name /* <: String */, Theme /* <: ThemeWithProps[_] */](name: Name, props: Props, theme: Theme = null): Anon_Name[Props, Name, Theme] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Name[Props, Name, Theme]]
  }
}

