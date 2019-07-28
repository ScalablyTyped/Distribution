package typings.levelDashSublevel

import typings.abstractDashLeveldown.abstractDashLeveldownMod.AbstractIterator
import typings.abstractDashLeveldown.abstractDashLeveldownMod.AbstractLevelDOWN
import typings.levelup.levelupMod.LevelUp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object levelDashSublevelMod {
  type Constructor = js.Function1[
    /* levelup */ LevelUp[AbstractLevelDOWN[js.Any, js.Any], AbstractIterator[js.Any, js.Any]], 
    Sublevel
  ]
  type Hook = js.Function2[/* ch */ js.Any, /* add */ js.Function1[/* op */ Batch | Boolean, Unit], Unit]
}
