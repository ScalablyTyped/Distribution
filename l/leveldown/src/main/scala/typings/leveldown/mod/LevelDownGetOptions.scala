package typings.leveldown.mod

import typings.abstractLeveldown.mod.AbstractGetOptions
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
    if (!js.isUndefined(asBuffer)) __obj.updateDynamic("asBuffer")(asBuffer.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fillCache)) __obj.updateDynamic("fillCache")(fillCache.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LevelDownGetOptions]
  }
}

