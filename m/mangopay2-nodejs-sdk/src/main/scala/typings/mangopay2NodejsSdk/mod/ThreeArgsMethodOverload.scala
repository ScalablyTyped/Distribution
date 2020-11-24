package typings.mangopay2NodejsSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThreeArgsMethodOverload[T, U, V, R] extends js.Object {
  
  def apply(data: T, extra: U, lastArg: V): js.Promise[R] = js.native
  def apply(
    data: T,
    extra: U,
    lastArg: V,
    callback: js.Function1[(/* data */ R) | (/* data */ WithResponse[R]), Unit]
  ): Unit = js.native
  def apply(
    data: T,
    extra: U,
    lastArg: V,
    callback: js.Function1[/* data */ WithResponse[R], Unit],
    options: MethodOptionWithResponse
  ): Unit = js.native
  def apply(
    data: T,
    extra: U,
    lastArg: V,
    callback: js.Function1[/* data */ R, Unit],
    options: MethodOptionWithoutResponse
  ): Unit = js.native
  def apply(data: T, extra: U, lastArg: V, options: MethodOptionWithResponse): js.Promise[WithResponse[R]] = js.native
  def apply(data: T, extra: U, lastArg: V, options: MethodOptionWithoutResponse): js.Promise[R] = js.native
}
