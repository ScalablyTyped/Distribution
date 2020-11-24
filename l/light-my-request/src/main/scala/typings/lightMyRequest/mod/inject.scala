package typings.lightMyRequest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("light-my-request", "inject")
@js.native
object inject extends js.Object {
  
  def apply(dispatchFunc: DispatchFunc): Chain = js.native
  def apply(dispatchFunc: DispatchFunc, options: String): Chain = js.native
  def apply(dispatchFunc: DispatchFunc, options: String, callback: CallbackFunc): Unit = js.native
  def apply(dispatchFunc: DispatchFunc, options: InjectOptions): Chain = js.native
  def apply(dispatchFunc: DispatchFunc, options: InjectOptions, callback: CallbackFunc): Unit = js.native
}
