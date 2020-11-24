package typings.jointjs.mod.util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jointjs", "util.debounce")
@js.native
object debounce extends js.Object {
  
  def apply[T /* <: js.Function */](func: T): T with Cancelable = js.native
  def apply[T /* <: js.Function */](func: T, wait: js.UndefOr[scala.Nothing], options: js.Object): T with Cancelable = js.native
  def apply[T /* <: js.Function */](func: T, wait: Double): T with Cancelable = js.native
  def apply[T /* <: js.Function */](func: T, wait: Double, options: js.Object): T with Cancelable = js.native
}
