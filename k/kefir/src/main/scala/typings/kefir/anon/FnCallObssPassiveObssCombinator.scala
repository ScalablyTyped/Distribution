package typings.kefir.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallObssPassiveObssCombinator extends StObject {
  
  def apply[T, S, U](obss: js.Array[typings.kefir.mod.Observable[T, S]]): typings.kefir.mod.Observable[U, S] = js.native
  def apply[T, S, U](
    obss: js.Array[typings.kefir.mod.Observable[T, S]],
    passiveObss: js.Array[typings.kefir.mod.Observable[T, S]]
  ): typings.kefir.mod.Observable[U, S] = js.native
  def apply[T, S, U](
    obss: js.Array[typings.kefir.mod.Observable[T, S]],
    passiveObss: js.Array[typings.kefir.mod.Observable[T, S]],
    combinator: js.Function1[/* repeated */ T, U]
  ): typings.kefir.mod.Observable[U, S] = js.native
  def apply[T, S, U](
    obss: js.Array[typings.kefir.mod.Observable[T, S]],
    passiveObss: Unit,
    combinator: js.Function1[/* repeated */ T, U]
  ): typings.kefir.mod.Observable[U, S] = js.native
}
