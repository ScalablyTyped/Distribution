package typings.mangopay2NodejsSdk.typingsBaseMod.base

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MethodOverload[T, R] extends StObject {
  
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
