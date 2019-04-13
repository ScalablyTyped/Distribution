package typings
package linqLib.linqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("linq", "Utils")
@js.native
object Utils extends js.Object {
  def createEnumerable[T](getEnumerator: js.Function0[linqLib.linqMod.IEnumerator[T]]): linqLib.linqMod.IEnumerable[T] = js.native
  def createEnumerator[T](
    initialize: js.Function0[scala.Unit],
    tryGetNext: js.Function0[scala.Boolean],
    dispose: js.Function0[scala.Unit]
  ): linqLib.linqMod.IEnumerator[T] = js.native
  def createLambda(expression: js.Any): js.Function1[/* repeated */ js.Any, _] = js.native
  def extendTo(`type`: js.Any): scala.Unit = js.native
  def hasNativeIteratorSupport(): scala.Boolean = js.native
}

