package typings
package levelupLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object levelupMod {
  type InferDBDel[DB] = LevelUpDel[js.Any, abstractDashLeveldownLib.abstractDashLeveldownMod.AbstractOptions | js.Any]
  type InferDBGet[DB] = LevelUpGet[
    js.Any, 
    js.Any, 
    abstractDashLeveldownLib.abstractDashLeveldownMod.AbstractGetOptions | js.Any
  ]
  type InferDBPut[DB] = LevelUpPut[
    js.Any, 
    js.Any, 
    abstractDashLeveldownLib.abstractDashLeveldownMod.AbstractOptions | js.Any
  ]
  type LevelUpBatch[K, O] = (js.Function2[
    /* key */ K, 
    /* callback */ abstractDashLeveldownLib.abstractDashLeveldownMod.ErrorCallback, 
    scala.Unit
  ]) with (js.Function3[
    /* key */ K, 
    /* options */ O, 
    /* callback */ abstractDashLeveldownLib.abstractDashLeveldownMod.ErrorCallback, 
    scala.Unit
  ]) with (js.Function2[/* key */ K, /* options */ js.UndefOr[O], js.Promise[scala.Unit]])
  type LevelUpDel[K, O] = (js.Function2[
    /* key */ K, 
    /* callback */ abstractDashLeveldownLib.abstractDashLeveldownMod.ErrorCallback, 
    scala.Unit
  ]) with (js.Function3[
    /* key */ K, 
    /* options */ O, 
    /* callback */ abstractDashLeveldownLib.abstractDashLeveldownMod.ErrorCallback, 
    scala.Unit
  ]) with (js.Function2[/* key */ K, /* options */ js.UndefOr[O], js.Promise[scala.Unit]])
  type LevelUpGet[K, V, O] = (js.Function2[
    /* key */ K, 
    /* callback */ abstractDashLeveldownLib.abstractDashLeveldownMod.ErrorValueCallback[V], 
    scala.Unit
  ]) with (js.Function3[
    /* key */ K, 
    /* options */ O, 
    /* callback */ abstractDashLeveldownLib.abstractDashLeveldownMod.ErrorValueCallback[V], 
    scala.Unit
  ]) with (js.Function2[/* key */ K, /* options */ js.UndefOr[O], js.Promise[V]])
  type LevelUpPut[K, V, O] = (js.Function3[
    /* key */ K, 
    /* value */ V, 
    /* callback */ abstractDashLeveldownLib.abstractDashLeveldownMod.ErrorCallback, 
    scala.Unit
  ]) with (js.Function4[
    /* key */ K, 
    /* value */ V, 
    /* options */ O, 
    /* callback */ abstractDashLeveldownLib.abstractDashLeveldownMod.ErrorCallback, 
    scala.Unit
  ]) with (js.Function3[/* key */ K, /* value */ V, /* options */ js.UndefOr[O], js.Promise[scala.Unit]])
}
