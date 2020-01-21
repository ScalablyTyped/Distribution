package typings.hexo.mod.Post

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderData extends js.Object {
  var content: js.UndefOr[String] = js.undefined
  var engine: js.UndefOr[String] = js.undefined
}

object RenderData {
  @scala.inline
  def apply(content: String = null, engine: String = null): RenderData = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (engine != null) __obj.updateDynamic("engine")(engine.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderData]
  }
}

