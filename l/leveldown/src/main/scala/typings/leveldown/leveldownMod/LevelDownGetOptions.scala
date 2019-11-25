package typings.leveldown.leveldownMod

import typings.abstractDashLeveldown.abstractDashLeveldownMod.AbstractGetOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LevelDownGetOptions extends AbstractGetOptions {
  var fillCache: js.UndefOr[Boolean] = js.undefined
}

object LevelDownGetOptions {
  @scala.inline
  def apply(asBuffer: js.UndefOr[Boolean] = js.undefined, fillCache: js.UndefOr[Boolean] = js.undefined): LevelDownGetOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(asBuffer)) __obj.updateDynamic("asBuffer")(asBuffer.asInstanceOf[js.Any])
    if (!js.isUndefined(fillCache)) __obj.updateDynamic("fillCache")(fillCache.asInstanceOf[js.Any])
    __obj.asInstanceOf[LevelDownGetOptions]
  }
}

