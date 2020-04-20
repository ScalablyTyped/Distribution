package typings.knockoutProjections

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDispose[TResult] extends js.Object {
  var mappedValue: TResult
  def dispose(): Unit
}

object AnonDispose {
  @scala.inline
  def apply[TResult](dispose: () => Unit, mappedValue: TResult): AnonDispose[TResult] = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), mappedValue = mappedValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDispose[TResult]]
  }
}

