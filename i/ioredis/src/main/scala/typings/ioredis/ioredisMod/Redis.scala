package typings.ioredis.ioredisMod

import org.scalablytyped.runtime.StringDictionary
import typings.ioredis.Anon_False
import typings.ioredis.ioredisStrings.AFTER
import typings.ioredis.ioredisStrings.BEFORE
import typings.ioredis.ioredisStrings.COUNT
import typings.ioredis.ioredisStrings.GET
import typings.ioredis.ioredisStrings.GROUP
import typings.ioredis.ioredisStrings.LIMIT
import typings.ioredis.ioredisStrings.MATCH
import typings.ioredis.ioredisStrings.MAXLEN
import typings.ioredis.ioredisStrings.NOKEY
import typings.ioredis.ioredisStrings.NOSAVE
import typings.ioredis.ioredisStrings.REWRITE
import typings.ioredis.ioredisStrings.SAVE
import typings.ioredis.ioredisStrings.SET
import typings.ioredis.ioredisStrings.Tilde
import typings.ioredis.ioredisStrings.WITHSCORES
import typings.ioredis.ioredisStrings.count_
import typings.ioredis.ioredisStrings.group_
import typings.ioredis.ioredisStrings.match_
import typings.ioredis.ioredisStrings.maxlen_
import typings.node.Buffer
import typings.node.eventsMod.EventEmitter
import typings.node.streamMod.Readable
import typings.std.Error
import typings.std.Map
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
  def append(key: KeyType, value: ValueType): js.Promise[Double] = js.native
  def append(key: KeyType, value: ValueType, callback: js.Function2[/* err */ Error, /* res */ Double, Unit]): Unit = js.native
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
  def blpop(keys: KeyType*): js.Promise[js.Tuple2[String, String]] = js.native
  def brpop(keys: KeyType*): js.Promise[js.Tuple2[String, String]] = js.native
  def brpoplpush(source: String, destination: String, timeout: Double): js.Promise[String] = js.native
  def brpoplpush(
    source: String,
    destination: String,
    timeout: Double,
    callback: js.Function2[/* err */ Error, /* res */ String, Unit]
  ): Unit = js.native
  def client(args: ValueType*): js.Any = js.native
  def cluster(args: ValueType*): js.Any = js.native
  @JSName("config")
  def config_GET(op: GET, cfg: js.Array[_]): js.Promise[js.Tuple2[String, String]] = js.native
  @JSName("config")
  def config_REWRITE(op: REWRITE): js.Promise[Ok] = js.native
  @JSName("config")
  def config_SET(op: SET, key: String, value: ValueType): js.Promise[Ok] = js.native
  def connect(): js.Promise[Unit] = js.native
  def connect(callback: js.Function0[Unit]): js.Promise[Unit] = js.native
  def dbsize(): js.Promise[Double] = js.native
  def dbsize(callback: js.Function2[/* err */ Error, /* res */ Double, Unit]): Unit = js.native
  def debug(args: ValueType*): js.Promise[_] = js.native
  def decr(key: KeyType): js.Promise[Double] = js.native
  def decr(key: KeyType, callback: js.Function2[/* err */ Error, /* res */ Double, Unit]): Unit = js.native
  def decrby(key: KeyType, decrement: Double): js.Promise[Double] = js.native
  def decrby(key: KeyType, decrement: Double, callback: js.Function2[/* err */ Error, /* res */ Double, Unit]): Unit = js.native
  def del(keys: KeyType*): js.Promise[Double] = js.native
  def discard(): js.Promise[String] = js.native
  def discard(callback: js.Function2[/* err */ Error, /* res */ String, Unit]): Unit = js.native
  def disconnect(): Unit = js.native
  def dump(key: KeyType): js.Promise[String] = js.native
  def dump(key: KeyType, callback: js.Function2[/* err */ Error, /* res */ String, Unit]): Unit = js.native
  def duplicate(): Redis = js.native
  def echo(message: String): js.Promise[String] = js.native
  def echo(message: String, callback: js.Function2[/* err */ Error, /* res */ String, Unit]): Unit = js.native
  // This overload exists specifically to retain compatibility to `redlock`
  // All arguments are by default flattened, declaring all possible permuatations
  // would be unreasonable (and probably impossible)
  def eval(args: js.Array[ValueType]): js.Any = js.native
  def eval(args: js.Array[ValueType], callback: js.Function2[/* err */ Error | Null, /* res */ js.Any, Unit]): js.Any = js.native
  def eval(script: String, numKeys: Double, args: ValueType*): js.Any = js.native
  def evalsha(scriptSha: String, numKeys: String, args: ValueType*): js.Any = js.native
  def exec(): js.Promise[js.Array[js.Tuple2[Error | Null, String]]] = js.native
  def exec(callback: js.Function2[/* err */ Error, /* res */ js.Array[js.Tuple2[Error | Null, String]], Unit]): Unit = js.native
  def exists(keys: KeyType*): js.Promise[Double] = js.native
  def exists(key: KeyType, callback: js.Function2[/* err */ Error, /* res */ Double, Unit]): Unit = js.native
  def expire(key: KeyType, seconds: Double): js.Promise[BooleanResponse] = js.native
  def expire(
    key: KeyType,
    seconds: Double,
    callback: js.Function2[/* err */ Error, /* res */ BooleanResponse, Unit]
  ): Unit = js.native
  def expireat(key: KeyType, timestamp: Double): js.Promise[BooleanResponse] = js.native
  def expireat(
    key: KeyType,
    timestamp: Double,
    callback: js.Function2[/* err */ Error, /* res */ BooleanResponse, Unit]
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
  def getset(key: KeyType, value: ValueType): js.Promise[String | Null] = js.native
  def getset(
    key: KeyType,
    value: ValueType,
    callback: js.Function2[/* err */ Error, /* res */ String | Null, Unit]
  ): Unit = js.native
  def hdel(key: KeyType, fields: String*): js.Promise[Double] = js.native
  def hexists(key: KeyType, field: String): js.Promise[BooleanResponse] = js.native
  def hexists(
    key: KeyType,
    field: String,
    callback: js.Function2[/* err */ Error, /* res */ BooleanResponse, Unit]
  ): Unit = js.native
  def hget(key: KeyType, field: String): js.Promise[String | Null] = js.native
  def hget(
    key: KeyType,
    field: String,
    callback: js.Function2[/* err */ Error, /* res */ String | Null, Unit]
  ): Unit = js.native
  def hgetBuffer(key: KeyType, field: String): js.Promise[Buffer] = js.native
  def hgetBuffer(key: KeyType, field: String, callback: js.Function2[/* err */ Error, /* res */ Buffer, Unit]): Unit = js.native
  def hgetall(key: KeyType): js.Promise[StringDictionary[String | Double]] = js.native
  def hgetall(
    key: KeyType,
    callback: js.Function2[/* err */ Error, /* res */ StringDictionary[String | Double], Unit]
  ): Unit = js.native
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
  def hkeys(key: KeyType): js.Promise[js.Array[String]] = js.native
  def hkeys(key: KeyType, callback: js.Function2[/* err */ Error, /* res */ js.Array[String], Unit]): Unit = js.native
  def hlen(key: KeyType): js.Promise[Double] = js.native
  def hlen(key: KeyType, callback: js.Function2[/* err */ Error, /* res */ Double, Unit]): Unit = js.native
  def hmget(key: KeyType, fields: String*): js.Promise[js.Array[String | Null]] = js.native
  def hmset(key: KeyType, args: ValueType*): js.Promise[BooleanResponse] = js.native
  def hmset(key: KeyType, data: js.Object): js.Promise[BooleanResponse] = js.native
  def hmset(
    key: KeyType,
    data: js.Object,
    callback: js.Function2[/* err */ Error, /* res */ BooleanResponse, Unit]
  ): Unit = js.native
  def hmset(key: KeyType, data: Map[String, ValueType]): js.Promise[BooleanResponse] = js.native
  def hmset(
    key: KeyType,
    data: Map[String, ValueType],
    callback: js.Function2[/* err */ Error, /* res */ BooleanResponse, Unit]
  ): Unit = js.native
  def hscan(key: KeyType, cursor: Double, args: ValueType*): js.Promise[js.Tuple2[String, js.Array[String]]] = js.native
  def hscanStream(key: KeyType): Readable = js.native
  def hscanStream(key: KeyType, options: ScanStreamOption): Readable = js.native
  def hset(key: KeyType, field: String, value: ValueType): js.Promise[BooleanResponse] = js.native
  def hset(
    key: KeyType,
    field: String,
    value: ValueType,
    callback: js.Function2[/* err */ Error, /* res */ BooleanResponse, Unit]
  ): Unit = js.native
  def hsetBuffer(key: KeyType, field: String, value: ValueType): js.Promise[Buffer] = js.native
  def hsetBuffer(
    key: KeyType,
    field: String,
    value: ValueType,
    callback: js.Function2[/* err */ Error, /* res */ BooleanResponse, Unit]
  ): Unit = js.native
  def hsetnx(key: KeyType, field: String, value: ValueType): js.Promise[BooleanResponse] = js.native
  def hsetnx(
    key: KeyType,
    field: String,
    value: ValueType,
    callback: js.Function2[/* err */ Error, /* res */ BooleanResponse, Unit]
  ): Unit = js.native
  def hvals(key: KeyType): js.Promise[js.Array[String]] = js.native
  def hvals(key: KeyType, callback: js.Function2[/* err */ Error, /* res */ js.Array[String], Unit]): Unit = js.native
  def incr(key: KeyType): js.Promise[Double] = js.native
  def incr(key: KeyType, callback: js.Function2[/* err */ Error, /* res */ Double, Unit]): Unit = js.native
  def incrby(key: KeyType, increment: Double): js.Promise[Double] = js.native
  def incrby(key: KeyType, increment: Double, callback: js.Function2[/* err */ Error, /* res */ Double, Unit]): Unit = js.native
  def incrbyfloat(key: KeyType, increment: Double): js.Promise[Double] = js.native
  def incrbyfloat(key: KeyType, increment: Double, callback: js.Function2[/* err */ Error, /* res */ Double, Unit]): Unit = js.native
  def info(): js.Promise[String] = js.native
  def info(callback: js.Function2[/* err */ Error, /* res */ String, Unit]): Unit = js.native
  def info(section: String): js.Promise[String] = js.native
  def info(section: String, callback: js.Function2[/* err */ Error, /* res */ String, Unit]): Unit = js.native
  def keys(pattern: String): js.Promise[js.Array[String]] = js.native
  def keys(pattern: String, callback: js.Function2[/* err */ Error, /* res */ js.Array[String], Unit]): Unit = js.native
  def lastsave(): js.Promise[Double] = js.native
  def lastsave(callback: js.Function2[/* err */ Error, /* res */ Double, Unit]): Unit = js.native
  def lindex(key: KeyType, index: Double): js.Promise[String] = js.native
  def lindex(key: KeyType, index: Double, callback: js.Function2[/* err */ Error, /* res */ String, Unit]): Unit = js.native
  @JSName("linsert")
  def linsert_AFTER(key: KeyType, direction: AFTER, pivot: String, value: ValueType): js.Promise[Double] = js.native
  @JSName("linsert")
  def linsert_AFTER(
    key: KeyType,
    direction: AFTER,
    pivot: String,
    value: ValueType,
    callback: js.Function2[/* err */ Error, /* res */ Double, Unit]
  ): Unit = js.native
  @JSName("linsert")
  def linsert_BEFORE(key: KeyType, direction: BEFORE, pivot: String, value: ValueType): js.Promise[Double] = js.native
  @JSName("linsert")
  def linsert_BEFORE(
    key: KeyType,
    direction: BEFORE,
    pivot: String,
    value: ValueType,
    callback: js.Function2[/* err */ Error, /* res */ Double, Unit]
  ): Unit = js.native
  def llen(key: KeyType): js.Promise[Double] = js.native
  def llen(key: KeyType, callback: js.Function2[/* err */ Error, /* res */ Double, Unit]): Unit = js.native
  def lpop(key: KeyType): js.Promise[String] = js.native
  def lpop(key: KeyType, callback: js.Function2[/* err */ Error, /* res */ String, Unit]): Unit = js.native
  def lpopBuffer(key: KeyType): js.Promise[Buffer] = js.native
  def lpopBuffer(key: KeyType, callback: js.Function2[/* err */ Error, /* res */ Buffer, Unit]): Unit = js.native
  def lpush(key: KeyType, values: ValueType*): js.Promise[Double] = js.native
  def lpushx(key: KeyType, value: ValueType): js.Promise[Double] = js.native
  def lpushx(key: KeyType, value: ValueType, callback: js.Function2[/* err */ Error, /* res */ Double, Unit]): Unit = js.native
  def lrange(key: KeyType, start: Double, stop: Double): js.Promise[js.Array[String]] = js.native
  def lrange(
    key: KeyType,
    start: Double,
    stop: Double,
    callback: js.Function2[/* err */ Error, /* res */ js.Array[String], Unit]
  ): Unit = js.native
  def lrangeBuffer(key: KeyType, start: Double, stop: Double): js.Promise[js.Array[Buffer]] = js.native
  def lrangeBuffer(
    key: KeyType,
    start: Double,
    stop: Double,
    callback: js.Function2[/* err */ Error, /* res */ js.Array[Buffer], Unit]
  ): Unit = js.native
  def lrem(key: KeyType, count: Double, value: ValueType): js.Promise[Double] = js.native
  def lrem(
    key: KeyType,
    count: Double,
    value: ValueType,
    callback: js.Function2[/* err */ Error, /* res */ Double, Unit]
  ): Unit = js.native
  def lset(key: KeyType, index: Double, value: ValueType): js.Promise[Ok] = js.native
  def lset(
    key: KeyType,
    index: Double,
    value: ValueType,
    callback: js.Function2[/* err */ Error, /* res */ Ok, Unit]
  ): Unit = js.native
  def ltrim(key: KeyType, start: Double, stop: Double): js.Promise[Ok] = js.native
  def ltrim(
    key: KeyType,
    start: Double,
    stop: Double,
    callback: js.Function2[/* err */ Error, /* res */ Ok, Unit]
  ): Unit = js.native
  def mget(keys: KeyType*): js.Promise[js.Array[String | Null]] = js.native
  def migrate(args: ValueType*): js.Promise[Ok | NOKEY] = js.native
  def monitor(): js.Promise[EventEmitter] = js.native
  def monitor(callback: js.Function2[/* err */ Error, /* res */ EventEmitter, Unit]): Unit = js.native
  def move(key: KeyType, db: String): js.Promise[BooleanResponse] = js.native
  def move(key: KeyType, db: String, callback: js.Function2[/* err */ Error, /* res */ BooleanResponse, Unit]): Unit = js.native
  def mset(args: ValueType*): js.Promise[Ok] = js.native
  def mset(data: js.Object): js.Promise[Ok] = js.native
  def mset(data: js.Object, callback: js.Function2[/* err */ Error, /* res */ Ok, Unit]): Unit = js.native
  def mset(data: Map[String, ValueType]): js.Promise[Ok] = js.native
  def mset(data: Map[String, ValueType], callback: js.Function2[/* err */ Error, /* res */ Ok, Unit]): Unit = js.native
  def msetnx(args: ValueType*): js.Promise[Double] = js.native
  def msetnx(data: js.Object): js.Promise[BooleanResponse] = js.native
  def msetnx(data: js.Object, callback: js.Function2[/* err */ Error, /* res */ BooleanResponse, Unit]): Unit = js.native
  def msetnx(data: Map[String, ValueType]): js.Promise[BooleanResponse] = js.native
  def msetnx(
    data: Map[String, ValueType],
    callback: js.Function2[/* err */ Error, /* res */ BooleanResponse, Unit]
  ): Unit = js.native
  def multi(): Pipeline = js.native
  def multi(commands: js.Array[js.Array[String]]): Pipeline = js.native
  def multi(commands: js.Array[js.Array[String]], options: MultiOptions): Pipeline = js.native
  def multi(options: Anon_False): js.Promise[String] = js.native
  def `object`(subcommand: String, args: ValueType*): js.Promise[_] = js.native
  def persist(key: KeyType): js.Promise[BooleanResponse] = js.native
  def persist(key: KeyType, callback: js.Function2[/* err */ Error, /* res */ BooleanResponse, Unit]): Unit = js.native
  def pexpire(key: KeyType, milliseconds: Double): js.Promise[BooleanResponse] = js.native
  def pexpire(
    key: KeyType,
    milliseconds: Double,
    callback: js.Function2[/* err */ Error, /* res */ BooleanResponse, Unit]
  ): Unit = js.native
  def pexpireat(key: KeyType, millisecondsTimestamp: Double): js.Promise[BooleanResponse] = js.native
  def pexpireat(
    key: KeyType,
    millisecondsTimestamp: Double,
    callback: js.Function2[/* err */ Error, /* res */ BooleanResponse, Unit]
  ): Unit = js.native
  def pfadd(key: KeyType, elements: String*): js.Promise[Double] = js.native
  def pfcount(keys: KeyType*): js.Promise[Double] = js.native
  def pfmerge(destkey: KeyType, sourcekeys: KeyType*): js.Promise[Ok] = js.native
  def ping(): js.Promise[String] = js.native
  def ping(callback: js.Function2[/* err */ Error, /* res */ String, Unit]): Unit = js.native
  def ping(message: String): js.Promise[String] = js.native
  def ping(message: String, callback: js.Function2[/* err */ Error, /* res */ String, Unit]): Unit = js.native
  def pipeline(): Pipeline = js.native
  def pipeline(commands: js.Array[js.Array[String]]): Pipeline = js.native
  def psetex(key: KeyType, milliseconds: Double, value: ValueType): js.Promise[Ok] = js.native
  def psetex(
    key: KeyType,
    milliseconds: Double,
    value: ValueType,
    callback: js.Function2[/* err */ Error, /* res */ Ok, Unit]
  ): Unit = js.native
  def psubscribe(patterns: String*): js.Promise[Double] = js.native
  def pttl(key: KeyType): js.Promise[Double] = js.native
  def pttl(key: KeyType, callback: js.Function2[/* err */ Error, /* res */ Double, Unit]): Unit = js.native
  def publish(channel: String, message: String): js.Promise[Double] = js.native
  def publish(channel: String, message: String, callback: js.Function2[/* err */ Error, /* res */ Double, Unit]): Unit = js.native
  def publishBuffer(channel: String, message: Buffer): js.Promise[Double] = js.native
  def punsubscribe(patterns: String*): js.Promise[Double] = js.native
  def quit(): js.Promise[String] = js.native
  def quit(callback: js.Function2[/* err */ Error, /* res */ String, Unit]): Unit = js.native
  def randomkey(): js.Promise[String] = js.native
  def randomkey(callback: js.Function2[/* err */ Error, /* res */ String, Unit]): Unit = js.native
  def rename(key: KeyType, newkey: KeyType): js.Promise[Ok] = js.native
  def rename(key: KeyType, newkey: KeyType, callback: js.Function2[/* err */ Error, /* res */ Ok, Unit]): Unit = js.native
  def renamenx(key: KeyType, newkey: KeyType): js.Promise[BooleanResponse] = js.native
  def renamenx(
    key: KeyType,
    newkey: KeyType,
    callback: js.Function2[/* err */ Error, /* res */ BooleanResponse, Unit]
  ): Unit = js.native
  def restore(args: ValueType*): js.Promise[Ok] = js.native
  def rpop(key: KeyType): js.Promise[String] = js.native
  def rpop(key: KeyType, callback: js.Function2[/* err */ Error, /* res */ String, Unit]): Unit = js.native
  def rpoplpush(source: String, destination: String): js.Promise[String] = js.native
  def rpoplpush(
    source: String,
    destination: String,
    callback: js.Function2[/* err */ Error, /* res */ String, Unit]
  ): Unit = js.native
  def rpoplpushBuffer(source: String, destination: String): js.Promise[Buffer] = js.native
  def rpoplpushBuffer(
    source: String,
    destination: String,
    callback: js.Function2[/* err */ Error, /* res */ Buffer, Unit]
  ): Unit = js.native
  def rpush(key: KeyType, values: ValueType*): js.Promise[Double] = js.native
  def rpushBuffer(key: String, values: Buffer*): js.Promise[Double] = js.native
  def rpushx(key: KeyType, value: ValueType): js.Promise[Double] = js.native
  def rpushx(key: KeyType, value: ValueType, callback: js.Function2[/* err */ Error, /* res */ Double, Unit]): Unit = js.native
  def sadd(key: KeyType, members: ValueType*): js.Promise[Double] = js.native
  def save(): js.Promise[String] = js.native
  def save(callback: js.Function2[/* err */ Error, /* res */ String, Unit]): Unit = js.native
  def scan(cursor: Double): js.Promise[js.Tuple2[String, js.Array[String]]] = js.native
  def scan(cursor: Double, countOption: COUNT, count: Double, matchOption: MATCH, pattern: String): js.Promise[js.Tuple2[String, js.Array[String]]] = js.native
  def scan(cursor: Double, countOption: COUNT, count: Double, matchOption: match_, pattern: String): js.Promise[js.Tuple2[String, js.Array[String]]] = js.native
  def scan(cursor: Double, countOption: count_, count: Double, matchOption: MATCH, pattern: String): js.Promise[js.Tuple2[String, js.Array[String]]] = js.native
  def scan(cursor: Double, countOption: count_, count: Double, matchOption: match_, pattern: String): js.Promise[js.Tuple2[String, js.Array[String]]] = js.native
  def scan(cursor: Double, matchOption: MATCH, pattern: String, countOption: COUNT, count: Double): js.Promise[js.Tuple2[String, js.Array[String]]] = js.native
  def scan(cursor: Double, matchOption: MATCH, pattern: String, countOption: count_, count: Double): js.Promise[js.Tuple2[String, js.Array[String]]] = js.native
  def scan(cursor: Double, matchOption: match_, pattern: String, countOption: COUNT, count: Double): js.Promise[js.Tuple2[String, js.Array[String]]] = js.native
  def scan(cursor: Double, matchOption: match_, pattern: String, countOption: count_, count: Double): js.Promise[js.Tuple2[String, js.Array[String]]] = js.native
  def scanStream(): Readable = js.native
  def scanStream(options: ScanStreamOption): Readable = js.native
  @JSName("scan")
  def scan_COUNT(cursor: Double, countOption: COUNT, count: Double): js.Promise[js.Tuple2[String, js.Array[String]]] = js.native
  @JSName("scan")
  def scan_MATCH(cursor: Double, matchOption: MATCH, pattern: String): js.Promise[js.Tuple2[String, js.Array[String]]] = js.native
  @JSName("scan")
  def scan_count(cursor: Double, countOption: count_, count: Double): js.Promise[js.Tuple2[String, js.Array[String]]] = js.native
  @JSName("scan")
  def scan_match(cursor: Double, matchOption: match_, pattern: String): js.Promise[js.Tuple2[String, js.Array[String]]] = js.native
  def scard(key: KeyType): js.Promise[Double] = js.native
  def scard(key: KeyType, callback: js.Function2[/* err */ Error, /* res */ Double, Unit]): Unit = js.native
  def script(args: ValueType*): js.Any = js.native
  def sdiff(keys: KeyType*): js.Promise[js.Array[String]] = js.native
  def sdiffstore(destination: String, keys: KeyType*): js.Promise[Double] = js.native
  def select(index: Double): js.Promise[String] = js.native
  def select(index: Double, callback: js.Function2[/* err */ Error, /* res */ String, Unit]): Unit = js.native
  def send_command(command: String, args: ValueType*): js.Promise[_] = js.native
  def set(key: KeyType, value: ValueType): js.Promise[String] = js.native
  def set(key: KeyType, value: ValueType, callback: js.Function2[/* err */ Error, /* res */ String, Unit]): Unit = js.native
  def set(key: KeyType, value: ValueType, expiryMode: String): js.Promise[String] = js.native
  def set(key: KeyType, value: ValueType, expiryMode: String, time: String): js.Promise[String] = js.native
  def set(
    key: KeyType,
    value: ValueType,
    expiryMode: String,
    time: String,
    callback: js.Function2[/* err */ Error, /* res */ String, Unit]
  ): Unit = js.native
  def set(key: KeyType, value: ValueType, expiryMode: String, time: String, setMode: String): js.Promise[String] = js.native
  def set(
    key: KeyType,
    value: ValueType,
    expiryMode: String,
    time: String,
    setMode: String,
    callback: js.Function2[/* err */ Error, /* res */ String, Unit]
  ): Unit = js.native
  def set(key: KeyType, value: ValueType, expiryMode: String, time: String, setMode: Double): js.Promise[String] = js.native
  def set(
    key: KeyType,
    value: ValueType,
    expiryMode: String,
    time: String,
    setMode: Double,
    callback: js.Function2[/* err */ Error, /* res */ String, Unit]
  ): Unit = js.native
  def set(key: KeyType, value: ValueType, expiryMode: String, time: Double): js.Promise[String] = js.native
  def set(
    key: KeyType,
    value: ValueType,
    expiryMode: String,
    time: Double,
    callback: js.Function2[/* err */ Error, /* res */ String, Unit]
  ): Unit = js.native
  def set(key: KeyType, value: ValueType, expiryMode: String, time: Double, setMode: String): js.Promise[String] = js.native
  def set(
    key: KeyType,
    value: ValueType,
    expiryMode: String,
    time: Double,
    setMode: String,
    callback: js.Function2[/* err */ Error, /* res */ String, Unit]
  ): Unit = js.native
  def set(key: KeyType, value: ValueType, expiryMode: String, time: Double, setMode: Double): js.Promise[String] = js.native
  def set(
    key: KeyType,
    value: ValueType,
    expiryMode: String,
    time: Double,
    setMode: Double,
    callback: js.Function2[/* err */ Error, /* res */ String, Unit]
  ): Unit = js.native
  def set(key: KeyType, value: ValueType, expiryMode: js.Array[_]): js.Promise[String] = js.native
  def set(key: KeyType, value: ValueType, expiryMode: js.Array[_], time: String): js.Promise[String] = js.native
  def set(key: KeyType, value: ValueType, expiryMode: js.Array[_], time: String, setMode: String): js.Promise[String] = js.native
  def set(key: KeyType, value: ValueType, expiryMode: js.Array[_], time: String, setMode: Double): js.Promise[String] = js.native
  def set(key: KeyType, value: ValueType, expiryMode: js.Array[_], time: Double): js.Promise[String] = js.native
  def set(key: KeyType, value: ValueType, expiryMode: js.Array[_], time: Double, setMode: String): js.Promise[String] = js.native
  def set(key: KeyType, value: ValueType, expiryMode: js.Array[_], time: Double, setMode: Double): js.Promise[String] = js.native
  def set(
    key: KeyType,
    value: ValueType,
    setMode: String,
    callback: js.Function2[/* err */ Error, /* res */ String, Unit]
  ): Unit = js.native
  def set(
    key: KeyType,
    value: ValueType,
    setMode: js.Array[_],
    callback: js.Function2[/* err */ Error, /* res */ String, Unit]
  ): Unit = js.native
  def setBuffer(key: KeyType, value: ValueType): js.Promise[Buffer] = js.native
  def setBuffer(key: KeyType, value: ValueType, callback: js.Function2[/* err */ Error, /* res */ Buffer, Unit]): Unit = js.native
  def setBuffer(key: KeyType, value: ValueType, expiryMode: String): js.Promise[Buffer] = js.native
  def setBuffer(key: KeyType, value: ValueType, expiryMode: String, time: String): js.Promise[Buffer] = js.native
  def setBuffer(key: KeyType, value: ValueType, expiryMode: String, time: String, setMode: String): js.Promise[Buffer] = js.native
  def setBuffer(
    key: KeyType,
    value: ValueType,
    expiryMode: String,
    time: String,
    setMode: String,
    callback: js.Function2[/* err */ Error, /* res */ Buffer, Unit]
  ): Unit = js.native
  def setBuffer(key: KeyType, value: ValueType, expiryMode: String, time: String, setMode: Double): js.Promise[Buffer] = js.native
  def setBuffer(
    key: KeyType,
    value: ValueType,
    expiryMode: String,
    time: String,
    setMode: Double,
    callback: js.Function2[/* err */ Error, /* res */ Buffer, Unit]
  ): Unit = js.native
  def setBuffer(key: KeyType, value: ValueType, expiryMode: String, time: Double): js.Promise[Buffer] = js.native
  def setBuffer(
    key: KeyType,
    value: ValueType,
    expiryMode: String,
    time: Double,
    callback: js.Function2[/* err */ Error, /* res */ Buffer, Unit]
  ): Unit = js.native
  def setBuffer(key: KeyType, value: ValueType, expiryMode: String, time: Double, setMode: String): js.Promise[Buffer] = js.native
  def setBuffer(
    key: KeyType,
    value: ValueType,
    expiryMode: String,
    time: Double,
    setMode: String,
    callback: js.Function2[/* err */ Error, /* res */ Buffer, Unit]
  ): Unit = js.native
  def setBuffer(key: KeyType, value: ValueType, expiryMode: String, time: Double, setMode: Double): js.Promise[Buffer] = js.native
  def setBuffer(
    key: KeyType,
    value: ValueType,
    expiryMode: String,
    time: Double,
    setMode: Double,
    callback: js.Function2[/* err */ Error, /* res */ Buffer, Unit]
  ): Unit = js.native
  def setBuffer(key: KeyType, value: ValueType, expiryMode: js.Array[_]): js.Promise[Buffer] = js.native
  def setBuffer(key: KeyType, value: ValueType, expiryMode: js.Array[_], time: String): js.Promise[Buffer] = js.native
  def setBuffer(key: KeyType, value: ValueType, expiryMode: js.Array[_], time: String, setMode: String): js.Promise[Buffer] = js.native
  def setBuffer(key: KeyType, value: ValueType, expiryMode: js.Array[_], time: String, setMode: Double): js.Promise[Buffer] = js.native
  def setBuffer(key: KeyType, value: ValueType, expiryMode: js.Array[_], time: Double): js.Promise[Buffer] = js.native
  def setBuffer(key: KeyType, value: ValueType, expiryMode: js.Array[_], time: Double, setMode: String): js.Promise[Buffer] = js.native
  def setBuffer(key: KeyType, value: ValueType, expiryMode: js.Array[_], time: Double, setMode: Double): js.Promise[Buffer] = js.native
  def setBuffer(
    key: KeyType,
    value: ValueType,
    setMode: String,
    callback: js.Function2[/* err */ Error, /* res */ Buffer, Unit]
  ): Unit = js.native
  def setbit(key: KeyType, offset: Double, value: ValueType): js.Promise[Double] = js.native
  def setbit(
    key: KeyType,
    offset: Double,
    value: ValueType,
    callback: js.Function2[/* err */ Error, /* res */ Double, Unit]
  ): Unit = js.native
  def setex(key: KeyType, seconds: Double, value: ValueType): js.Promise[Ok] = js.native
  def setex(
    key: KeyType,
    seconds: Double,
    value: ValueType,
    callback: js.Function2[/* err */ Error, /* res */ Ok, Unit]
  ): Unit = js.native
  def setnx(key: KeyType, value: ValueType): js.Promise[BooleanResponse] = js.native
  def setnx(
    key: KeyType,
    value: ValueType,
    callback: js.Function2[/* err */ Error, /* res */ BooleanResponse, Unit]
  ): Unit = js.native
  def setrange(key: KeyType, offset: Double, value: ValueType): js.Promise[Double] = js.native
  def setrange(
    key: KeyType,
    offset: Double,
    value: ValueType,
    callback: js.Function2[/* err */ Error, /* res */ Double, Unit]
  ): Unit = js.native
  @JSName("shutdown")
  def shutdown_NOSAVE(save: NOSAVE): js.Promise[scala.Nothing] = js.native
  @JSName("shutdown")
  def shutdown_NOSAVE(save: NOSAVE, callback: js.Function2[/* err */ Error, /* res */ scala.Nothing, Unit]): Unit = js.native
  @JSName("shutdown")
  def shutdown_SAVE(save: SAVE): js.Promise[scala.Nothing] = js.native
  @JSName("shutdown")
  def shutdown_SAVE(save: SAVE, callback: js.Function2[/* err */ Error, /* res */ scala.Nothing, Unit]): Unit = js.native
  def sinter(keys: KeyType*): js.Promise[js.Array[String]] = js.native
  def sinterstore(destination: String, keys: KeyType*): js.Promise[Double] = js.native
  def sismember(key: KeyType, member: String): js.Promise[BooleanResponse] = js.native
  def sismember(
    key: KeyType,
    member: String,
    callback: js.Function2[/* err */ Error, /* res */ BooleanResponse, Unit]
  ): Unit = js.native
  def slaveof(host: String, port: Double): js.Promise[String] = js.native
  def slaveof(host: String, port: Double, callback: js.Function2[/* err */ Error, /* res */ String, Unit]): Unit = js.native
  def smembers(key: KeyType): js.Promise[js.Array[String]] = js.native
  def smembers(key: KeyType, callback: js.Function2[/* err */ Error, /* res */ js.Array[String], Unit]): Unit = js.native
  def smove(source: String, destination: String, member: String): js.Promise[BooleanResponse] = js.native
  def smove(
    source: String,
    destination: String,
    member: String,
    callback: js.Function2[/* err */ Error, /* res */ BooleanResponse, Unit]
  ): Unit = js.native
  def sort(key: KeyType, args: String*): js.Promise[js.Array[String] | Double] = js.native
  def spop(key: KeyType): js.Promise[String | Null] = js.native
  def spop(key: KeyType, callback: js.Function2[/* err */ Error, /* res */ String | Null, Unit]): Unit = js.native
  def spop(key: KeyType, count: Double): js.Promise[js.Array[String]] = js.native
  def spop(
    key: KeyType,
    count: Double,
    callback: js.Function2[/* err */ Error, /* res */ js.Array[String], Unit]
  ): Unit = js.native
  def srandmember(key: KeyType): js.Promise[String | Null] = js.native
  def srandmember(key: KeyType, callback: js.Function2[/* err */ Error, /* res */ String | Null, Unit]): Unit = js.native
  def srandmember(key: KeyType, count: Double): js.Promise[js.Array[String]] = js.native
  def srandmember(
    key: KeyType,
    count: Double,
    callback: js.Function2[/* err */ Error, /* res */ js.Array[String], Unit]
  ): Unit = js.native
  def srem(key: KeyType, members: ValueType*): js.Promise[Double] = js.native
  def sscan(key: KeyType, cursor: Double, args: ValueType*): js.Promise[js.Tuple2[String, js.Array[String]]] = js.native
  def sscanStream(key: KeyType): Readable = js.native
  def sscanStream(key: KeyType, options: ScanStreamOption): Readable = js.native
  def strlen(key: KeyType): js.Promise[Double] = js.native
  def strlen(key: KeyType, callback: js.Function2[/* err */ Error, /* res */ Double, Unit]): Unit = js.native
  def subscribe(channels: String*): js.Promise[Double] = js.native
  def substr(key: KeyType, start: Double, end: Double): js.Promise[String] = js.native
  def substr(
    key: KeyType,
    start: Double,
    end: Double,
    callback: js.Function2[/* err */ Error, /* res */ String, Unit]
  ): Unit = js.native
  def sunion(keys: KeyType*): js.Promise[js.Array[String]] = js.native
  def sunionstore(destination: String, keys: KeyType*): js.Promise[Double] = js.native
  def sync(): js.Promise[_] = js.native
  def sync(callback: js.Function2[/* err */ Error, /* res */ js.Any, Unit]): Unit = js.native
  def time(): js.Promise[js.Tuple2[String, String]] = js.native
  def time(callback: js.Function2[/* err */ Error, /* res */ js.Tuple2[String, String], Unit]): Unit = js.native
  def ttl(key: KeyType): js.Promise[Double] = js.native
  def ttl(key: KeyType, callback: js.Function2[/* err */ Error, /* res */ Double, Unit]): Unit = js.native
  def `type`(key: KeyType): js.Promise[String] = js.native
  def `type`(key: KeyType, callback: js.Function2[/* err */ Error, /* res */ String, Unit]): Unit = js.native
  def unlink(keys: KeyType*): js.Promise[Double] = js.native
  def unsubscribe(channels: String*): js.Promise[Double] = js.native
  def unwatch(): js.Promise[String] = js.native
  def unwatch(callback: js.Function2[/* err */ Error, /* res */ String, Unit]): Unit = js.native
  def watch(keys: KeyType*): js.Promise[Ok] = js.native
  def xack(key: KeyType, group: String, ids: String*): js.Promise[Double] = js.native
  def xadd(key: KeyType, id: String, args: String*): js.Promise[String] = js.native
  @JSName("xadd")
  def xadd_MAXLEN(key: KeyType, maxLenOption: MAXLEN, approximate: Tilde, count: Double, args: String*): js.Promise[String] = js.native
  @JSName("xadd")
  def xadd_MAXLEN(key: KeyType, maxLenOption: MAXLEN, count: Double, args: String*): js.Promise[String] = js.native
  @JSName("xadd")
  def xadd_maxlen(key: KeyType, maxLenOption: maxlen_, approximate: Tilde, count: Double, args: String*): js.Promise[String] = js.native
  @JSName("xadd")
  def xadd_maxlen(key: KeyType, maxLenOption: maxlen_, count: Double, args: String*): js.Promise[String] = js.native
  def xclaim(key: KeyType, group: String, consumer: String, minIdleTime: Double, args: ValueType*): js.Promise[js.Array[js.Tuple2[String, js.Array[String]]]] = js.native
  def xdel(key: KeyType, ids: String*): js.Promise[Double] = js.native
  def xgroup(args: ValueType*): js.Promise[Ok] = js.native
  def xinfo(args: ValueType*): js.Promise[_] = js.native
  def xlen(key: KeyType): js.Promise[Double] = js.native
  def xpending(key: KeyType, group: String, args: ValueType*): js.Promise[_] = js.native
  def xrange(key: KeyType, start: String, end: String, args: ValueType*): js.Promise[js.Array[js.Tuple2[String, js.Array[String]]]] = js.native
  def xread(args: ValueType*): js.Array[js.Tuple2[String, js.Array[String]]] = js.native
  @JSName("xreadgroup")
  def xreadgroup_GROUP(groupOption: GROUP, group: String, consumer: String, args: ValueType*): js.Any = js.native
  @JSName("xreadgroup")
  def xreadgroup_group(groupOption: group_, group: String, consumer: String, args: ValueType*): js.Any = js.native
  def xrevrange(key: KeyType, end: String, start: String, args: ValueType*): js.Promise[js.Array[js.Tuple2[String, js.Array[String]]]] = js.native
  @JSName("xtrim")
  def xtrim_MAXLEN(key: KeyType, maxLenOption: MAXLEN, args: ValueType*): js.Promise[Double] = js.native
  @JSName("xtrim")
  def xtrim_maxlen(key: KeyType, maxLenOption: maxlen_, args: ValueType*): js.Promise[Double] = js.native
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
  def zincrby(key: KeyType, increment: Double, member: String): js.Promise[String] = js.native
  def zincrby(
    key: KeyType,
    increment: Double,
    member: String,
    callback: js.Function2[/* err */ Error, /* res */ String, Unit]
  ): Unit = js.native
  def zinterstore(destination: String, numkeys: Double, key: KeyType, args: String*): js.Promise[Double] = js.native
  def zrange(key: KeyType, start: Double, stop: Double): js.Promise[js.Array[String]] = js.native
  def zrange(
    key: KeyType,
    start: Double,
    stop: Double,
    callback: js.Function2[/* err */ Error, /* res */ js.Array[String], Unit]
  ): Unit = js.native
  @JSName("zrange")
  def zrange_WITHSCORES(key: KeyType, start: Double, stop: Double, withScores: WITHSCORES): js.Promise[js.Array[String]] = js.native
  @JSName("zrange")
  def zrange_WITHSCORES(
    key: KeyType,
    start: Double,
    stop: Double,
    withScores: WITHSCORES,
    callback: js.Function2[/* err */ Error, /* res */ js.Array[String], Unit]
  ): Unit = js.native
  def zrangebyscore(key: KeyType, min: String, max: String): js.Promise[js.Array[String]] = js.native
  def zrangebyscore(
    key: KeyType,
    min: String,
    max: String,
    withScores: WITHSCORES,
    limit: LIMIT,
    offset: Double,
    count: Double
  ): js.Promise[js.Array[String]] = js.native
  def zrangebyscore(key: KeyType, min: String, max: Double): js.Promise[js.Array[String]] = js.native
  def zrangebyscore(
    key: KeyType,
    min: String,
    max: Double,
    withScores: WITHSCORES,
    limit: LIMIT,
    offset: Double,
    count: Double
  ): js.Promise[js.Array[String]] = js.native
  def zrangebyscore(key: KeyType, min: Double, max: String): js.Promise[js.Array[String]] = js.native
  def zrangebyscore(
    key: KeyType,
    min: Double,
    max: String,
    withScores: WITHSCORES,
    limit: LIMIT,
    offset: Double,
    count: Double
  ): js.Promise[js.Array[String]] = js.native
  def zrangebyscore(key: KeyType, min: Double, max: Double): js.Promise[js.Array[String]] = js.native
  def zrangebyscore(
    key: KeyType,
    min: Double,
    max: Double,
    withScores: WITHSCORES,
    limit: LIMIT,
    offset: Double,
    count: Double
  ): js.Promise[js.Array[String]] = js.native
  @JSName("zrangebyscore")
  def zrangebyscore_LIMIT(key: KeyType, min: String, max: String, limit: LIMIT, offset: Double, count: Double): js.Promise[js.Array[String]] = js.native
  @JSName("zrangebyscore")
  def zrangebyscore_LIMIT(key: KeyType, min: String, max: Double, limit: LIMIT, offset: Double, count: Double): js.Promise[js.Array[String]] = js.native
  @JSName("zrangebyscore")
  def zrangebyscore_LIMIT(key: KeyType, min: Double, max: String, limit: LIMIT, offset: Double, count: Double): js.Promise[js.Array[String]] = js.native
  @JSName("zrangebyscore")
  def zrangebyscore_LIMIT(key: KeyType, min: Double, max: Double, limit: LIMIT, offset: Double, count: Double): js.Promise[js.Array[String]] = js.native
  @JSName("zrangebyscore")
  def zrangebyscore_WITHSCORES(key: KeyType, min: String, max: String, withScores: WITHSCORES): js.Promise[js.Array[String]] = js.native
  @JSName("zrangebyscore")
  def zrangebyscore_WITHSCORES(key: KeyType, min: String, max: Double, withScores: WITHSCORES): js.Promise[js.Array[String]] = js.native
  @JSName("zrangebyscore")
  def zrangebyscore_WITHSCORES(key: KeyType, min: Double, max: String, withScores: WITHSCORES): js.Promise[js.Array[String]] = js.native
  @JSName("zrangebyscore")
  def zrangebyscore_WITHSCORES(key: KeyType, min: Double, max: Double, withScores: WITHSCORES): js.Promise[js.Array[String]] = js.native
  def zrank(key: KeyType, member: String): js.Promise[Double | Null] = js.native
  def zrank(
    key: KeyType,
    member: String,
    callback: js.Function2[/* err */ Error, /* res */ Double | Null, Unit]
  ): Unit = js.native
  def zrem(key: KeyType, members: ValueType*): js.Promise[Double] = js.native
  def zremrangebyrank(key: KeyType, start: Double, stop: Double): js.Promise[Double] = js.native
  def zremrangebyrank(
    key: KeyType,
    start: Double,
    stop: Double,
    callback: js.Function2[/* err */ Error, /* res */ Double, Unit]
  ): Unit = js.native
  def zremrangebyscore(key: KeyType, min: String, max: String): js.Promise[Double] = js.native
  def zremrangebyscore(
    key: KeyType,
    min: String,
    max: String,
    callback: js.Function2[/* err */ Error, /* res */ Double, Unit]
  ): Unit = js.native
  def zremrangebyscore(key: KeyType, min: String, max: Double): js.Promise[Double] = js.native
  def zremrangebyscore(
    key: KeyType,
    min: String,
    max: Double,
    callback: js.Function2[/* err */ Error, /* res */ Double, Unit]
  ): Unit = js.native
  def zremrangebyscore(key: KeyType, min: Double, max: String): js.Promise[Double] = js.native
  def zremrangebyscore(
    key: KeyType,
    min: Double,
    max: String,
    callback: js.Function2[/* err */ Error, /* res */ Double, Unit]
  ): Unit = js.native
  def zremrangebyscore(key: KeyType, min: Double, max: Double): js.Promise[Double] = js.native
  def zremrangebyscore(
    key: KeyType,
    min: Double,
    max: Double,
    callback: js.Function2[/* err */ Error, /* res */ Double, Unit]
  ): Unit = js.native
  def zrevrange(key: KeyType, start: Double, stop: Double): js.Promise[js.Array[String]] = js.native
  def zrevrange(
    key: KeyType,
    start: Double,
    stop: Double,
    callback: js.Function2[/* err */ Error, /* res */ js.Array[String], Unit]
  ): Unit = js.native
  @JSName("zrevrange")
  def zrevrange_WITHSCORES(key: KeyType, start: Double, stop: Double, withScores: WITHSCORES): js.Promise[js.Array[String]] = js.native
  @JSName("zrevrange")
  def zrevrange_WITHSCORES(
    key: KeyType,
    start: Double,
    stop: Double,
    withScores: WITHSCORES,
    callback: js.Function2[/* err */ Error, /* res */ js.Array[String], Unit]
  ): Unit = js.native
  def zrevrangebyscore(key: KeyType, min: String, max: String): js.Promise[js.Array[String]] = js.native
  def zrevrangebyscore(
    key: KeyType,
    min: String,
    max: String,
    withScores: WITHSCORES,
    limit: LIMIT,
    offset: Double,
    count: Double
  ): js.Promise[js.Array[String]] = js.native
  def zrevrangebyscore(key: KeyType, min: String, max: Double): js.Promise[js.Array[String]] = js.native
  def zrevrangebyscore(
    key: KeyType,
    min: String,
    max: Double,
    withScores: WITHSCORES,
    limit: LIMIT,
    offset: Double,
    count: Double
  ): js.Promise[js.Array[String]] = js.native
  def zrevrangebyscore(key: KeyType, min: Double, max: String): js.Promise[js.Array[String]] = js.native
  def zrevrangebyscore(
    key: KeyType,
    min: Double,
    max: String,
    withScores: WITHSCORES,
    limit: LIMIT,
    offset: Double,
    count: Double
  ): js.Promise[js.Array[String]] = js.native
  def zrevrangebyscore(key: KeyType, min: Double, max: Double): js.Promise[js.Array[String]] = js.native
  def zrevrangebyscore(
    key: KeyType,
    min: Double,
    max: Double,
    withScores: WITHSCORES,
    limit: LIMIT,
    offset: Double,
    count: Double
  ): js.Promise[js.Array[String]] = js.native
  @JSName("zrevrangebyscore")
  def zrevrangebyscore_LIMIT(key: KeyType, min: String, max: String, limit: LIMIT, offset: Double, count: Double): js.Promise[js.Array[String]] = js.native
  @JSName("zrevrangebyscore")
  def zrevrangebyscore_LIMIT(key: KeyType, min: String, max: Double, limit: LIMIT, offset: Double, count: Double): js.Promise[js.Array[String]] = js.native
  @JSName("zrevrangebyscore")
  def zrevrangebyscore_LIMIT(key: KeyType, min: Double, max: String, limit: LIMIT, offset: Double, count: Double): js.Promise[js.Array[String]] = js.native
  @JSName("zrevrangebyscore")
  def zrevrangebyscore_LIMIT(key: KeyType, min: Double, max: Double, limit: LIMIT, offset: Double, count: Double): js.Promise[js.Array[String]] = js.native
  @JSName("zrevrangebyscore")
  def zrevrangebyscore_WITHSCORES(key: KeyType, min: String, max: String, withScores: WITHSCORES): js.Promise[js.Array[String]] = js.native
  @JSName("zrevrangebyscore")
  def zrevrangebyscore_WITHSCORES(key: KeyType, min: String, max: Double, withScores: WITHSCORES): js.Promise[js.Array[String]] = js.native
  @JSName("zrevrangebyscore")
  def zrevrangebyscore_WITHSCORES(key: KeyType, min: Double, max: String, withScores: WITHSCORES): js.Promise[js.Array[String]] = js.native
  @JSName("zrevrangebyscore")
  def zrevrangebyscore_WITHSCORES(key: KeyType, min: Double, max: Double, withScores: WITHSCORES): js.Promise[js.Array[String]] = js.native
  def zrevrank(key: KeyType, member: String): js.Promise[Double | Null] = js.native
  def zrevrank(
    key: KeyType,
    member: String,
    callback: js.Function2[/* err */ Error, /* res */ Double | Null, Unit]
  ): Unit = js.native
  def zscan(key: KeyType, cursor: Double, args: ValueType*): js.Promise[js.Tuple2[String, js.Array[String]]] = js.native
  def zscanStream(key: KeyType): Readable = js.native
  def zscanStream(key: KeyType, options: ScanStreamOption): Readable = js.native
  def zscore(key: KeyType, member: String): js.Promise[String] = js.native
  def zscore(key: KeyType, member: String, callback: js.Function2[/* err */ Error, /* res */ String, Unit]): Unit = js.native
  def zunionstore(destination: String, numkeys: Double, key: KeyType, args: String*): js.Promise[Double] = js.native
}

