package typings
package atMaterialDashUiCoreLib.stylesWithStylesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof jss.Anon_ClassNamePrefix<ClassKey> ]:? jss.Anon_ClassNamePrefix<ClassKey>[P]} */ trait WithStylesOptions[ClassKey /* <: java.lang.String */] extends js.Object {
  var flip: js.UndefOr[scala.Boolean] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var withTheme: js.UndefOr[scala.Boolean] = js.undefined
}

object WithStylesOptions {
  @scala.inline
  def apply[ClassKey /* <: java.lang.String */](
    flip: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    withTheme: js.UndefOr[scala.Boolean] = js.undefined
  ): WithStylesOptions[ClassKey] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(flip)) __obj.updateDynamic("flip")(flip)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(withTheme)) __obj.updateDynamic("withTheme")(withTheme)
    __obj.asInstanceOf[WithStylesOptions[ClassKey]]
  }
}

