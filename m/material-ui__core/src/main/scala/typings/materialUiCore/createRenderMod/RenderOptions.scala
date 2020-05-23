package typings.materialUiCore.createRenderMod

import typings.materialUiCore.anon.Fn0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderOptions extends js.Object {
  var render: Fn0 = js.native
}

object RenderOptions {
  @scala.inline
  def apply(render: Fn0): RenderOptions = {
    val __obj = js.Dynamic.literal(render = render.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderOptions]
  }
}

