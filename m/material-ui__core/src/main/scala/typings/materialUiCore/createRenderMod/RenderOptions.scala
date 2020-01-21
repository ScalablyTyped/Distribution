package typings.materialUiCore.createRenderMod

import typings.materialUiCore.FnNodeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderOptions extends js.Object {
  var render: FnNodeOptions = js.native
}

object RenderOptions {
  @scala.inline
  def apply(render: FnNodeOptions): RenderOptions = {
    val __obj = js.Dynamic.literal(render = render.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RenderOptions]
  }
}

