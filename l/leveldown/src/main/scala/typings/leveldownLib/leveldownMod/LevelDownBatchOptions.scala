package typings
package leveldownLib.leveldownMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LevelDownBatchOptions
  extends abstractDashLeveldownLib.abstractDashLeveldownMod.AbstractOptions {
  var sync: js.UndefOr[scala.Boolean] = js.undefined
}

object LevelDownBatchOptions {
  @scala.inline
  def apply(sync: js.UndefOr[scala.Boolean] = js.undefined): LevelDownBatchOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(sync)) __obj.updateDynamic("sync")(sync)
    __obj.asInstanceOf[LevelDownBatchOptions]
  }
}

