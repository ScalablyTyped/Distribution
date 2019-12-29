package typings.atMaterialDashUiStyles.getThemePropsGetThemePropsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeWithProps[Components] extends js.Object {
  var props: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Components ]: std.Partial<Components[K]>}
    */ typings.atMaterialDashUiStyles.atMaterialDashUiStylesStrings.ThemeWithProps with Components
  ] = js.undefined
}

object ThemeWithProps {
  @scala.inline
  def apply[Components](
    props: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Components ]: std.Partial<Components[K]>}
    */ typings.atMaterialDashUiStyles.atMaterialDashUiStylesStrings.ThemeWithProps with Components = null
  ): ThemeWithProps[Components] = {
    val __obj = js.Dynamic.literal()
    if (props != null) __obj.updateDynamic("props")(props.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeWithProps[Components]]
  }
}

