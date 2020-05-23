package typings.kefir.anon

import typings.kefir.mod.Stream_
import typings.kefir.mod.ValueOfAnObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallObssObssPCombinator extends js.Object {
  def apply[T /* <: js.Tuple8[
    typings.kefir.mod.Observable[_, _], 
    typings.kefir.mod.Observable[_, _], 
    typings.kefir.mod.Observable[_, _], 
    typings.kefir.mod.Observable[_, _], 
    typings.kefir.mod.Observable[_, _], 
    typings.kefir.mod.Observable[_, _], 
    typings.kefir.mod.Observable[_, _], 
    typings.kefir.mod.Observable[_, _]
  ] */](obss: T): Stream_[
    js.Tuple8[
      ValueOfAnObservable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any
      ], 
      ValueOfAnObservable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[1] */ js.Any
      ], 
      ValueOfAnObservable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[2] */ js.Any
      ], 
      ValueOfAnObservable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[3] */ js.Any
      ], 
      ValueOfAnObservable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[4] */ js.Any
      ], 
      ValueOfAnObservable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[5] */ js.Any
      ], 
      ValueOfAnObservable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[6] */ js.Any
      ], 
      ValueOfAnObservable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[7] */ js.Any
      ]
    ], 
    _
  ] = js.native
  def apply[T /* <: js.Array[typings.kefir.mod.Observable[_, _]] */, P /* <: js.Array[typings.kefir.mod.Observable[_, _]] */, K](
    obss: T,
    obssP: P,
    combinator: js.Function2[
      /* import warning: importer.ImportType#apply Failed type conversion: T[0][''] */ /* a */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: P[0][''] */ /* b */ js.Any, 
      K
    ]
  ): typings.kefir.mod.Observable[K, _] = js.native
  def apply[T, S, U](obss: js.Array[typings.kefir.mod.Observable[T, S]], combinator: js.Function1[/* repeated */ T, U]): Stream_[U, S] = js.native
  def apply[T, S, U](
    obss: js.Array[typings.kefir.mod.Observable[T, S]],
    passiveObss: js.Array[typings.kefir.mod.Observable[T, S]]
  ): Stream_[U, S] = js.native
  def apply[T, S, U](
    obss: js.Array[typings.kefir.mod.Observable[T, S]],
    passiveObss: js.Array[typings.kefir.mod.Observable[T, S]],
    combinator: js.Function1[/* repeated */ T, U]
  ): Stream_[U, S] = js.native
}

