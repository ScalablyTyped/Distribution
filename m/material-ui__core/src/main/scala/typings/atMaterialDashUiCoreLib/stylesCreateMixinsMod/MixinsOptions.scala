package typings
package atMaterialDashUiCoreLib.stylesCreateMixinsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@material-ui/core.@material-ui/core/styles/createMixins.Mixins> */
trait MixinsOptions extends js.Object {
  var gutters: js.UndefOr[js.Any] = js.undefined
  var toolbar: js.UndefOr[atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties] = js.undefined
}

object MixinsOptions {
  @scala.inline
  def apply(gutters: js.Any = null, toolbar: atMaterialDashUiCoreLib.stylesWithStylesMod.CSSProperties = null): MixinsOptions = {
    val __obj = js.Dynamic.literal()
    if (gutters != null) __obj.updateDynamic("gutters")(gutters)
    if (toolbar != null) __obj.updateDynamic("toolbar")(toolbar)
    __obj.asInstanceOf[MixinsOptions]
  }
}

