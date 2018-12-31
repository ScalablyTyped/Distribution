package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object levelupLib {
  type InferDBDel[DB] = LevelUpDel[
    js.Any, 
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify AbstractOptions */ js.Any
  ]
  type InferDBGet[DB] = LevelUpGet[
    js.Any, 
    js.Any, 
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify AbstractGetOptions */ js.Any
  ]
  type InferDBPut[DB] = LevelUpPut[
    js.Any, 
    js.Any, 
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify AbstractOptions */ js.Any
  ]
  type LevelUpBatch[K, O] = (js.Function2[
    /* key */ K, 
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify ErrorCallback */ /* callback */ js.Any, 
    scala.Unit
  ]) with (js.Function3[
    /* key */ K, 
    /* options */ O, 
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify ErrorCallback */ /* callback */ js.Any, 
    scala.Unit
  ]) with (js.Function2[/* key */ K, /* options */ js.UndefOr[O], js.Promise[scala.Unit]])
  type LevelUpDel[K, O] = (js.Function2[
    /* key */ K, 
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify ErrorCallback */ /* callback */ js.Any, 
    scala.Unit
  ]) with (js.Function3[
    /* key */ K, 
    /* options */ O, 
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify ErrorCallback */ /* callback */ js.Any, 
    scala.Unit
  ]) with (js.Function2[/* key */ K, /* options */ js.UndefOr[O], js.Promise[scala.Unit]])
  type LevelUpGet[K, V, O] = (js.Function2[
    /* key */ K, 
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify ErrorValueCallback<V> */ /* callback */ js.Any, 
    scala.Unit
  ]) with (js.Function3[
    /* key */ K, 
    /* options */ O, 
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify ErrorValueCallback<V> */ /* callback */ js.Any, 
    scala.Unit
  ]) with (js.Function2[/* key */ K, /* options */ js.UndefOr[O], js.Promise[V]])
  type LevelUpPut[K, V, O] = (js.Function3[
    /* key */ K, 
    /* value */ V, 
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify ErrorCallback */ /* callback */ js.Any, 
    scala.Unit
  ]) with (js.Function4[
    /* key */ K, 
    /* value */ V, 
    /* options */ O, 
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify ErrorCallback */ /* callback */ js.Any, 
    scala.Unit
  ]) with (js.Function3[/* key */ K, /* value */ V, /* options */ js.UndefOr[O], js.Promise[scala.Unit]])
}
