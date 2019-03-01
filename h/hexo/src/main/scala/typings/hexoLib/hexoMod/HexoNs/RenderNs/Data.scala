package typings
package hexoLib.hexoMod.HexoNs.RenderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  var engine: js.UndefOr[java.lang.String] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object Data {
  @scala.inline
  def apply(engine: java.lang.String = null, path: java.lang.String = null, text: java.lang.String = null): Data = {
    val __obj = js.Dynamic.literal()
    if (engine != null) __obj.updateDynamic("engine")(engine)
    if (path != null) __obj.updateDynamic("path")(path)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Data]
  }
}

