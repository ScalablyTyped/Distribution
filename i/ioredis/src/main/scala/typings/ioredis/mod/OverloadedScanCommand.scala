package typings.ioredis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OverloadedScanCommand[T, U] extends StObject {
  
  def apply(key: String, cursor: Double, arg1: T, arg2: T, arg3: T, arg4: T, arg5: T, arg6: T, cb: Callback[U]): Unit = js.native
  def apply(key: String, cursor: Double, arg1: T, arg2: T, arg3: T, arg4: T, arg5: T, cb: Callback[U]): Unit = js.native
  def apply(key: String, cursor: Double, arg1: T, arg2: T, arg3: T, arg4: T, cb: Callback[U]): Unit = js.native
  def apply(key: String, cursor: Double, arg1: T, arg2: T, arg3: T, cb: Callback[U]): Unit = js.native
  def apply(key: String, cursor: Double, arg1: T, arg2: T, cb: Callback[U]): Unit = js.native
  def apply(key: String, cursor: Double, arg1: T, cb: Callback[U]): Unit = js.native
  def apply(key: String, cursor: Double, arg1: js.Array[T]): js.Promise[U] = js.native
  def apply(key: String, cursor: Double, arg1: js.Array[T], cb: Callback[U]): Unit = js.native
  def apply(key: String, cursor: Double, args: T*): js.Promise[U] = js.native
  def apply(key: String, cursor: Double, cb: Callback[U]): Unit = js.native
}
