package typings.levelSublevel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Constructor = js.Function1[
    /* levelup */ typings.levelup.mod.LevelUp[
      typings.abstractLeveldown.mod.AbstractLevelDOWN[js.Any, js.Any], 
      typings.abstractLeveldown.mod.AbstractIterator[js.Any, js.Any]
    ], 
    typings.levelSublevel.mod.Sublevel
  ]
  type Hook = js.Function2[
    /* ch */ js.Any, 
    /* add */ js.Function1[/* op */ typings.levelSublevel.mod.Batch | scala.Boolean, scala.Unit], 
    scala.Unit
  ]
}
