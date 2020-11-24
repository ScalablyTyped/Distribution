package typings.kefir.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.kefir.mod.Stream_
import typings.kefir.mod.ValueOfAnObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallObssObssPCombinator extends js.Object {
  
  def apply[T /* <: js.Array[typings.kefir.mod.Observable[_, _]] */](obss: T): Stream_[
    js.Array[
      ValueOfAnObservable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any
      ]
    ], 
    _
  ] = js.native
  def apply[T /* <: StringDictionary[typings.kefir.mod.Observable[_, _]] */, K /* <: StringDictionary[typings.kefir.mod.Observable[_, _]] */](obss: T, passiveObss: K): Stream_[
    typings.kefir.kefirStrings.FnCallObssObssPCombinator with TopLevel[T] with TopLevel[K], 
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
