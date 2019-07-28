package typings.ioredis.ioredisMod

import typings.ioredis.ioredisStrings.OK
import typings.node.NodeJSNs.EventEmitter
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cluster
  extends EventEmitter
     with Commander {
  def connect(callback: js.Function0[Unit]): js.Promise[_] = js.native
  def disconnect(): Unit = js.native
  def get(key: KeyType): js.Promise[String | Null] = js.native
  def get(key: KeyType, callback: js.Function2[/* err */ Error, /* res */ String | Null, Unit]): Unit = js.native
  def nodes(): js.Array[Redis] = js.native
  def nodes(role: NodeRole): js.Array[Redis] = js.native
  def quit(): js.Promise[OK] = js.native
  @JSName("quit")
  def quit_OK(callback: CallbackFunction[OK]): js.Promise[OK] = js.native
  def set(key: KeyType, value: js.Any): js.Promise[String] = js.native
  def set(key: KeyType, value: js.Any, callback: js.Function2[/* err */ Error, /* res */ String, Unit]): Unit = js.native
  def set(key: KeyType, value: js.Any, expiryMode: String): js.Promise[String] = js.native
  def set(key: KeyType, value: js.Any, expiryMode: String, time: String): js.Promise[String] = js.native
  def set(
    key: KeyType,
    value: js.Any,
    expiryMode: String,
    time: String,
    callback: js.Function2[/* err */ Error, /* res */ String, Unit]
  ): Unit = js.native
  def set(key: KeyType, value: js.Any, expiryMode: String, time: String, setMode: String): js.Promise[String] = js.native
  def set(
    key: KeyType,
    value: js.Any,
    expiryMode: String,
    time: String,
    setMode: String,
    callback: js.Function2[/* err */ Error, /* res */ String, Unit]
  ): Unit = js.native
  def set(key: KeyType, value: js.Any, expiryMode: String, time: String, setMode: Double): js.Promise[String] = js.native
  def set(
    key: KeyType,
    value: js.Any,
    expiryMode: String,
    time: String,
    setMode: Double,
    callback: js.Function2[/* err */ Error, /* res */ String, Unit]
  ): Unit = js.native
  def set(key: KeyType, value: js.Any, expiryMode: String, time: Double): js.Promise[String] = js.native
  def set(
    key: KeyType,
    value: js.Any,
    expiryMode: String,
    time: Double,
    callback: js.Function2[/* err */ Error, /* res */ String, Unit]
  ): Unit = js.native
  def set(key: KeyType, value: js.Any, expiryMode: String, time: Double, setMode: String): js.Promise[String] = js.native
  def set(
    key: KeyType,
    value: js.Any,
    expiryMode: String,
    time: Double,
    setMode: String,
    callback: js.Function2[/* err */ Error, /* res */ String, Unit]
  ): Unit = js.native
  def set(key: KeyType, value: js.Any, expiryMode: String, time: Double, setMode: Double): js.Promise[String] = js.native
  def set(
    key: KeyType,
    value: js.Any,
    expiryMode: String,
    time: Double,
    setMode: Double,
    callback: js.Function2[/* err */ Error, /* res */ String, Unit]
  ): Unit = js.native
  def set(key: KeyType, value: js.Any, expiryMode: js.Array[_]): js.Promise[String] = js.native
  def set(key: KeyType, value: js.Any, expiryMode: js.Array[_], time: String): js.Promise[String] = js.native
  def set(key: KeyType, value: js.Any, expiryMode: js.Array[_], time: String, setMode: String): js.Promise[String] = js.native
  def set(key: KeyType, value: js.Any, expiryMode: js.Array[_], time: String, setMode: Double): js.Promise[String] = js.native
  def set(key: KeyType, value: js.Any, expiryMode: js.Array[_], time: Double): js.Promise[String] = js.native
  def set(key: KeyType, value: js.Any, expiryMode: js.Array[_], time: Double, setMode: String): js.Promise[String] = js.native
  def set(key: KeyType, value: js.Any, expiryMode: js.Array[_], time: Double, setMode: Double): js.Promise[String] = js.native
  def set(
    key: KeyType,
    value: js.Any,
    setMode: String,
    callback: js.Function2[/* err */ Error, /* res */ String, Unit]
  ): Unit = js.native
  def set(
    key: KeyType,
    value: js.Any,
    setMode: js.Array[_],
    callback: js.Function2[/* err */ Error, /* res */ String, Unit]
  ): Unit = js.native
}

