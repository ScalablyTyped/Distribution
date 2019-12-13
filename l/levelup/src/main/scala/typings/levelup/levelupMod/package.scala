package typings.levelup

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object levelupMod {
  import typings.abstractDashLeveldown.abstractDashLeveldownMod.AbstractGetOptions
  import typings.abstractDashLeveldown.abstractDashLeveldownMod.AbstractOptions
  import typings.abstractDashLeveldown.abstractDashLeveldownMod.ErrorCallback
  import typings.abstractDashLeveldown.abstractDashLeveldownMod.ErrorValueCallback

  type InferDBClear[DB] = LevelUpClear[AbstractClearOptions[js.Any] | js.Any]
  type InferDBDel[DB] = LevelUpDel[js.Any, AbstractOptions | js.Any]
  type InferDBGet[DB] = LevelUpGet[js.Any, js.Any, AbstractGetOptions | js.Any]
  type InferDBPut[DB] = LevelUpPut[js.Any, js.Any, AbstractOptions | js.Any]
  type LevelUpBatch[K, O] = (js.Function2[/* key */ K, /* callback */ ErrorCallback, Unit]) with (js.Function3[/* key */ K, /* options */ O, /* callback */ ErrorCallback, Unit]) with (js.Function2[/* key */ K, /* options */ js.UndefOr[O], js.Promise[Unit]])
  type LevelUpClear[O] = (js.Function1[/* callback */ ErrorCallback, Unit]) with (js.Function2[/* options */ O, /* callback */ ErrorCallback, Unit]) with (js.Function1[/* options */ js.UndefOr[O], js.Promise[Unit]])
  type LevelUpDel[K, O] = (js.Function2[/* key */ K, /* callback */ ErrorCallback, Unit]) with (js.Function3[/* key */ K, /* options */ O, /* callback */ ErrorCallback, Unit]) with (js.Function2[/* key */ K, /* options */ js.UndefOr[O], js.Promise[Unit]])
  type LevelUpGet[K, V, O] = (js.Function2[/* key */ K, /* callback */ ErrorValueCallback[V], Unit]) with (js.Function3[/* key */ K, /* options */ O, /* callback */ ErrorValueCallback[V], Unit]) with (js.Function2[/* key */ K, /* options */ js.UndefOr[O], js.Promise[V]])
  type LevelUpPut[K, V, O] = (js.Function3[/* key */ K, /* value */ V, /* callback */ ErrorCallback, Unit]) with (js.Function4[/* key */ K, /* value */ V, /* options */ O, /* callback */ ErrorCallback, Unit]) with (js.Function3[/* key */ K, /* value */ V, /* options */ js.UndefOr[O], js.Promise[Unit]])
}
