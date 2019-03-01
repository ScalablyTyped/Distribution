package typings
package leveldownLib.leveldownMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LevelDownPutOptions
  extends abstractDashLeveldownLib.abstractDashLeveldownMod.AbstractOptions {
  var sync: js.UndefOr[scala.Boolean] = js.undefined
}

object LevelDownPutOptions {
  @scala.inline
  def apply(sync: js.UndefOr[scala.Boolean] = js.undefined): LevelDownPutOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(sync)) __obj.updateDynamic("sync")(sync)
    __obj.asInstanceOf[LevelDownPutOptions]
  }
}

