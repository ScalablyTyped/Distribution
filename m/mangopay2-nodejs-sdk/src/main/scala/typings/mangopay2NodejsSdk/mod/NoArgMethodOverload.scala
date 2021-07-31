package typings.mangopay2NodejsSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NoArgMethodOverload[R] extends StObject {
  
  def apply(): js.Promise[R] = js.native
  def apply(callback: js.Function1[(/* data */ R) | (/* data */ WithResponse[R]), Unit]): Unit = js.native
  def apply(callback: js.Function1[/* data */ WithResponse[R], Unit], options: MethodOptionWithResponse): Unit = js.native
  def apply(callback: js.Function1[/* data */ R, Unit], options: MethodOptionWithoutResponse): Unit = js.native
  def apply(options: MethodOptionWithResponse): js.Promise[WithResponse[R]] = js.native
  def apply(options: MethodOptionWithoutResponse): js.Promise[R] = js.native
}
