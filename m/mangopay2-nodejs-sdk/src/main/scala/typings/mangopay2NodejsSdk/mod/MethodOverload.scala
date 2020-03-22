package typings.mangopay2NodejsSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MethodOverload[T, R] extends js.Object {
  def apply(data: T): js.Promise[R] = js.native
  def apply(data: T, callback: js.Function1[/* data */ R, Unit]): Unit = js.native
  def apply(
    data: T,
    callback: js.Function1[/* data */ WithResponse[R], Unit],
    options: MethodOptionWithResponse
  ): Unit = js.native
  def apply(data: T, callback: js.Function1[/* data */ R, Unit], options: MethodOptionWithoutResponse): Unit = js.native
  def apply(data: T, options: MethodOptionWithResponse): js.Promise[WithResponse[R]] = js.native
  def apply(data: T, options: MethodOptionWithoutResponse): js.Promise[R] = js.native
}

