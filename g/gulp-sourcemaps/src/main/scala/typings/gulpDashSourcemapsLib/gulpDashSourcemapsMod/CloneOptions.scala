package typings
package gulpDashSourcemapsLib.gulpDashSourcemapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloneOptions extends js.Object {
  var contents: js.UndefOr[scala.Boolean] = js.undefined
  var deep: js.UndefOr[scala.Boolean] = js.undefined
}

object CloneOptions {
  @scala.inline
  def apply(contents: js.UndefOr[scala.Boolean] = js.undefined, deep: js.UndefOr[scala.Boolean] = js.undefined): CloneOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(contents)) __obj.updateDynamic("contents")(contents)
    if (!js.isUndefined(deep)) __obj.updateDynamic("deep")(deep)
    __obj.asInstanceOf[CloneOptions]
  }
}

