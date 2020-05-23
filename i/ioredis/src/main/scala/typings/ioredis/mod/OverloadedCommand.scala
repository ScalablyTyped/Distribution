package typings.ioredis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OverloadedCommand[T, U] extends js.Object {
  def apply(arg1: T, arg2: T, arg3: T, arg4: T, arg5: T, arg6: T, cb: Callback[U]): Unit = js.native
  def apply(arg1: T, arg2: T, arg3: T, arg4: T, arg5: T, cb: Callback[U]): Unit = js.native
  def apply(arg1: T, arg2: T, arg3: T, arg4: T, cb: Callback[U]): Unit = js.native
  def apply(arg1: T, arg2: T, arg3: T, cb: Callback[U]): Unit = js.native
  def apply(arg1: T, arg2: T, cb: Callback[U]): Unit = js.native
  def apply(arg1: T, cb: Callback[U]): Unit = js.native
  def apply(arg1: js.Array[T]): js.Promise[U] = js.native
  def apply(arg1: js.Array[T], cb: Callback[U]): Unit = js.native
  def apply(args: T*): js.Promise[U] = js.native
  def apply(cb: Callback[U]): Unit = js.native
}

