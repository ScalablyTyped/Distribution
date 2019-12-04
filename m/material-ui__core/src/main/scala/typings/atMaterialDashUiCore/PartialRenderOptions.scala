package typings.atMaterialDashUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/test-utils/createRender.RenderOptions> */
trait PartialRenderOptions extends js.Object {
  var render: js.UndefOr[Fn_NodeOptions] = js.undefined
}

object PartialRenderOptions {
  @scala.inline
  def apply(render: Fn_NodeOptions = null): PartialRenderOptions = {
    val __obj = js.Dynamic.literal()
    if (render != null) __obj.updateDynamic("render")(render.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialRenderOptions]
  }
}

