package typings
package levelDashSublevelLib.levelDashSublevelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sublevelNs {
  type Constructor = js.Function1[
    /* levelup */ levelupLib.levelupMod.LevelUp[
      abstractDashLeveldownLib.abstractDashLeveldownMod.AbstractLevelDOWN[js.Any, js.Any]
    ], 
    Sublevel
  ]
  type Hook = js.Function2[
    /* ch */ js.Any, 
    /* add */ js.Function1[/* op */ Batch | scala.Boolean, scala.Unit], 
    scala.Unit
  ]
}
