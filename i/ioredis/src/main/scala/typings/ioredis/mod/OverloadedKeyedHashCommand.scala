package typings.ioredis.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OverloadedKeyedHashCommand[T, U] extends StObject {
  
  def apply(key: KeyType, arg1: T, arg2: T, arg3: T, arg4: T, arg5: T, arg6: T, cb: Callback[U]): Unit = js.native
  def apply(key: KeyType, arg1: T, arg2: T, arg3: T, arg4: T, cb: Callback[U]): Unit = js.native
  def apply(key: KeyType, arg1: T, arg2: T, cb: Callback[U]): Unit = js.native
  def apply(key: KeyType, args: T*): js.Promise[U] = js.native
  def apply(key: KeyType, data: js.Array[T]): js.Promise[U] = js.native
  def apply(key: KeyType, data: js.Array[T], cb: Callback[U]): Unit = js.native
  def apply(key: KeyType, data: StringDictionary[T]): js.Promise[U] = js.native
  def apply(key: KeyType, data: StringDictionary[T], cb: Callback[U]): Unit = js.native
  def apply(key: KeyType, data: Map[String, ValueType]): js.Promise[U] = js.native
  def apply(key: KeyType, data: Map[String, ValueType], cb: Callback[U]): Unit = js.native
}
