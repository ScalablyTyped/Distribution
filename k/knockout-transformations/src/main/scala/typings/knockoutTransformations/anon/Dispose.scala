package typings.knockoutTransformations.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dispose[TResult] extends js.Object {
  var mappedValue: TResult
  def dispose(): Unit
}

object Dispose {
  @scala.inline
  def apply[TResult](dispose: () => Unit, mappedValue: TResult): Dispose[TResult] = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), mappedValue = mappedValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dispose[TResult]]
  }
}

