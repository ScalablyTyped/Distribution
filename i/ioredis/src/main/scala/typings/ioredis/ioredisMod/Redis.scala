package typings.ioredis.ioredisMod

import typings.ioredis.Anon_False
import typings.ioredis.ioredisNumbers.`0`
import typings.ioredis.ioredisNumbers.`1`
import typings.ioredis.ioredisStrings.AFTER
import typings.ioredis.ioredisStrings.BEFORE
import typings.ioredis.ioredisStrings.COUNT
import typings.ioredis.ioredisStrings.GROUP
import typings.ioredis.ioredisStrings.MATCH
import typings.ioredis.ioredisStrings.MAXLEN
import typings.ioredis.ioredisStrings.NOSAVE
import typings.ioredis.ioredisStrings.SAVE
import typings.ioredis.ioredisStrings.WITHSCORES
import typings.ioredis.ioredisStrings.`match`
import typings.ioredis.ioredisStrings.`~`
import typings.ioredis.ioredisStrings.count
import typings.ioredis.ioredisStrings.group
import typings.ioredis.ioredisStrings.maxlen
import typings.node.Buffer
import typings.node.NodeJSNs.EventEmitter
import typings.node.streamMod.Readable
import typings.std.Error
import typings.std.PromiseConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Redis
  extends EventEmitter
     with Commander {
  var Promise: PromiseConstructor = js.native
  var status: String = js.native
  def append(key: KeyType, value: js.Any): js.Promise[Double] = js.native
  def append(key: KeyType, value: js.Any, callback: js.Function2[/* err */ Error, /* res */ Double, Unit]): Unit = js.native
  def auth(password: String): js.Promise[String] = js.native
  def auth(password: String, callback: js.Function2[/* err */ Error, /* res */ String, Unit]): Unit = js.native
  def bgrewriteaof(): js.Promise[String] = js.native
  def bgrewriteaof(callback: js.Function2[/* err */ Error, /* res */ String, Unit]): Unit = js.native
  def bgsave(): js.Promise[String] = js.native
  def bgsave(callback: js.Function2[/* err */ Error, /* res */ String, Unit]): Unit = js.native
  def bitcount(key: KeyType): js.Promise[Double] = js.native
  def bitcount(key: KeyType, callback: js.Function2[/* err */ Error, /* res */ Double, Unit]): Unit = js.native
  def bitcount(key: KeyType, start: Double, end: Double): js.Promise[Double] = js.native
  def bitcount(
    key: KeyType,
    start: Double,
    end: Double,
    callback: js.Function2[/* err */ Error, /* res */ Double, Unit]
  ): Unit = js.native
  def blpop(keys: KeyType*): js.Any = js.native
  def brpop(keys: KeyType*): js.Any = js.native
  def brpoplpush(source: String, destination: String, timeout: Double): js.Promise[_] = js.native
  def brpoplpush(
    source: String,
    destination: String,
    timeout: Double,
    callback: js.Function2[/* err */ Error, /* res */ js.Any, Unit]
  ): Unit = js.native
  def client(args: js.Any*): js.Any = js.native
  def cluster(args: js.Any*): js.Any = js.native
  def config(args: js.Any*): js.Any = js.native
  def connect(): js.Promise[_] = js.native
  def connect(callback: js.Function0[Unit]): js.Promise[_] = js.native
  def dbsize(): js.Promise[Double] = js.native
  def dbsize(callback: js.Function2[/* err */ Error, /* res */ Double, Unit]): Unit = js.native
  def debug(args: js.Any*): js.Any = js.native
  def decr(key: KeyType): js.Promise[Double] = js.native
  def decr(key: KeyType, callback: js.Function2[/* err */ Error, /* res */ Double, Unit]): Unit = js.native
  def decrby(key: KeyType, decrement: Double): js.Promise[Double] = js.native
  def decrby(key: KeyType, decrement: Double, callback: js.Function2[/* err */ Error, /* res */ Double, Unit]): Unit = js.native
  def del(keys: KeyType*): js.Promise[Double] = js.native
  def discard(): js.Promise[_] = js.native
  def discard(callback: js.Function2[/* err */ Error, /* res */ js.Any, Unit]): Unit = js.native
  def disconnect(): Unit = js.native
  def dump(key: KeyType): js.Promise[String] = js.native
  def dump(key: KeyType, callback: js.Function2[/* err */ Error, /* res */ String, Unit]): Unit = js.native
  def duplicate(): Redis = js.native
  def echo(message: String): js.Promise[String] = js.native
  def echo(message: String, callback: js.Function2[/* err */ Error, /* res */ String, Unit]): Unit = js.native
  def eval(args: js.Any*): js.Any = js.native
  def evalsha(args: js.Any*): js.Any = js.native
  def exec(): js.Promise[_] = js.native
  def exec(callback: js.Function2[/* err */ Error, /* res */ js.Any, Unit]): Unit = js.native
  def exists(keys: KeyType*): js.Promise[Double] = js.native
  def exists(key: KeyType, callback: js.Function2[/* err */ Error, /* res */ Double, Unit]): Unit = js.native
  def expire(key: KeyType, seconds: Double): js.Promise[`0` | `1`] = js.native
  def expire(key: KeyType, seconds: Double, callback: js.Function2[/* err */ Error, /* res */ `0` | `1`, Unit]): Unit = js.native
  def expireat(key: KeyType, timestamp: Double): js.Promise[`0` | `1`] = js.native
  def expireat(
    key: KeyType,
    timestamp: Double,
    callback: js.Function2[/* err */ Error, /* res */ `0` | `1`, Unit]
  ): Unit = js.native
  def flushall(): js.Promise[String] = js.native
  def flushall(callback: js.Function2[/* err */ Error, /* res */ String, Unit]): Unit = js.native
  def flushdb(): js.Promise[String] = js.native
  def flushdb(callback: js.Function2[/* err */ Error, /* res */ String, Unit]): Unit = js.native
  def get(key: KeyType): js.Promise[String | Null] = js.native
  def get(key: KeyType, callback: js.Function2[/* err */ Error, /* res */ String | Null, Unit]): Unit = js.native
  def getBuffer(key: KeyType): js.Promise[Buffer] = js.native
  def getBuffer(key: KeyType, callback: js.Function2[/* err */ Error, /* res */ Buffer, Unit]): Unit = js.native
  def getbit(key: KeyType, offset: Double): js.Promise[Double] = js.native
  def getbit(key: KeyType, offset: Double, callback: js.Function2[/* err */ Error, /* res */ Double, Unit]): Unit = js.native
  def getrange(key: KeyType, start: Double, end: Double): js.Promise[String] = js.native
  def getrange(
    key: KeyType,
    start: Double,
    end: Double,
    callback: js.Function2[/* err */ Error, /* res */ String, Unit]
  ): Unit = js.native
  def getset(key: KeyType, value: js.Any): js.Promise[String | Null] = js.native
  def getset(
    key: KeyType,
    value: js.Any,
    callback: js.Function2[/* err */ Error, /* res */ String | Null, Unit]
  ): Unit = js.native
  def hdel(key: KeyType, fields: String*): js.Any = js.native
  def hexists(key: KeyType, field: String): js.Promise[`0` | `1`] = js.native
  def hexists(key: KeyType, field: String, callback: js.Function2[/* err */ Error, /* res */ `0` | `1`, Unit]): Unit = js.native
  def hget(key: KeyType, field: String): js.Promise[String | Null] = js.native
  def hget(
    key: KeyType,
    field: String,
    callback: js.Function2[/* err */ Error, /* res */ String | Null, Unit]
  ): Unit = js.native
  def hgetBuffer(key: KeyType, field: String): js.Promise[Buffer] = js.native
  def hgetBuffer(key: KeyType, field: String, callback: js.Function2[/* err */ Error, /* res */ Buffer, Unit]): Unit = js.native
  def hgetall(key: KeyType): js.Promise[_] = js.native
  def hgetall(key: KeyType, callback: js.Function2[/* err */ Error, /* res */ js.Any, Unit]): Unit = js.native
  def hincrby(key: KeyType, field: String, increment: Double): js.Promise[Double] = js.native
  def hincrby(
    key: KeyType,
    field: String,
    increment: Double,
    callback: js.Function2[/* err */ Error, /* res */ Double, Unit]
  ): Unit = js.native
  def hincrbyfloat(key: KeyType, field: String, increment: Double): js.Promise[Double] = js.native
  def hincrbyfloat(
    key: KeyType,
    field: String,
    increment: Double,
    callback: js.Function2[/* err */ Error, /* res */ Double, Unit]
  ): Unit = js.native
  def hkeys(key: KeyType): js.Promise[_] = js.native
  def hkeys(key: KeyType, callback: js.Function2[/* err */ Error, /* res */ js.Any, Unit]): Unit = js.native
  def hlen(key: KeyType): js.Promise[Double] = js.native
  def hlen(key: KeyType, callback: js.Function2[/* err */ Error, /* res */ Double, Unit]): Unit = js.native
  def hmget(key: KeyType, fields: String*): js.Any = js.native
  def hmset(key: KeyType, args: js.Any*): js.Promise[`0` | `1`] = js.native
  def hmset(key: KeyType, data: js.Any): js.Promise[`0` | `1`] = js.native
  def hmset(key: KeyType, data: js.Any, callback: js.Function2[/* err */ Error, /* res */ `0` | `1`, Unit]): Unit = js.native
  def hscan(key: KeyType, cursor: Double, args: js.Any*): js.Any = js.native
  def hscanStream(key: KeyType): Readable = js.native
  def hscanStream(key: KeyType, options: ScanStreamOption): Readable = js.native
  def hset(key: KeyType, field: String, value: js.Any): js.Promise[`0` | `1`] = js.native
  def hset(
    key: KeyType,
    field: String,
    value: js.Any,
    callback: js.Function2[/* err */ Error, /* res */ `0` | `1`, Unit]
  ): Unit = js.native
  def hsetBuffer(key: KeyType, field: String, value: js.Any): js.Promise[Buffer] = js.native
  def hsetBuffer(
    key: KeyType,
    field: String,
    value: js.Any,
    callback: js.Function2[/* err */ Error, /* res */ `0` | `1`, Unit]
  ): Unit = js.native
  def hsetnx(key: KeyType, field: String, value: js.Any): js.Promise[`0` | `1`] = js.native
  def hsetnx(
    key: KeyType,
    field: String,
    value: js.Any,
    callback: js.Function2[/* err */ Error, /* res */ `0` | `1`, Unit]
  ): Unit = js.native
  def hvals(key: KeyType): js.Promise[_] = js.native
  def hvals(key: KeyType, callback: js.Function2[/* err */ Error, /* res */ js.Any, Unit]): Unit = js.native
  def incr(key: KeyType): js.Promise[Double] = js.native
  def incr(key: KeyType, callback: js.Function2[/* err */ Error, /* res */ Double, Unit]): Unit = js.native
  def incrby(key: KeyType, increment: Double): js.Promise[Double] = js.native
  def incrby(key: KeyType, increment: Double, callback: js.Function2[/* err */ Error, /* res */ Double, Unit]): Unit = js.native
  def incrbyfloat(key: KeyType, increment: Double): js.Promise[Double] = js.native
  def incrbyfloat(key: KeyType, increment: Double, callback: js.Function2[/* err */ Error, /* res */ Double, Unit]): Unit = js.native
  def info(): js.Promise[String] = js.native
  def info(callback: js.Function2[/* err */ Error, /* res */ js.Any, Unit]): Unit = js.native
  def info(section: String): js.Promise[String] = js.native
  def info(section: String, callback: js.Function2[/* err */ Error, /* res */ js.Any, Unit]): Unit = js.native
  def keys(pattern: String): js.Promise[js.Array[String]] = js.native
  def keys(pattern: String, callback: js.Function2[/* err */ Error, /* res */ js.Array[String], Unit]): Unit = js.native
  def lastsave(): js.Promise[Double] = js.native
  def lastsave(callback: js.Function2[/* err */ Error, /* res */ Double, Unit]): Unit = js.native
  def lindex(key: KeyType, index: Double): js.Promise[String] = js.native
  def lindex(key: KeyType, index: Double, callback: js.Function2[/* err */ Error, /* res */ String, Unit]): Unit = js.native
  @JSName("linsert")
  def linsert_AFTER(key: KeyType, direction: AFTER, pivot: String, value: js.Any): js.Promise[Double] = js.native
  @JSName("linsert")
  def linsert_AFTER(
    key: KeyType,
    direction: AFTER,
    pivot: String,
    value: js.Any,
    callback: js.Function2[/* err */ Error, /* res */ Double, Unit]
  ): Unit = js.native
  @JSName("linsert")
  def linsert_BEFORE(key: KeyType, direction: BEFORE, pivot: String, value: js.Any): js.Promise[Double] = js.native
  @JSName("linsert")
  def linsert_BEFORE(
    key: KeyType,
    direction: BEFORE,
    pivot: String,
    value: js.Any,
    callback: js.Function2[/* err */ Error, /* res */ Double, Unit]
  ): Unit = js.native
  def llen(key: KeyType): js.Promise[Double] = js.native
  def llen(key: KeyType, callback: js.Function2[/* err */ Error, /* res */ Double, Unit]): Unit = js.native
  def lpop(key: KeyType): js.Promise[String] = js.native
  def lpop(key: KeyType, callback: js.Function2[/* err */ Error, /* res */ String, Unit]): Unit = js.native
  def lpopBuffer(key: KeyType): js.Promise[Buffer] = js.native
  def lpopBuffer(key: KeyType, callback: js.Function2[/* err */ Error, /* res */ Buffer, Unit]): Unit = js.native
  def lpush(key: KeyType, values: js.Any*): js.Any = js.native
  def lpushx(key: KeyType, value: js.Any): js.Promise[Double] = js.native
  def lpushx(key: KeyType, value: js.Any, callback: js.Function2[/* err */ Error, /* res */ Double, Unit]): Unit = js.native
  def lrange(key: KeyType, start: Double, stop: Double): js.Promise[_] = js.native
  def lrange(
    key: KeyType,
    start: Double,
    stop: Double,
    callback: js.Function2[/* err */ Error, /* res */ js.Any, Unit]
  ): Unit = js.native
  def lrangeBuffer(key: KeyType, start: Double, stop: Double): js.Promise[js.Array[Buffer]] = js.native
  def lrangeBuffer(
    key: KeyType,
    start: Double,
    stop: Double,
    callback: js.Function2[/* err */ Error, /* res */ js.Array[Buffer], Unit]
  ): Unit = js.native
  def lrem(key: KeyType, count: Double, value: js.Any): js.Promise[Double] = js.native
  def lrem(
    key: KeyType,
    count: Double,
    value: js.Any,
    callback: js.Function2[/* err */ Error, /* res */ Double, Unit]
  ): Unit = js.native
  def lset(key: KeyType, index: Double, value: js.Any): js.Promise[_] = js.native
  def lset(
    key: KeyType,
    index: Double,
    value: js.Any,
    callback: js.Function2[/* err */ Error, /* res */ js.Any, Unit]
  ): Unit = js.native
  def ltrim(key: KeyType, start: Double, stop: Double): js.Promise[_] = js.native
  def ltrim(
    key: KeyType,
    start: Double,
    stop: Double,
    callback: js.Function2[/* err */ Error, /* res */ js.Any, Unit]
  ): Unit = js.native
  def mget(keys: KeyType*): js.Any = js.native
  def migrate(args: js.Any*): js.Any = js.native
  def monitor(): js.Promise[EventEmitter] = js.native
  def monitor(callback: js.Function2[/* err */ Error, /* res */ EventEmitter, Unit]): Unit = js.native
  def move(key: KeyType, db: String): js.Promise[`0` | `1`] = js.native
  def move(key: KeyType, db: String, callback: js.Function2[/* err */ Error, /* res */ `0` | `1`, Unit]): Unit = js.native
  def mset(args: js.Any*): js.Any = js.native
  def mset(data: js.Any): js.Promise[String] = js.native
  def mset(data: js.Any, callback: js.Function2[/* err */ Error, /* res */ String, Unit]): Unit = js.native
  def msetnx(args: js.Any*): js.Any = js.native
  def msetnx(data: js.Any): js.Promise[`0` | `1`] = js.native
  def msetnx(data: js.Any, callback: js.Function2[/* err */ Error, /* res */ `0` | `1`, Unit]): Unit = js.native
  def multi(): Pipeline = js.native
  def multi(commands: js.Array[js.Array[String]]): Pipeline = js.native
  def multi(commands: js.Array[js.Array[String]], options: MultiOptions): Pipeline = js.native
  def multi(options: Anon_False): js.Promise[String] = js.native
  def `object`(subcommand: String, args: js.Any*): js.Any = js.native
  def persist(key: KeyType): js.Promise[`0` | `1`] = js.native
  def persist(key: KeyType, callback: js.Function2[/* err */ Error, /* res */ `0` | `1`, Unit]): Unit = js.native
  def pexpire(key: KeyType, milliseconds: Double): js.Promise[`0` | `1`] = js.native
  def pexpire(
    key: KeyType,
    milliseconds: Double,
    callback: js.Function2[/* err */ Error, /* res */ `0` | `1`, Unit]
  ): Unit = js.native
  def pexpireat(key: KeyType, millisecondsTimestamp: Double): js.Promise[`0` | `1`] = js.native
  def pexpireat(
    key: KeyType,
    millisecondsTimestamp: Double,
    callback: js.Function2[/* err */ Error, /* res */ `0` | `1`, Unit]
  ): Unit = js.native
  def pfadd(key: KeyType, elements: String*): js.Any = js.native
  def pfcount(keys: KeyType*): js.Any = js.native
  def pfmerge(destkey: KeyType, sourcekeys: KeyType*): js.Any = js.native
  def ping(): js.Promise[String] = js.native
  def ping(callback: js.Function2[/* err */ Error, /* res */ String, Unit]): Unit = js.native
  def ping(message: String): js.Promise[String] = js.native
  def ping(message: String, callback: js.Function2[/* err */ Error, /* res */ String, Unit]): Unit = js.native
  def pipeline(): Pipeline = js.native
  def pipeline(commands: js.Array[js.Array[String]]): Pipeline = js.native
  def psetex(key: KeyType, milliseconds: Double, value: js.Any): js.Promise[_] = js.native
  def psetex(
    key: KeyType,
    milliseconds: Double,
    value: js.Any,
    callback: js.Function2[/* err */ Error, /* res */ js.Any, Unit]
  ): Unit = js.native
  def psubscribe(patterns: String*): js.Any = js.native
  def pttl(key: KeyType): js.Promise[Double] = js.native
  def pttl(key: KeyType, callback: js.Function2[/* err */ Error, /* res */ Double, Unit]): Unit = js.native
  def publish(channel: String, message: String): js.Promise[Double] = js.native
  def publish(channel: String, message: String, callback: js.Function2[/* err */ Error, /* res */ Double, Unit]): Unit = js.native
  def publishBuffer(channel: String, message: Buffer): js.Promise[Double] = js.native
  def punsubscribe(patterns: String*): js.Any = js.native
  def quit(): js.Promise[String] = js.native
  def quit(callback: js.Function2[/* err */ Error, /* res */ String, Unit]): Unit = js.native
  def randomkey(): js.Promise[String] = js.native
  def randomkey(callback: js.Function2[/* err */ Error, /* res */ String, Unit]): Unit = js.native
  def rename(key: KeyType, newkey: KeyType): js.Promise[String] = js.native
  def rename(key: KeyType, newkey: KeyType, callback: js.Function2[/* err */ Error, /* res */ String, Unit]): Unit = js.native
  def renamenx(key: KeyType, newkey: KeyType): js.Promise[`0` | `1`] = js.native
  def renamenx(key: KeyType, newkey: KeyType, callback: js.Function2[/* err */ Error, /* res */ `0` | `1`, Unit]): Unit = js.native
  def restore(args: js.Any*): js.Any = js.native
  def rpop(key: KeyType): js.Promise[String] = js.native
  def rpop(key: KeyType, callback: js.Function2[/* err */ Error, /* res */ String, Unit]): Unit = js.native
  def rpoplpush(source: String, destination: String): js.Promise[String] = js.native
  def rpoplpush(
    source: String,
    destination: String,
    callback: js.Function2[/* err */ Error, /* res */ String, Unit]
  ): Unit = js.native
  def rpush(key: KeyType, values: js.Any*): js.Any = js.native
  def rpushBuffer(key: String, values: Buffer*): js.Any = js.native
  def rpushx(key: KeyType, value: js.Any): js.Promise[Double] = js.native
  def rpushx(key: KeyType, value: js.Any, callback: js.Function2[/* err */ Error, /* res */ Double, Unit]): Unit = js.native
  def sadd(key: KeyType, members: js.Any*): js.Any = js.native
  def save(): js.Promise[String] = js.native
  def save(callback: js.Function2[/* err */ Error, /* res */ String, Unit]): Unit = js.native
  def scan(cursor: Double): js.Promise[js.Tuple2[String, js.Array[String]]] = js.native
  def scan(cursor: Double, countOption: COUNT, count: Double, matchOption: MATCH, pattern: String): js.Promise[js.Tuple2[String, js.Array[String]]] = js.native
  def scan(cursor: Double, countOption: COUNT, count: Double, matchOption: `match`, pattern: String): js.Promise[js.Tuple2[String, js.Array[String]]] = js.native
  def scan(cursor: Double, countOption: count, count: Double, matchOption: MATCH, pattern: String): js.Promise[js.Tuple2[String, js.Array[String]]] = js.native
  def scan(cursor: Double, countOption: count, count: Double, matchOption: `match`, pattern: String): js.Promise[js.Tuple2[String, js.Array[String]]] = js.native
  def scan(cursor: Double, matchOption: MATCH, pattern: String, countOption: COUNT, count: Double): js.Promise[js.Tuple2[String, js.Array[String]]] = js.native
  def scan(cursor: Double, matchOption: MATCH, pattern: String, countOption: count, count: Double): js.Promise[js.Tuple2[String, js.Array[String]]] = js.native
  def scan(cursor: Double, matchOption: `match`, pattern: String, countOption: COUNT, count: Double): js.Promise[js.Tuple2[String, js.Array[String]]] = js.native
  def scan(cursor: Double, matchOption: `match`, pattern: String, countOption: count, count: Double): js.Promise[js.Tuple2[String, js.Array[String]]] = js.native
  def scanStream(): Readable = js.native
  def scanStream(options: ScanStreamOption): Readable = js.native
  @JSName("scan")
  def scan_COUNT(cursor: Double, countOption: COUNT, count: Double): js.Promise[js.Tuple2[String, js.Array[String]]] = js.native
  @JSName("scan")
  def scan_MATCH(cursor: Double, matchOption: MATCH, pattern: String): js.Promise[js.Tuple2[String, js.Array[String]]] = js.native
  @JSName("scan")
  def scan_count(cursor: Double, countOption: count, count: Double): js.Promise[js.Tuple2[String, js.Array[String]]] = js.native
  @JSName("scan")
  def scan_match(cursor: Double, matchOption: `match`, pattern: String): js.Promise[js.Tuple2[String, js.Array[String]]] = js.native
  def scard(key: KeyType): js.Promise[Double] = js.native
  def scard(key: KeyType, callback: js.Function2[/* err */ Error, /* res */ Double, Unit]): Unit = js.native
  def script(args: js.Any*): js.Any = js.native
  def sdiff(keys: KeyType*): js.Any = js.native
  def sdiffstore(destination: String, keys: KeyType*): js.Any = js.native
  def select(index: Double): js.Promise[String] = js.native
  def select(index: Double, callback: js.Function2[/* err */ Error, /* res */ String, Unit]): Unit = js.native
  def send_command(command: String, args: js.Any*): js.Any = js.native
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
  def setbit(key: KeyType, offset: Double, value: js.Any): js.Promise[Double] = js.native
  def setbit(
    key: KeyType,
    offset: Double,
    value: js.Any,
    callback: js.Function2[/* err */ Error, /* res */ Double, Unit]
  ): Unit = js.native
  def setex(key: KeyType, seconds: Double, value: js.Any): js.Promise[_] = js.native
  def setex(
    key: KeyType,
    seconds: Double,
    value: js.Any,
    callback: js.Function2[/* err */ Error, /* res */ js.Any, Unit]
  ): Unit = js.native
  def setnx(key: KeyType, value: js.Any): js.Promise[_] = js.native
  def setnx(key: KeyType, value: js.Any, callback: js.Function2[/* err */ Error, /* res */ js.Any, Unit]): Unit = js.native
  def setrange(key: KeyType, offset: Double, value: js.Any): js.Promise[Double] = js.native
  def setrange(
    key: KeyType,
    offset: Double,
    value: js.Any,
    callback: js.Function2[/* err */ Error, /* res */ Double, Unit]
  ): Unit = js.native
  @JSName("shutdown")
  def shutdown_NOSAVE(save: NOSAVE): js.Promise[_] = js.native
  @JSName("shutdown")
  def shutdown_NOSAVE(save: NOSAVE, callback: js.Function2[/* err */ Error, /* res */ js.Any, Unit]): Unit = js.native
  @JSName("shutdown")
  def shutdown_SAVE(save: SAVE): js.Promise[_] = js.native
  @JSName("shutdown")
  def shutdown_SAVE(save: SAVE, callback: js.Function2[/* err */ Error, /* res */ js.Any, Unit]): Unit = js.native
  def sinter(keys: KeyType*): js.Any = js.native
  def sinterstore(destination: String, keys: KeyType*): js.Any = js.native
  def sismember(key: KeyType, member: String): js.Promise[`1` | `0`] = js.native
  def sismember(key: KeyType, member: String, callback: js.Function2[/* err */ Error, /* res */ `1` | `0`, Unit]): Unit = js.native
  def slaveof(host: String, port: Double): js.Promise[String] = js.native
  def slaveof(host: String, port: Double, callback: js.Function2[/* err */ Error, /* res */ String, Unit]): Unit = js.native
  def smembers(key: KeyType): js.Promise[_] = js.native
  def smembers(key: KeyType, callback: js.Function2[/* err */ Error, /* res */ js.Any, Unit]): Unit = js.native
  def smove(source: String, destination: String, member: String): js.Promise[String] = js.native
  def smove(
    source: String,
    destination: String,
    member: String,
    callback: js.Function2[/* err */ Error, /* res */ String, Unit]
  ): Unit = js.native
  def sort(key: KeyType, args: String*): js.Any = js.native
  def spop(key: KeyType): js.Promise[_] = js.native
  def spop(key: KeyType, callback: js.Function2[/* err */ Error, /* res */ js.Any, Unit]): Unit = js.native
  def spop(key: KeyType, count: Double): js.Promise[_] = js.native
  def spop(key: KeyType, count: Double, callback: js.Function2[/* err */ Error, /* res */ js.Any, Unit]): Unit = js.native
  def srandmember(key: KeyType): js.Promise[_] = js.native
  def srandmember(key: KeyType, callback: js.Function2[/* err */ Error, /* res */ js.Any, Unit]): Unit = js.native
  def srandmember(key: KeyType, count: Double): js.Promise[_] = js.native
  def srandmember(key: KeyType, count: Double, callback: js.Function2[/* err */ Error, /* res */ js.Any, Unit]): Unit = js.native
  def srem(key: KeyType, members: js.Any*): js.Any = js.native
  def sscan(key: KeyType, cursor: Double, args: js.Any*): js.Any = js.native
  def sscanStream(key: KeyType): Readable = js.native
  def sscanStream(key: KeyType, options: ScanStreamOption): Readable = js.native
  def strlen(key: KeyType): js.Promise[Double] = js.native
  def strlen(key: KeyType, callback: js.Function2[/* err */ Error, /* res */ Double, Unit]): Unit = js.native
  def subscribe(channels: js.Any*): js.Any = js.native
  def substr(key: KeyType, start: Double, end: Double): js.Promise[String] = js.native
  def substr(
    key: KeyType,
    start: Double,
    end: Double,
    callback: js.Function2[/* err */ Error, /* res */ String, Unit]
  ): Unit = js.native
  def sunion(keys: KeyType*): js.Any = js.native
  def sunionstore(destination: String, keys: KeyType*): js.Any = js.native
  def sync(): js.Promise[_] = js.native
  def sync(callback: js.Function2[/* err */ Error, /* res */ js.Any, Unit]): Unit = js.native
  def time(): js.Promise[_] = js.native
  def time(callback: js.Function2[/* err */ Error, /* res */ js.Any, Unit]): Unit = js.native
  def ttl(key: KeyType): js.Promise[Double] = js.native
  def ttl(key: KeyType, callback: js.Function2[/* err */ Error, /* res */ Double, Unit]): Unit = js.native
  def `type`(key: KeyType): js.Promise[String] = js.native
  def `type`(key: KeyType, callback: js.Function2[/* err */ Error, /* res */ String, Unit]): Unit = js.native
  def unsubscribe(channels: String*): js.Any = js.native
  def unwatch(): js.Promise[String] = js.native
  def unwatch(callback: js.Function2[/* err */ Error, /* res */ String, Unit]): Unit = js.native
  def watch(keys: KeyType*): js.Any = js.native
  def xack(key: KeyType, group: String, ids: String*): js.Any = js.native
  def xadd(key: KeyType, id: String, args: String*): js.Any = js.native
  @JSName("xadd")
  def xadd_MAXLEN(key: KeyType, maxLenOption: MAXLEN, approximate: `~`, count: Double, args: String*): js.Any = js.native
  @JSName("xadd")
  def xadd_MAXLEN(key: KeyType, maxLenOption: MAXLEN, count: Double, args: String*): js.Any = js.native
  @JSName("xadd")
  def xadd_maxlen(key: KeyType, maxLenOption: maxlen, approximate: `~`, count: Double, args: String*): js.Any = js.native
  @JSName("xadd")
  def xadd_maxlen(key: KeyType, maxLenOption: maxlen, count: Double, args: String*): js.Any = js.native
  def xclaim(key: KeyType, group: String, consumer: String, minIdleTime: Double, args: js.Any*): js.Any = js.native
  def xdel(key: KeyType, ids: String*): js.Any = js.native
  def xgroup(args: js.Any*): js.Any = js.native
  def xinfo(args: js.Any*): js.Any = js.native
  def xlen(key: KeyType): js.Any = js.native
  def xpending(key: KeyType, group: String, args: js.Any*): js.Any = js.native
  def xrange(key: KeyType, start: String, end: String, args: js.Any*): js.Any = js.native
  def xread(args: js.Any*): js.Any = js.native
  @JSName("xreadgroup")
  def xreadgroup_GROUP(groupOption: GROUP, group: String, consumer: String, args: js.Any*): js.Any = js.native
  @JSName("xreadgroup")
  def xreadgroup_group(groupOption: group, group: String, consumer: String, args: js.Any*): js.Any = js.native
  def xrevrange(key: KeyType, end: String, start: String, args: js.Any*): js.Any = js.native
  @JSName("xtrim")
  def xtrim_MAXLEN(key: KeyType, maxLenOption: MAXLEN, args: js.Any*): js.Any = js.native
  @JSName("xtrim")
  def xtrim_maxlen(key: KeyType, maxLenOption: maxlen, args: js.Any*): js.Any = js.native
  def zadd(key: KeyType, args: String*): js.Promise[Double | String] = js.native
  def zaddBuffer(key: KeyType, score1: Double, member1: Buffer): js.Promise[String | Double] = js.native
  def zcard(key: KeyType): js.Promise[Double] = js.native
  def zcard(key: KeyType, callback: js.Function2[/* err */ Error, /* res */ Double, Unit]): Unit = js.native
  def zcount(key: KeyType, min: String, max: String): js.Promise[Double] = js.native
  def zcount(
    key: KeyType,
    min: String,
    max: String,
    callback: js.Function2[/* err */ Error, /* res */ Double, Unit]
  ): Unit = js.native
  def zcount(key: KeyType, min: String, max: Double): js.Promise[Double] = js.native
  def zcount(
    key: KeyType,
    min: String,
    max: Double,
    callback: js.Function2[/* err */ Error, /* res */ Double, Unit]
  ): Unit = js.native
  def zcount(key: KeyType, min: Double, max: String): js.Promise[Double] = js.native
  def zcount(
    key: KeyType,
    min: Double,
    max: String,
    callback: js.Function2[/* err */ Error, /* res */ Double, Unit]
  ): Unit = js.native
  def zcount(key: KeyType, min: Double, max: Double): js.Promise[Double] = js.native
  def zcount(
    key: KeyType,
    min: Double,
    max: Double,
    callback: js.Function2[/* err */ Error, /* res */ Double, Unit]
  ): Unit = js.native
  def zincrby(key: KeyType, increment: Double, member: String): js.Promise[_] = js.native
  def zincrby(
    key: KeyType,
    increment: Double,
    member: String,
    callback: js.Function2[/* err */ Error, /* res */ js.Any, Unit]
  ): Unit = js.native
  def zinterstore(destination: String, numkeys: Double, key: KeyType, args: String*): js.Any = js.native
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
  def zrangebyscore(key: KeyType, min: String, max: String, args: String*): js.Any = js.native
  def zrangebyscore(key: KeyType, min: String, max: Double, args: String*): js.Any = js.native
  def zrangebyscore(key: KeyType, min: Double, max: String, args: String*): js.Any = js.native
  def zrangebyscore(key: KeyType, min: Double, max: Double, args: String*): js.Any = js.native
  def zrank(key: KeyType, member: String): js.Promise[Double | Null] = js.native
  def zrank(
    key: KeyType,
    member: String,
    callback: js.Function2[/* err */ Error, /* res */ Double | Null, Unit]
  ): Unit = js.native
  def zrem(key: KeyType, members: js.Any*): js.Any = js.native
  def zremrangebyrank(key: KeyType, start: Double, stop: Double): js.Promise[_] = js.native
  def zremrangebyrank(
    key: KeyType,
    start: Double,
    stop: Double,
    callback: js.Function2[/* err */ Error, /* res */ js.Any, Unit]
  ): Unit = js.native
  def zremrangebyscore(key: KeyType, min: String, max: String): js.Promise[_] = js.native
  def zremrangebyscore(
    key: KeyType,
    min: String,
    max: String,
    callback: js.Function2[/* err */ Error, /* res */ js.Any, Unit]
  ): Unit = js.native
  def zremrangebyscore(key: KeyType, min: String, max: Double): js.Promise[_] = js.native
  def zremrangebyscore(
    key: KeyType,
    min: String,
    max: Double,
    callback: js.Function2[/* err */ Error, /* res */ js.Any, Unit]
  ): Unit = js.native
  def zremrangebyscore(key: KeyType, min: Double, max: String): js.Promise[_] = js.native
  def zremrangebyscore(
    key: KeyType,
    min: Double,
    max: String,
    callback: js.Function2[/* err */ Error, /* res */ js.Any, Unit]
  ): Unit = js.native
  def zremrangebyscore(key: KeyType, min: Double, max: Double): js.Promise[_] = js.native
  def zremrangebyscore(
    key: KeyType,
    min: Double,
    max: Double,
    callback: js.Function2[/* err */ Error, /* res */ js.Any, Unit]
  ): Unit = js.native
  def zrevrange(key: KeyType, start: Double, stop: Double): js.Promise[_] = js.native
  def zrevrange(
    key: KeyType,
    start: Double,
    stop: Double,
    callback: js.Function2[/* err */ Error, /* res */ js.Any, Unit]
  ): Unit = js.native
  @JSName("zrevrange")
  def zrevrange_WITHSCORES(key: KeyType, start: Double, stop: Double, withScores: WITHSCORES): js.Promise[_] = js.native
  @JSName("zrevrange")
  def zrevrange_WITHSCORES(
    key: KeyType,
    start: Double,
    stop: Double,
    withScores: WITHSCORES,
    callback: js.Function2[/* err */ Error, /* res */ js.Any, Unit]
  ): Unit = js.native
  def zrevrangebyscore(key: KeyType, max: String, min: String, args: String*): js.Any = js.native
  def zrevrangebyscore(key: KeyType, max: String, min: Double, args: String*): js.Any = js.native
  def zrevrangebyscore(key: KeyType, max: Double, min: String, args: String*): js.Any = js.native
  def zrevrangebyscore(key: KeyType, max: Double, min: Double, args: String*): js.Any = js.native
  def zrevrank(key: KeyType, member: String): js.Promise[Double | Null] = js.native
  def zrevrank(
    key: KeyType,
    member: String,
    callback: js.Function2[/* err */ Error, /* res */ Double | Null, Unit]
  ): Unit = js.native
  def zscan(key: KeyType, cursor: Double, args: js.Any*): js.Any = js.native
  def zscanStream(key: KeyType): Readable = js.native
  def zscanStream(key: KeyType, options: ScanStreamOption): Readable = js.native
  def zscore(key: KeyType, member: String): js.Promise[String] = js.native
  def zscore(key: KeyType, member: String, callback: js.Function2[/* err */ Error, /* res */ String, Unit]): Unit = js.native
  def zunionstore(destination: String, numkeys: Double, key: KeyType, args: String*): js.Any = js.native
}

