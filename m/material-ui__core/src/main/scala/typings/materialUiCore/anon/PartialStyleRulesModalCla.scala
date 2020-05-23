package typings.materialUiCore.anon

import typings.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/Modal.ModalClassKey>> */
@js.native
trait PartialStyleRulesModalCla extends js.Object {
  var hidden: js.UndefOr[CSSProperties] = js.native
  var root: js.UndefOr[CSSProperties] = js.native
}

object PartialStyleRulesModalCla {
  @scala.inline
  def apply(hidden: CSSProperties = null, root: CSSProperties = null): PartialStyleRulesModalCla = {
    val __obj = js.Dynamic.literal()
    if (hidden != null) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialStyleRulesModalCla]
  }
}

