package typings
package linqLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CreateEnumerable extends js.Object {
  def createEnumerable[T](getEnumerator: js.Function0[linqLib.linqMod.EnumerableNs.IEnumerator[T]]): linqLib.linqMod.EnumerableNs.IEnumerable[T]
  def createEnumerator[T](
    initialize: js.Function0[scala.Unit],
    tryGetNext: js.Function0[scala.Boolean],
    dispose: js.Function0[scala.Unit]
  ): linqLib.linqMod.EnumerableNs.IEnumerator[T]
  def createLambda(expression: js.Any): js.Function1[/* repeated */ js.Any, _]
  def extendTo(`type`: js.Any): scala.Unit
}

