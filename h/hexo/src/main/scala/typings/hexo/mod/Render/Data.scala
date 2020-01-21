package typings.hexo.mod.Render

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  var engine: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object Data {
  @scala.inline
  def apply(engine: String = null, path: String = null, text: String = null): Data = {
    val __obj = js.Dynamic.literal()
    if (engine != null) __obj.updateDynamic("engine")(engine.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
}

