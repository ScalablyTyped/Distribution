package typings
package lodashLib.fpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashMapValues1x2[T] extends js.Object {
  def apply(iteratee: java.lang.String): lodashLib.lodashMod.Dictionary[_] = js.native
  def apply(iteratee: js.Object): lodashLib.lodashMod.Dictionary[scala.Boolean] = js.native
  def apply[TResult](callback: js.Function1[/* value */ T, TResult]): lodashLib.lodashMod.Dictionary[TResult] = js.native
  def apply[TKey /* <: java.lang.String */](iteratee: TKey): lodashLib.lodashMod.Dictionary[/* import warning: ImportType.apply Failed type conversion: T[TKey] */ js.Any] = js.native
}

