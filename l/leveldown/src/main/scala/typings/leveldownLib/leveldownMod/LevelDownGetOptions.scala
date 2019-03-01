package typings
package leveldownLib.leveldownMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LevelDownGetOptions
  extends abstractDashLeveldownLib.abstractDashLeveldownMod.AbstractGetOptions {
  var fillCache: js.UndefOr[scala.Boolean] = js.undefined
}

object LevelDownGetOptions {
  @scala.inline
  def apply(
    asBuffer: js.UndefOr[scala.Boolean] = js.undefined,
    fillCache: js.UndefOr[scala.Boolean] = js.undefined
  ): LevelDownGetOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(asBuffer)) __obj.updateDynamic("asBuffer")(asBuffer)
    if (!js.isUndefined(fillCache)) __obj.updateDynamic("fillCache")(fillCache)
    __obj.asInstanceOf[LevelDownGetOptions]
  }
}

