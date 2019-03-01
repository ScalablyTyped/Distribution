package typings
package hexoLib.hexoMod.HexoNs.PostNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderData extends js.Object {
  var content: js.UndefOr[java.lang.String] = js.undefined
  var engine: js.UndefOr[java.lang.String] = js.undefined
}

object RenderData {
  @scala.inline
  def apply(content: java.lang.String = null, engine: java.lang.String = null): RenderData = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content)
    if (engine != null) __obj.updateDynamic("engine")(engine)
    __obj.asInstanceOf[RenderData]
  }
}

