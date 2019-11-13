package typings.ioredis.ioredisMod

import typings.ioredis.ioredisNumbers.`0`
import typings.ioredis.ioredisNumbers.`1`
import typings.ioredis.ioredisStrings.OK
import typings.ioredis.ioredisStrings.WITHSCORES
import typings.node.Buffer
import typings.node.NodeJS.EventEmitter
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cluster
  extends EventEmitter
     with Commander {
  def connect(callback: js.Function0[Unit]): js.Promise[_] = js.native
  def decr(key: KeyType): js.Promise[Double] = js.native
  def decr(key: KeyType, callback: js.Function2[/* err */ Error, /* res */ Double, Unit]): Unit = js.native
  def del(keys: KeyType*): js.Promise[Double] = js.native
  def disconnect(): Unit = js.native
  def expire(key: KeyType, seconds: Double): js.Promise[`0` | `1`] = js.native
  def expire(key: KeyType, seconds: Double, callback: js.Function2[/* err */ Error, /* res */ `0` | `1`, Unit]): Unit = js.native
  def get(key: KeyType): js.Promise[String | Null] = js.native
  def get(key: KeyType, callback: js.Function2[/* err */ Error, /* res */ String | Null, Unit]): Unit = js.native
  def getBuffer(key: KeyType): js.Promise[Buffer] = js.native
  def getBuffer(key: KeyType, callback: js.Function2[/* err */ Error, /* res */ Buffer, Unit]): Unit = js.native
  def hget(key: KeyType, field: String): js.Promise[String | Null] = js.native
  def hget(
    key: KeyType,
    field: String,
    callback: js.Function2[/* err */ Error, /* res */ String | Null, Unit]
  ): Unit = js.native
  def hset(key: KeyType, field: String, value: js.Any): js.Promise[`0` | `1`] = js.native
  def hset(
    key: KeyType,
    field: String,
    value: js.Any,
    callback: js.Function2[/* err */ Error, /* res */ `0` | `1`, Unit]
  ): Unit = js.native
  def incr(key: KeyType): js.Promise[Double] = js.native
  def incr(key: KeyType, callback: js.Function2[/* err */ Error, /* res */ Double, Unit]): Unit = js.native
  def keys(pattern: String): js.Promise[js.Array[String]] = js.native
  def keys(pattern: String, callback: js.Function2[/* err */ Error, /* res */ js.Array[String], Unit]): Unit = js.native
  def llen(key: KeyType): js.Promise[Double] = js.native
  def llen(key: KeyType, callback: js.Function2[/* err */ Error, /* res */ Double, Unit]): Unit = js.native
  def lpopBuffer(key: KeyType): js.Promise[Buffer] = js.native
  def lpopBuffer(key: KeyType, callback: js.Function2[/* err */ Error, /* res */ Buffer, Unit]): Unit = js.native
  def lrangeBuffer(key: KeyType, start: Double, stop: Double): js.Promise[js.Array[Buffer]] = js.native
  def lrangeBuffer(
    key: KeyType,
    start: Double,
    stop: Double,
    callback: js.Function2[/* err */ Error, /* res */ js.Array[Buffer], Unit]
  ): Unit = js.native
  def nodes(): js.Array[Redis] = js.native
  def nodes(role: NodeRole): js.Array[Redis] = js.native
  def quit(): js.Promise[OK] = js.native
  @JSName("quit")
  def quit_OK(callback: CallbackFunction[OK]): js.Promise[OK] = js.native
  def rpush(key: KeyType, values: js.Any*): js.Any = js.native
  def rpushBuffer(key: String, values: Buffer*): js.Any = js.native
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
  def setBuffer(key: KeyType, value: js.Any): js.Promise[Buffer] = js.native
  def setBuffer(key: KeyType, value: js.Any, callback: js.Function2[/* err */ Error, /* res */ Buffer, Unit]): Unit = js.native
  def setBuffer(key: KeyType, value: js.Any, expiryMode: String): js.Promise[Buffer] = js.native
  def setBuffer(key: KeyType, value: js.Any, expiryMode: String, time: String): js.Promise[Buffer] = js.native
  def setBuffer(key: KeyType, value: js.Any, expiryMode: String, time: String, setMode: String): js.Promise[Buffer] = js.native
  def setBuffer(
    key: KeyType,
    value: js.Any,
    expiryMode: String,
    time: String,
    setMode: String,
    callback: js.Function2[/* err */ Error, /* res */ Buffer, Unit]
  ): Unit = js.native
  def setBuffer(key: KeyType, value: js.Any, expiryMode: String, time: String, setMode: Double): js.Promise[Buffer] = js.native
  def setBuffer(
    key: KeyType,
    value: js.Any,
    expiryMode: String,
    time: String,
    setMode: Double,
    callback: js.Function2[/* err */ Error, /* res */ Buffer, Unit]
  ): Unit = js.native
  def setBuffer(key: KeyType, value: js.Any, expiryMode: String, time: Double): js.Promise[Buffer] = js.native
  def setBuffer(
    key: KeyType,
    value: js.Any,
    expiryMode: String,
    time: Double,
    callback: js.Function2[/* err */ Error, /* res */ Buffer, Unit]
  ): Unit = js.native
  def setBuffer(key: KeyType, value: js.Any, expiryMode: String, time: Double, setMode: String): js.Promise[Buffer] = js.native
  def setBuffer(
    key: KeyType,
    value: js.Any,
    expiryMode: String,
    time: Double,
    setMode: String,
    callback: js.Function2[/* err */ Error, /* res */ Buffer, Unit]
  ): Unit = js.native
  def setBuffer(key: KeyType, value: js.Any, expiryMode: String, time: Double, setMode: Double): js.Promise[Buffer] = js.native
  def setBuffer(
    key: KeyType,
    value: js.Any,
    expiryMode: String,
    time: Double,
    setMode: Double,
    callback: js.Function2[/* err */ Error, /* res */ Buffer, Unit]
  ): Unit = js.native
  def setBuffer(key: KeyType, value: js.Any, expiryMode: js.Array[_]): js.Promise[Buffer] = js.native
  def setBuffer(key: KeyType, value: js.Any, expiryMode: js.Array[_], time: String): js.Promise[Buffer] = js.native
  def setBuffer(key: KeyType, value: js.Any, expiryMode: js.Array[_], time: String, setMode: String): js.Promise[Buffer] = js.native
  def setBuffer(key: KeyType, value: js.Any, expiryMode: js.Array[_], time: String, setMode: Double): js.Promise[Buffer] = js.native
  def setBuffer(key: KeyType, value: js.Any, expiryMode: js.Array[_], time: Double): js.Promise[Buffer] = js.native
  def setBuffer(key: KeyType, value: js.Any, expiryMode: js.Array[_], time: Double, setMode: String): js.Promise[Buffer] = js.native
  def setBuffer(key: KeyType, value: js.Any, expiryMode: js.Array[_], time: Double, setMode: Double): js.Promise[Buffer] = js.native
  def setBuffer(
    key: KeyType,
    value: js.Any,
    setMode: String,
    callback: js.Function2[/* err */ Error, /* res */ Buffer, Unit]
  ): Unit = js.native
  def setnx(key: KeyType, value: js.Any): js.Promise[_] = js.native
  def setnx(key: KeyType, value: js.Any, callback: js.Function2[/* err */ Error, /* res */ js.Any, Unit]): Unit = js.native
  def zadd(key: KeyType, args: String*): js.Promise[Double | String] = js.native
  def zrange(key: KeyType, start: Double, stop: Double): js.Promise[_] = js.native
  def zrange(
    key: KeyType,
    start: Double,
    stop: Double,
    callback: js.Function2[/* err */ Error, /* res */ js.Any, Unit]
  ): Unit = js.native
  @JSName("zrange")
  def zrange_WITHSCORES(key: KeyType, start: Double, stop: Double, withScores: WITHSCORES): js.Promise[_] = js.native
  @JSName("zrange")
  def zrange_WITHSCORES(
    key: KeyType,
    start: Double,
    stop: Double,
    withScores: WITHSCORES,
    callback: js.Function2[/* err */ Error, /* res */ js.Any, Unit]
  ): Unit = js.native
  def zrem(key: KeyType, members: js.Any*): js.Any = js.native
}

