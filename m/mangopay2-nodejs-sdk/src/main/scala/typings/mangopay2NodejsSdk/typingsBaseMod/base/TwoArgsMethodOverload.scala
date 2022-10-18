package typings.mangopay2NodejsSdk.typingsBaseMod.base

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TwoArgsMethodOverload[T, U, R] extends StObject {
  
  def apply(data: T, extra: U): js.Promise[R] = js.native
  def apply(data: T, extra: U, callback: js.Function1[(/* data */ R) | (/* data */ WithResponse[R]), Unit]): Unit = js.native
  def apply(
    data: T,
    extra: U,
    callback: js.Function1[/* data */ WithResponse[R], Unit],
    options: MethodOptionWithResponse
  ): Unit = js.native
  def apply(
    data: T,
    extra: U,
    callback: js.Function1[/* data */ R, Unit],
    options: MethodOptionWithoutResponse
  ): Unit = js.native
  def apply(data: T, extra: U, options: MethodOptionWithResponse): js.Promise[WithResponse[R]] = js.native
  def apply(data: T, extra: U, options: MethodOptionWithoutResponse): js.Promise[R] = js.native
}
