package typings.leveldown.leveldownMod

import org.scalablytyped.runtime.StringDictionary
import typings.abstractDashLeveldown.abstractDashLeveldownMod.AbstractOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LevelDownBatchOptions extends AbstractOptions {
  var sync: js.UndefOr[Boolean] = js.undefined
}

object LevelDownBatchOptions {
  @scala.inline
  def apply(StringDictionary: StringDictionary[js.Any] = null, sync: js.UndefOr[Boolean] = js.undefined): LevelDownBatchOptions = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(sync)) __obj.updateDynamic("sync")(sync)
    __obj.asInstanceOf[LevelDownBatchOptions]
  }
}

