package typings.linq.linqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("linq", "Utils")
@js.native
object Utils extends js.Object {
  def createEnumerable[T](getEnumerator: js.Function0[IEnumerator[T]]): IEnumerable[T] = js.native
  def createEnumerator[T](initialize: js.Function0[Unit], tryGetNext: js.Function0[Boolean], dispose: js.Function0[Unit]): IEnumerator[T] = js.native
  def createLambda(expression: js.Any): js.Function1[/* repeated */ js.Any, _] = js.native
  def extendTo(`type`: js.Any): Unit = js.native
  def hasNativeIteratorSupport(): Boolean = js.native
}

