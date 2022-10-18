package typings.kefir.anon

import org.scalablytyped.runtime.StringDictionary
import typings.kefir.mod.Stream_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallObssObssPCombinator extends StObject {
  
  def apply[T /* <: js.Array[scala.Nothing] */](obss: T): Stream_[scala.Nothing, scala.Nothing] = js.native
  def apply[T /* <: StringDictionary[typings.kefir.mod.Observable[Any, Any]] */, K /* <: StringDictionary[typings.kefir.mod.Observable[Any, Any]] */](obss: T, passiveObss: K): Stream_[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: kefir.kefir.ValueOfAnObservable<T[P]>} */ js.Any, 
    Any
  ] = js.native
  def apply[T /* <: js.Array[typings.kefir.mod.Observable[Any, Any]] */, P /* <: js.Array[typings.kefir.mod.Observable[Any, Any]] */, K](
    obss: T,
    obssP: P,
    combinator: js.Function2[
      /* import warning: importer.ImportType#apply Failed type conversion: T[0][''] */ /* a */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: P[0][''] */ /* b */ js.Any, 
      K
    ]
  ): typings.kefir.mod.Observable[K, Any] = js.native
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
