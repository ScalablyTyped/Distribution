package typings.ioredis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OverloadedEvalCommand[T, U] extends js.Object {
  
  // This overload exists specifically to retain compatibility to `redlock`
  // All arguments are by default flattened, declaring all possible permuatations
  // would be unreasonable (and probably impossible)
  def apply(args: js.Array[ValueType]): js.Any = js.native
  def apply(args: js.Array[ValueType], callback: Callback[_]): js.Any = js.native
  def apply(
    script: String,
    numKeys: Double,
    arg1: T,
    arg2: T,
    arg3: T,
    arg4: T,
    arg5: T,
    arg6: T,
    cb: Callback[U]
  ): Unit = js.native
  def apply(script: String, numKeys: Double, arg1: T, arg2: T, arg3: T, arg4: T, arg5: T, cb: Callback[U]): Unit = js.native
  def apply(script: String, numKeys: Double, arg1: T, arg2: T, arg3: T, arg4: T, cb: Callback[U]): Unit = js.native
  def apply(script: String, numKeys: Double, arg1: T, arg2: T, arg3: T, cb: Callback[U]): Unit = js.native
  def apply(script: String, numKeys: Double, arg1: T, arg2: T, cb: Callback[U]): Unit = js.native
  def apply(script: String, numKeys: Double, arg1: T, cb: Callback[U]): Unit = js.native
  def apply(script: String, numKeys: Double, arg1: js.Array[T]): js.Promise[U] = js.native
  def apply(script: String, numKeys: Double, arg1: js.Array[T], cb: Callback[U]): Unit = js.native
  def apply(script: String, numKeys: Double, args: T*): js.Promise[U] = js.native
}
