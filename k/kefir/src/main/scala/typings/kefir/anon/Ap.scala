package typings.kefir.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ap extends js.Object {
  def ap[A, B, E1, E2](
    obsF: typings.kefir.mod.Observable[js.Function1[/* x */ A, B], E1],
    obsV: typings.kefir.mod.Observable[A, E2]
  ): typings.kefir.mod.Observable[B, E1 | E2]
  def bimap[V1, E1, V2, E2](
    fnE: js.Function1[/* x */ E1, E2],
    fnV: js.Function1[/* x */ V1, V2],
    obs: typings.kefir.mod.Observable[V1, E1]
  ): typings.kefir.mod.Observable[V2, E2]
  def chain[V, V2, E, E2](
    cb: js.Function1[/* value */ V, typings.kefir.mod.Observable[V2, E2]],
    s: typings.kefir.mod.Observable[V, E]
  ): typings.kefir.mod.Observable[V2, E | E2]
  def concat[V1, E1, V2, E2](obs1: typings.kefir.mod.Observable[V1, E1], obs2: typings.kefir.mod.Observable[V2, E2]): typings.kefir.mod.Observable[V1 | V2, E1 | E2]
  def empty(): typings.kefir.mod.Observable[scala.Nothing, scala.Nothing]
  def map[V, V2, E](cb: js.Function1[/* value */ V, V2], s: typings.kefir.mod.Observable[V, E]): typings.kefir.mod.Observable[V2, E]
  def of[V](value: V): typings.kefir.mod.Observable[V, scala.Nothing]
}

object Ap {
  @scala.inline
  def apply(
    ap: (typings.kefir.mod.Observable[js.Function1[js.Any, js.Any], js.Any], typings.kefir.mod.Observable[js.Any, js.Any]) => typings.kefir.mod.Observable[js.Any, js.Any | js.Any],
    bimap: (js.Function1[js.Any, js.Any], js.Function1[js.Any, js.Any], typings.kefir.mod.Observable[js.Any, js.Any]) => typings.kefir.mod.Observable[js.Any, js.Any],
    chain: (js.Function1[js.Any, typings.kefir.mod.Observable[js.Any, js.Any]], typings.kefir.mod.Observable[js.Any, js.Any]) => typings.kefir.mod.Observable[js.Any, js.Any | js.Any],
    concat: (typings.kefir.mod.Observable[js.Any, js.Any], typings.kefir.mod.Observable[js.Any, js.Any]) => typings.kefir.mod.Observable[js.Any | js.Any, js.Any | js.Any],
    empty: () => typings.kefir.mod.Observable[scala.Nothing, scala.Nothing],
    map: (js.Function1[js.Any, js.Any], typings.kefir.mod.Observable[js.Any, js.Any]) => typings.kefir.mod.Observable[js.Any, js.Any],
    of: js.Any => typings.kefir.mod.Observable[js.Any, scala.Nothing]
  ): Ap = {
    val __obj = js.Dynamic.literal(ap = js.Any.fromFunction2(ap), bimap = js.Any.fromFunction3(bimap), chain = js.Any.fromFunction2(chain), concat = js.Any.fromFunction2(concat), empty = js.Any.fromFunction0(empty), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
    __obj.asInstanceOf[Ap]
  }
}

