package typings.levelup

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type InferDBClear[DB] = typings.levelup.mod.LevelUpClear[typings.levelup.mod.AbstractClearOptions[js.Any] | js.Any]
  type InferDBDel[DB] = typings.levelup.mod.LevelUpDel[js.Any, typings.abstractLeveldown.mod.AbstractOptions | js.Any]
  type InferDBGet[DB] = typings.levelup.mod.LevelUpGet[js.Any, js.Any, typings.abstractLeveldown.mod.AbstractGetOptions | js.Any]
  type InferDBPut[DB] = typings.levelup.mod.LevelUpPut[js.Any, js.Any, typings.abstractLeveldown.mod.AbstractOptions | js.Any]
  type LevelUpBatch[K, O] = (js.Function2[/* key */ K, /* callback */ typings.abstractLeveldown.mod.ErrorCallback, scala.Unit]) with (js.Function3[
    /* key */ K, 
    /* options */ O, 
    /* callback */ typings.abstractLeveldown.mod.ErrorCallback, 
    scala.Unit
  ]) with (js.Function2[/* key */ K, /* options */ js.UndefOr[O], js.Promise[scala.Unit]])
  type LevelUpClear[O] = (js.Function1[/* callback */ typings.abstractLeveldown.mod.ErrorCallback, scala.Unit]) with (js.Function2[
    /* options */ O, 
    /* callback */ typings.abstractLeveldown.mod.ErrorCallback, 
    scala.Unit
  ]) with (js.Function1[/* options */ js.UndefOr[O], js.Promise[scala.Unit]])
  type LevelUpDel[K, O] = (js.Function2[/* key */ K, /* callback */ typings.abstractLeveldown.mod.ErrorCallback, scala.Unit]) with (js.Function3[
    /* key */ K, 
    /* options */ O, 
    /* callback */ typings.abstractLeveldown.mod.ErrorCallback, 
    scala.Unit
  ]) with (js.Function2[/* key */ K, /* options */ js.UndefOr[O], js.Promise[scala.Unit]])
  type LevelUpGet[K, V, O] = (js.Function2[
    /* key */ K, 
    /* callback */ typings.abstractLeveldown.mod.ErrorValueCallback[V], 
    scala.Unit
  ]) with (js.Function3[
    /* key */ K, 
    /* options */ O, 
    /* callback */ typings.abstractLeveldown.mod.ErrorValueCallback[V], 
    scala.Unit
  ]) with (js.Function2[/* key */ K, /* options */ js.UndefOr[O], js.Promise[V]])
  type LevelUpPut[K, V, O] = (js.Function3[
    /* key */ K, 
    /* value */ V, 
    /* callback */ typings.abstractLeveldown.mod.ErrorCallback, 
    scala.Unit
  ]) with (js.Function4[
    /* key */ K, 
    /* value */ V, 
    /* options */ O, 
    /* callback */ typings.abstractLeveldown.mod.ErrorCallback, 
    scala.Unit
  ]) with (js.Function3[/* key */ K, /* value */ V, /* options */ js.UndefOr[O], js.Promise[scala.Unit]])
}
