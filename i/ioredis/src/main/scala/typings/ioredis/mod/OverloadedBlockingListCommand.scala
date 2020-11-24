package typings.ioredis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OverloadedBlockingListCommand[T, U] extends js.Object {
  
  def apply(arg1: T, arg2: T, arg3: T, arg4: T, arg5: T, arg6: T, timeout: Double): js.Promise[U] = js.native
  def apply(arg1: T, arg2: T, arg3: T, arg4: T, arg5: T, arg6: T, timeout: Double, cb: Callback[U]): Unit = js.native
  def apply(arg1: T, arg2: T, arg3: T, arg4: T, arg5: T, timeout: Double): js.Promise[U] = js.native
  def apply(arg1: T, arg2: T, arg3: T, arg4: T, arg5: T, timeout: Double, cb: Callback[U]): Unit = js.native
  def apply(arg1: T, arg2: T, arg3: T, arg4: T, timeout: Double): js.Promise[U] = js.native
  def apply(arg1: T, arg2: T, arg3: T, arg4: T, timeout: Double, cb: Callback[U]): Unit = js.native
  def apply(arg1: T, arg2: T, arg3: T, timeout: Double): js.Promise[U] = js.native
  def apply(arg1: T, arg2: T, arg3: T, timeout: Double, cb: Callback[U]): Unit = js.native
  def apply(arg1: T, arg2: T, timeout: Double): js.Promise[U] = js.native
  def apply(arg1: T, arg2: T, timeout: Double, cb: Callback[U]): Unit = js.native
  def apply(arg1: T, timeout: Double): js.Promise[U] = js.native
  def apply(arg1: T, timeout: Double, cb: Callback[U]): Unit = js.native
  def apply(arg1: js.Array[T | Double]): js.Promise[U] = js.native
  def apply(arg1: js.Array[T | Double], cb: Callback[U]): Unit = js.native
  def apply(args: (T | Double)*): js.Promise[U] = js.native
}
