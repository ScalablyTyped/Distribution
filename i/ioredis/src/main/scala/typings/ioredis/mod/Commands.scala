package typings.ioredis.mod

import org.scalablytyped.runtime.StringDictionary
import typings.ioredis.ioredisStrings.AFTER
import typings.ioredis.ioredisStrings.BEFORE
import typings.ioredis.ioredisStrings.COUNT
import typings.ioredis.ioredisStrings.GET
import typings.ioredis.ioredisStrings.LIMIT
import typings.ioredis.ioredisStrings.MATCH
import typings.ioredis.ioredisStrings.NOKEY
import typings.ioredis.ioredisStrings.NOSAVE
import typings.ioredis.ioredisStrings.RESETSTAT
import typings.ioredis.ioredisStrings.REWRITE
import typings.ioredis.ioredisStrings.SAVE
import typings.ioredis.ioredisStrings.SET
import typings.ioredis.ioredisStrings.WITHSCORES
import typings.ioredis.ioredisStrings.count_
import typings.ioredis.ioredisStrings.match_
import typings.node.Buffer
import typings.node.eventsMod.EventEmitter
import typings.node.streamMod.Readable
import typings.std.Error
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Commands extends js.Object {
  @JSName("blpop")
  var blpop_Original: OverloadedBlockingListCommand[KeyType, js.Tuple2[String, String]] = js.native
  @JSName("brpop")
  var brpop_Original: OverloadedBlockingListCommand[KeyType, js.Tuple2[String, String]] = js.native
  @JSName("client")
  var client_Original: OverloadedSubCommand[ValueType, _] = js.native
  @JSName("cluster")
  var cluster_Original: OverloadedSubCommand[ValueType, _] = js.native
  @JSName("debug")
  var debug_Original: OverloadedSubCommand[ValueType, _] = js.native
  @JSName("del")
  var del_Original: OverloadedListCommand[KeyType, Double] = js.native
  @JSName("eval")
  var eval_Original: OverloadedEvalCommand[ValueType, _] = js.native
  @JSName("evalsha")
  var evalsha_Original: OverloadedEvalCommand[ValueType, _] = js.native
  @JSName("hdel")
  var hdel_Original: OverloadedKeyCommand[KeyType, Double] = js.native
  @JSName("hmget")
  var hmget_Original: OverloadedKeyCommand[KeyType, js.Array[String | Null]] = js.native
  @JSName("hmset")
  var hmset_Original: OverloadedKeyedHashCommand[ValueType, Ok] = js.native
  @JSName("hscan")
  var hscan_Original: OverloadedKeyCommand[ValueType, js.Tuple2[String, js.Array[String]]] = js.native
  @JSName("lpushBuffer")
  var lpushBuffer_Original: OverloadedKeyCommand[Buffer, Double] = js.native
  @JSName("lpush")
  var lpush_Original: OverloadedKeyCommand[ValueType, Double] = js.native
  @JSName("lpushx")
  var lpushx_Original: OverloadedKeyCommand[ValueType, Double] = js.native
  @JSName("mget")
  var mget_Original: OverloadedListCommand[KeyType, js.Array[String | Null]] = js.native
  @JSName("migrate")
  var migrate_Original: OverloadedListCommand[ValueType, Ok | NOKEY] = js.native
  @JSName("mset")
  var mset_Original: OverloadedHashCommand[ValueType, Ok] = js.native
  @JSName("msetnx")
  var msetnx_Original: OverloadedHashCommand[ValueType, BooleanResponse] = js.native
  @JSName("object")
  var object_Original: OverloadedListCommand[ValueType, _] = js.native
  @JSName("pfadd")
  var pfadd_Original: OverloadedKeyCommand[String, Double] = js.native
  @JSName("pfcount")
  var pfcount_Original: OverloadedListCommand[KeyType, Double] = js.native
  @JSName("pfmerge")
  var pfmerge_Original: OverloadedKeyCommand[KeyType, Ok] = js.native
  @JSName("psubscribe")
  var psubscribe_Original: OverloadedListCommand[String, Double] = js.native
  @JSName("punsubscribe")
  var punsubscribe_Original: OverloadedCommand[String, Double] = js.native
  @JSName("restore")
  var restore_Original: OverloadedListCommand[ValueType, Ok] = js.native
  @JSName("rpushBuffer")
  var rpushBuffer_Original: OverloadedKeyCommand[Buffer, Double] = js.native
  @JSName("rpush")
  var rpush_Original: OverloadedKeyCommand[ValueType, Double] = js.native
  @JSName("rpushx")
  var rpushx_Original: OverloadedKeyCommand[ValueType, Double] = js.native
  @JSName("sadd")
  var sadd_Original: OverloadedKeyCommand[ValueType, Double] = js.native
  @JSName("script")
  var script_Original: OverloadedSubCommand[ValueType, _] = js.native
  @JSName("sdiff")
  var sdiff_Original: OverloadedListCommand[KeyType, js.Array[String]] = js.native
  @JSName("sdiffstore")
  var sdiffstore_Original: OverloadedKeyCommand[KeyType, Double] = js.native
  @JSName("sinter")
  var sinter_Original: OverloadedListCommand[KeyType, js.Array[String]] = js.native
  @JSName("sinterstore")
  var sinterstore_Original: OverloadedKeyCommand[KeyType, Double] = js.native
  @JSName("sort")
  var sort_Original: OverloadedListCommand[KeyType | Double, js.Array[String] | Double] = js.native
  @JSName("srem")
  var srem_Original: OverloadedKeyCommand[ValueType, Double] = js.native
  @JSName("sscan")
  var sscan_Original: OverloadedKeyCommand[ValueType, js.Tuple2[String, js.Array[String]]] = js.native
  @JSName("subscribe")
  var subscribe_Original: OverloadedListCommand[String, Double] = js.native
  @JSName("sunion")
  var sunion_Original: OverloadedListCommand[KeyType, js.Array[String]] = js.native
  @JSName("sunionstore")
  var sunionstore_Original: OverloadedKeyCommand[KeyType, Double] = js.native
  @JSName("unlink")
  var unlink_Original: OverloadedListCommand[KeyType, Double] = js.native
  @JSName("unsubscribe")
  var unsubscribe_Original: OverloadedCommand[String, Double] = js.native
  @JSName("watch")
  var watch_Original: OverloadedListCommand[KeyType, Ok] = js.native
  @JSName("xack")
  var xack_Original: OverloadedKeyCommand[ValueType, Double] = js.native
  @JSName("xadd")
  var xadd_Original: OverloadedKeyCommand[ValueType, String] = js.native
  @JSName("xclaim")
  var xclaim_Original: OverloadedKeyCommand[ValueType, js.Array[js.Tuple2[String, js.Array[String]]]] = js.native
  @JSName("xdel")
  var xdel_Original: OverloadedKeyCommand[String, Double] = js.native
  @JSName("xgroup")
  var xgroup_Original: OverloadedSubCommand[ValueType, Ok] = js.native
  @JSName("xinfo")
  var xinfo_Original: OverloadedSubCommand[ValueType, _] = js.native
  @JSName("xpending")
  var xpending_Original: OverloadedKeyCommand[ValueType, _] = js.native
  @JSName("xrange")
  var xrange_Original: OverloadedKeyCommand[ValueType, js.Array[js.Tuple2[String, js.Array[String]]]] = js.native
  @JSName("xread")
  var xread_Original: OverloadedListCommand[ValueType, js.Array[js.Tuple2[String, js.Array[String]]]] = js.native
  @JSName("xreadgroup")
  var xreadgroup_Original: OverloadedKeyCommand[ValueType, js.Array[js.Tuple2[String, js.Array[String]]]] = js.native
  @JSName("xrevrange")
  var xrevrange_Original: OverloadedKeyCommand[ValueType, js.Array[js.Tuple2[String, js.Array[String]]]] = js.native
  @JSName("xtrim")
  var xtrim_Original: OverloadedKeyCommand[ValueType, Double] = js.native
  @JSName("zadd")
  var zadd_Original: OverloadedKeyCommand[KeyType | Double, Double | String] = js.native
  @JSName("zinterstore")
  var zinterstore_Original: OverloadedKeyCommand[KeyType | Double, Double] = js.native
  @JSName("zrem")
  var zrem_Original: OverloadedKeyCommand[ValueType, Double] = js.native
  @JSName("zscan")
  var zscan_Original: OverloadedKeyCommand[ValueType, js.Tuple2[String, js.Array[String]]] = js.native
  @JSName("zunionstore")
  var zunionstore_Original: OverloadedKeyCommand[KeyType | Double, Double] = js.native
  def append(key: KeyType, value: ValueType): js.Promise[Double] = js.native
  def append(key: KeyType, value: ValueType, callback: Callback[Double]): Unit = js.native
  def auth(password: String): js.Promise[String] = js.native
  def auth(password: String, callback: Callback[String]): Unit = js.native
  def bgrewriteaof(): js.Promise[String] = js.native
  def bgrewriteaof(callback: Callback[String]): Unit = js.native
  def bgsave(): js.Promise[String] = js.native
  def bgsave(callback: Callback[String]): Unit = js.native
  def bitcount(key: KeyType): js.Promise[Double] = js.native
  def bitcount(key: KeyType, callback: Callback[Double]): Unit = js.native
  def bitcount(key: KeyType, start: Double, end: Double): js.Promise[Double] = js.native
  def bitcount(
    key: KeyType,
    start: Double,
    end: Double,
    callback: js.Function2[/* err */ Error, /* res */ Double, Unit]
  ): Unit = js.native
  def blpop(arg1: js.Array[KeyType | Double]): js.Promise[js.Tuple2[String, String]] = js.native
  def blpop(arg1: js.Array[KeyType | Double], cb: Callback[js.Tuple2[String, String]]): Unit = js.native
  def blpop(
    arg1: KeyType,
    arg2: KeyType,
    arg3: KeyType,
    arg4: KeyType,
    arg5: KeyType,
    arg6: KeyType,
    timeout: Double,
    cb: Callback[js.Tuple2[String, String]]
  ): Unit = js.native
  def blpop(
    arg1: KeyType,
    arg2: KeyType,
    arg3: KeyType,
    arg4: KeyType,
    arg5: KeyType,
    timeout: Double,
    cb: Callback[js.Tuple2[String, String]]
  ): Unit = js.native
  def blpop(
    arg1: KeyType,
    arg2: KeyType,
    arg3: KeyType,
    arg4: KeyType,
    timeout: Double,
    cb: Callback[js.Tuple2[String, String]]
  ): Unit = js.native
  def blpop(
    arg1: KeyType,
    arg2: KeyType,
    arg3: KeyType,
    timeout: Double,
    cb: Callback[js.Tuple2[String, String]]
  ): Unit = js.native
  def blpop(arg1: KeyType, arg2: KeyType, timeout: Double, cb: Callback[js.Tuple2[String, String]]): Unit = js.native
  def blpop(arg1: KeyType, timeout: Double, cb: Callback[js.Tuple2[String, String]]): Unit = js.native
  def blpop(args: (KeyType | Double)*): js.Promise[js.Tuple2[String, String]] = js.native
  def brpop(arg1: js.Array[KeyType | Double]): js.Promise[js.Tuple2[String, String]] = js.native
  def brpop(arg1: js.Array[KeyType | Double], cb: Callback[js.Tuple2[String, String]]): Unit = js.native
  def brpop(
    arg1: KeyType,
    arg2: KeyType,
    arg3: KeyType,
    arg4: KeyType,
    arg5: KeyType,
    arg6: KeyType,
    timeout: Double,
    cb: Callback[js.Tuple2[String, String]]
  ): Unit = js.native
  def brpop(
    arg1: KeyType,
    arg2: KeyType,
    arg3: KeyType,
    arg4: KeyType,
    arg5: KeyType,
    timeout: Double,
    cb: Callback[js.Tuple2[String, String]]
  ): Unit = js.native
  def brpop(
    arg1: KeyType,
    arg2: KeyType,
    arg3: KeyType,
    arg4: KeyType,
    timeout: Double,
    cb: Callback[js.Tuple2[String, String]]
  ): Unit = js.native
  def brpop(
    arg1: KeyType,
    arg2: KeyType,
    arg3: KeyType,
    timeout: Double,
    cb: Callback[js.Tuple2[String, String]]
  ): Unit = js.native
  def brpop(arg1: KeyType, arg2: KeyType, timeout: Double, cb: Callback[js.Tuple2[String, String]]): Unit = js.native
  def brpop(arg1: KeyType, timeout: Double, cb: Callback[js.Tuple2[String, String]]): Unit = js.native
  def brpop(args: (KeyType | Double)*): js.Promise[js.Tuple2[String, String]] = js.native
  def brpoplpush(source: String, destination: String, timeout: Double): js.Promise[String] = js.native
  def brpoplpush(source: String, destination: String, timeout: Double, callback: Callback[String]): Unit = js.native
  def client(arg1: js.Array[ValueType]): js.Promise[_] = js.native
  def client(arg1: js.Array[ValueType], cb: Callback[_]): Unit = js.native
  def client(arg1: ValueType, arg2: js.Array[ValueType], cb: Callback[_]): Unit = js.native
  def client(
    arg1: ValueType,
    arg2: ValueType,
    arg3: ValueType,
    arg4: ValueType,
    arg5: ValueType,
    arg6: ValueType,
    cb: Callback[_]
  ): Unit = js.native
  def client(
    arg1: ValueType,
    arg2: ValueType,
    arg3: ValueType,
    arg4: ValueType,
    arg5: ValueType,
    cb: Callback[_]
  ): Unit = js.native
  def client(arg1: ValueType, arg2: ValueType, arg3: ValueType, arg4: ValueType, cb: Callback[_]): Unit = js.native
  def client(arg1: ValueType, arg2: ValueType, arg3: ValueType, cb: Callback[_]): Unit = js.native
  def client(arg1: ValueType, arg2: ValueType, cb: Callback[_]): Unit = js.native
  def client(arg1: ValueType, cb: Callback[_]): Unit = js.native
  def client(args: ValueType*): js.Promise[_] = js.native
  def cluster(arg1: js.Array[ValueType]): js.Promise[_] = js.native
  def cluster(arg1: js.Array[ValueType], cb: Callback[_]): Unit = js.native
  def cluster(arg1: ValueType, arg2: js.Array[ValueType], cb: Callback[_]): Unit = js.native
  def cluster(
    arg1: ValueType,
    arg2: ValueType,
    arg3: ValueType,
    arg4: ValueType,
    arg5: ValueType,
    arg6: ValueType,
    cb: Callback[_]
  ): Unit = js.native
  def cluster(
    arg1: ValueType,
    arg2: ValueType,
    arg3: ValueType,
    arg4: ValueType,
    arg5: ValueType,
    cb: Callback[_]
  ): Unit = js.native
  def cluster(arg1: ValueType, arg2: ValueType, arg3: ValueType, arg4: ValueType, cb: Callback[_]): Unit = js.native
  def cluster(arg1: ValueType, arg2: ValueType, arg3: ValueType, cb: Callback[_]): Unit = js.native
  def cluster(arg1: ValueType, arg2: ValueType, cb: Callback[_]): Unit = js.native
  def cluster(arg1: ValueType, cb: Callback[_]): Unit = js.native
  def cluster(args: ValueType*): js.Promise[_] = js.native
  @JSName("config")
  def config_GET(op: GET, cfg: String): js.Promise[js.Array[String]] = js.native
  @JSName("config")
  def config_GET(op: GET, cfg: String, callback: Callback[js.Array[String]]): Unit = js.native
  @JSName("config")
  def config_RESETSTAT(op: RESETSTAT): js.Promise[Ok] = js.native
  @JSName("config")
  def config_RESETSTAT(op: RESETSTAT, callback: Callback[Ok]): Unit = js.native
  @JSName("config")
  def config_REWRITE(op: REWRITE): js.Promise[Ok] = js.native
  @JSName("config")
  def config_REWRITE(op: REWRITE, callback: Callback[Ok]): Unit = js.native
  @JSName("config")
  def config_SET(op: SET, key: String, value: ValueType): js.Promise[Ok] = js.native
  @JSName("config")
  def config_SET(op: SET, key: String, value: ValueType, callback: Callback[Ok]): Unit = js.native
  def dbsize(): js.Promise[Double] = js.native
  def dbsize(callback: Callback[Double]): Unit = js.native
  def debug(arg1: js.Array[ValueType]): js.Promise[_] = js.native
  def debug(arg1: js.Array[ValueType], cb: Callback[_]): Unit = js.native
  def debug(arg1: ValueType, arg2: js.Array[ValueType], cb: Callback[_]): Unit = js.native
  def debug(
    arg1: ValueType,
    arg2: ValueType,
    arg3: ValueType,
    arg4: ValueType,
    arg5: ValueType,
    arg6: ValueType,
    cb: Callback[_]
  ): Unit = js.native
  def debug(
    arg1: ValueType,
    arg2: ValueType,
    arg3: ValueType,
    arg4: ValueType,
    arg5: ValueType,
    cb: Callback[_]
  ): Unit = js.native
  def debug(arg1: ValueType, arg2: ValueType, arg3: ValueType, arg4: ValueType, cb: Callback[_]): Unit = js.native
  def debug(arg1: ValueType, arg2: ValueType, arg3: ValueType, cb: Callback[_]): Unit = js.native
  def debug(arg1: ValueType, arg2: ValueType, cb: Callback[_]): Unit = js.native
  def debug(arg1: ValueType, cb: Callback[_]): Unit = js.native
  def debug(args: ValueType*): js.Promise[_] = js.native
  def decr(key: KeyType): js.Promise[Double] = js.native
  def decr(key: KeyType, callback: Callback[Double]): Unit = js.native
  def decrby(key: KeyType, decrement: Double): js.Promise[Double] = js.native
  def decrby(key: KeyType, decrement: Double, callback: Callback[Double]): Unit = js.native
  def del(arg1: js.Array[KeyType]): js.Promise[Double] = js.native
  def del(arg1: js.Array[KeyType], cb: Callback[Double]): Unit = js.native
  def del(
    arg1: KeyType,
    arg2: KeyType,
    arg3: KeyType,
    arg4: KeyType,
    arg5: KeyType,
    arg6: KeyType,
    cb: Callback[Double]
  ): Unit = js.native
  def del(arg1: KeyType, arg2: KeyType, arg3: KeyType, arg4: KeyType, arg5: KeyType, cb: Callback[Double]): Unit = js.native
  def del(arg1: KeyType, arg2: KeyType, arg3: KeyType, arg4: KeyType, cb: Callback[Double]): Unit = js.native
  def del(arg1: KeyType, arg2: KeyType, arg3: KeyType, cb: Callback[Double]): Unit = js.native
  def del(arg1: KeyType, arg2: KeyType, cb: Callback[Double]): Unit = js.native
  def del(arg1: KeyType, cb: Callback[Double]): Unit = js.native
  def del(args: KeyType*): js.Promise[Double] = js.native
  def discard(): js.Promise[Ok] = js.native
  def discard(callback: Callback[Ok]): Unit = js.native
  def dump(key: KeyType): js.Promise[String] = js.native
  def dump(key: KeyType, callback: Callback[String]): Unit = js.native
  def echo(message: String): js.Promise[String] = js.native
  def echo(message: String, callback: Callback[String]): Unit = js.native
  // This overload exists specifically to retain compatibility to `redlock`
  // All arguments are by default flattened, declaring all possible permuatations
  // would be unreasonable (and probably impossible)
  def eval(args: js.Array[ValueType]): js.Any = js.native
  def eval(args: js.Array[ValueType], callback: Callback[_]): js.Any = js.native
  def eval(script: String, numKeys: Double, arg1: js.Array[ValueType]): js.Promise[_] = js.native
  def eval(script: String, numKeys: Double, arg1: js.Array[ValueType], cb: Callback[_]): Unit = js.native
  def eval(
    script: String,
    numKeys: Double,
    arg1: ValueType,
    arg2: ValueType,
    arg3: ValueType,
    arg4: ValueType,
    arg5: ValueType,
    arg6: ValueType,
    cb: Callback[_]
  ): Unit = js.native
  def eval(
    script: String,
    numKeys: Double,
    arg1: ValueType,
    arg2: ValueType,
    arg3: ValueType,
    arg4: ValueType,
    arg5: ValueType,
    cb: Callback[_]
  ): Unit = js.native
  def eval(
    script: String,
    numKeys: Double,
    arg1: ValueType,
    arg2: ValueType,
    arg3: ValueType,
    arg4: ValueType,
    cb: Callback[_]
  ): Unit = js.native
  def eval(
    script: String,
    numKeys: Double,
    arg1: ValueType,
    arg2: ValueType,
    arg3: ValueType,
    cb: Callback[_]
  ): Unit = js.native
  def eval(script: String, numKeys: Double, arg1: ValueType, arg2: ValueType, cb: Callback[_]): Unit = js.native
  def eval(script: String, numKeys: Double, arg1: ValueType, cb: Callback[_]): Unit = js.native
  def eval(script: String, numKeys: Double, args: ValueType*): js.Promise[_] = js.native
  // This overload exists specifically to retain compatibility to `redlock`
  // All arguments are by default flattened, declaring all possible permuatations
  // would be unreasonable (and probably impossible)
  def evalsha(args: js.Array[ValueType]): js.Any = js.native
  def evalsha(args: js.Array[ValueType], callback: Callback[_]): js.Any = js.native
  def evalsha(script: String, numKeys: Double, arg1: js.Array[ValueType]): js.Promise[_] = js.native
  def evalsha(script: String, numKeys: Double, arg1: js.Array[ValueType], cb: Callback[_]): Unit = js.native
  def evalsha(
    script: String,
    numKeys: Double,
    arg1: ValueType,
    arg2: ValueType,
    arg3: ValueType,
    arg4: ValueType,
    arg5: ValueType,
    arg6: ValueType,
    cb: Callback[_]
  ): Unit = js.native
  def evalsha(
    script: String,
    numKeys: Double,
    arg1: ValueType,
    arg2: ValueType,
    arg3: ValueType,
    arg4: ValueType,
    arg5: ValueType,
    cb: Callback[_]
  ): Unit = js.native
  def evalsha(
    script: String,
    numKeys: Double,
    arg1: ValueType,
    arg2: ValueType,
    arg3: ValueType,
    arg4: ValueType,
    cb: Callback[_]
  ): Unit = js.native
  def evalsha(
    script: String,
    numKeys: Double,
    arg1: ValueType,
    arg2: ValueType,
    arg3: ValueType,
    cb: Callback[_]
  ): Unit = js.native
  def evalsha(script: String, numKeys: Double, arg1: ValueType, arg2: ValueType, cb: Callback[_]): Unit = js.native
  def evalsha(script: String, numKeys: Double, arg1: ValueType, cb: Callback[_]): Unit = js.native
  def evalsha(script: String, numKeys: Double, args: ValueType*): js.Promise[_] = js.native
  def exec(): js.Promise[js.Array[js.Tuple2[Error | Null, String]]] = js.native
  def exec(callback: Callback[js.Array[js.Tuple2[Error | Null, String]]]): Unit = js.native
  def exists(keys: KeyType*): js.Promise[Double] = js.native
  def exists(key: KeyType, callback: Callback[Double]): Unit = js.native
  def expire(key: KeyType, seconds: Double): js.Promise[BooleanResponse] = js.native
  def expire(key: KeyType, seconds: Double, callback: Callback[BooleanResponse]): Unit = js.native
  def expireat(key: KeyType, timestamp: Double): js.Promise[BooleanResponse] = js.native
  def expireat(key: KeyType, timestamp: Double, callback: Callback[BooleanResponse]): Unit = js.native
  def flushall(): js.Promise[Ok] = js.native
  def flushall(callback: Callback[Ok]): Unit = js.native
  def flushdb(): js.Promise[Ok] = js.native
  def flushdb(callback: Callback[Ok]): Unit = js.native
  def get(key: KeyType): js.Promise[String | Null] = js.native
  def get(key: KeyType, callback: Callback[String | Null]): Unit = js.native
  def getBuffer(key: KeyType): js.Promise[Buffer] = js.native
  def getBuffer(key: KeyType, callback: Callback[Buffer]): Unit = js.native
  def getbit(key: KeyType, offset: Double): js.Promise[Double] = js.native
  def getbit(key: KeyType, offset: Double, callback: Callback[Double]): Unit = js.native
  def getrange(key: KeyType, start: Double, end: Double): js.Promise[String] = js.native
  def getrange(key: KeyType, start: Double, end: Double, callback: Callback[String]): Unit = js.native
  def getset(key: KeyType, value: ValueType): js.Promise[String | Null] = js.native
  def getset(key: KeyType, value: ValueType, callback: Callback[String | Null]): Unit = js.native
  def hdel(key: KeyType, arg1: js.Array[KeyType]): js.Promise[Double] = js.native
  def hdel(key: KeyType, arg1: js.Array[KeyType], cb: Callback[Double]): Unit = js.native
  def hdel(
    key: KeyType,
    arg1: KeyType,
    arg2: KeyType,
    arg3: KeyType,
    arg4: KeyType,
    arg5: KeyType,
    arg6: KeyType,
    cb: Callback[Double]
  ): Unit = js.native
  def hdel(
    key: KeyType,
    arg1: KeyType,
    arg2: KeyType,
    arg3: KeyType,
    arg4: KeyType,
    arg5: KeyType,
    cb: Callback[Double]
  ): Unit = js.native
  def hdel(key: KeyType, arg1: KeyType, arg2: KeyType, arg3: KeyType, arg4: KeyType, cb: Callback[Double]): Unit = js.native
  def hdel(key: KeyType, arg1: KeyType, arg2: KeyType, arg3: KeyType, cb: Callback[Double]): Unit = js.native
  def hdel(key: KeyType, arg1: KeyType, arg2: KeyType, cb: Callback[Double]): Unit = js.native
  def hdel(key: KeyType, arg1: KeyType, cb: Callback[Double]): Unit = js.native
  def hdel(key: KeyType, args: KeyType*): js.Promise[Double] = js.native
  def hexists(key: KeyType, field: String): js.Promise[BooleanResponse] = js.native
  def hexists(key: KeyType, field: String, callback: Callback[BooleanResponse]): Unit = js.native
  def hget(key: KeyType, field: String): js.Promise[String | Null] = js.native
  def hget(key: KeyType, field: String, callback: Callback[String | Null]): Unit = js.native
  def hgetBuffer(key: KeyType, field: String): js.Promise[Buffer] = js.native
  def hgetBuffer(key: KeyType, field: String, callback: Callback[Buffer]): Unit = js.native
  def hgetall(key: KeyType): js.Promise[Record[String, String]] = js.native
  def hgetall(key: KeyType, callback: Callback[Record[String, String]]): Unit = js.native
  def hincrby(key: KeyType, field: String, increment: Double): js.Promise[Double] = js.native
  def hincrby(key: KeyType, field: String, increment: Double, callback: Callback[Double]): Unit = js.native
  def hincrbyfloat(key: KeyType, field: String, increment: Double): js.Promise[Double] = js.native
  def hincrbyfloat(key: KeyType, field: String, increment: Double, callback: Callback[Double]): Unit = js.native
  def hkeys(key: KeyType): js.Promise[js.Array[String]] = js.native
  def hkeys(key: KeyType, callback: Callback[js.Array[String]]): Unit = js.native
  def hlen(key: KeyType): js.Promise[Double] = js.native
  def hlen(key: KeyType, callback: Callback[Double]): Unit = js.native
  def hmget(key: KeyType, arg1: js.Array[KeyType]): js.Promise[js.Array[String | Null]] = js.native
  def hmget(key: KeyType, arg1: js.Array[KeyType], cb: Callback[js.Array[String | Null]]): Unit = js.native
  def hmget(
    key: KeyType,
    arg1: KeyType,
    arg2: KeyType,
    arg3: KeyType,
    arg4: KeyType,
    arg5: KeyType,
    arg6: KeyType,
    cb: Callback[js.Array[String | Null]]
  ): Unit = js.native
  def hmget(
    key: KeyType,
    arg1: KeyType,
    arg2: KeyType,
    arg3: KeyType,
    arg4: KeyType,
    arg5: KeyType,
    cb: Callback[js.Array[String | Null]]
  ): Unit = js.native
  def hmget(
    key: KeyType,
    arg1: KeyType,
    arg2: KeyType,
    arg3: KeyType,
    arg4: KeyType,
    cb: Callback[js.Array[String | Null]]
  ): Unit = js.native
  def hmget(key: KeyType, arg1: KeyType, arg2: KeyType, arg3: KeyType, cb: Callback[js.Array[String | Null]]): Unit = js.native
  def hmget(key: KeyType, arg1: KeyType, arg2: KeyType, cb: Callback[js.Array[String | Null]]): Unit = js.native
  def hmget(key: KeyType, arg1: KeyType, cb: Callback[js.Array[String | Null]]): Unit = js.native
  def hmget(key: KeyType, args: KeyType*): js.Promise[js.Array[String | Null]] = js.native
  def hmset(
    key: KeyType,
    arg1: ValueType,
    arg2: ValueType,
    arg3: ValueType,
    arg4: ValueType,
    arg5: ValueType,
    arg6: ValueType,
    cb: Callback[Ok]
  ): Unit = js.native
  def hmset(key: KeyType, arg1: ValueType, arg2: ValueType, arg3: ValueType, arg4: ValueType, cb: Callback[Ok]): Unit = js.native
  def hmset(key: KeyType, arg1: ValueType, arg2: ValueType, cb: Callback[Ok]): Unit = js.native
  def hmset(key: KeyType, args: ValueType*): js.Promise[Ok] = js.native
  def hmset(key: KeyType, data: js.Array[ValueType]): js.Promise[Ok] = js.native
  def hmset(key: KeyType, data: js.Array[ValueType], cb: Callback[Ok]): Unit = js.native
  def hmset(key: KeyType, data: StringDictionary[ValueType]): js.Promise[Ok] = js.native
  def hmset(key: KeyType, data: StringDictionary[ValueType], cb: Callback[Ok]): Unit = js.native
  def hscan(key: KeyType, arg1: js.Array[ValueType]): js.Promise[js.Tuple2[String, js.Array[String]]] = js.native
  def hscan(key: KeyType, arg1: js.Array[ValueType], cb: Callback[js.Tuple2[String, js.Array[String]]]): Unit = js.native
  def hscan(
    key: KeyType,
    arg1: ValueType,
    arg2: ValueType,
    arg3: ValueType,
    arg4: ValueType,
    arg5: ValueType,
    arg6: ValueType,
    cb: Callback[js.Tuple2[String, js.Array[String]]]
  ): Unit = js.native
  def hscan(
    key: KeyType,
    arg1: ValueType,
    arg2: ValueType,
    arg3: ValueType,
    arg4: ValueType,
    arg5: ValueType,
    cb: Callback[js.Tuple2[String, js.Array[String]]]
  ): Unit = js.native
  def hscan(
    key: KeyType,
    arg1: ValueType,
    arg2: ValueType,
    arg3: ValueType,
    arg4: ValueType,
    cb: Callback[js.Tuple2[String, js.Array[String]]]
  ): Unit = js.native
  def hscan(
    key: KeyType,
    arg1: ValueType,
    arg2: ValueType,
    arg3: ValueType,
    cb: Callback[js.Tuple2[String, js.Array[String]]]
  ): Unit = js.native
  def hscan(key: KeyType, arg1: ValueType, arg2: ValueType, cb: Callback[js.Tuple2[String, js.Array[String]]]): Unit = js.native
  def hscan(key: KeyType, arg1: ValueType, cb: Callback[js.Tuple2[String, js.Array[String]]]): Unit = js.native
  def hscan(key: KeyType, args: ValueType*): js.Promise[js.Tuple2[String, js.Array[String]]] = js.native
  def hscanStream(key: KeyType): Readable = js.native
  def hscanStream(key: KeyType, options: ScanStreamOption): Readable = js.native
  def hset(key: KeyType, field: String, value: ValueType): js.Promise[BooleanResponse] = js.native
  def hset(key: KeyType, field: String, value: ValueType, callback: Callback[BooleanResponse]): Unit = js.native
  def hsetBuffer(key: KeyType, field: String, value: ValueType): js.Promise[Buffer] = js.native
  def hsetBuffer(key: KeyType, field: String, value: ValueType, callback: Callback[BooleanResponse]): Unit = js.native
  def hsetnx(key: KeyType, field: String, value: ValueType): js.Promise[BooleanResponse] = js.native
  def hsetnx(key: KeyType, field: String, value: ValueType, callback: Callback[BooleanResponse]): Unit = js.native
  def hvals(key: KeyType): js.Promise[js.Array[String]] = js.native
  def hvals(key: KeyType, callback: Callback[js.Array[String]]): Unit = js.native
  def incr(key: KeyType): js.Promise[Double] = js.native
  def incr(key: KeyType, callback: Callback[Double]): Unit = js.native
  def incrby(key: KeyType, increment: Double): js.Promise[Double] = js.native
  def incrby(key: KeyType, increment: Double, callback: Callback[Double]): Unit = js.native
  def incrbyfloat(key: KeyType, increment: Double): js.Promise[Double] = js.native
  def incrbyfloat(key: KeyType, increment: Double, callback: Callback[Double]): Unit = js.native
  def info(): js.Promise[String] = js.native
  def info(callback: Callback[String]): Unit = js.native
  def info(section: String): js.Promise[String] = js.native
  def info(section: String, callback: Callback[String]): Unit = js.native
  def keys(pattern: String): js.Promise[js.Array[String]] = js.native
  def keys(pattern: String, callback: Callback[js.Array[String]]): Unit = js.native
  def lastsave(): js.Promise[Double] = js.native
  def lastsave(callback: Callback[Double]): Unit = js.native
  def lindex(key: KeyType, index: Double): js.Promise[String] = js.native
  def lindex(key: KeyType, index: Double, callback: Callback[String]): Unit = js.native
  @JSName("linsert")
  def linsert_AFTER(key: KeyType, direction: AFTER, pivot: String, value: ValueType): js.Promise[Double] = js.native
  @JSName("linsert")
  def linsert_AFTER(key: KeyType, direction: AFTER, pivot: String, value: ValueType, callback: Callback[Double]): Unit = js.native
  @JSName("linsert")
  def linsert_BEFORE(key: KeyType, direction: BEFORE, pivot: String, value: ValueType): js.Promise[Double] = js.native
  @JSName("linsert")
  def linsert_BEFORE(key: KeyType, direction: BEFORE, pivot: String, value: ValueType, callback: Callback[Double]): Unit = js.native
  def llen(key: KeyType): js.Promise[Double] = js.native
  def llen(key: KeyType, callback: Callback[Double]): Unit = js.native
  def lpop(key: KeyType): js.Promise[String] = js.native
  def lpop(key: KeyType, callback: Callback[String]): Unit = js.native
  def lpopBuffer(key: KeyType): js.Promise[Buffer] = js.native
  def lpopBuffer(key: KeyType, callback: Callback[Buffer]): Unit = js.native
  def lpush(key: KeyType, arg1: js.Array[ValueType]): js.Promise[Double] = js.native
  def lpush(key: KeyType, arg1: js.Array[ValueType], cb: Callback[Double]): Unit = js.native
  def lpush(
    key: KeyType,
    arg1: ValueType,
    arg2: ValueType,
    arg3: ValueType,
    arg4: ValueType,
    arg5: ValueType,
    arg6: ValueType,
    cb: Callback[Double]
  ): Unit = js.native
  def lpush(
    key: KeyType,
    arg1: ValueType,
    arg2: ValueType,
    arg3: ValueType,
    arg4: ValueType,
    arg5: ValueType,
    cb: Callback[Double]
  ): Unit = js.native
  def lpush(
    key: KeyType,
    arg1: ValueType,
    arg2: ValueType,
    arg3: ValueType,
    arg4: ValueType,
    cb: Callback[Double]
  ): Unit = js.native
  def lpush(key: KeyType, arg1: ValueType, arg2: ValueType, arg3: ValueType, cb: Callback[Double]): Unit = js.native
  def lpush(key: KeyType, arg1: ValueType, arg2: ValueType, cb: Callback[Double]): Unit = js.native
  def lpush(key: KeyType, arg1: ValueType, cb: Callback[Double]): Unit = js.native
  def lpush(key: KeyType, args: ValueType*): js.Promise[Double] = js.native
  def lpushBuffer(key: KeyType, arg1: js.Array[Buffer]): js.Promise[Double] = js.native
  def lpushBuffer(key: KeyType, arg1: js.Array[Buffer], cb: Callback[Double]): Unit = js.native
  def lpushBuffer(
    key: KeyType,
    arg1: Buffer,
    arg2: Buffer,
    arg3: Buffer,
    arg4: Buffer,
    arg5: Buffer,
    arg6: Buffer,
    cb: Callback[Double]
  ): Unit = js.native
  def lpushBuffer(
    key: KeyType,
    arg1: Buffer,
    arg2: Buffer,
    arg3: Buffer,
    arg4: Buffer,
    arg5: Buffer,
    cb: Callback[Double]
  ): Unit = js.native
  def lpushBuffer(key: KeyType, arg1: Buffer, arg2: Buffer, arg3: Buffer, arg4: Buffer, cb: Callback[Double]): Unit = js.native
  def lpushBuffer(key: KeyType, arg1: Buffer, arg2: Buffer, arg3: Buffer, cb: Callback[Double]): Unit = js.native
  def lpushBuffer(key: KeyType, arg1: Buffer, arg2: Buffer, cb: Callback[Double]): Unit = js.native
  def lpushBuffer(key: KeyType, arg1: Buffer, cb: Callback[Double]): Unit = js.native
  def lpushBuffer(key: KeyType, args: Buffer*): js.Promise[Double] = js.native
  def lpushx(key: KeyType, arg1: js.Array[ValueType]): js.Promise[Double] = js.native
  def lpushx(key: KeyType, arg1: js.Array[ValueType], cb: Callback[Double]): Unit = js.native
  def lpushx(
    key: KeyType,
    arg1: ValueType,
    arg2: ValueType,
    arg3: ValueType,
    arg4: ValueType,
    arg5: ValueType,
    arg6: ValueType,
    cb: Callback[Double]
  ): Unit = js.native
  def lpushx(
    key: KeyType,
    arg1: ValueType,
    arg2: ValueType,
    arg3: ValueType,
    arg4: ValueType,
    arg5: ValueType,
    cb: Callback[Double]
  ): Unit = js.native
  def lpushx(
    key: KeyType,
    arg1: ValueType,
    arg2: ValueType,
    arg3: ValueType,
    arg4: ValueType,
    cb: Callback[Double]
  ): Unit = js.native
  def lpushx(key: KeyType, arg1: ValueType, arg2: ValueType, arg3: ValueType, cb: Callback[Double]): Unit = js.native
  def lpushx(key: KeyType, arg1: ValueType, arg2: ValueType, cb: Callback[Double]): Unit = js.native
  def lpushx(key: KeyType, arg1: ValueType, cb: Callback[Double]): Unit = js.native
  def lpushx(key: KeyType, args: ValueType*): js.Promise[Double] = js.native
  def lrange(key: KeyType, start: Double, stop: Double): js.Promise[js.Array[String]] = js.native
  def lrange(key: KeyType, start: Double, stop: Double, callback: Callback[js.Array[String]]): Unit = js.native
  def lrangeBuffer(key: KeyType, start: Double, stop: Double): js.Promise[js.Array[Buffer]] = js.native
  def lrangeBuffer(key: KeyType, start: Double, stop: Double, callback: Callback[js.Array[Buffer]]): Unit = js.native
  def lrem(key: KeyType, count: Double, value: ValueType): js.Promise[Double] = js.native
  def lrem(key: KeyType, count: Double, value: ValueType, callback: Callback[Double]): Unit = js.native
  def lset(key: KeyType, index: Double, value: ValueType): js.Promise[Ok] = js.native
  def lset(key: KeyType, index: Double, value: ValueType, callback: Callback[Ok]): Unit = js.native
  def ltrim(key: KeyType, start: Double, stop: Double): js.Promise[Ok] = js.native
  def ltrim(key: KeyType, start: Double, stop: Double, callback: Callback[Ok]): Unit = js.native
  def mget(arg1: js.Array[KeyType]): js.Promise[js.Array[String | Null]] = js.native
  def mget(arg1: js.Array[KeyType], cb: Callback[js.Array[String | Null]]): Unit = js.native
  def mget(
    arg1: KeyType,
    arg2: KeyType,
    arg3: KeyType,
    arg4: KeyType,
    arg5: KeyType,
    arg6: KeyType,
    cb: Callback[js.Array[String | Null]]
  ): Unit = js.native
  def mget(
    arg1: KeyType,
    arg2: KeyType,
    arg3: KeyType,
    arg4: KeyType,
    arg5: KeyType,
    cb: Callback[js.Array[String | Null]]
  ): Unit = js.native
  def mget(arg1: KeyType, arg2: KeyType, arg3: KeyType, arg4: KeyType, cb: Callback[js.Array[String | Null]]): Unit = js.native
  def mget(arg1: KeyType, arg2: KeyType, arg3: KeyType, cb: Callback[js.Array[String | Null]]): Unit = js.native
  def mget(arg1: KeyType, arg2: KeyType, cb: Callback[js.Array[String | Null]]): Unit = js.native
  def mget(arg1: KeyType, cb: Callback[js.Array[String | Null]]): Unit = js.native
  def mget(args: KeyType*): js.Promise[js.Array[String | Null]] = js.native
  def migrate(arg1: js.Array[ValueType]): js.Promise[Ok | NOKEY] = js.native
  def migrate(args: ValueType*): js.Promise[Ok | NOKEY] = js.native
  @JSName("migrate")
  def migrate_NOKEY(arg1: js.Array[ValueType], cb: Callback[Ok | NOKEY]): Unit = js.native
  @JSName("migrate")
  def migrate_NOKEY(
    arg1: ValueType,
    arg2: ValueType,
    arg3: ValueType,
    arg4: ValueType,
    arg5: ValueType,
    arg6: ValueType,
    cb: Callback[Ok | NOKEY]
  ): Unit = js.native
  @JSName("migrate")
  def migrate_NOKEY(
    arg1: ValueType,
    arg2: ValueType,
    arg3: ValueType,
    arg4: ValueType,
    arg5: ValueType,
    cb: Callback[Ok | NOKEY]
  ): Unit = js.native
  @JSName("migrate")
  def migrate_NOKEY(arg1: ValueType, arg2: ValueType, arg3: ValueType, arg4: ValueType, cb: Callback[Ok | NOKEY]): Unit = js.native
  @JSName("migrate")
  def migrate_NOKEY(arg1: ValueType, arg2: ValueType, arg3: ValueType, cb: Callback[Ok | NOKEY]): Unit = js.native
  @JSName("migrate")
  def migrate_NOKEY(arg1: ValueType, arg2: ValueType, cb: Callback[Ok | NOKEY]): Unit = js.native
  @JSName("migrate")
  def migrate_NOKEY(arg1: ValueType, cb: Callback[Ok | NOKEY]): Unit = js.native
  def monitor(): js.Promise[EventEmitter] = js.native
  def monitor(callback: Callback[EventEmitter]): Unit = js.native
  def move(key: KeyType, db: String): js.Promise[BooleanResponse] = js.native
  def move(key: KeyType, db: String, callback: Callback[BooleanResponse]): Unit = js.native
  def mset(
    arg1: ValueType,
    arg2: ValueType,
    arg3: ValueType,
    arg4: ValueType,
    arg5: ValueType,
    arg6: ValueType,
    cb: Callback[Ok]
  ): Unit = js.native
  def mset(arg1: ValueType, arg2: ValueType, arg3: ValueType, arg4: ValueType, cb: Callback[Ok]): Unit = js.native
  def mset(arg1: ValueType, arg2: ValueType, cb: Callback[Ok]): Unit = js.native
  def mset(args: ValueType*): js.Promise[Ok] = js.native
  def mset(data: js.Array[ValueType]): js.Promise[Ok] = js.native
  def mset(data: js.Array[ValueType], cb: Callback[Ok]): Unit = js.native
  def mset(data: StringDictionary[ValueType]): js.Promise[Ok] = js.native
  def mset(data: StringDictionary[ValueType], cb: Callback[Ok]): Unit = js.native
  def msetnx(
    arg1: ValueType,
    arg2: ValueType,
    arg3: ValueType,
    arg4: ValueType,
    arg5: ValueType,
    arg6: ValueType,
    cb: Callback[BooleanResponse]
  ): Unit = js.native
  def msetnx(arg1: ValueType, arg2: ValueType, arg3: ValueType, arg4: ValueType, cb: Callback[BooleanResponse]): Unit = js.native
  def msetnx(arg1: ValueType, arg2: ValueType, cb: Callback[BooleanResponse]): Unit = js.native
  def msetnx(args: ValueType*): js.Promise[BooleanResponse] = js.native
  def msetnx(data: js.Array[ValueType]): js.Promise[BooleanResponse] = js.native
  def msetnx(data: js.Array[ValueType], cb: Callback[BooleanResponse]): Unit = js.native
  def msetnx(data: StringDictionary[ValueType]): js.Promise[BooleanResponse] = js.native
  def msetnx(data: StringDictionary[ValueType], cb: Callback[BooleanResponse]): Unit = js.native
  def multi(): Pipeline = js.native
  def multi(commands: js.Array[js.Array[String]]): Pipeline = js.native
  def multi(commands: js.Array[js.Array[String]], options: MultiOptions): Pipeline = js.native
  def multi(options: typings.ioredis.anon.Pipeline): js.Promise[Ok] = js.native
  def `object`(arg1: js.Array[ValueType]): js.Promise[_] = js.native
  def `object`(arg1: js.Array[ValueType], cb: Callback[_]): Unit = js.native
  def `object`(
    arg1: ValueType,
    arg2: ValueType,
    arg3: ValueType,
    arg4: ValueType,
    arg5: ValueType,
    arg6: ValueType,
    cb: Callback[_]
  ): Unit = js.native
  def `object`(
    arg1: ValueType,
    arg2: ValueType,
    arg3: ValueType,
    arg4: ValueType,
    arg5: ValueType,
    cb: Callback[_]
  ): Unit = js.native
  def `object`(arg1: ValueType, arg2: ValueType, arg3: ValueType, arg4: ValueType, cb: Callback[_]): Unit = js.native
  def `object`(arg1: ValueType, arg2: ValueType, arg3: ValueType, cb: Callback[_]): Unit = js.native
  def `object`(arg1: ValueType, arg2: ValueType, cb: Callback[_]): Unit = js.native
  def `object`(arg1: ValueType, cb: Callback[_]): Unit = js.native
  def `object`(args: ValueType*): js.Promise[_] = js.native
  def persist(key: KeyType): js.Promise[BooleanResponse] = js.native
  def persist(key: KeyType, callback: Callback[BooleanResponse]): Unit = js.native
  def pexpire(key: KeyType, milliseconds: Double): js.Promise[BooleanResponse] = js.native
  def pexpire(key: KeyType, milliseconds: Double, callback: Callback[BooleanResponse]): Unit = js.native
  def pexpireat(key: KeyType, millisecondsTimestamp: Double): js.Promise[BooleanResponse] = js.native
  def pexpireat(key: KeyType, millisecondsTimestamp: Double, callback: Callback[BooleanResponse]): Unit = js.native
  def pfadd(
    key: KeyType,
    arg1: String,
    arg2: String,
    arg3: String,
    arg4: String,
    arg5: String,
    arg6: String,
    cb: Callback[Double]
  ): Unit = js.native
  def pfadd(
    key: KeyType,
    arg1: String,
    arg2: String,
    arg3: String,
    arg4: String,
    arg5: String,
    cb: Callback[Double]
  ): Unit = js.native
  def pfadd(key: KeyType, arg1: String, arg2: String, arg3: String, arg4: String, cb: Callback[Double]): Unit = js.native
  def pfadd(key: KeyType, arg1: String, arg2: String, arg3: String, cb: Callback[Double]): Unit = js.native
  def pfadd(key: KeyType, arg1: String, arg2: String, cb: Callback[Double]): Unit = js.native
  def pfadd(key: KeyType, arg1: String, cb: Callback[Double]): Unit = js.native
  def pfadd(key: KeyType, arg1: js.Array[String]): js.Promise[Double] = js.native
  def pfadd(key: KeyType, arg1: js.Array[String], cb: Callback[Double]): Unit = js.native
  def pfadd(key: KeyType, args: String*): js.Promise[Double] = js.native
  def pfcount(arg1: js.Array[KeyType]): js.Promise[Double] = js.native
  def pfcount(arg1: js.Array[KeyType], cb: Callback[Double]): Unit = js.native
  def pfcount(
    arg1: KeyType,
    arg2: KeyType,
    arg3: KeyType,
    arg4: KeyType,
    arg5: KeyType,
    arg6: KeyType,
    cb: Callback[Double]
  ): Unit = js.native
  def pfcount(arg1: KeyType, arg2: KeyType, arg3: KeyType, arg4: KeyType, arg5: KeyType, cb: Callback[Double]): Unit = js.native
  def pfcount(arg1: KeyType, arg2: KeyType, arg3: KeyType, arg4: KeyType, cb: Callback[Double]): Unit = js.native
  def pfcount(arg1: KeyType, arg2: KeyType, arg3: KeyType, cb: Callback[Double]): Unit = js.native
  def pfcount(arg1: KeyType, arg2: KeyType, cb: Callback[Double]): Unit = js.native
  def pfcount(arg1: KeyType, cb: Callback[Double]): Unit = js.native
  def pfcount(args: KeyType*): js.Promise[Double] = js.native
  def pfmerge(key: KeyType, arg1: js.Array[KeyType]): js.Promise[Ok] = js.native
  def pfmerge(key: KeyType, arg1: js.Array[KeyType], cb: Callback[Ok]): Unit = js.native
  def pfmerge(
    key: KeyType,
    arg1: KeyType,
    arg2: KeyType,
    arg3: KeyType,
    arg4: KeyType,
    arg5: KeyType,
    arg6: KeyType,
    cb: Callback[Ok]
  ): Unit = js.native
  def pfmerge(
    key: KeyType,
    arg1: KeyType,
    arg2: KeyType,
    arg3: KeyType,
    arg4: KeyType,
    arg5: KeyType,
    cb: Callback[Ok]
  ): Unit = js.native
  def pfmerge(key: KeyType, arg1: KeyType, arg2: KeyType, arg3: KeyType, arg4: KeyType, cb: Callback[Ok]): Unit = js.native
  def pfmerge(key: KeyType, arg1: KeyType, arg2: KeyType, arg3: KeyType, cb: Callback[Ok]): Unit = js.native
  def pfmerge(key: KeyType, arg1: KeyType, arg2: KeyType, cb: Callback[Ok]): Unit = js.native
  def pfmerge(key: KeyType, arg1: KeyType, cb: Callback[Ok]): Unit = js.native
  def pfmerge(key: KeyType, args: KeyType*): js.Promise[Ok] = js.native
  def ping(): js.Promise[String] = js.native
  def ping(callback: Callback[String]): Unit = js.native
  def ping(message: String): js.Promise[String] = js.native
  def ping(message: String, callback: Callback[String]): Unit = js.native
  def pipeline(): Pipeline = js.native
  def pipeline(commands: js.Array[js.Array[String]]): Pipeline = js.native
  def psetex(key: KeyType, milliseconds: Double, value: ValueType): js.Promise[Ok] = js.native
  def psetex(key: KeyType, milliseconds: Double, value: ValueType, callback: Callback[Ok]): Unit = js.native
  def psubscribe(
    arg1: String,
    arg2: String,
    arg3: String,
    arg4: String,
    arg5: String,
    arg6: String,
    cb: Callback[Double]
  ): Unit = js.native
  def psubscribe(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, cb: Callback[Double]): Unit = js.native
  def psubscribe(arg1: String, arg2: String, arg3: String, arg4: String, cb: Callback[Double]): Unit = js.native
  def psubscribe(arg1: String, arg2: String, arg3: String, cb: Callback[Double]): Unit = js.native
  def psubscribe(arg1: String, arg2: String, cb: Callback[Double]): Unit = js.native
  def psubscribe(arg1: String, cb: Callback[Double]): Unit = js.native
  def psubscribe(arg1: js.Array[String]): js.Promise[Double] = js.native
  def psubscribe(arg1: js.Array[String], cb: Callback[Double]): Unit = js.native
  def psubscribe(args: String*): js.Promise[Double] = js.native
  def pttl(key: KeyType): js.Promise[Double] = js.native
  def pttl(key: KeyType, callback: Callback[Double]): Unit = js.native
  def publish(channel: String, message: String): js.Promise[Double] = js.native
  def publish(channel: String, message: String, callback: Callback[Double]): Unit = js.native
  def publishBuffer(channel: String, message: Buffer): js.Promise[Double] = js.native
  def punsubscribe(
    arg1: String,
    arg2: String,
    arg3: String,
    arg4: String,
    arg5: String,
    arg6: String,
    cb: Callback[Double]
  ): Unit = js.native
  def punsubscribe(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, cb: Callback[Double]): Unit = js.native
  def punsubscribe(arg1: String, arg2: String, arg3: String, arg4: String, cb: Callback[Double]): Unit = js.native
  def punsubscribe(arg1: String, arg2: String, arg3: String, cb: Callback[Double]): Unit = js.native
  def punsubscribe(arg1: String, arg2: String, cb: Callback[Double]): Unit = js.native
  def punsubscribe(arg1: String, cb: Callback[Double]): Unit = js.native
  def punsubscribe(arg1: js.Array[String]): js.Promise[Double] = js.native
  def punsubscribe(arg1: js.Array[String], cb: Callback[Double]): Unit = js.native
  def punsubscribe(args: String*): js.Promise[Double] = js.native
  def punsubscribe(cb: Callback[Double]): Unit = js.native
  def quit(): js.Promise[Ok] = js.native
  def quit(callback: Callback[Ok]): Unit = js.native
  def randomkey(): js.Promise[String] = js.native
  def randomkey(callback: Callback[String]): Unit = js.native
  def rename(key: KeyType, newkey: KeyType): js.Promise[Ok] = js.native
  def rename(key: KeyType, newkey: KeyType, callback: Callback[Ok]): Unit = js.native
  def renamenx(key: KeyType, newkey: KeyType): js.Promise[BooleanResponse] = js.native
  def renamenx(key: KeyType, newkey: KeyType, callback: Callback[BooleanResponse]): Unit = js.native
  def restore(arg1: js.Array[ValueType]): js.Promise[Ok] = js.native
  def restore(arg1: js.Array[ValueType], cb: Callback[Ok]): Unit = js.native
  def restore(
    arg1: ValueType,
    arg2: ValueType,
    arg3: ValueType,
    arg4: ValueType,
    arg5: ValueType,
    arg6: ValueType,
    cb: Callback[Ok]
  ): Unit = js.native
  def restore(
    arg1: ValueType,
    arg2: ValueType,
    arg3: ValueType,
    arg4: ValueType,
    arg5: ValueType,
    cb: Callback[Ok]
  ): Unit = js.native
  def restore(arg1: ValueType, arg2: ValueType, arg3: ValueType, arg4: ValueType, cb: Callback[Ok]): Unit = js.native
  def restore(arg1: ValueType, arg2: ValueType, arg3: ValueType, cb: Callback[Ok]): Unit = js.native
  def restore(arg1: ValueType, arg2: ValueType, cb: Callback[Ok]): Unit = js.native
  def restore(arg1: ValueType, cb: Callback[Ok]): Unit = js.native
  def restore(args: ValueType*): js.Promise[Ok] = js.native
  def rpop(key: KeyType): js.Promise[String] = js.native
  def rpop(key: KeyType, callback: Callback[String]): Unit = js.native
  def rpoplpush(source: String, destination: String): js.Promise[String] = js.native
  def rpoplpush(source: String, destination: String, callback: Callback[String]): Unit = js.native
  def rpoplpushBuffer(source: String, destination: String): js.Promise[Buffer] = js.native
  def rpoplpushBuffer(source: String, destination: String, callback: Callback[Buffer]): Unit = js.native
  def rpush(key: KeyType, arg1: js.Array[ValueType]): js.Promise[Double] = js.native
  def rpush(key: KeyType, arg1: js.Array[ValueType], cb: Callback[Double]): Unit = js.native
  def rpush(
    key: KeyType,
    arg1: ValueType,
    arg2: ValueType,
    arg3: ValueType,
    arg4: ValueType,
    arg5: ValueType,
    arg6: ValueType,
    cb: Callback[Double]
  ): Unit = js.native
  def rpush(
    key: KeyType,
    arg1: ValueType,
    arg2: ValueType,
    arg3: ValueType,
    arg4: ValueType,
    arg5: ValueType,
    cb: Callback[Double]
  ): Unit = js.native
  def rpush(
    key: KeyType,
    arg1: ValueType,
    arg2: ValueType,
    arg3: ValueType,
    arg4: ValueType,
    cb: Callback[Double]
  ): Unit = js.native
  def rpush(key: KeyType, arg1: ValueType, arg2: ValueType, arg3: ValueType, cb: Callback[Double]): Unit = js.native
  def rpush(key: KeyType, arg1: ValueType, arg2: ValueType, cb: Callback[Double]): Unit = js.native
  def rpush(key: KeyType, arg1: ValueType, cb: Callback[Double]): Unit = js.native
  def rpush(key: KeyType, args: ValueType*): js.Promise[Double] = js.native
  def rpushBuffer(key: KeyType, arg1: js.Array[Buffer]): js.Promise[Double] = js.native
  def rpushBuffer(key: KeyType, arg1: js.Array[Buffer], cb: Callback[Double]): Unit = js.native
  def rpushBuffer(
    key: KeyType,
    arg1: Buffer,
    arg2: Buffer,
    arg3: Buffer,
    arg4: Buffer,
    arg5: Buffer,
    arg6: Buffer,
    cb: Callback[Double]
  ): Unit = js.native
  def rpushBuffer(
    key: KeyType,
    arg1: Buffer,
    arg2: Buffer,
    arg3: Buffer,
    arg4: Buffer,
    arg5: Buffer,
    cb: Callback[Double]
  ): Unit = js.native
  def rpushBuffer(key: KeyType, arg1: Buffer, arg2: Buffer, arg3: Buffer, arg4: Buffer, cb: Callback[Double]): Unit = js.native
  def rpushBuffer(key: KeyType, arg1: Buffer, arg2: Buffer, arg3: Buffer, cb: Callback[Double]): Unit = js.native
  def rpushBuffer(key: KeyType, arg1: Buffer, arg2: Buffer, cb: Callback[Double]): Unit = js.native
  def rpushBuffer(key: KeyType, arg1: Buffer, cb: Callback[Double]): Unit = js.native
  def rpushBuffer(key: KeyType, args: Buffer*): js.Promise[Double] = js.native
  def rpushx(key: KeyType, arg1: js.Array[ValueType]): js.Promise[Double] = js.native
  def rpushx(key: KeyType, arg1: js.Array[ValueType], cb: Callback[Double]): Unit = js.native
  def rpushx(
    key: KeyType,
    arg1: ValueType,
    arg2: ValueType,
    arg3: ValueType,
    arg4: ValueType,
    arg5: ValueType,
    arg6: ValueType,
    cb: Callback[Double]
  ): Unit = js.native
  def rpushx(
    key: KeyType,
    arg1: ValueType,
    arg2: ValueType,
    arg3: ValueType,
    arg4: ValueType,
    arg5: ValueType,
    cb: Callback[Double]
  ): Unit = js.native
  def rpushx(
    key: KeyType,
    arg1: ValueType,
    arg2: ValueType,
    arg3: ValueType,
    arg4: ValueType,
    cb: Callback[Double]
  ): Unit = js.native
  def rpushx(key: KeyType, arg1: ValueType, arg2: ValueType, arg3: ValueType, cb: Callback[Double]): Unit = js.native
  def rpushx(key: KeyType, arg1: ValueType, arg2: ValueType, cb: Callback[Double]): Unit = js.native
  def rpushx(key: KeyType, arg1: ValueType, cb: Callback[Double]): Unit = js.native
  def rpushx(key: KeyType, args: ValueType*): js.Promise[Double] = js.native
  def sadd(key: KeyType, arg1: js.Array[ValueType]): js.Promise[Double] = js.native
  def sadd(key: KeyType, arg1: js.Array[ValueType], cb: Callback[Double]): Unit = js.native
  def sadd(
    key: KeyType,
    arg1: ValueType,
    arg2: ValueType,
    arg3: ValueType,
    arg4: ValueType,
    arg5: ValueType,
    arg6: ValueType,
    cb: Callback[Double]
  ): Unit = js.native
  def sadd(
    key: KeyType,
    arg1: ValueType,
    arg2: ValueType,
    arg3: ValueType,
    arg4: ValueType,
    arg5: ValueType,
    cb: Callback[Double]
  ): Unit = js.native
  def sadd(
    key: KeyType,
    arg1: ValueType,
    arg2: ValueType,
    arg3: ValueType,
    arg4: ValueType,
    cb: Callback[Double]
  ): Unit = js.native
  def sadd(key: KeyType, arg1: ValueType, arg2: ValueType, arg3: ValueType, cb: Callback[Double]): Unit = js.native
  def sadd(key: KeyType, arg1: ValueType, arg2: ValueType, cb: Callback[Double]): Unit = js.native
  def sadd(key: KeyType, arg1: ValueType, cb: Callback[Double]): Unit = js.native
  def sadd(key: KeyType, args: ValueType*): js.Promise[Double] = js.native
  def save(): js.Promise[String] = js.native
  def save(callback: Callback[String]): Unit = js.native
  def scan(cursor: String, countOption: COUNT, count: Double, matchOption: MATCH, pattern: String): js.Promise[js.Tuple2[String, js.Array[String]]] = js.native
  def scan(
    cursor: String,
    countOption: COUNT,
    count: Double,
    matchOption: MATCH,
    pattern: String,
    callback: Callback[js.Tuple2[String, js.Array[String]]]
  ): Unit = js.native
  def scan(cursor: String, countOption: COUNT, count: Double, matchOption: match_, pattern: String): js.Promise[js.Tuple2[String, js.Array[String]]] = js.native
  def scan(
    cursor: String,
    countOption: COUNT,
    count: Double,
    matchOption: match_,
    pattern: String,
    callback: Callback[js.Tuple2[String, js.Array[String]]]
  ): Unit = js.native
  def scan(cursor: String, countOption: count_, count: Double, matchOption: MATCH, pattern: String): js.Promise[js.Tuple2[String, js.Array[String]]] = js.native
  def scan(
    cursor: String,
    countOption: count_,
    count: Double,
    matchOption: MATCH,
    pattern: String,
    callback: Callback[js.Tuple2[String, js.Array[String]]]
  ): Unit = js.native
  def scan(cursor: String, countOption: count_, count: Double, matchOption: match_, pattern: String): js.Promise[js.Tuple2[String, js.Array[String]]] = js.native
  def scan(
    cursor: String,
    countOption: count_,
    count: Double,
    matchOption: match_,
    pattern: String,
    callback: Callback[js.Tuple2[String, js.Array[String]]]
  ): Unit = js.native
  def scan(cursor: String, matchOption: MATCH, pattern: String, countOption: COUNT, count: Double): js.Promise[js.Tuple2[String, js.Array[String]]] = js.native
  def scan(
    cursor: String,
    matchOption: MATCH,
    pattern: String,
    countOption: COUNT,
    count: Double,
    callback: Callback[js.Tuple2[String, js.Array[String]]]
  ): Unit = js.native
  def scan(cursor: String, matchOption: MATCH, pattern: String, countOption: count_, count: Double): js.Promise[js.Tuple2[String, js.Array[String]]] = js.native
  def scan(
    cursor: String,
    matchOption: MATCH,
    pattern: String,
    countOption: count_,
    count: Double,
    callback: Callback[js.Tuple2[String, js.Array[String]]]
  ): Unit = js.native
  def scan(cursor: String, matchOption: match_, pattern: String, countOption: COUNT, count: Double): js.Promise[js.Tuple2[String, js.Array[String]]] = js.native
  def scan(
    cursor: String,
    matchOption: match_,
    pattern: String,
    countOption: COUNT,
    count: Double,
    callback: Callback[js.Tuple2[String, js.Array[String]]]
  ): Unit = js.native
  def scan(cursor: String, matchOption: match_, pattern: String, countOption: count_, count: Double): js.Promise[js.Tuple2[String, js.Array[String]]] = js.native
  def scan(
    cursor: String,
    matchOption: match_,
    pattern: String,
    countOption: count_,
    count: Double,
    callback: Callback[js.Tuple2[String, js.Array[String]]]
  ): Unit = js.native
  def scan(cursor: Double, countOption: COUNT, count: Double, matchOption: MATCH, pattern: String): js.Promise[js.Tuple2[String, js.Array[String]]] = js.native
  def scan(
    cursor: Double,
    countOption: COUNT,
    count: Double,
    matchOption: MATCH,
    pattern: String,
    callback: Callback[js.Tuple2[String, js.Array[String]]]
  ): Unit = js.native
  def scan(cursor: Double, countOption: COUNT, count: Double, matchOption: match_, pattern: String): js.Promise[js.Tuple2[String, js.Array[String]]] = js.native
  def scan(
    cursor: Double,
    countOption: COUNT,
    count: Double,
    matchOption: match_,
    pattern: String,
    callback: Callback[js.Tuple2[String, js.Array[String]]]
  ): Unit = js.native
  def scan(cursor: Double, countOption: count_, count: Double, matchOption: MATCH, pattern: String): js.Promise[js.Tuple2[String, js.Array[String]]] = js.native
  def scan(
    cursor: Double,
    countOption: count_,
    count: Double,
    matchOption: MATCH,
    pattern: String,
    callback: Callback[js.Tuple2[String, js.Array[String]]]
  ): Unit = js.native
  def scan(cursor: Double, countOption: count_, count: Double, matchOption: match_, pattern: String): js.Promise[js.Tuple2[String, js.Array[String]]] = js.native
  def scan(
    cursor: Double,
    countOption: count_,
    count: Double,
    matchOption: match_,
    pattern: String,
    callback: Callback[js.Tuple2[String, js.Array[String]]]
  ): Unit = js.native
  def scan(cursor: Double, matchOption: MATCH, pattern: String, countOption: COUNT, count: Double): js.Promise[js.Tuple2[String, js.Array[String]]] = js.native
  def scan(
    cursor: Double,
    matchOption: MATCH,
    pattern: String,
    countOption: COUNT,
    count: Double,
    callback: Callback[js.Tuple2[String, js.Array[String]]]
  ): Unit = js.native
  def scan(cursor: Double, matchOption: MATCH, pattern: String, countOption: count_, count: Double): js.Promise[js.Tuple2[String, js.Array[String]]] = js.native
  def scan(
    cursor: Double,
    matchOption: MATCH,
    pattern: String,
    countOption: count_,
    count: Double,
    callback: Callback[js.Tuple2[String, js.Array[String]]]
  ): Unit = js.native
  def scan(cursor: Double, matchOption: match_, pattern: String, countOption: COUNT, count: Double): js.Promise[js.Tuple2[String, js.Array[String]]] = js.native
  def scan(
    cursor: Double,
    matchOption: match_,
    pattern: String,
    countOption: COUNT,
    count: Double,
    callback: Callback[js.Tuple2[String, js.Array[String]]]
  ): Unit = js.native
  def scan(cursor: Double, matchOption: match_, pattern: String, countOption: count_, count: Double): js.Promise[js.Tuple2[String, js.Array[String]]] = js.native
  def scan(
    cursor: Double,
    matchOption: match_,
    pattern: String,
    countOption: count_,
    count: Double,
    callback: Callback[js.Tuple2[String, js.Array[String]]]
  ): Unit = js.native
  def scanStream(): Readable = js.native
  def scanStream(options: ScanStreamOption): Readable = js.native
  @JSName("scan")
  def scan_COUNT(cursor: String, countOption: COUNT, count: Double): js.Promise[js.Tuple2[String, js.Array[String]]] = js.native
  @JSName("scan")
  def scan_COUNT(
    cursor: String,
    countOption: COUNT,
    count: Double,
    callback: Callback[js.Tuple2[String, js.Array[String]]]
  ): Unit = js.native
  @JSName("scan")
  def scan_COUNT(cursor: Double, countOption: COUNT, count: Double): js.Promise[js.Tuple2[String, js.Array[String]]] = js.native
  @JSName("scan")
  def scan_COUNT(
    cursor: Double,
    countOption: COUNT,
    count: Double,
    callback: Callback[js.Tuple2[String, js.Array[String]]]
  ): Unit = js.native
  @JSName("scan")
  def scan_MATCH(cursor: String, matchOption: MATCH, pattern: String): js.Promise[js.Tuple2[String, js.Array[String]]] = js.native
  @JSName("scan")
  def scan_MATCH(
    cursor: String,
    matchOption: MATCH,
    pattern: String,
    callback: Callback[js.Tuple2[String, js.Array[String]]]
  ): Unit = js.native
  @JSName("scan")
  def scan_MATCH(cursor: Double, matchOption: MATCH, pattern: String): js.Promise[js.Tuple2[String, js.Array[String]]] = js.native
  @JSName("scan")
  def scan_MATCH(
    cursor: Double,
    matchOption: MATCH,
    pattern: String,
    callback: Callback[js.Tuple2[String, js.Array[String]]]
  ): Unit = js.native
  @JSName("scan")
  def scan_count(cursor: String, countOption: count_, count: Double): js.Promise[js.Tuple2[String, js.Array[String]]] = js.native
  @JSName("scan")
  def scan_count(
    cursor: String,
    countOption: count_,
    count: Double,
    callback: Callback[js.Tuple2[String, js.Array[String]]]
  ): Unit = js.native
  @JSName("scan")
  def scan_count(cursor: Double, countOption: count_, count: Double): js.Promise[js.Tuple2[String, js.Array[String]]] = js.native
  @JSName("scan")
  def scan_count(
    cursor: Double,
    countOption: count_,
    count: Double,
    callback: Callback[js.Tuple2[String, js.Array[String]]]
  ): Unit = js.native
  @JSName("scan")
  def scan_match(cursor: String, matchOption: match_, pattern: String): js.Promise[js.Tuple2[String, js.Array[String]]] = js.native
  @JSName("scan")
  def scan_match(
    cursor: String,
    matchOption: match_,
    pattern: String,
    callback: Callback[js.Tuple2[String, js.Array[String]]]
  ): Unit = js.native
  @JSName("scan")
  def scan_match(cursor: Double, matchOption: match_, pattern: String): js.Promise[js.Tuple2[String, js.Array[String]]] = js.native
  @JSName("scan")
  def scan_match(
    cursor: Double,
    matchOption: match_,
    pattern: String,
    callback: Callback[js.Tuple2[String, js.Array[String]]]
  ): Unit = js.native
  def scard(key: KeyType): js.Promise[Double] = js.native
  def scard(key: KeyType, callback: Callback[Double]): Unit = js.native
  def script(arg1: js.Array[ValueType]): js.Promise[_] = js.native
  def script(arg1: js.Array[ValueType], cb: Callback[_]): Unit = js.native
  def script(arg1: ValueType, arg2: js.Array[ValueType], cb: Callback[_]): Unit = js.native
  def script(
    arg1: ValueType,
    arg2: ValueType,
    arg3: ValueType,
    arg4: ValueType,
    arg5: ValueType,
    arg6: ValueType,
    cb: Callback[_]
  ): Unit = js.native
  def script(
    arg1: ValueType,
    arg2: ValueType,
    arg3: ValueType,
    arg4: ValueType,
    arg5: ValueType,
    cb: Callback[_]
  ): Unit = js.native
  def script(arg1: ValueType, arg2: ValueType, arg3: ValueType, arg4: ValueType, cb: Callback[_]): Unit = js.native
  def script(arg1: ValueType, arg2: ValueType, arg3: ValueType, cb: Callback[_]): Unit = js.native
  def script(arg1: ValueType, arg2: ValueType, cb: Callback[_]): Unit = js.native
  def script(arg1: ValueType, cb: Callback[_]): Unit = js.native
  def script(args: ValueType*): js.Promise[_] = js.native
  def sdiff(arg1: js.Array[KeyType]): js.Promise[js.Array[String]] = js.native
  def sdiff(arg1: js.Array[KeyType], cb: Callback[js.Array[String]]): Unit = js.native
  def sdiff(
    arg1: KeyType,
    arg2: KeyType,
    arg3: KeyType,
    arg4: KeyType,
    arg5: KeyType,
    arg6: KeyType,
    cb: Callback[js.Array[String]]
  ): Unit = js.native
  def sdiff(
    arg1: KeyType,
    arg2: KeyType,
    arg3: KeyType,
    arg4: KeyType,
    arg5: KeyType,
    cb: Callback[js.Array[String]]
  ): Unit = js.native
  def sdiff(arg1: KeyType, arg2: KeyType, arg3: KeyType, arg4: KeyType, cb: Callback[js.Array[String]]): Unit = js.native
  def sdiff(arg1: KeyType, arg2: KeyType, arg3: KeyType, cb: Callback[js.Array[String]]): Unit = js.native
  def sdiff(arg1: KeyType, arg2: KeyType, cb: Callback[js.Array[String]]): Unit = js.native
  def sdiff(arg1: KeyType, cb: Callback[js.Array[String]]): Unit = js.native
  def sdiff(args: KeyType*): js.Promise[js.Array[String]] = js.native
  def sdiffstore(key: KeyType, arg1: js.Array[KeyType]): js.Promise[Double] = js.native
  def sdiffstore(key: KeyType, arg1: js.Array[KeyType], cb: Callback[Double]): Unit = js.native
  def sdiffstore(
    key: KeyType,
    arg1: KeyType,
    arg2: KeyType,
    arg3: KeyType,
    arg4: KeyType,
    arg5: KeyType,
    arg6: KeyType,
    cb: Callback[Double]
  ): Unit = js.native
  def sdiffstore(
    key: KeyType,
    arg1: KeyType,
    arg2: KeyType,
    arg3: KeyType,
    arg4: KeyType,
    arg5: KeyType,
    cb: Callback[Double]
  ): Unit = js.native
  def sdiffstore(key: KeyType, arg1: KeyType, arg2: KeyType, arg3: KeyType, arg4: KeyType, cb: Callback[Double]): Unit = js.native
  def sdiffstore(key: KeyType, arg1: KeyType, arg2: KeyType, arg3: KeyType, cb: Callback[Double]): Unit = js.native
  def sdiffstore(key: KeyType, arg1: KeyType, arg2: KeyType, cb: Callback[Double]): Unit = js.native
  def sdiffstore(key: KeyType, arg1: KeyType, cb: Callback[Double]): Unit = js.native
  def sdiffstore(key: KeyType, args: KeyType*): js.Promise[Double] = js.native
  def select(index: Double): js.Promise[Ok] = js.native
  def select(index: Double, callback: Callback[Ok]): Unit = js.native
  def set(key: KeyType, value: ValueType): js.Promise[Ok] = js.native
  def set(key: KeyType, value: ValueType, callback: Callback[Ok]): Unit = js.native
  def set(key: KeyType, value: ValueType, expiryMode: String): js.Promise[Ok] = js.native
  def set(key: KeyType, value: ValueType, expiryMode: String, time: String): js.Promise[Ok] = js.native
  def set(key: KeyType, value: ValueType, expiryMode: String, time: String, callback: Callback[Ok]): Unit = js.native
  def set(key: KeyType, value: ValueType, expiryMode: String, time: String, setMode: String): js.Promise[Ok] = js.native
  def set(
    key: KeyType,
    value: ValueType,
    expiryMode: String,
    time: String,
    setMode: String,
    callback: Callback[Ok]
  ): Unit = js.native
  def set(key: KeyType, value: ValueType, expiryMode: String, time: String, setMode: Double): js.Promise[Ok] = js.native
  def set(
    key: KeyType,
    value: ValueType,
    expiryMode: String,
    time: String,
    setMode: Double,
    callback: Callback[Ok]
  ): Unit = js.native
  def set(key: KeyType, value: ValueType, expiryMode: String, time: Double): js.Promise[Ok] = js.native
  def set(key: KeyType, value: ValueType, expiryMode: String, time: Double, callback: Callback[Ok]): Unit = js.native
  def set(key: KeyType, value: ValueType, expiryMode: String, time: Double, setMode: String): js.Promise[Ok] = js.native
  def set(
    key: KeyType,
    value: ValueType,
    expiryMode: String,
    time: Double,
    setMode: String,
    callback: Callback[Ok]
  ): Unit = js.native
  def set(key: KeyType, value: ValueType, expiryMode: String, time: Double, setMode: Double): js.Promise[Ok] = js.native
  def set(
    key: KeyType,
    value: ValueType,
    expiryMode: String,
    time: Double,
    setMode: Double,
    callback: Callback[Ok]
  ): Unit = js.native
  def set(key: KeyType, value: ValueType, expiryMode: js.Array[_]): js.Promise[Ok] = js.native
  def set(key: KeyType, value: ValueType, expiryMode: js.Array[_], time: String): js.Promise[Ok] = js.native
  def set(key: KeyType, value: ValueType, expiryMode: js.Array[_], time: String, setMode: String): js.Promise[Ok] = js.native
  def set(key: KeyType, value: ValueType, expiryMode: js.Array[_], time: String, setMode: Double): js.Promise[Ok] = js.native
  def set(key: KeyType, value: ValueType, expiryMode: js.Array[_], time: Double): js.Promise[Ok] = js.native
  def set(key: KeyType, value: ValueType, expiryMode: js.Array[_], time: Double, setMode: String): js.Promise[Ok] = js.native
  def set(key: KeyType, value: ValueType, expiryMode: js.Array[_], time: Double, setMode: Double): js.Promise[Ok] = js.native
  def set(key: KeyType, value: ValueType, setMode: String, callback: Callback[Ok]): Unit = js.native
  def set(key: KeyType, value: ValueType, setMode: js.Array[_], callback: Callback[Ok]): Unit = js.native
  def setBuffer(key: KeyType, value: ValueType): js.Promise[Buffer] = js.native
  def setBuffer(key: KeyType, value: ValueType, callback: Callback[Buffer]): Unit = js.native
  def setBuffer(key: KeyType, value: ValueType, expiryMode: String): js.Promise[Buffer] = js.native
  def setBuffer(key: KeyType, value: ValueType, expiryMode: String, time: String): js.Promise[Buffer] = js.native
  def setBuffer(key: KeyType, value: ValueType, expiryMode: String, time: String, setMode: String): js.Promise[Buffer] = js.native
  def setBuffer(
    key: KeyType,
    value: ValueType,
    expiryMode: String,
    time: String,
    setMode: String,
    callback: Callback[Buffer]
  ): Unit = js.native
  def setBuffer(key: KeyType, value: ValueType, expiryMode: String, time: String, setMode: Double): js.Promise[Buffer] = js.native
  def setBuffer(
    key: KeyType,
    value: ValueType,
    expiryMode: String,
    time: String,
    setMode: Double,
    callback: Callback[Buffer]
  ): Unit = js.native
  def setBuffer(key: KeyType, value: ValueType, expiryMode: String, time: Double): js.Promise[Buffer] = js.native
  def setBuffer(key: KeyType, value: ValueType, expiryMode: String, time: Double, callback: Callback[Buffer]): Unit = js.native
  def setBuffer(key: KeyType, value: ValueType, expiryMode: String, time: Double, setMode: String): js.Promise[Buffer] = js.native
  def setBuffer(
    key: KeyType,
    value: ValueType,
    expiryMode: String,
    time: Double,
    setMode: String,
    callback: Callback[Buffer]
  ): Unit = js.native
  def setBuffer(key: KeyType, value: ValueType, expiryMode: String, time: Double, setMode: Double): js.Promise[Buffer] = js.native
  def setBuffer(
    key: KeyType,
    value: ValueType,
    expiryMode: String,
    time: Double,
    setMode: Double,
    callback: Callback[Buffer]
  ): Unit = js.native
  def setBuffer(key: KeyType, value: ValueType, expiryMode: js.Array[_]): js.Promise[Buffer] = js.native
  def setBuffer(key: KeyType, value: ValueType, expiryMode: js.Array[_], time: String): js.Promise[Buffer] = js.native
  def setBuffer(key: KeyType, value: ValueType, expiryMode: js.Array[_], time: String, setMode: String): js.Promise[Buffer] = js.native
  def setBuffer(key: KeyType, value: ValueType, expiryMode: js.Array[_], time: String, setMode: Double): js.Promise[Buffer] = js.native
  def setBuffer(key: KeyType, value: ValueType, expiryMode: js.Array[_], time: Double): js.Promise[Buffer] = js.native
  def setBuffer(key: KeyType, value: ValueType, expiryMode: js.Array[_], time: Double, setMode: String): js.Promise[Buffer] = js.native
  def setBuffer(key: KeyType, value: ValueType, expiryMode: js.Array[_], time: Double, setMode: Double): js.Promise[Buffer] = js.native
  def setBuffer(key: KeyType, value: ValueType, setMode: String, callback: Callback[Buffer]): Unit = js.native
  def setbit(key: KeyType, offset: Double, value: ValueType): js.Promise[Double] = js.native
  def setbit(key: KeyType, offset: Double, value: ValueType, callback: Callback[Double]): Unit = js.native
  def setex(key: KeyType, seconds: Double, value: ValueType): js.Promise[Ok] = js.native
  def setex(key: KeyType, seconds: Double, value: ValueType, callback: Callback[Ok]): Unit = js.native
  def setnx(key: KeyType, value: ValueType): js.Promise[BooleanResponse] = js.native
  def setnx(key: KeyType, value: ValueType, callback: Callback[BooleanResponse]): Unit = js.native
  def setrange(key: KeyType, offset: Double, value: ValueType): js.Promise[Double] = js.native
  def setrange(key: KeyType, offset: Double, value: ValueType, callback: Callback[Double]): Unit = js.native
  @JSName("shutdown")
  def shutdown_NOSAVE(save: NOSAVE): js.Promise[scala.Nothing] = js.native
  @JSName("shutdown")
  def shutdown_NOSAVE(save: NOSAVE, callback: Callback[scala.Nothing]): Unit = js.native
  @JSName("shutdown")
  def shutdown_SAVE(save: SAVE): js.Promise[scala.Nothing] = js.native
  @JSName("shutdown")
  def shutdown_SAVE(save: SAVE, callback: Callback[scala.Nothing]): Unit = js.native
  def sinter(arg1: js.Array[KeyType]): js.Promise[js.Array[String]] = js.native
  def sinter(arg1: js.Array[KeyType], cb: Callback[js.Array[String]]): Unit = js.native
  def sinter(
    arg1: KeyType,
    arg2: KeyType,
    arg3: KeyType,
    arg4: KeyType,
    arg5: KeyType,
    arg6: KeyType,
    cb: Callback[js.Array[String]]
  ): Unit = js.native
  def sinter(
    arg1: KeyType,
    arg2: KeyType,
    arg3: KeyType,
    arg4: KeyType,
    arg5: KeyType,
    cb: Callback[js.Array[String]]
  ): Unit = js.native
  def sinter(arg1: KeyType, arg2: KeyType, arg3: KeyType, arg4: KeyType, cb: Callback[js.Array[String]]): Unit = js.native
  def sinter(arg1: KeyType, arg2: KeyType, arg3: KeyType, cb: Callback[js.Array[String]]): Unit = js.native
  def sinter(arg1: KeyType, arg2: KeyType, cb: Callback[js.Array[String]]): Unit = js.native
  def sinter(arg1: KeyType, cb: Callback[js.Array[String]]): Unit = js.native
  def sinter(args: KeyType*): js.Promise[js.Array[String]] = js.native
  def sinterstore(key: KeyType, arg1: js.Array[KeyType]): js.Promise[Double] = js.native
  def sinterstore(key: KeyType, arg1: js.Array[KeyType], cb: Callback[Double]): Unit = js.native
  def sinterstore(
    key: KeyType,
    arg1: KeyType,
    arg2: KeyType,
    arg3: KeyType,
    arg4: KeyType,
    arg5: KeyType,
    arg6: KeyType,
    cb: Callback[Double]
  ): Unit = js.native
  def sinterstore(
    key: KeyType,
    arg1: KeyType,
    arg2: KeyType,
    arg3: KeyType,
    arg4: KeyType,
    arg5: KeyType,
    cb: Callback[Double]
  ): Unit = js.native
  def sinterstore(key: KeyType, arg1: KeyType, arg2: KeyType, arg3: KeyType, arg4: KeyType, cb: Callback[Double]): Unit = js.native
  def sinterstore(key: KeyType, arg1: KeyType, arg2: KeyType, arg3: KeyType, cb: Callback[Double]): Unit = js.native
  def sinterstore(key: KeyType, arg1: KeyType, arg2: KeyType, cb: Callback[Double]): Unit = js.native
  def sinterstore(key: KeyType, arg1: KeyType, cb: Callback[Double]): Unit = js.native
  def sinterstore(key: KeyType, args: KeyType*): js.Promise[Double] = js.native
  def sismember(key: KeyType, member: String): js.Promise[BooleanResponse] = js.native
  def sismember(key: KeyType, member: String, callback: Callback[BooleanResponse]): Unit = js.native
  def slaveof(host: String, port: Double): js.Promise[String] = js.native
  def slaveof(host: String, port: Double, callback: Callback[String]): Unit = js.native
  def smembers(key: KeyType): js.Promise[js.Array[String]] = js.native
  def smembers(key: KeyType, callback: Callback[js.Array[String]]): Unit = js.native
  def smove(source: String, destination: String, member: String): js.Promise[BooleanResponse] = js.native
  def smove(source: String, destination: String, member: String, callback: Callback[BooleanResponse]): Unit = js.native
  def sort(
    arg1: KeyType | Double,
    arg2: KeyType | Double,
    arg3: KeyType | Double,
    arg4: KeyType | Double,
    arg5: KeyType | Double,
    arg6: KeyType | Double,
    cb: Callback[js.Array[String] | Double]
  ): Unit = js.native
  def sort(
    arg1: KeyType | Double,
    arg2: KeyType | Double,
    arg3: KeyType | Double,
    arg4: KeyType | Double,
    arg5: KeyType | Double,
    cb: Callback[js.Array[String] | Double]
  ): Unit = js.native
  def sort(arg1: KeyType | Double, cb: Callback[js.Array[String] | Double]): Unit = js.native
  def sort(arg1: js.Array[KeyType | Double]): js.Promise[js.Array[String] | Double] = js.native
  def sort(arg1: js.Array[KeyType | Double], cb: Callback[js.Array[String] | Double]): Unit = js.native
  def sort(arg1: Double, arg2: Double, arg3: Double, arg4: Double, cb: Callback[js.Array[String] | Double]): Unit = js.native
  def sort(arg1: Double, arg2: Double, arg3: Double, arg4: KeyType, cb: Callback[js.Array[String] | Double]): Unit = js.native
  def sort(arg1: Double, arg2: Double, arg3: Double, cb: Callback[js.Array[String] | Double]): Unit = js.native
  def sort(arg1: Double, arg2: Double, arg3: KeyType, arg4: Double, cb: Callback[js.Array[String] | Double]): Unit = js.native
  def sort(arg1: Double, arg2: Double, arg3: KeyType, arg4: KeyType, cb: Callback[js.Array[String] | Double]): Unit = js.native
  def sort(arg1: Double, arg2: Double, arg3: KeyType, cb: Callback[js.Array[String] | Double]): Unit = js.native
  def sort(arg1: Double, arg2: Double, cb: Callback[js.Array[String] | Double]): Unit = js.native
  def sort(arg1: Double, arg2: KeyType, arg3: Double, arg4: Double, cb: Callback[js.Array[String] | Double]): Unit = js.native
  def sort(arg1: Double, arg2: KeyType, arg3: Double, arg4: KeyType, cb: Callback[js.Array[String] | Double]): Unit = js.native
  def sort(arg1: Double, arg2: KeyType, arg3: Double, cb: Callback[js.Array[String] | Double]): Unit = js.native
  def sort(arg1: Double, arg2: KeyType, arg3: KeyType, arg4: Double, cb: Callback[js.Array[String] | Double]): Unit = js.native
  def sort(arg1: Double, arg2: KeyType, arg3: KeyType, arg4: KeyType, cb: Callback[js.Array[String] | Double]): Unit = js.native
  def sort(arg1: Double, arg2: KeyType, arg3: KeyType, cb: Callback[js.Array[String] | Double]): Unit = js.native
  def sort(arg1: Double, arg2: KeyType, cb: Callback[js.Array[String] | Double]): Unit = js.native
  def sort(arg1: KeyType, arg2: Double, arg3: Double, arg4: Double, cb: Callback[js.Array[String] | Double]): Unit = js.native
  def sort(arg1: KeyType, arg2: Double, arg3: Double, arg4: KeyType, cb: Callback[js.Array[String] | Double]): Unit = js.native
  def sort(arg1: KeyType, arg2: Double, arg3: Double, cb: Callback[js.Array[String] | Double]): Unit = js.native
  def sort(arg1: KeyType, arg2: Double, arg3: KeyType, arg4: Double, cb: Callback[js.Array[String] | Double]): Unit = js.native
  def sort(arg1: KeyType, arg2: Double, arg3: KeyType, arg4: KeyType, cb: Callback[js.Array[String] | Double]): Unit = js.native
  def sort(arg1: KeyType, arg2: Double, arg3: KeyType, cb: Callback[js.Array[String] | Double]): Unit = js.native
  def sort(arg1: KeyType, arg2: Double, cb: Callback[js.Array[String] | Double]): Unit = js.native
  def sort(arg1: KeyType, arg2: KeyType, arg3: Double, arg4: Double, cb: Callback[js.Array[String] | Double]): Unit = js.native
  def sort(arg1: KeyType, arg2: KeyType, arg3: Double, arg4: KeyType, cb: Callback[js.Array[String] | Double]): Unit = js.native
  def sort(arg1: KeyType, arg2: KeyType, arg3: Double, cb: Callback[js.Array[String] | Double]): Unit = js.native
  def sort(arg1: KeyType, arg2: KeyType, arg3: KeyType, arg4: Double, cb: Callback[js.Array[String] | Double]): Unit = js.native
  def sort(
    arg1: KeyType,
    arg2: KeyType,
    arg3: KeyType,
    arg4: KeyType,
    cb: Callback[js.Array[String] | Double]
  ): Unit = js.native
  def sort(arg1: KeyType, arg2: KeyType, arg3: KeyType, cb: Callback[js.Array[String] | Double]): Unit = js.native
  def sort(arg1: KeyType, arg2: KeyType, cb: Callback[js.Array[String] | Double]): Unit = js.native
  def sort(args: (KeyType | Double)*): js.Promise[js.Array[String] | Double] = js.native
  def spop(key: KeyType): js.Promise[String | Null] = js.native
  def spop(key: KeyType, callback: Callback[String | Null]): Unit = js.native
  def spop(key: KeyType, count: Double): js.Promise[js.Array[String]] = js.native
  def spop(key: KeyType, count: Double, callback: Callback[js.Array[String]]): Unit = js.native
  def srandmember(key: KeyType): js.Promise[String | Null] = js.native
  def srandmember(key: KeyType, callback: Callback[String | Null]): Unit = js.native
  def srandmember(key: KeyType, count: Double): js.Promise[js.Array[String]] = js.native
  def srandmember(key: KeyType, count: Double, callback: Callback[js.Array[String]]): Unit = js.native
  def srem(key: KeyType, arg1: js.Array[ValueType]): js.Promise[Double] = js.native
  def srem(key: KeyType, arg1: js.Array[ValueType], cb: Callback[Double]): Unit = js.native
  def srem(
    key: KeyType,
    arg1: ValueType,
    arg2: ValueType,
    arg3: ValueType,
    arg4: ValueType,
    arg5: ValueType,
    arg6: ValueType,
    cb: Callback[Double]
  ): Unit = js.native
  def srem(
    key: KeyType,
    arg1: ValueType,
    arg2: ValueType,
    arg3: ValueType,
    arg4: ValueType,
    arg5: ValueType,
    cb: Callback[Double]
  ): Unit = js.native
  def srem(
    key: KeyType,
    arg1: ValueType,
    arg2: ValueType,
    arg3: ValueType,
    arg4: ValueType,
    cb: Callback[Double]
  ): Unit = js.native
  def srem(key: KeyType, arg1: ValueType, arg2: ValueType, arg3: ValueType, cb: Callback[Double]): Unit = js.native
  def srem(key: KeyType, arg1: ValueType, arg2: ValueType, cb: Callback[Double]): Unit = js.native
  def srem(key: KeyType, arg1: ValueType, cb: Callback[Double]): Unit = js.native
  def srem(key: KeyType, args: ValueType*): js.Promise[Double] = js.native
  def sscan(key: KeyType, arg1: js.Array[ValueType]): js.Promise[js.Tuple2[String, js.Array[String]]] = js.native
  def sscan(key: KeyType, arg1: js.Array[ValueType], cb: Callback[js.Tuple2[String, js.Array[String]]]): Unit = js.native
  def sscan(
    key: KeyType,
    arg1: ValueType,
    arg2: ValueType,
    arg3: ValueType,
    arg4: ValueType,
    arg5: ValueType,
    arg6: ValueType,
    cb: Callback[js.Tuple2[String, js.Array[String]]]
  ): Unit = js.native
  def sscan(
    key: KeyType,
    arg1: ValueType,
    arg2: ValueType,
    arg3: ValueType,
    arg4: ValueType,
    arg5: ValueType,
    cb: Callback[js.Tuple2[String, js.Array[String]]]
  ): Unit = js.native
  def sscan(
    key: KeyType,
    arg1: ValueType,
    arg2: ValueType,
    arg3: ValueType,
    arg4: ValueType,
    cb: Callback[js.Tuple2[String, js.Array[String]]]
  ): Unit = js.native
  def sscan(
    key: KeyType,
    arg1: ValueType,
    arg2: ValueType,
    arg3: ValueType,
    cb: Callback[js.Tuple2[String, js.Array[String]]]
  ): Unit = js.native
  def sscan(key: KeyType, arg1: ValueType, arg2: ValueType, cb: Callback[js.Tuple2[String, js.Array[String]]]): Unit = js.native
  def sscan(key: KeyType, arg1: ValueType, cb: Callback[js.Tuple2[String, js.Array[String]]]): Unit = js.native
  def sscan(key: KeyType, args: ValueType*): js.Promise[js.Tuple2[String, js.Array[String]]] = js.native
  def sscanStream(key: KeyType): Readable = js.native
  def sscanStream(key: KeyType, options: ScanStreamOption): Readable = js.native
  def strlen(key: KeyType): js.Promise[Double] = js.native
  def strlen(key: KeyType, callback: Callback[Double]): Unit = js.native
  def subscribe(
    arg1: String,
    arg2: String,
    arg3: String,
    arg4: String,
    arg5: String,
    arg6: String,
    cb: Callback[Double]
  ): Unit = js.native
  def subscribe(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, cb: Callback[Double]): Unit = js.native
  def subscribe(arg1: String, arg2: String, arg3: String, arg4: String, cb: Callback[Double]): Unit = js.native
  def subscribe(arg1: String, arg2: String, arg3: String, cb: Callback[Double]): Unit = js.native
  def subscribe(arg1: String, arg2: String, cb: Callback[Double]): Unit = js.native
  def subscribe(arg1: String, cb: Callback[Double]): Unit = js.native
  def subscribe(arg1: js.Array[String]): js.Promise[Double] = js.native
  def subscribe(arg1: js.Array[String], cb: Callback[Double]): Unit = js.native
  def subscribe(args: String*): js.Promise[Double] = js.native
  def substr(key: KeyType, start: Double, end: Double): js.Promise[String] = js.native
  def substr(key: KeyType, start: Double, end: Double, callback: Callback[String]): Unit = js.native
  def sunion(arg1: js.Array[KeyType]): js.Promise[js.Array[String]] = js.native
  def sunion(arg1: js.Array[KeyType], cb: Callback[js.Array[String]]): Unit = js.native
  def sunion(
    arg1: KeyType,
    arg2: KeyType,
    arg3: KeyType,
    arg4: KeyType,
    arg5: KeyType,
    arg6: KeyType,
    cb: Callback[js.Array[String]]
  ): Unit = js.native
  def sunion(
    arg1: KeyType,
    arg2: KeyType,
    arg3: KeyType,
    arg4: KeyType,
    arg5: KeyType,
    cb: Callback[js.Array[String]]
  ): Unit = js.native
  def sunion(arg1: KeyType, arg2: KeyType, arg3: KeyType, arg4: KeyType, cb: Callback[js.Array[String]]): Unit = js.native
  def sunion(arg1: KeyType, arg2: KeyType, arg3: KeyType, cb: Callback[js.Array[String]]): Unit = js.native
  def sunion(arg1: KeyType, arg2: KeyType, cb: Callback[js.Array[String]]): Unit = js.native
  def sunion(arg1: KeyType, cb: Callback[js.Array[String]]): Unit = js.native
  def sunion(args: KeyType*): js.Promise[js.Array[String]] = js.native
  def sunionstore(key: KeyType, arg1: js.Array[KeyType]): js.Promise[Double] = js.native
  def sunionstore(key: KeyType, arg1: js.Array[KeyType], cb: Callback[Double]): Unit = js.native
  def sunionstore(
    key: KeyType,
    arg1: KeyType,
    arg2: KeyType,
    arg3: KeyType,
    arg4: KeyType,
    arg5: KeyType,
    arg6: KeyType,
    cb: Callback[Double]
  ): Unit = js.native
  def sunionstore(
    key: KeyType,
    arg1: KeyType,
    arg2: KeyType,
    arg3: KeyType,
    arg4: KeyType,
    arg5: KeyType,
    cb: Callback[Double]
  ): Unit = js.native
  def sunionstore(key: KeyType, arg1: KeyType, arg2: KeyType, arg3: KeyType, arg4: KeyType, cb: Callback[Double]): Unit = js.native
  def sunionstore(key: KeyType, arg1: KeyType, arg2: KeyType, arg3: KeyType, cb: Callback[Double]): Unit = js.native
  def sunionstore(key: KeyType, arg1: KeyType, arg2: KeyType, cb: Callback[Double]): Unit = js.native
  def sunionstore(key: KeyType, arg1: KeyType, cb: Callback[Double]): Unit = js.native
  def sunionstore(key: KeyType, args: KeyType*): js.Promise[Double] = js.native
  def sync(): js.Promise[_] = js.native
  def sync(callback: Callback[_]): Unit = js.native
  def time(): js.Promise[js.Tuple2[String, String]] = js.native
  def time(callback: Callback[js.Tuple2[String, String]]): Unit = js.native
  def ttl(key: KeyType): js.Promise[Double] = js.native
  def ttl(key: KeyType, callback: Callback[Double]): Unit = js.native
  def `type`(key: KeyType): js.Promise[String] = js.native
  def `type`(key: KeyType, callback: Callback[String]): Unit = js.native
  def unlink(arg1: js.Array[KeyType]): js.Promise[Double] = js.native
  def unlink(arg1: js.Array[KeyType], cb: Callback[Double]): Unit = js.native
  def unlink(
    arg1: KeyType,
    arg2: KeyType,
    arg3: KeyType,
    arg4: KeyType,
    arg5: KeyType,
    arg6: KeyType,
    cb: Callback[Double]
  ): Unit = js.native
  def unlink(arg1: KeyType, arg2: KeyType, arg3: KeyType, arg4: KeyType, arg5: KeyType, cb: Callback[Double]): Unit = js.native
  def unlink(arg1: KeyType, arg2: KeyType, arg3: KeyType, arg4: KeyType, cb: Callback[Double]): Unit = js.native
  def unlink(arg1: KeyType, arg2: KeyType, arg3: KeyType, cb: Callback[Double]): Unit = js.native
  def unlink(arg1: KeyType, arg2: KeyType, cb: Callback[Double]): Unit = js.native
  def unlink(arg1: KeyType, cb: Callback[Double]): Unit = js.native
  def unlink(args: KeyType*): js.Promise[Double] = js.native
  def unsubscribe(
    arg1: String,
    arg2: String,
    arg3: String,
    arg4: String,
    arg5: String,
    arg6: String,
    cb: Callback[Double]
  ): Unit = js.native
  def unsubscribe(arg1: String, arg2: String, arg3: String, arg4: String, arg5: String, cb: Callback[Double]): Unit = js.native
  def unsubscribe(arg1: String, arg2: String, arg3: String, arg4: String, cb: Callback[Double]): Unit = js.native
  def unsubscribe(arg1: String, arg2: String, arg3: String, cb: Callback[Double]): Unit = js.native
  def unsubscribe(arg1: String, arg2: String, cb: Callback[Double]): Unit = js.native
  def unsubscribe(arg1: String, cb: Callback[Double]): Unit = js.native
  def unsubscribe(arg1: js.Array[String]): js.Promise[Double] = js.native
  def unsubscribe(arg1: js.Array[String], cb: Callback[Double]): Unit = js.native
  def unsubscribe(args: String*): js.Promise[Double] = js.native
  def unsubscribe(cb: Callback[Double]): Unit = js.native
  def unwatch(): js.Promise[String] = js.native
  def unwatch(callback: Callback[String]): Unit = js.native
  def watch(arg1: js.Array[KeyType]): js.Promise[Ok] = js.native
  def watch(arg1: js.Array[KeyType], cb: Callback[Ok]): Unit = js.native
  def watch(
    arg1: KeyType,
    arg2: KeyType,
    arg3: KeyType,
    arg4: KeyType,
    arg5: KeyType,
    arg6: KeyType,
    cb: Callback[Ok]
  ): Unit = js.native
  def watch(arg1: KeyType, arg2: KeyType, arg3: KeyType, arg4: KeyType, arg5: KeyType, cb: Callback[Ok]): Unit = js.native
  def watch(arg1: KeyType, arg2: KeyType, arg3: KeyType, arg4: KeyType, cb: Callback[Ok]): Unit = js.native
  def watch(arg1: KeyType, arg2: KeyType, arg3: KeyType, cb: Callback[Ok]): Unit = js.native
  def watch(arg1: KeyType, arg2: KeyType, cb: Callback[Ok]): Unit = js.native
  def watch(arg1: KeyType, cb: Callback[Ok]): Unit = js.native
  def watch(args: KeyType*): js.Promise[Ok] = js.native
  def xack(key: KeyType, arg1: js.Array[ValueType]): js.Promise[Double] = js.native
  def xack(key: KeyType, arg1: js.Array[ValueType], cb: Callback[Double]): Unit = js.native
  def xack(
    key: KeyType,
    arg1: ValueType,
    arg2: ValueType,
    arg3: ValueType,
    arg4: ValueType,
    arg5: ValueType,
    arg6: ValueType,
    cb: Callback[Double]
  ): Unit = js.native
  def xack(
    key: KeyType,
    arg1: ValueType,
    arg2: ValueType,
    arg3: ValueType,
    arg4: ValueType,
    arg5: ValueType,
    cb: Callback[Double]
  ): Unit = js.native
  def xack(
    key: KeyType,
    arg1: ValueType,
    arg2: ValueType,
    arg3: ValueType,
    arg4: ValueType,
    cb: Callback[Double]
  ): Unit = js.native
  def xack(key: KeyType, arg1: ValueType, arg2: ValueType, arg3: ValueType, cb: Callback[Double]): Unit = js.native
  def xack(key: KeyType, arg1: ValueType, arg2: ValueType, cb: Callback[Double]): Unit = js.native
  def xack(key: KeyType, arg1: ValueType, cb: Callback[Double]): Unit = js.native
  def xack(key: KeyType, args: ValueType*): js.Promise[Double] = js.native
  def xadd(key: KeyType, arg1: js.Array[ValueType]): js.Promise[String] = js.native
  def xadd(key: KeyType, arg1: js.Array[ValueType], cb: Callback[String]): Unit = js.native
  def xadd(
    key: KeyType,
    arg1: ValueType,
    arg2: ValueType,
    arg3: ValueType,
    arg4: ValueType,
    arg5: ValueType,
    arg6: ValueType,
    cb: Callback[String]
  ): Unit = js.native
  def xadd(
    key: KeyType,
    arg1: ValueType,
    arg2: ValueType,
    arg3: ValueType,
    arg4: ValueType,
    arg5: ValueType,
    cb: Callback[String]
  ): Unit = js.native
  def xadd(
    key: KeyType,
    arg1: ValueType,
    arg2: ValueType,
    arg3: ValueType,
    arg4: ValueType,
    cb: Callback[String]
  ): Unit = js.native
  def xadd(key: KeyType, arg1: ValueType, arg2: ValueType, arg3: ValueType, cb: Callback[String]): Unit = js.native
  def xadd(key: KeyType, arg1: ValueType, arg2: ValueType, cb: Callback[String]): Unit = js.native
  def xadd(key: KeyType, arg1: ValueType, cb: Callback[String]): Unit = js.native
  def xadd(key: KeyType, args: ValueType*): js.Promise[String] = js.native
  def xclaim(key: KeyType, arg1: js.Array[ValueType]): js.Promise[js.Array[js.Tuple2[String, js.Array[String]]]] = js.native
  def xclaim(
    key: KeyType,
    arg1: js.Array[ValueType],
    cb: Callback[js.Array[js.Tuple2[String, js.Array[String]]]]
  ): Unit = js.native
  def xclaim(
    key: KeyType,
    arg1: ValueType,
    arg2: ValueType,
    arg3: ValueType,
    arg4: ValueType,
    arg5: ValueType,
    arg6: ValueType,
    cb: Callback[js.Array[js.Tuple2[String, js.Array[String]]]]
  ): Unit = js.native
  def xclaim(
    key: KeyType,
    arg1: ValueType,
    arg2: ValueType,
    arg3: ValueType,
    arg4: ValueType,
    arg5: ValueType,
    cb: Callback[js.Array[js.Tuple2[String, js.Array[String]]]]
  ): Unit = js.native
  def xclaim(
    key: KeyType,
    arg1: ValueType,
    arg2: ValueType,
    arg3: ValueType,
    arg4: ValueType,
    cb: Callback[js.Array[js.Tuple2[String, js.Array[String]]]]
  ): Unit = js.native
  def xclaim(
    key: KeyType,
    arg1: ValueType,
    arg2: ValueType,
    arg3: ValueType,
    cb: Callback[js.Array[js.Tuple2[String, js.Array[String]]]]
  ): Unit = js.native
  def xclaim(
    key: KeyType,
    arg1: ValueType,
    arg2: ValueType,
    cb: Callback[js.Array[js.Tuple2[String, js.Array[String]]]]
  ): Unit = js.native
  def xclaim(key: KeyType, arg1: ValueType, cb: Callback[js.Array[js.Tuple2[String, js.Array[String]]]]): Unit = js.native
  def xclaim(key: KeyType, args: ValueType*): js.Promise[js.Array[js.Tuple2[String, js.Array[String]]]] = js.native
  def xdel(
    key: KeyType,
    arg1: String,
    arg2: String,
    arg3: String,
    arg4: String,
    arg5: String,
    arg6: String,
    cb: Callback[Double]
  ): Unit = js.native
  def xdel(
    key: KeyType,
    arg1: String,
    arg2: String,
    arg3: String,
    arg4: String,
    arg5: String,
    cb: Callback[Double]
  ): Unit = js.native
  def xdel(key: KeyType, arg1: String, arg2: String, arg3: String, arg4: String, cb: Callback[Double]): Unit = js.native
  def xdel(key: KeyType, arg1: String, arg2: String, arg3: String, cb: Callback[Double]): Unit = js.native
  def xdel(key: KeyType, arg1: String, arg2: String, cb: Callback[Double]): Unit = js.native
  def xdel(key: KeyType, arg1: String, cb: Callback[Double]): Unit = js.native
  def xdel(key: KeyType, arg1: js.Array[String]): js.Promise[Double] = js.native
  def xdel(key: KeyType, arg1: js.Array[String], cb: Callback[Double]): Unit = js.native
  def xdel(key: KeyType, args: String*): js.Promise[Double] = js.native
  def xgroup(arg1: js.Array[ValueType]): js.Promise[Ok] = js.native
  def xgroup(arg1: js.Array[ValueType], cb: Callback[Ok]): Unit = js.native
  def xgroup(arg1: ValueType, arg2: js.Array[ValueType], cb: Callback[Ok]): Unit = js.native
  def xgroup(
    arg1: ValueType,
    arg2: ValueType,
    arg3: ValueType,
    arg4: ValueType,
    arg5: ValueType,
    arg6: ValueType,
    cb: Callback[Ok]
  ): Unit = js.native
  def xgroup(
    arg1: ValueType,
    arg2: ValueType,
    arg3: ValueType,
    arg4: ValueType,
    arg5: ValueType,
    cb: Callback[Ok]
  ): Unit = js.native
  def xgroup(arg1: ValueType, arg2: ValueType, arg3: ValueType, arg4: ValueType, cb: Callback[Ok]): Unit = js.native
  def xgroup(arg1: ValueType, arg2: ValueType, arg3: ValueType, cb: Callback[Ok]): Unit = js.native
  def xgroup(arg1: ValueType, arg2: ValueType, cb: Callback[Ok]): Unit = js.native
  def xgroup(arg1: ValueType, cb: Callback[Ok]): Unit = js.native
  def xgroup(args: ValueType*): js.Promise[Ok] = js.native
  def xinfo(arg1: js.Array[ValueType]): js.Promise[_] = js.native
  def xinfo(arg1: js.Array[ValueType], cb: Callback[_]): Unit = js.native
  def xinfo(arg1: ValueType, arg2: js.Array[ValueType], cb: Callback[_]): Unit = js.native
  def xinfo(
    arg1: ValueType,
    arg2: ValueType,
    arg3: ValueType,
    arg4: ValueType,
    arg5: ValueType,
    arg6: ValueType,
    cb: Callback[_]
  ): Unit = js.native
  def xinfo(
    arg1: ValueType,
    arg2: ValueType,
    arg3: ValueType,
    arg4: ValueType,
    arg5: ValueType,
    cb: Callback[_]
  ): Unit = js.native
  def xinfo(arg1: ValueType, arg2: ValueType, arg3: ValueType, arg4: ValueType, cb: Callback[_]): Unit = js.native
  def xinfo(arg1: ValueType, arg2: ValueType, arg3: ValueType, cb: Callback[_]): Unit = js.native
  def xinfo(arg1: ValueType, arg2: ValueType, cb: Callback[_]): Unit = js.native
  def xinfo(arg1: ValueType, cb: Callback[_]): Unit = js.native
  def xinfo(args: ValueType*): js.Promise[_] = js.native
  def xlen(key: KeyType): js.Promise[Double] = js.native
  def xlen(key: KeyType, callback: Callback[Double]): Unit = js.native
  def xpending(key: KeyType, arg1: js.Array[ValueType]): js.Promise[_] = js.native
  def xpending(key: KeyType, arg1: js.Array[ValueType], cb: Callback[_]): Unit = js.native
  def xpending(
    key: KeyType,
    arg1: ValueType,
    arg2: ValueType,
    arg3: ValueType,
    arg4: ValueType,
    arg5: ValueType,
    arg6: ValueType,
    cb: Callback[_]
  ): Unit = js.native
  def xpending(
    key: KeyType,
    arg1: ValueType,
    arg2: ValueType,
    arg3: ValueType,
    arg4: ValueType,
    arg5: ValueType,
    cb: Callback[_]
  ): Unit = js.native
  def xpending(key: KeyType, arg1: ValueType, arg2: ValueType, arg3: ValueType, arg4: ValueType, cb: Callback[_]): Unit = js.native
  def xpending(key: KeyType, arg1: ValueType, arg2: ValueType, arg3: ValueType, cb: Callback[_]): Unit = js.native
  def xpending(key: KeyType, arg1: ValueType, arg2: ValueType, cb: Callback[_]): Unit = js.native
  def xpending(key: KeyType, arg1: ValueType, cb: Callback[_]): Unit = js.native
  def xpending(key: KeyType, args: ValueType*): js.Promise[_] = js.native
  def xrange(key: KeyType, arg1: js.Array[ValueType]): js.Promise[js.Array[js.Tuple2[String, js.Array[String]]]] = js.native
  def xrange(
    key: KeyType,
    arg1: js.Array[ValueType],
    cb: Callback[js.Array[js.Tuple2[String, js.Array[String]]]]
  ): Unit = js.native
  def xrange(
    key: KeyType,
    arg1: ValueType,
    arg2: ValueType,
    arg3: ValueType,
    arg4: ValueType,
    arg5: ValueType,
    arg6: ValueType,
    cb: Callback[js.Array[js.Tuple2[String, js.Array[String]]]]
  ): Unit = js.native
  def xrange(
    key: KeyType,
    arg1: ValueType,
    arg2: ValueType,
    arg3: ValueType,
    arg4: ValueType,
    arg5: ValueType,
    cb: Callback[js.Array[js.Tuple2[String, js.Array[String]]]]
  ): Unit = js.native
  def xrange(
    key: KeyType,
    arg1: ValueType,
    arg2: ValueType,
    arg3: ValueType,
    arg4: ValueType,
    cb: Callback[js.Array[js.Tuple2[String, js.Array[String]]]]
  ): Unit = js.native
  def xrange(
    key: KeyType,
    arg1: ValueType,
    arg2: ValueType,
    arg3: ValueType,
    cb: Callback[js.Array[js.Tuple2[String, js.Array[String]]]]
  ): Unit = js.native
  def xrange(
    key: KeyType,
    arg1: ValueType,
    arg2: ValueType,
    cb: Callback[js.Array[js.Tuple2[String, js.Array[String]]]]
  ): Unit = js.native
  def xrange(key: KeyType, arg1: ValueType, cb: Callback[js.Array[js.Tuple2[String, js.Array[String]]]]): Unit = js.native
  def xrange(key: KeyType, args: ValueType*): js.Promise[js.Array[js.Tuple2[String, js.Array[String]]]] = js.native
  def xread(arg1: js.Array[ValueType]): js.Promise[js.Array[js.Tuple2[String, js.Array[String]]]] = js.native
  def xread(arg1: js.Array[ValueType], cb: Callback[js.Array[js.Tuple2[String, js.Array[String]]]]): Unit = js.native
  def xread(
    arg1: ValueType,
    arg2: ValueType,
    arg3: ValueType,
    arg4: ValueType,
    arg5: ValueType,
    arg6: ValueType,
    cb: Callback[js.Array[js.Tuple2[String, js.Array[String]]]]
  ): Unit = js.native
  def xread(
    arg1: ValueType,
    arg2: ValueType,
    arg3: ValueType,
    arg4: ValueType,
    arg5: ValueType,
    cb: Callback[js.Array[js.Tuple2[String, js.Array[String]]]]
  ): Unit = js.native
  def xread(
    arg1: ValueType,
    arg2: ValueType,
    arg3: ValueType,
    arg4: ValueType,
    cb: Callback[js.Array[js.Tuple2[String, js.Array[String]]]]
  ): Unit = js.native
  def xread(
    arg1: ValueType,
    arg2: ValueType,
    arg3: ValueType,
    cb: Callback[js.Array[js.Tuple2[String, js.Array[String]]]]
  ): Unit = js.native
  def xread(arg1: ValueType, arg2: ValueType, cb: Callback[js.Array[js.Tuple2[String, js.Array[String]]]]): Unit = js.native
  def xread(arg1: ValueType, cb: Callback[js.Array[js.Tuple2[String, js.Array[String]]]]): Unit = js.native
  def xread(args: ValueType*): js.Promise[js.Array[js.Tuple2[String, js.Array[String]]]] = js.native
  def xreadgroup(key: KeyType, arg1: js.Array[ValueType]): js.Promise[js.Array[js.Tuple2[String, js.Array[String]]]] = js.native
  def xreadgroup(
    key: KeyType,
    arg1: js.Array[ValueType],
    cb: Callback[js.Array[js.Tuple2[String, js.Array[String]]]]
  ): Unit = js.native
  def xreadgroup(
    key: KeyType,
    arg1: ValueType,
    arg2: ValueType,
    arg3: ValueType,
    arg4: ValueType,
    arg5: ValueType,
    arg6: ValueType,
    cb: Callback[js.Array[js.Tuple2[String, js.Array[String]]]]
  ): Unit = js.native
  def xreadgroup(
    key: KeyType,
    arg1: ValueType,
    arg2: ValueType,
    arg3: ValueType,
    arg4: ValueType,
    arg5: ValueType,
    cb: Callback[js.Array[js.Tuple2[String, js.Array[String]]]]
  ): Unit = js.native
  def xreadgroup(
    key: KeyType,
    arg1: ValueType,
    arg2: ValueType,
    arg3: ValueType,
    arg4: ValueType,
    cb: Callback[js.Array[js.Tuple2[String, js.Array[String]]]]
  ): Unit = js.native
  def xreadgroup(
    key: KeyType,
    arg1: ValueType,
    arg2: ValueType,
    arg3: ValueType,
    cb: Callback[js.Array[js.Tuple2[String, js.Array[String]]]]
  ): Unit = js.native
  def xreadgroup(
    key: KeyType,
    arg1: ValueType,
    arg2: ValueType,
    cb: Callback[js.Array[js.Tuple2[String, js.Array[String]]]]
  ): Unit = js.native
  def xreadgroup(key: KeyType, arg1: ValueType, cb: Callback[js.Array[js.Tuple2[String, js.Array[String]]]]): Unit = js.native
  def xreadgroup(key: KeyType, args: ValueType*): js.Promise[js.Array[js.Tuple2[String, js.Array[String]]]] = js.native
  def xrevrange(key: KeyType, arg1: js.Array[ValueType]): js.Promise[js.Array[js.Tuple2[String, js.Array[String]]]] = js.native
  def xrevrange(
    key: KeyType,
    arg1: js.Array[ValueType],
    cb: Callback[js.Array[js.Tuple2[String, js.Array[String]]]]
  ): Unit = js.native
  def xrevrange(
    key: KeyType,
    arg1: ValueType,
    arg2: ValueType,
    arg3: ValueType,
    arg4: ValueType,
    arg5: ValueType,
    arg6: ValueType,
    cb: Callback[js.Array[js.Tuple2[String, js.Array[String]]]]
  ): Unit = js.native
  def xrevrange(
    key: KeyType,
    arg1: ValueType,
    arg2: ValueType,
    arg3: ValueType,
    arg4: ValueType,
    arg5: ValueType,
    cb: Callback[js.Array[js.Tuple2[String, js.Array[String]]]]
  ): Unit = js.native
  def xrevrange(
    key: KeyType,
    arg1: ValueType,
    arg2: ValueType,
    arg3: ValueType,
    arg4: ValueType,
    cb: Callback[js.Array[js.Tuple2[String, js.Array[String]]]]
  ): Unit = js.native
  def xrevrange(
    key: KeyType,
    arg1: ValueType,
    arg2: ValueType,
    arg3: ValueType,
    cb: Callback[js.Array[js.Tuple2[String, js.Array[String]]]]
  ): Unit = js.native
  def xrevrange(
    key: KeyType,
    arg1: ValueType,
    arg2: ValueType,
    cb: Callback[js.Array[js.Tuple2[String, js.Array[String]]]]
  ): Unit = js.native
  def xrevrange(key: KeyType, arg1: ValueType, cb: Callback[js.Array[js.Tuple2[String, js.Array[String]]]]): Unit = js.native
  def xrevrange(key: KeyType, args: ValueType*): js.Promise[js.Array[js.Tuple2[String, js.Array[String]]]] = js.native
  def xtrim(key: KeyType, arg1: js.Array[ValueType]): js.Promise[Double] = js.native
  def xtrim(key: KeyType, arg1: js.Array[ValueType], cb: Callback[Double]): Unit = js.native
  def xtrim(
    key: KeyType,
    arg1: ValueType,
    arg2: ValueType,
    arg3: ValueType,
    arg4: ValueType,
    arg5: ValueType,
    arg6: ValueType,
    cb: Callback[Double]
  ): Unit = js.native
  def xtrim(
    key: KeyType,
    arg1: ValueType,
    arg2: ValueType,
    arg3: ValueType,
    arg4: ValueType,
    arg5: ValueType,
    cb: Callback[Double]
  ): Unit = js.native
  def xtrim(
    key: KeyType,
    arg1: ValueType,
    arg2: ValueType,
    arg3: ValueType,
    arg4: ValueType,
    cb: Callback[Double]
  ): Unit = js.native
  def xtrim(key: KeyType, arg1: ValueType, arg2: ValueType, arg3: ValueType, cb: Callback[Double]): Unit = js.native
  def xtrim(key: KeyType, arg1: ValueType, arg2: ValueType, cb: Callback[Double]): Unit = js.native
  def xtrim(key: KeyType, arg1: ValueType, cb: Callback[Double]): Unit = js.native
  def xtrim(key: KeyType, args: ValueType*): js.Promise[Double] = js.native
  def zadd(
    key: KeyType,
    arg1: KeyType | Double,
    arg2: KeyType | Double,
    arg3: KeyType | Double,
    arg4: KeyType | Double,
    arg5: KeyType | Double,
    arg6: KeyType | Double,
    cb: Callback[Double | String]
  ): Unit = js.native
  def zadd(
    key: KeyType,
    arg1: KeyType | Double,
    arg2: KeyType | Double,
    arg3: KeyType | Double,
    arg4: KeyType | Double,
    arg5: KeyType | Double,
    cb: Callback[Double | String]
  ): Unit = js.native
  def zadd(key: KeyType, arg1: KeyType | Double, cb: Callback[Double | String]): Unit = js.native
  def zadd(key: KeyType, arg1: js.Array[KeyType | Double]): js.Promise[Double | String] = js.native
  def zadd(key: KeyType, arg1: js.Array[KeyType | Double], cb: Callback[Double | String]): Unit = js.native
  def zadd(
    key: KeyType,
    arg1: Double,
    arg2: Double,
    arg3: Double,
    arg4: Double,
    cb: Callback[Double | String]
  ): Unit = js.native
  def zadd(
    key: KeyType,
    arg1: Double,
    arg2: Double,
    arg3: Double,
    arg4: KeyType,
    cb: Callback[Double | String]
  ): Unit = js.native
  def zadd(key: KeyType, arg1: Double, arg2: Double, arg3: Double, cb: Callback[Double | String]): Unit = js.native
  def zadd(
    key: KeyType,
    arg1: Double,
    arg2: Double,
    arg3: KeyType,
    arg4: Double,
    cb: Callback[Double | String]
  ): Unit = js.native
  def zadd(
    key: KeyType,
    arg1: Double,
    arg2: Double,
    arg3: KeyType,
    arg4: KeyType,
    cb: Callback[Double | String]
  ): Unit = js.native
  def zadd(key: KeyType, arg1: Double, arg2: Double, arg3: KeyType, cb: Callback[Double | String]): Unit = js.native
  def zadd(key: KeyType, arg1: Double, arg2: Double, cb: Callback[Double | String]): Unit = js.native
  def zadd(
    key: KeyType,
    arg1: Double,
    arg2: KeyType,
    arg3: Double,
    arg4: Double,
    cb: Callback[Double | String]
  ): Unit = js.native
  def zadd(
    key: KeyType,
    arg1: Double,
    arg2: KeyType,
    arg3: Double,
    arg4: KeyType,
    cb: Callback[Double | String]
  ): Unit = js.native
  def zadd(key: KeyType, arg1: Double, arg2: KeyType, arg3: Double, cb: Callback[Double | String]): Unit = js.native
  def zadd(
    key: KeyType,
    arg1: Double,
    arg2: KeyType,
    arg3: KeyType,
    arg4: Double,
    cb: Callback[Double | String]
  ): Unit = js.native
  def zadd(
    key: KeyType,
    arg1: Double,
    arg2: KeyType,
    arg3: KeyType,
    arg4: KeyType,
    cb: Callback[Double | String]
  ): Unit = js.native
  def zadd(key: KeyType, arg1: Double, arg2: KeyType, arg3: KeyType, cb: Callback[Double | String]): Unit = js.native
  def zadd(key: KeyType, arg1: Double, arg2: KeyType, cb: Callback[Double | String]): Unit = js.native
  def zadd(
    key: KeyType,
    arg1: KeyType,
    arg2: Double,
    arg3: Double,
    arg4: Double,
    cb: Callback[Double | String]
  ): Unit = js.native
  def zadd(
    key: KeyType,
    arg1: KeyType,
    arg2: Double,
    arg3: Double,
    arg4: KeyType,
    cb: Callback[Double | String]
  ): Unit = js.native
  def zadd(key: KeyType, arg1: KeyType, arg2: Double, arg3: Double, cb: Callback[Double | String]): Unit = js.native
  def zadd(
    key: KeyType,
    arg1: KeyType,
    arg2: Double,
    arg3: KeyType,
    arg4: Double,
    cb: Callback[Double | String]
  ): Unit = js.native
  def zadd(
    key: KeyType,
    arg1: KeyType,
    arg2: Double,
    arg3: KeyType,
    arg4: KeyType,
    cb: Callback[Double | String]
  ): Unit = js.native
  def zadd(key: KeyType, arg1: KeyType, arg2: Double, arg3: KeyType, cb: Callback[Double | String]): Unit = js.native
  def zadd(key: KeyType, arg1: KeyType, arg2: Double, cb: Callback[Double | String]): Unit = js.native
  def zadd(
    key: KeyType,
    arg1: KeyType,
    arg2: KeyType,
    arg3: Double,
    arg4: Double,
    cb: Callback[Double | String]
  ): Unit = js.native
  def zadd(
    key: KeyType,
    arg1: KeyType,
    arg2: KeyType,
    arg3: Double,
    arg4: KeyType,
    cb: Callback[Double | String]
  ): Unit = js.native
  def zadd(key: KeyType, arg1: KeyType, arg2: KeyType, arg3: Double, cb: Callback[Double | String]): Unit = js.native
  def zadd(
    key: KeyType,
    arg1: KeyType,
    arg2: KeyType,
    arg3: KeyType,
    arg4: Double,
    cb: Callback[Double | String]
  ): Unit = js.native
  def zadd(
    key: KeyType,
    arg1: KeyType,
    arg2: KeyType,
    arg3: KeyType,
    arg4: KeyType,
    cb: Callback[Double | String]
  ): Unit = js.native
  def zadd(key: KeyType, arg1: KeyType, arg2: KeyType, arg3: KeyType, cb: Callback[Double | String]): Unit = js.native
  def zadd(key: KeyType, arg1: KeyType, arg2: KeyType, cb: Callback[Double | String]): Unit = js.native
  def zadd(key: KeyType, args: (KeyType | Double)*): js.Promise[Double | String] = js.native
  def zaddBuffer(key: KeyType, score1: Double, member1: Buffer): js.Promise[String | Double] = js.native
  def zaddBuffer(key: KeyType, score1: Double, member1: Buffer, callback: Callback[String | Double]): Unit = js.native
  def zcard(key: KeyType): js.Promise[Double] = js.native
  def zcard(key: KeyType, callback: Callback[Double]): Unit = js.native
  def zcount(key: KeyType, min: String, max: String): js.Promise[Double] = js.native
  def zcount(key: KeyType, min: String, max: String, callback: Callback[Double]): Unit = js.native
  def zcount(key: KeyType, min: String, max: Double): js.Promise[Double] = js.native
  def zcount(key: KeyType, min: String, max: Double, callback: Callback[Double]): Unit = js.native
  def zcount(key: KeyType, min: Double, max: String): js.Promise[Double] = js.native
  def zcount(key: KeyType, min: Double, max: String, callback: Callback[Double]): Unit = js.native
  def zcount(key: KeyType, min: Double, max: Double): js.Promise[Double] = js.native
  def zcount(key: KeyType, min: Double, max: Double, callback: Callback[Double]): Unit = js.native
  def zincrby(key: KeyType, increment: Double, member: String): js.Promise[String] = js.native
  def zincrby(key: KeyType, increment: Double, member: String, callback: Callback[String]): Unit = js.native
  def zinterstore(
    key: KeyType,
    arg1: KeyType | Double,
    arg2: KeyType | Double,
    arg3: KeyType | Double,
    arg4: KeyType | Double,
    arg5: KeyType | Double,
    arg6: KeyType | Double,
    cb: Callback[Double]
  ): Unit = js.native
  def zinterstore(
    key: KeyType,
    arg1: KeyType | Double,
    arg2: KeyType | Double,
    arg3: KeyType | Double,
    arg4: KeyType | Double,
    arg5: KeyType | Double,
    cb: Callback[Double]
  ): Unit = js.native
  def zinterstore(key: KeyType, arg1: KeyType | Double, cb: Callback[Double]): Unit = js.native
  def zinterstore(key: KeyType, arg1: js.Array[KeyType | Double]): js.Promise[Double] = js.native
  def zinterstore(key: KeyType, arg1: js.Array[KeyType | Double], cb: Callback[Double]): Unit = js.native
  def zinterstore(key: KeyType, arg1: Double, arg2: Double, arg3: Double, arg4: Double, cb: Callback[Double]): Unit = js.native
  def zinterstore(key: KeyType, arg1: Double, arg2: Double, arg3: Double, arg4: KeyType, cb: Callback[Double]): Unit = js.native
  def zinterstore(key: KeyType, arg1: Double, arg2: Double, arg3: Double, cb: Callback[Double]): Unit = js.native
  def zinterstore(key: KeyType, arg1: Double, arg2: Double, arg3: KeyType, arg4: Double, cb: Callback[Double]): Unit = js.native
  def zinterstore(key: KeyType, arg1: Double, arg2: Double, arg3: KeyType, arg4: KeyType, cb: Callback[Double]): Unit = js.native
  def zinterstore(key: KeyType, arg1: Double, arg2: Double, arg3: KeyType, cb: Callback[Double]): Unit = js.native
  def zinterstore(key: KeyType, arg1: Double, arg2: Double, cb: Callback[Double]): Unit = js.native
  def zinterstore(key: KeyType, arg1: Double, arg2: KeyType, arg3: Double, arg4: Double, cb: Callback[Double]): Unit = js.native
  def zinterstore(key: KeyType, arg1: Double, arg2: KeyType, arg3: Double, arg4: KeyType, cb: Callback[Double]): Unit = js.native
  def zinterstore(key: KeyType, arg1: Double, arg2: KeyType, arg3: Double, cb: Callback[Double]): Unit = js.native
  def zinterstore(key: KeyType, arg1: Double, arg2: KeyType, arg3: KeyType, arg4: Double, cb: Callback[Double]): Unit = js.native
  def zinterstore(key: KeyType, arg1: Double, arg2: KeyType, arg3: KeyType, arg4: KeyType, cb: Callback[Double]): Unit = js.native
  def zinterstore(key: KeyType, arg1: Double, arg2: KeyType, arg3: KeyType, cb: Callback[Double]): Unit = js.native
  def zinterstore(key: KeyType, arg1: Double, arg2: KeyType, cb: Callback[Double]): Unit = js.native
  def zinterstore(key: KeyType, arg1: KeyType, arg2: Double, arg3: Double, arg4: Double, cb: Callback[Double]): Unit = js.native
  def zinterstore(key: KeyType, arg1: KeyType, arg2: Double, arg3: Double, arg4: KeyType, cb: Callback[Double]): Unit = js.native
  def zinterstore(key: KeyType, arg1: KeyType, arg2: Double, arg3: Double, cb: Callback[Double]): Unit = js.native
  def zinterstore(key: KeyType, arg1: KeyType, arg2: Double, arg3: KeyType, arg4: Double, cb: Callback[Double]): Unit = js.native
  def zinterstore(key: KeyType, arg1: KeyType, arg2: Double, arg3: KeyType, arg4: KeyType, cb: Callback[Double]): Unit = js.native
  def zinterstore(key: KeyType, arg1: KeyType, arg2: Double, arg3: KeyType, cb: Callback[Double]): Unit = js.native
  def zinterstore(key: KeyType, arg1: KeyType, arg2: Double, cb: Callback[Double]): Unit = js.native
  def zinterstore(key: KeyType, arg1: KeyType, arg2: KeyType, arg3: Double, arg4: Double, cb: Callback[Double]): Unit = js.native
  def zinterstore(key: KeyType, arg1: KeyType, arg2: KeyType, arg3: Double, arg4: KeyType, cb: Callback[Double]): Unit = js.native
  def zinterstore(key: KeyType, arg1: KeyType, arg2: KeyType, arg3: Double, cb: Callback[Double]): Unit = js.native
  def zinterstore(key: KeyType, arg1: KeyType, arg2: KeyType, arg3: KeyType, arg4: Double, cb: Callback[Double]): Unit = js.native
  def zinterstore(key: KeyType, arg1: KeyType, arg2: KeyType, arg3: KeyType, arg4: KeyType, cb: Callback[Double]): Unit = js.native
  def zinterstore(key: KeyType, arg1: KeyType, arg2: KeyType, arg3: KeyType, cb: Callback[Double]): Unit = js.native
  def zinterstore(key: KeyType, arg1: KeyType, arg2: KeyType, cb: Callback[Double]): Unit = js.native
  def zinterstore(key: KeyType, args: (KeyType | Double)*): js.Promise[Double] = js.native
  def zpopmax(key: KeyType): js.Promise[js.Array[String]] = js.native
  def zpopmax(key: KeyType, callback: Callback[js.Array[String]]): Unit = js.native
  def zpopmax(key: KeyType, count: Double): js.Promise[js.Array[String]] = js.native
  def zpopmax(key: KeyType, count: Double, callback: Callback[js.Array[String]]): Unit = js.native
  def zpopmin(key: KeyType): js.Promise[js.Array[String]] = js.native
  def zpopmin(key: KeyType, callback: Callback[js.Array[String]]): Unit = js.native
  def zpopmin(key: KeyType, count: Double): js.Promise[js.Array[String]] = js.native
  def zpopmin(key: KeyType, count: Double, callback: Callback[js.Array[String]]): Unit = js.native
  def zrange(key: KeyType, start: Double, stop: Double): js.Promise[js.Array[String]] = js.native
  def zrange(key: KeyType, start: Double, stop: Double, callback: Callback[js.Array[String]]): Unit = js.native
  @JSName("zrange")
  def zrange_WITHSCORES(key: KeyType, start: Double, stop: Double, withScores: WITHSCORES): js.Promise[js.Array[String]] = js.native
  @JSName("zrange")
  def zrange_WITHSCORES(
    key: KeyType,
    start: Double,
    stop: Double,
    withScores: WITHSCORES,
    callback: Callback[js.Array[String]]
  ): Unit = js.native
  def zrangebylex(key: KeyType, min: String, max: String): js.Promise[js.Array[String]] = js.native
  def zrangebylex(key: KeyType, min: String, max: String, callback: Callback[js.Array[String]]): Unit = js.native
  @JSName("zrangebylex")
  def zrangebylex_LIMIT(key: KeyType, min: String, max: String, limit: LIMIT, offset: Double, count: Double): js.Promise[js.Array[String]] = js.native
  @JSName("zrangebylex")
  def zrangebylex_LIMIT(
    key: KeyType,
    min: String,
    max: String,
    limit: LIMIT,
    offset: Double,
    count: Double,
    callback: Callback[js.Array[String]]
  ): Unit = js.native
  def zrangebyscore(key: KeyType, min: String, max: String): js.Promise[js.Array[String]] = js.native
  def zrangebyscore(key: KeyType, min: String, max: String, callback: Callback[js.Array[String]]): Unit = js.native
  def zrangebyscore(
    key: KeyType,
    min: String,
    max: String,
    withScores: WITHSCORES,
    limit: LIMIT,
    offset: Double,
    count: Double
  ): js.Promise[js.Array[String]] = js.native
  def zrangebyscore(
    key: KeyType,
    min: String,
    max: String,
    withScores: WITHSCORES,
    limit: LIMIT,
    offset: Double,
    count: Double,
    callback: Callback[js.Array[String]]
  ): Unit = js.native
  def zrangebyscore(key: KeyType, min: String, max: Double): js.Promise[js.Array[String]] = js.native
  def zrangebyscore(key: KeyType, min: String, max: Double, callback: Callback[js.Array[String]]): Unit = js.native
  def zrangebyscore(
    key: KeyType,
    min: String,
    max: Double,
    withScores: WITHSCORES,
    limit: LIMIT,
    offset: Double,
    count: Double
  ): js.Promise[js.Array[String]] = js.native
  def zrangebyscore(
    key: KeyType,
    min: String,
    max: Double,
    withScores: WITHSCORES,
    limit: LIMIT,
    offset: Double,
    count: Double,
    callback: Callback[js.Array[String]]
  ): Unit = js.native
  def zrangebyscore(key: KeyType, min: Double, max: String): js.Promise[js.Array[String]] = js.native
  def zrangebyscore(key: KeyType, min: Double, max: String, callback: Callback[js.Array[String]]): Unit = js.native
  def zrangebyscore(
    key: KeyType,
    min: Double,
    max: String,
    withScores: WITHSCORES,
    limit: LIMIT,
    offset: Double,
    count: Double
  ): js.Promise[js.Array[String]] = js.native
  def zrangebyscore(
    key: KeyType,
    min: Double,
    max: String,
    withScores: WITHSCORES,
    limit: LIMIT,
    offset: Double,
    count: Double,
    callback: Callback[js.Array[String]]
  ): Unit = js.native
  def zrangebyscore(key: KeyType, min: Double, max: Double): js.Promise[js.Array[String]] = js.native
  def zrangebyscore(key: KeyType, min: Double, max: Double, callback: Callback[js.Array[String]]): Unit = js.native
  def zrangebyscore(
    key: KeyType,
    min: Double,
    max: Double,
    withScores: WITHSCORES,
    limit: LIMIT,
    offset: Double,
    count: Double
  ): js.Promise[js.Array[String]] = js.native
  def zrangebyscore(
    key: KeyType,
    min: Double,
    max: Double,
    withScores: WITHSCORES,
    limit: LIMIT,
    offset: Double,
    count: Double,
    callback: Callback[js.Array[String]]
  ): Unit = js.native
  @JSName("zrangebyscore")
  def zrangebyscore_LIMIT(key: KeyType, min: String, max: String, limit: LIMIT, offset: Double, count: Double): js.Promise[js.Array[String]] = js.native
  @JSName("zrangebyscore")
  def zrangebyscore_LIMIT(
    key: KeyType,
    min: String,
    max: String,
    limit: LIMIT,
    offset: Double,
    count: Double,
    callback: Callback[js.Array[String]]
  ): Unit = js.native
  @JSName("zrangebyscore")
  def zrangebyscore_LIMIT(key: KeyType, min: String, max: Double, limit: LIMIT, offset: Double, count: Double): js.Promise[js.Array[String]] = js.native
  @JSName("zrangebyscore")
  def zrangebyscore_LIMIT(
    key: KeyType,
    min: String,
    max: Double,
    limit: LIMIT,
    offset: Double,
    count: Double,
    callback: Callback[js.Array[String]]
  ): Unit = js.native
  @JSName("zrangebyscore")
  def zrangebyscore_LIMIT(key: KeyType, min: Double, max: String, limit: LIMIT, offset: Double, count: Double): js.Promise[js.Array[String]] = js.native
  @JSName("zrangebyscore")
  def zrangebyscore_LIMIT(
    key: KeyType,
    min: Double,
    max: String,
    limit: LIMIT,
    offset: Double,
    count: Double,
    callback: Callback[js.Array[String]]
  ): Unit = js.native
  @JSName("zrangebyscore")
  def zrangebyscore_LIMIT(key: KeyType, min: Double, max: Double, limit: LIMIT, offset: Double, count: Double): js.Promise[js.Array[String]] = js.native
  @JSName("zrangebyscore")
  def zrangebyscore_LIMIT(
    key: KeyType,
    min: Double,
    max: Double,
    limit: LIMIT,
    offset: Double,
    count: Double,
    callback: Callback[js.Array[String]]
  ): Unit = js.native
  @JSName("zrangebyscore")
  def zrangebyscore_WITHSCORES(key: KeyType, min: String, max: String, withScores: WITHSCORES): js.Promise[js.Array[String]] = js.native
  @JSName("zrangebyscore")
  def zrangebyscore_WITHSCORES(
    key: KeyType,
    min: String,
    max: String,
    withScores: WITHSCORES,
    callback: Callback[js.Array[String]]
  ): Unit = js.native
  @JSName("zrangebyscore")
  def zrangebyscore_WITHSCORES(key: KeyType, min: String, max: Double, withScores: WITHSCORES): js.Promise[js.Array[String]] = js.native
  @JSName("zrangebyscore")
  def zrangebyscore_WITHSCORES(
    key: KeyType,
    min: String,
    max: Double,
    withScores: WITHSCORES,
    callback: Callback[js.Array[String]]
  ): Unit = js.native
  @JSName("zrangebyscore")
  def zrangebyscore_WITHSCORES(key: KeyType, min: Double, max: String, withScores: WITHSCORES): js.Promise[js.Array[String]] = js.native
  @JSName("zrangebyscore")
  def zrangebyscore_WITHSCORES(
    key: KeyType,
    min: Double,
    max: String,
    withScores: WITHSCORES,
    callback: Callback[js.Array[String]]
  ): Unit = js.native
  @JSName("zrangebyscore")
  def zrangebyscore_WITHSCORES(key: KeyType, min: Double, max: Double, withScores: WITHSCORES): js.Promise[js.Array[String]] = js.native
  @JSName("zrangebyscore")
  def zrangebyscore_WITHSCORES(
    key: KeyType,
    min: Double,
    max: Double,
    withScores: WITHSCORES,
    callback: Callback[js.Array[String]]
  ): Unit = js.native
  def zrank(key: KeyType, member: String): js.Promise[Double | Null] = js.native
  def zrank(key: KeyType, member: String, callback: Callback[Double | Null]): Unit = js.native
  def zrem(key: KeyType, arg1: js.Array[ValueType]): js.Promise[Double] = js.native
  def zrem(key: KeyType, arg1: js.Array[ValueType], cb: Callback[Double]): Unit = js.native
  def zrem(
    key: KeyType,
    arg1: ValueType,
    arg2: ValueType,
    arg3: ValueType,
    arg4: ValueType,
    arg5: ValueType,
    arg6: ValueType,
    cb: Callback[Double]
  ): Unit = js.native
  def zrem(
    key: KeyType,
    arg1: ValueType,
    arg2: ValueType,
    arg3: ValueType,
    arg4: ValueType,
    arg5: ValueType,
    cb: Callback[Double]
  ): Unit = js.native
  def zrem(
    key: KeyType,
    arg1: ValueType,
    arg2: ValueType,
    arg3: ValueType,
    arg4: ValueType,
    cb: Callback[Double]
  ): Unit = js.native
  def zrem(key: KeyType, arg1: ValueType, arg2: ValueType, arg3: ValueType, cb: Callback[Double]): Unit = js.native
  def zrem(key: KeyType, arg1: ValueType, arg2: ValueType, cb: Callback[Double]): Unit = js.native
  def zrem(key: KeyType, arg1: ValueType, cb: Callback[Double]): Unit = js.native
  def zrem(key: KeyType, args: ValueType*): js.Promise[Double] = js.native
  def zremrangebylex(key: KeyType, min: String, max: String): js.Promise[Double] = js.native
  def zremrangebylex(key: KeyType, min: String, max: String, callback: Callback[Double]): Unit = js.native
  def zremrangebyrank(key: KeyType, start: Double, stop: Double): js.Promise[Double] = js.native
  def zremrangebyrank(key: KeyType, start: Double, stop: Double, callback: Callback[Double]): Unit = js.native
  def zremrangebyscore(key: KeyType, min: String, max: String): js.Promise[Double] = js.native
  def zremrangebyscore(key: KeyType, min: String, max: String, callback: Callback[Double]): Unit = js.native
  def zremrangebyscore(key: KeyType, min: String, max: Double): js.Promise[Double] = js.native
  def zremrangebyscore(key: KeyType, min: String, max: Double, callback: Callback[Double]): Unit = js.native
  def zremrangebyscore(key: KeyType, min: Double, max: String): js.Promise[Double] = js.native
  def zremrangebyscore(key: KeyType, min: Double, max: String, callback: Callback[Double]): Unit = js.native
  def zremrangebyscore(key: KeyType, min: Double, max: Double): js.Promise[Double] = js.native
  def zremrangebyscore(key: KeyType, min: Double, max: Double, callback: Callback[Double]): Unit = js.native
  def zrevrange(key: KeyType, start: Double, stop: Double): js.Promise[js.Array[String]] = js.native
  def zrevrange(key: KeyType, start: Double, stop: Double, callback: Callback[js.Array[String]]): Unit = js.native
  @JSName("zrevrange")
  def zrevrange_WITHSCORES(key: KeyType, start: Double, stop: Double, withScores: WITHSCORES): js.Promise[js.Array[String]] = js.native
  @JSName("zrevrange")
  def zrevrange_WITHSCORES(
    key: KeyType,
    start: Double,
    stop: Double,
    withScores: WITHSCORES,
    callback: Callback[js.Array[String]]
  ): Unit = js.native
  def zrevrangebylex(key: KeyType, min: String, max: String): js.Promise[js.Array[String]] = js.native
  def zrevrangebylex(key: KeyType, min: String, max: String, callback: Callback[js.Array[String]]): Unit = js.native
  @JSName("zrevrangebylex")
  def zrevrangebylex_LIMIT(key: KeyType, min: String, max: String, limit: LIMIT, offset: Double, count: Double): js.Promise[js.Array[String]] = js.native
  @JSName("zrevrangebylex")
  def zrevrangebylex_LIMIT(
    key: KeyType,
    min: String,
    max: String,
    limit: LIMIT,
    offset: Double,
    count: Double,
    callback: Callback[js.Array[String]]
  ): Unit = js.native
  def zrevrangebyscore(key: KeyType, max: String, min: String): js.Promise[js.Array[String]] = js.native
  def zrevrangebyscore(key: KeyType, max: String, min: String, callback: Callback[js.Array[String]]): Unit = js.native
  def zrevrangebyscore(
    key: KeyType,
    max: String,
    min: String,
    withScores: WITHSCORES,
    limit: LIMIT,
    offset: Double,
    count: Double
  ): js.Promise[js.Array[String]] = js.native
  def zrevrangebyscore(
    key: KeyType,
    max: String,
    min: String,
    withScores: WITHSCORES,
    limit: LIMIT,
    offset: Double,
    count: Double,
    callback: Callback[js.Array[String]]
  ): Unit = js.native
  def zrevrangebyscore(key: KeyType, max: String, min: Double): js.Promise[js.Array[String]] = js.native
  def zrevrangebyscore(key: KeyType, max: String, min: Double, callback: Callback[js.Array[String]]): Unit = js.native
  def zrevrangebyscore(
    key: KeyType,
    max: String,
    min: Double,
    withScores: WITHSCORES,
    limit: LIMIT,
    offset: Double,
    count: Double
  ): js.Promise[js.Array[String]] = js.native
  def zrevrangebyscore(
    key: KeyType,
    max: String,
    min: Double,
    withScores: WITHSCORES,
    limit: LIMIT,
    offset: Double,
    count: Double,
    callback: Callback[js.Array[String]]
  ): Unit = js.native
  def zrevrangebyscore(key: KeyType, max: Double, min: String): js.Promise[js.Array[String]] = js.native
  def zrevrangebyscore(key: KeyType, max: Double, min: String, callback: Callback[js.Array[String]]): Unit = js.native
  def zrevrangebyscore(
    key: KeyType,
    max: Double,
    min: String,
    withScores: WITHSCORES,
    limit: LIMIT,
    offset: Double,
    count: Double
  ): js.Promise[js.Array[String]] = js.native
  def zrevrangebyscore(
    key: KeyType,
    max: Double,
    min: String,
    withScores: WITHSCORES,
    limit: LIMIT,
    offset: Double,
    count: Double,
    callback: Callback[js.Array[String]]
  ): Unit = js.native
  def zrevrangebyscore(key: KeyType, max: Double, min: Double): js.Promise[js.Array[String]] = js.native
  def zrevrangebyscore(key: KeyType, max: Double, min: Double, callback: Callback[js.Array[String]]): Unit = js.native
  def zrevrangebyscore(
    key: KeyType,
    max: Double,
    min: Double,
    withScores: WITHSCORES,
    limit: LIMIT,
    offset: Double,
    count: Double
  ): js.Promise[js.Array[String]] = js.native
  def zrevrangebyscore(
    key: KeyType,
    max: Double,
    min: Double,
    withScores: WITHSCORES,
    limit: LIMIT,
    offset: Double,
    count: Double,
    callback: Callback[js.Array[String]]
  ): Unit = js.native
  @JSName("zrevrangebyscore")
  def zrevrangebyscore_LIMIT(key: KeyType, max: String, min: String, limit: LIMIT, offset: Double, count: Double): js.Promise[js.Array[String]] = js.native
  @JSName("zrevrangebyscore")
  def zrevrangebyscore_LIMIT(
    key: KeyType,
    max: String,
    min: String,
    limit: LIMIT,
    offset: Double,
    count: Double,
    callback: Callback[js.Array[String]]
  ): Unit = js.native
  @JSName("zrevrangebyscore")
  def zrevrangebyscore_LIMIT(key: KeyType, max: String, min: Double, limit: LIMIT, offset: Double, count: Double): js.Promise[js.Array[String]] = js.native
  @JSName("zrevrangebyscore")
  def zrevrangebyscore_LIMIT(
    key: KeyType,
    max: String,
    min: Double,
    limit: LIMIT,
    offset: Double,
    count: Double,
    callback: Callback[js.Array[String]]
  ): Unit = js.native
  @JSName("zrevrangebyscore")
  def zrevrangebyscore_LIMIT(key: KeyType, max: Double, min: String, limit: LIMIT, offset: Double, count: Double): js.Promise[js.Array[String]] = js.native
  @JSName("zrevrangebyscore")
  def zrevrangebyscore_LIMIT(
    key: KeyType,
    max: Double,
    min: String,
    limit: LIMIT,
    offset: Double,
    count: Double,
    callback: Callback[js.Array[String]]
  ): Unit = js.native
  @JSName("zrevrangebyscore")
  def zrevrangebyscore_LIMIT(key: KeyType, max: Double, min: Double, limit: LIMIT, offset: Double, count: Double): js.Promise[js.Array[String]] = js.native
  @JSName("zrevrangebyscore")
  def zrevrangebyscore_LIMIT(
    key: KeyType,
    max: Double,
    min: Double,
    limit: LIMIT,
    offset: Double,
    count: Double,
    callback: Callback[js.Array[String]]
  ): Unit = js.native
  @JSName("zrevrangebyscore")
  def zrevrangebyscore_WITHSCORES(key: KeyType, max: String, min: String, withScores: WITHSCORES): js.Promise[js.Array[String]] = js.native
  @JSName("zrevrangebyscore")
  def zrevrangebyscore_WITHSCORES(
    key: KeyType,
    max: String,
    min: String,
    withScores: WITHSCORES,
    callback: Callback[js.Array[String]]
  ): Unit = js.native
  @JSName("zrevrangebyscore")
  def zrevrangebyscore_WITHSCORES(key: KeyType, max: String, min: Double, withScores: WITHSCORES): js.Promise[js.Array[String]] = js.native
  @JSName("zrevrangebyscore")
  def zrevrangebyscore_WITHSCORES(
    key: KeyType,
    max: String,
    min: Double,
    withScores: WITHSCORES,
    callback: Callback[js.Array[String]]
  ): Unit = js.native
  @JSName("zrevrangebyscore")
  def zrevrangebyscore_WITHSCORES(key: KeyType, max: Double, min: String, withScores: WITHSCORES): js.Promise[js.Array[String]] = js.native
  @JSName("zrevrangebyscore")
  def zrevrangebyscore_WITHSCORES(
    key: KeyType,
    max: Double,
    min: String,
    withScores: WITHSCORES,
    callback: Callback[js.Array[String]]
  ): Unit = js.native
  @JSName("zrevrangebyscore")
  def zrevrangebyscore_WITHSCORES(key: KeyType, max: Double, min: Double, withScores: WITHSCORES): js.Promise[js.Array[String]] = js.native
  @JSName("zrevrangebyscore")
  def zrevrangebyscore_WITHSCORES(
    key: KeyType,
    max: Double,
    min: Double,
    withScores: WITHSCORES,
    callback: Callback[js.Array[String]]
  ): Unit = js.native
  def zrevrank(key: KeyType, member: String): js.Promise[Double | Null] = js.native
  def zrevrank(key: KeyType, member: String, callback: Callback[Double | Null]): Unit = js.native
  def zscan(key: KeyType, arg1: js.Array[ValueType]): js.Promise[js.Tuple2[String, js.Array[String]]] = js.native
  def zscan(key: KeyType, arg1: js.Array[ValueType], cb: Callback[js.Tuple2[String, js.Array[String]]]): Unit = js.native
  def zscan(
    key: KeyType,
    arg1: ValueType,
    arg2: ValueType,
    arg3: ValueType,
    arg4: ValueType,
    arg5: ValueType,
    arg6: ValueType,
    cb: Callback[js.Tuple2[String, js.Array[String]]]
  ): Unit = js.native
  def zscan(
    key: KeyType,
    arg1: ValueType,
    arg2: ValueType,
    arg3: ValueType,
    arg4: ValueType,
    arg5: ValueType,
    cb: Callback[js.Tuple2[String, js.Array[String]]]
  ): Unit = js.native
  def zscan(
    key: KeyType,
    arg1: ValueType,
    arg2: ValueType,
    arg3: ValueType,
    arg4: ValueType,
    cb: Callback[js.Tuple2[String, js.Array[String]]]
  ): Unit = js.native
  def zscan(
    key: KeyType,
    arg1: ValueType,
    arg2: ValueType,
    arg3: ValueType,
    cb: Callback[js.Tuple2[String, js.Array[String]]]
  ): Unit = js.native
  def zscan(key: KeyType, arg1: ValueType, arg2: ValueType, cb: Callback[js.Tuple2[String, js.Array[String]]]): Unit = js.native
  def zscan(key: KeyType, arg1: ValueType, cb: Callback[js.Tuple2[String, js.Array[String]]]): Unit = js.native
  def zscan(key: KeyType, args: ValueType*): js.Promise[js.Tuple2[String, js.Array[String]]] = js.native
  def zscanStream(key: KeyType): Readable = js.native
  def zscanStream(key: KeyType, options: ScanStreamOption): Readable = js.native
  def zscore(key: KeyType, member: String): js.Promise[String] = js.native
  def zscore(key: KeyType, member: String, callback: Callback[String]): Unit = js.native
  def zunionstore(
    key: KeyType,
    arg1: KeyType | Double,
    arg2: KeyType | Double,
    arg3: KeyType | Double,
    arg4: KeyType | Double,
    arg5: KeyType | Double,
    arg6: KeyType | Double,
    cb: Callback[Double]
  ): Unit = js.native
  def zunionstore(
    key: KeyType,
    arg1: KeyType | Double,
    arg2: KeyType | Double,
    arg3: KeyType | Double,
    arg4: KeyType | Double,
    arg5: KeyType | Double,
    cb: Callback[Double]
  ): Unit = js.native
  def zunionstore(key: KeyType, arg1: KeyType | Double, cb: Callback[Double]): Unit = js.native
  def zunionstore(key: KeyType, arg1: js.Array[KeyType | Double]): js.Promise[Double] = js.native
  def zunionstore(key: KeyType, arg1: js.Array[KeyType | Double], cb: Callback[Double]): Unit = js.native
  def zunionstore(key: KeyType, arg1: Double, arg2: Double, arg3: Double, arg4: Double, cb: Callback[Double]): Unit = js.native
  def zunionstore(key: KeyType, arg1: Double, arg2: Double, arg3: Double, arg4: KeyType, cb: Callback[Double]): Unit = js.native
  def zunionstore(key: KeyType, arg1: Double, arg2: Double, arg3: Double, cb: Callback[Double]): Unit = js.native
  def zunionstore(key: KeyType, arg1: Double, arg2: Double, arg3: KeyType, arg4: Double, cb: Callback[Double]): Unit = js.native
  def zunionstore(key: KeyType, arg1: Double, arg2: Double, arg3: KeyType, arg4: KeyType, cb: Callback[Double]): Unit = js.native
  def zunionstore(key: KeyType, arg1: Double, arg2: Double, arg3: KeyType, cb: Callback[Double]): Unit = js.native
  def zunionstore(key: KeyType, arg1: Double, arg2: Double, cb: Callback[Double]): Unit = js.native
  def zunionstore(key: KeyType, arg1: Double, arg2: KeyType, arg3: Double, arg4: Double, cb: Callback[Double]): Unit = js.native
  def zunionstore(key: KeyType, arg1: Double, arg2: KeyType, arg3: Double, arg4: KeyType, cb: Callback[Double]): Unit = js.native
  def zunionstore(key: KeyType, arg1: Double, arg2: KeyType, arg3: Double, cb: Callback[Double]): Unit = js.native
  def zunionstore(key: KeyType, arg1: Double, arg2: KeyType, arg3: KeyType, arg4: Double, cb: Callback[Double]): Unit = js.native
  def zunionstore(key: KeyType, arg1: Double, arg2: KeyType, arg3: KeyType, arg4: KeyType, cb: Callback[Double]): Unit = js.native
  def zunionstore(key: KeyType, arg1: Double, arg2: KeyType, arg3: KeyType, cb: Callback[Double]): Unit = js.native
  def zunionstore(key: KeyType, arg1: Double, arg2: KeyType, cb: Callback[Double]): Unit = js.native
  def zunionstore(key: KeyType, arg1: KeyType, arg2: Double, arg3: Double, arg4: Double, cb: Callback[Double]): Unit = js.native
  def zunionstore(key: KeyType, arg1: KeyType, arg2: Double, arg3: Double, arg4: KeyType, cb: Callback[Double]): Unit = js.native
  def zunionstore(key: KeyType, arg1: KeyType, arg2: Double, arg3: Double, cb: Callback[Double]): Unit = js.native
  def zunionstore(key: KeyType, arg1: KeyType, arg2: Double, arg3: KeyType, arg4: Double, cb: Callback[Double]): Unit = js.native
  def zunionstore(key: KeyType, arg1: KeyType, arg2: Double, arg3: KeyType, arg4: KeyType, cb: Callback[Double]): Unit = js.native
  def zunionstore(key: KeyType, arg1: KeyType, arg2: Double, arg3: KeyType, cb: Callback[Double]): Unit = js.native
  def zunionstore(key: KeyType, arg1: KeyType, arg2: Double, cb: Callback[Double]): Unit = js.native
  def zunionstore(key: KeyType, arg1: KeyType, arg2: KeyType, arg3: Double, arg4: Double, cb: Callback[Double]): Unit = js.native
  def zunionstore(key: KeyType, arg1: KeyType, arg2: KeyType, arg3: Double, arg4: KeyType, cb: Callback[Double]): Unit = js.native
  def zunionstore(key: KeyType, arg1: KeyType, arg2: KeyType, arg3: Double, cb: Callback[Double]): Unit = js.native
  def zunionstore(key: KeyType, arg1: KeyType, arg2: KeyType, arg3: KeyType, arg4: Double, cb: Callback[Double]): Unit = js.native
  def zunionstore(key: KeyType, arg1: KeyType, arg2: KeyType, arg3: KeyType, arg4: KeyType, cb: Callback[Double]): Unit = js.native
  def zunionstore(key: KeyType, arg1: KeyType, arg2: KeyType, arg3: KeyType, cb: Callback[Double]): Unit = js.native
  def zunionstore(key: KeyType, arg1: KeyType, arg2: KeyType, cb: Callback[Double]): Unit = js.native
  def zunionstore(key: KeyType, args: (KeyType | Double)*): js.Promise[Double] = js.native
}

