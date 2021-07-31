package typings.kefir.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.kefir.mod.Stream_
import typings.kefir.mod.ValueOfAnObservable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallObssObssPCombinator extends StObject {
  
  def apply[T /* <: js.Tuple5[
    typings.kefir.mod.Observable[js.Any, js.Any], 
    typings.kefir.mod.Observable[js.Any, js.Any], 
    typings.kefir.mod.Observable[js.Any, js.Any], 
    typings.kefir.mod.Observable[js.Any, js.Any], 
    typings.kefir.mod.Observable[js.Any, js.Any]
  ] */](obss: T): Stream_[
    js.Tuple5[
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
      ]
    ], 
    js.Any
  ] = js.native
  def apply[T /* <: StringDictionary[typings.kefir.mod.Observable[js.Any, js.Any]] */, K /* <: StringDictionary[typings.kefir.mod.Observable[js.Any, js.Any]] */](obss: T, passiveObss: K): Stream_[
    typings.kefir.kefirStrings.FnCallObssObssPCombinator & TopLevel[T] & TopLevel[K], 
    js.Any
  ] = js.native
  def apply[T /* <: js.Array[typings.kefir.mod.Observable[js.Any, js.Any]] */, P /* <: js.Array[typings.kefir.mod.Observable[js.Any, js.Any]] */, K](
    obss: T,
    obssP: P,
    combinator: js.Function2[
      /* import warning: importer.ImportType#apply Failed type conversion: T[0][''] */ /* a */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: P[0][''] */ /* b */ js.Any, 
      K
    ]
  ): typings.kefir.mod.Observable[K, js.Any] = js.native
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
