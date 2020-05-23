package typings.ioredis.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OverloadedKeyedHashCommand[T, U] extends js.Object {
  def apply(key: KeyType, arg1: T, arg2: T, arg3: T, arg4: T, arg5: T, arg6: T, cb: Callback[U]): Unit = js.native
  def apply(key: KeyType, arg1: T, arg2: T, arg3: T, arg4: T, cb: Callback[U]): Unit = js.native
  def apply(key: KeyType, arg1: T, arg2: T, cb: Callback[U]): Unit = js.native
  def apply(key: KeyType, args: T*): js.Promise[U] = js.native
  def apply(key: KeyType, data: js.Array[T]): js.Promise[U] = js.native
  def apply(key: KeyType, data: js.Array[T], cb: Callback[U]): Unit = js.native
  def apply(key: KeyType, data: StringDictionary[T]): js.Promise[U] = js.native
  def apply(key: KeyType, data: StringDictionary[T], cb: Callback[U]): Unit = js.native
}

