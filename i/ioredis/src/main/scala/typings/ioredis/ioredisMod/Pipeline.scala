package typings.ioredis.ioredisMod

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
import typings.ioredis.ioredisStrings.count
import typings.ioredis.ioredisStrings.group
import typings.ioredis.ioredisStrings.maxlen
import typings.node.Buffer
import typings.node.NodeJSNs.EventEmitter
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pipeline extends js.Object {
  var _queue: js.Array[Command] = js.native
  var _result: js.Array[_] = js.native
  var _transactions: Double = js.native
  var isCluster: Boolean = js.native
  var options: RedisOptions = js.native
  var redis: Redis = js.native
  def append(key: KeyType, value: js.Any): Pipeline = js.native
  def append(key: KeyType, value: js.Any, callback: js.Function2[/* err */ Error, /* res */ Double, Unit]): Pipeline = js.native
  def auth(password: String): Pipeline = js.native
  def auth(password: String, callback: js.Function2[/* err */ Error, /* res */ String, Unit]): Pipeline = js.native
  def bgrewriteaof(): Pipeline = js.native
  def bgrewriteaof(callback: js.Function2[/* err */ Error, /* res */ String, Unit]): Pipeline = js.native
  def bgsave(): Pipeline = js.native
  def bgsave(callback: js.Function2[/* err */ Error, /* res */ String, Unit]): Pipeline = js.native
  def bitcount(key: KeyType): Pipeline = js.native
  def bitcount(key: KeyType, callback: js.Function2[/* err */ Error, /* res */ Double, Unit]): Pipeline = js.native
  def bitcount(key: KeyType, start: Double, end: Double): Pipeline = js.native
  def bitcount(
    key: KeyType,
    start: Double,
    end: Double,
    callback: js.Function2[/* err */ Error, /* res */ Double, Unit]
  ): Pipeline = js.native
  def blpop(keys: KeyType*): Pipeline = js.native
  def brpop(keys: KeyType*): Pipeline = js.native
  def brpoplpush(source: String, destination: String, timeout: Double): Pipeline = js.native
  def brpoplpush(
    source: String,
    destination: String,
    timeout: Double,
    callback: js.Function2[/* err */ Error, /* res */ js.Any, Unit]
  ): Pipeline = js.native
  def client(args: js.Any*): Pipeline = js.native
  def cluster(args: js.Any*): Pipeline = js.native
  def config(args: js.Any*): Pipeline = js.native
  def dbsize(): Pipeline = js.native
  def dbsize(callback: js.Function2[/* err */ Error, /* res */ Double, Unit]): Pipeline = js.native
  def debug(args: js.Any*): Pipeline = js.native
  def decr(key: KeyType): Pipeline = js.native
  def decr(key: KeyType, callback: js.Function2[/* err */ Error, /* res */ Double, Unit]): Pipeline = js.native
  def decrby(key: KeyType, decrement: Double): Pipeline = js.native
  def decrby(key: KeyType, decrement: Double, callback: js.Function2[/* err */ Error, /* res */ Double, Unit]): Pipeline = js.native
  def del(keys: KeyType*): Pipeline = js.native
  def discard(): Pipeline = js.native
  def discard(callback: js.Function2[/* err */ Error, /* res */ js.Any, Unit]): Pipeline = js.native
  def dump(key: KeyType): Pipeline = js.native
  def dump(key: KeyType, callback: js.Function2[/* err */ Error, /* res */ String, Unit]): Pipeline = js.native
  def echo(message: String): Pipeline = js.native
  def echo(message: String, callback: js.Function2[/* err */ Error, /* res */ String, Unit]): Pipeline = js.native
  def eval(args: js.Any*): Pipeline = js.native
  def evalsha(args: js.Any*): Pipeline = js.native
  def exec(): js.Promise[_] = js.native
  def exec(callback: js.Function2[/* err */ Error, /* res */ js.Any, Unit]): js.Promise[_] = js.native
  def exists(keys: KeyType*): Pipeline = js.native
  def expire(key: KeyType, seconds: Double): Pipeline = js.native
  def expire(key: KeyType, seconds: Double, callback: js.Function2[/* err */ Error, /* res */ `0` | `1`, Unit]): Pipeline = js.native
  def expireat(key: KeyType, timestamp: Double): Pipeline = js.native
  def expireat(
    key: KeyType,
    timestamp: Double,
    callback: js.Function2[/* err */ Error, /* res */ `0` | `1`, Unit]
  ): Pipeline = js.native
  def flushall(): Pipeline = js.native
  def flushall(callback: js.Function2[/* err */ Error, /* res */ String, Unit]): Pipeline = js.native
  def flushdb(): Pipeline = js.native
  def flushdb(callback: js.Function2[/* err */ Error, /* res */ String, Unit]): Pipeline = js.native
  def get(key: KeyType): Pipeline = js.native
  def get(key: KeyType, callback: js.Function2[/* err */ Error, /* res */ String, Unit]): Pipeline = js.native
  def getBuffer(key: KeyType): Pipeline = js.native
  def getBuffer(key: KeyType, callback: js.Function2[/* err */ Error, /* res */ Buffer, Unit]): Pipeline = js.native
  def getbit(key: KeyType, offset: Double): Pipeline = js.native
  def getbit(key: KeyType, offset: Double, callback: js.Function2[/* err */ Error, /* res */ Double, Unit]): Pipeline = js.native
  def getrange(key: KeyType, start: Double, end: Double): Pipeline = js.native
  def getrange(
    key: KeyType,
    start: Double,
    end: Double,
    callback: js.Function2[/* err */ Error, /* res */ String, Unit]
  ): Pipeline = js.native
  def getset(key: KeyType, value: js.Any): Pipeline = js.native
  def getset(key: KeyType, value: js.Any, callback: js.Function2[/* err */ Error, /* res */ String, Unit]): Pipeline = js.native
  def hdel(key: KeyType, fields: String*): Pipeline = js.native
  def hexists(key: KeyType, field: String): Pipeline = js.native
  def hexists(key: KeyType, field: String, callback: js.Function2[/* err */ Error, /* res */ `0` | `1`, Unit]): Pipeline = js.native
  def hget(key: KeyType, field: String): Pipeline = js.native
  def hget(key: KeyType, field: String, callback: js.Function2[/* err */ Error, /* res */ String, Unit]): Pipeline = js.native
  def hgetBuffer(key: KeyType, field: String): Pipeline = js.native
  def hgetBuffer(key: KeyType, field: String, callback: js.Function2[/* err */ Error, /* res */ Buffer, Unit]): Pipeline = js.native
  def hgetall(key: KeyType): Pipeline = js.native
  def hgetall(key: KeyType, callback: js.Function2[/* err */ Error, /* res */ js.Any, Unit]): Pipeline = js.native
  def hincrby(key: KeyType, field: String, increment: Double): Pipeline = js.native
  def hincrby(
    key: KeyType,
    field: String,
    increment: Double,
    callback: js.Function2[/* err */ Error, /* res */ Double, Unit]
  ): Pipeline = js.native
  def hincrbyfloat(key: KeyType, field: String, increment: Double): Pipeline = js.native
  def hincrbyfloat(
    key: KeyType,
    field: String,
    increment: Double,
    callback: js.Function2[/* err */ Error, /* res */ Double, Unit]
  ): Pipeline = js.native
  def hkeys(key: KeyType): Pipeline = js.native
  def hkeys(key: KeyType, callback: js.Function2[/* err */ Error, /* res */ js.Any, Unit]): Pipeline = js.native
  def hlen(key: KeyType): Pipeline = js.native
  def hlen(key: KeyType, callback: js.Function2[/* err */ Error, /* res */ Double, Unit]): Pipeline = js.native
  def hmget(key: KeyType, fields: String*): Pipeline = js.native
  def hmset(key: KeyType, args: js.Any*): Pipeline = js.native
  def hmset(key: KeyType, data: js.Any): Pipeline = js.native
  def hmset(key: KeyType, data: js.Any, callback: js.Function2[/* err */ Error, /* res */ `0` | `1`, Unit]): Pipeline = js.native
  def hscan(key: KeyType, cursor: Double, args: js.Any*): Pipeline = js.native
  def hset(key: KeyType, field: String, value: js.Any): Pipeline = js.native
  def hset(
    key: KeyType,
    field: String,
    value: js.Any,
    callback: js.Function2[/* err */ Error, /* res */ `0` | `1`, Unit]
  ): Pipeline = js.native
  def hsetBuffer(key: KeyType, field: String, value: js.Any): Pipeline = js.native
  def hsetBuffer(
    key: KeyType,
    field: String,
    value: js.Any,
    callback: js.Function2[/* err */ Error, /* res */ Buffer, Unit]
  ): Pipeline = js.native
  def hsetnx(key: KeyType, field: String, value: js.Any): Pipeline = js.native
  def hsetnx(
    key: KeyType,
    field: String,
    value: js.Any,
    callback: js.Function2[/* err */ Error, /* res */ `0` | `1`, Unit]
  ): Pipeline = js.native
  def hvals(key: KeyType): Pipeline = js.native
  def hvals(key: KeyType, callback: js.Function2[/* err */ Error, /* res */ js.Any, Unit]): Pipeline = js.native
  def incr(key: KeyType): Pipeline = js.native
  def incr(key: KeyType, callback: js.Function2[/* err */ Error, /* res */ Double, Unit]): Pipeline = js.native
  def incrby(key: KeyType, increment: Double): Pipeline = js.native
  def incrby(key: KeyType, increment: Double, callback: js.Function2[/* err */ Error, /* res */ Double, Unit]): Pipeline = js.native
  def incrbyfloat(key: KeyType, increment: Double): Pipeline = js.native
  def incrbyfloat(key: KeyType, increment: Double, callback: js.Function2[/* err */ Error, /* res */ Double, Unit]): Pipeline = js.native
  def info(): Pipeline = js.native
  def info(callback: js.Function2[/* err */ Error, /* res */ js.Any, Unit]): Pipeline = js.native
  def info(section: String): Pipeline = js.native
  def info(section: String, callback: js.Function2[/* err */ Error, /* res */ js.Any, Unit]): Pipeline = js.native
  def keys(pattern: String): Pipeline = js.native
  def keys(pattern: String, callback: js.Function2[/* err */ Error, /* res */ js.Array[String], Unit]): Pipeline = js.native
  def lastsave(): Pipeline = js.native
  def lastsave(callback: js.Function2[/* err */ Error, /* res */ Double, Unit]): Pipeline = js.native
  def lindex(key: KeyType, index: Double): Pipeline = js.native
  def lindex(key: KeyType, index: Double, callback: js.Function2[/* err */ Error, /* res */ String, Unit]): Pipeline = js.native
  @JSName("linsert")
  def linsert_AFTER(key: KeyType, direction: AFTER, pivot: String, value: js.Any): Pipeline = js.native
  @JSName("linsert")
  def linsert_AFTER(
    key: KeyType,
    direction: AFTER,
    pivot: String,
    value: js.Any,
    callback: js.Function2[/* err */ Error, /* res */ Double, Unit]
  ): Pipeline = js.native
  @JSName("linsert")
  def linsert_BEFORE(key: KeyType, direction: BEFORE, pivot: String, value: js.Any): Pipeline = js.native
  @JSName("linsert")
  def linsert_BEFORE(
    key: KeyType,
    direction: BEFORE,
    pivot: String,
    value: js.Any,
    callback: js.Function2[/* err */ Error, /* res */ Double, Unit]
  ): Pipeline = js.native
  def llen(key: KeyType): Pipeline = js.native
  def llen(key: KeyType, callback: js.Function2[/* err */ Error, /* res */ Double, Unit]): Pipeline = js.native
  def lpop(key: KeyType): Pipeline = js.native
  def lpop(key: KeyType, callback: js.Function2[/* err */ Error, /* res */ String, Unit]): Pipeline = js.native
  def lpopBuffer(key: KeyType): Pipeline = js.native
  def lpopBuffer(key: KeyType, callback: js.Function2[/* err */ Error, /* res */ Buffer, Unit]): Pipeline = js.native
  def lpush(key: KeyType, values: js.Any*): Pipeline = js.native
  def lpushx(key: KeyType, value: js.Any): Pipeline = js.native
  def lpushx(key: KeyType, value: js.Any, callback: js.Function2[/* err */ Error, /* res */ Double, Unit]): Pipeline = js.native
  def lrange(key: KeyType, start: Double, stop: Double): Pipeline = js.native
  def lrange(
    key: KeyType,
    start: Double,
    stop: Double,
    callback: js.Function2[/* err */ Error, /* res */ js.Any, Unit]
  ): Pipeline = js.native
  def lrangeBuffer(key: KeyType, start: Double, stop: Double): Pipeline = js.native
  def lrangeBuffer(
    key: KeyType,
    start: Double,
    stop: Double,
    callback: js.Function2[/* err */ Error, /* res */ js.Array[Buffer], Unit]
  ): Pipeline = js.native
  def lrem(key: KeyType, count: Double, value: js.Any): Pipeline = js.native
  def lrem(
    key: KeyType,
    count: Double,
    value: js.Any,
    callback: js.Function2[/* err */ Error, /* res */ Double, Unit]
  ): Pipeline = js.native
  def lset(key: KeyType, index: Double, value: js.Any): Pipeline = js.native
  def lset(
    key: KeyType,
    index: Double,
    value: js.Any,
    callback: js.Function2[/* err */ Error, /* res */ js.Any, Unit]
  ): Pipeline = js.native
  def ltrim(key: KeyType, start: Double, stop: Double): Pipeline = js.native
  def ltrim(
    key: KeyType,
    start: Double,
    stop: Double,
    callback: js.Function2[/* err */ Error, /* res */ js.Any, Unit]
  ): Pipeline = js.native
  def mget(keys: KeyType*): Pipeline = js.native
  def migrate(args: js.Any*): Pipeline = js.native
  def monitor(): Pipeline = js.native
  def monitor(callback: js.Function2[/* err */ Error, /* res */ EventEmitter, Unit]): Pipeline = js.native
  def move(key: KeyType, db: String): Pipeline = js.native
  def move(key: KeyType, db: String, callback: js.Function2[/* err */ Error, /* res */ `0` | `1`, Unit]): Pipeline = js.native
  def mset(args: js.Any*): Pipeline = js.native
  def mset(data: js.Any): Pipeline = js.native
  def mset(data: js.Any, callback: js.Function2[/* err */ Error, /* res */ String, Unit]): Pipeline = js.native
  def msetnx(args: js.Any*): Pipeline = js.native
  def msetnx(data: js.Any): Pipeline = js.native
  def msetnx(data: js.Any, callback: js.Function2[/* err */ Error, /* res */ `0` | `1`, Unit]): Pipeline = js.native
  def multi(): Pipeline = js.native
  def multi(callback: js.Function2[/* err */ Error, /* res */ String, Unit]): Pipeline = js.native
  def `object`(subcommand: String, args: js.Any*): Pipeline = js.native
  def persist(key: KeyType): Pipeline = js.native
  def persist(key: KeyType, callback: js.Function2[/* err */ Error, /* res */ `0` | `1`, Unit]): Pipeline = js.native
  def pexpire(key: KeyType, milliseconds: Double): Pipeline = js.native
  def pexpire(
    key: KeyType,
    milliseconds: Double,
    callback: js.Function2[/* err */ Error, /* res */ `0` | `1`, Unit]
  ): Pipeline = js.native
  def pexpireat(key: KeyType, millisecondsTimestamp: Double): Pipeline = js.native
  def pexpireat(
    key: KeyType,
    millisecondsTimestamp: Double,
    callback: js.Function2[/* err */ Error, /* res */ `0` | `1`, Unit]
  ): Pipeline = js.native
  def pfadd(key: KeyType, elements: String*): Pipeline = js.native
  def pfcount(keys: KeyType*): Pipeline = js.native
  def pfmerge(destkey: KeyType, sourcekeys: KeyType*): Pipeline = js.native
  def ping(): Pipeline = js.native
  def ping(callback: js.Function2[/* err */ Error, /* res */ String, Unit]): Pipeline = js.native
  def ping(message: String): Pipeline = js.native
  def ping(message: String, callback: js.Function2[/* err */ Error, /* res */ String, Unit]): Pipeline = js.native
  def psetex(key: KeyType, milliseconds: Double, value: js.Any): Pipeline = js.native
  def psetex(
    key: KeyType,
    milliseconds: Double,
    value: js.Any,
    callback: js.Function2[/* err */ Error, /* res */ js.Any, Unit]
  ): Pipeline = js.native
  def psubscribe(patterns: String*): Pipeline = js.native
  def pttl(key: KeyType, callback: js.Function2[/* err */ Error, /* res */ Double, Unit]): Pipeline = js.native
  def publish(channel: String, message: String): Pipeline = js.native
  def publish(channel: String, message: String, callback: js.Function2[/* err */ Error, /* res */ Double, Unit]): Pipeline = js.native
  def punsubscribe(patterns: String*): Pipeline = js.native
  def quit(): Pipeline = js.native
  def quit(callback: js.Function2[/* err */ Error, /* res */ String, Unit]): Pipeline = js.native
  def randomkey(): Pipeline = js.native
  def randomkey(callback: js.Function2[/* err */ Error, /* res */ String, Unit]): Pipeline = js.native
  def rename(key: KeyType, newkey: KeyType): Pipeline = js.native
  def rename(key: KeyType, newkey: KeyType, callback: js.Function2[/* err */ Error, /* res */ String, Unit]): Pipeline = js.native
  def renamenx(key: KeyType, newkey: KeyType): Pipeline = js.native
  def renamenx(key: KeyType, newkey: KeyType, callback: js.Function2[/* err */ Error, /* res */ `0` | `1`, Unit]): Pipeline = js.native
  def restore(args: js.Any*): Pipeline = js.native
  def rpop(key: KeyType): Pipeline = js.native
  def rpop(key: KeyType, callback: js.Function2[/* err */ Error, /* res */ String, Unit]): Pipeline = js.native
  def rpoplpush(source: String, destination: String): Pipeline = js.native
  def rpoplpush(
    source: String,
    destination: String,
    callback: js.Function2[/* err */ Error, /* res */ String, Unit]
  ): Pipeline = js.native
  def rpush(key: KeyType, values: js.Any*): Pipeline = js.native
  def rpushBuffer(key: String, values: Buffer*): Pipeline = js.native
  def rpushx(key: KeyType, value: js.Any): Pipeline = js.native
  def rpushx(key: KeyType, value: js.Any, callback: js.Function2[/* err */ Error, /* res */ Double, Unit]): Pipeline = js.native
  def sadd(key: KeyType, members: js.Any*): Pipeline = js.native
  def save(): Pipeline = js.native
  def save(callback: js.Function2[/* err */ Error, /* res */ String, Unit]): Pipeline = js.native
  def scan(cursor: Double): Pipeline = js.native
  def scan(cursor: Double, countOption: COUNT, count: Double, matchOption: MATCH, pattern: String): Pipeline = js.native
  def scan(cursor: Double, countOption: COUNT, count: Double, matchOption: `match`, pattern: String): Pipeline = js.native
  def scan(cursor: Double, countOption: count, count: Double, matchOption: MATCH, pattern: String): Pipeline = js.native
  def scan(cursor: Double, countOption: count, count: Double, matchOption: `match`, pattern: String): Pipeline = js.native
  def scan(cursor: Double, matchOption: MATCH, pattern: String, countOption: COUNT, count: Double): Pipeline = js.native
  def scan(cursor: Double, matchOption: MATCH, pattern: String, countOption: count, count: Double): Pipeline = js.native
  def scan(cursor: Double, matchOption: `match`, pattern: String, countOption: COUNT, count: Double): Pipeline = js.native
  def scan(cursor: Double, matchOption: `match`, pattern: String, countOption: count, count: Double): Pipeline = js.native
  @JSName("scan")
  def scan_COUNT(cursor: Double, countOption: COUNT, count: Double): Pipeline = js.native
  @JSName("scan")
  def scan_MATCH(cursor: Double, matchOption: MATCH, pattern: String): Pipeline = js.native
  @JSName("scan")
  def scan_count(cursor: Double, countOption: count, count: Double): Pipeline = js.native
  @JSName("scan")
  def scan_match(cursor: Double, matchOption: `match`, pattern: String): Pipeline = js.native
  def scard(key: KeyType): Pipeline = js.native
  def scard(key: KeyType, callback: js.Function2[/* err */ Error, /* res */ Double, Unit]): Pipeline = js.native
  def script(args: js.Any*): Pipeline = js.native
  def sdiff(keys: KeyType*): Pipeline = js.native
  def sdiffstore(destination: String, keys: KeyType*): Pipeline = js.native
  def select(index: Double): Pipeline = js.native
  def select(index: Double, callback: js.Function2[/* err */ Error, /* res */ String, Unit]): Pipeline = js.native
  def set(key: KeyType, value: js.Any): Pipeline = js.native
  def set(key: KeyType, value: js.Any, callback: js.Function2[/* err */ Error, /* res */ String, Unit]): Pipeline = js.native
  def set(key: KeyType, value: js.Any, expiryMode: String, time: Double): Pipeline = js.native
  def set(
    key: KeyType,
    value: js.Any,
    expiryMode: String,
    time: Double,
    callback: js.Function2[/* err */ Error, /* res */ String, Unit]
  ): Pipeline = js.native
  def set(key: KeyType, value: js.Any, expiryMode: String, time: Double, setMode: String): Pipeline = js.native
  def set(
    key: KeyType,
    value: js.Any,
    expiryMode: String,
    time: Double,
    setMode: String,
    callback: js.Function2[/* err */ Error, /* res */ String, Unit]
  ): Pipeline = js.native
  def set(key: KeyType, value: js.Any, setMode: String): Pipeline = js.native
  def set(
    key: KeyType,
    value: js.Any,
    setMode: String,
    callback: js.Function2[/* err */ Error, /* res */ String, Unit]
  ): Pipeline = js.native
  def setBuffer(key: KeyType, value: js.Any): Pipeline = js.native
  def setBuffer(key: KeyType, value: js.Any, callback: js.Function2[/* err */ Error, /* res */ Buffer, Unit]): Pipeline = js.native
  def setBuffer(key: KeyType, value: js.Any, expiryMode: String, time: Double): Pipeline = js.native
  def setBuffer(
    key: KeyType,
    value: js.Any,
    expiryMode: String,
    time: Double,
    callback: js.Function2[/* err */ Error, /* res */ Buffer, Unit]
  ): Pipeline = js.native
  def setBuffer(key: KeyType, value: js.Any, expiryMode: String, time: Double, setMode: String): Pipeline = js.native
  def setBuffer(
    key: KeyType,
    value: js.Any,
    expiryMode: String,
    time: Double,
    setMode: String,
    callback: js.Function2[/* err */ Error, /* res */ Buffer, Unit]
  ): Pipeline = js.native
  def setBuffer(key: KeyType, value: js.Any, setMode: String): Pipeline = js.native
  def setBuffer(
    key: KeyType,
    value: js.Any,
    setMode: String,
    callback: js.Function2[/* err */ Error, /* res */ Buffer, Unit]
  ): Pipeline = js.native
  def setbit(key: KeyType, offset: Double, value: js.Any): Pipeline = js.native
  def setbit(
    key: KeyType,
    offset: Double,
    value: js.Any,
    callback: js.Function2[/* err */ Error, /* res */ Double, Unit]
  ): Pipeline = js.native
  def setex(key: KeyType, seconds: Double, value: js.Any): Pipeline = js.native
  def setex(
    key: KeyType,
    seconds: Double,
    value: js.Any,
    callback: js.Function2[/* err */ Error, /* res */ js.Any, Unit]
  ): Pipeline = js.native
  def setnx(key: KeyType, value: js.Any): Pipeline = js.native
  def setnx(key: KeyType, value: js.Any, callback: js.Function2[/* err */ Error, /* res */ js.Any, Unit]): Pipeline = js.native
  def setrange(key: KeyType, offset: Double, value: js.Any): Pipeline = js.native
  def setrange(
    key: KeyType,
    offset: Double,
    value: js.Any,
    callback: js.Function2[/* err */ Error, /* res */ Double, Unit]
  ): Pipeline = js.native
  @JSName("shutdown")
  def shutdown_NOSAVE(save: NOSAVE): Pipeline = js.native
  @JSName("shutdown")
  def shutdown_NOSAVE(save: NOSAVE, callback: js.Function2[/* err */ Error, /* res */ js.Any, Unit]): Pipeline = js.native
  @JSName("shutdown")
  def shutdown_SAVE(save: SAVE): Pipeline = js.native
  @JSName("shutdown")
  def shutdown_SAVE(save: SAVE, callback: js.Function2[/* err */ Error, /* res */ js.Any, Unit]): Pipeline = js.native
  def sinter(keys: KeyType*): Pipeline = js.native
  def sinterstore(destination: String, keys: KeyType*): Pipeline = js.native
  def sismember(key: KeyType, member: String): Pipeline = js.native
  def sismember(key: KeyType, member: String, callback: js.Function2[/* err */ Error, /* res */ `1` | `0`, Unit]): Pipeline = js.native
  def slaveof(host: String, port: Double): Pipeline = js.native
  def slaveof(host: String, port: Double, callback: js.Function2[/* err */ Error, /* res */ String, Unit]): Pipeline = js.native
  def smembers(key: KeyType): Pipeline = js.native
  def smembers(key: KeyType, callback: js.Function2[/* err */ Error, /* res */ js.Any, Unit]): Pipeline = js.native
  def smove(source: String, destination: String, member: String): Pipeline = js.native
  def smove(
    source: String,
    destination: String,
    member: String,
    callback: js.Function2[/* err */ Error, /* res */ String, Unit]
  ): Pipeline = js.native
  def sort(key: KeyType, args: String*): Pipeline = js.native
  def spop(key: KeyType): Pipeline = js.native
  def spop(key: KeyType, callback: js.Function2[/* err */ Error, /* res */ js.Any, Unit]): Pipeline = js.native
  def spop(key: KeyType, count: Double): Pipeline = js.native
  def spop(key: KeyType, count: Double, callback: js.Function2[/* err */ Error, /* res */ js.Any, Unit]): Pipeline = js.native
  def srandmember(key: KeyType): Pipeline = js.native
  def srandmember(key: KeyType, callback: js.Function2[/* err */ Error, /* res */ js.Any, Unit]): Pipeline = js.native
  def srandmember(key: KeyType, count: Double): Pipeline = js.native
  def srandmember(key: KeyType, count: Double, callback: js.Function2[/* err */ Error, /* res */ js.Any, Unit]): Pipeline = js.native
  def srem(key: KeyType, members: js.Any*): Pipeline = js.native
  def sscan(key: KeyType, cursor: Double, args: js.Any*): Pipeline = js.native
  def strlen(key: KeyType): Pipeline = js.native
  def strlen(key: KeyType, callback: js.Function2[/* err */ Error, /* res */ Double, Unit]): Pipeline = js.native
  def subscribe(channels: js.Any*): Pipeline = js.native
  def substr(key: KeyType, start: Double, end: Double): Pipeline = js.native
  def substr(
    key: KeyType,
    start: Double,
    end: Double,
    callback: js.Function2[/* err */ Error, /* res */ String, Unit]
  ): Pipeline = js.native
  def sunion(keys: KeyType*): Pipeline = js.native
  def sunionstore(destination: String, keys: KeyType*): Pipeline = js.native
  def sync(): Pipeline = js.native
  def sync(callback: js.Function2[/* err */ Error, /* res */ js.Any, Unit]): Pipeline = js.native
  def time(): Pipeline = js.native
  def time(callback: js.Function2[/* err */ Error, /* res */ js.Any, Unit]): Pipeline = js.native
  def ttl(key: KeyType): Pipeline = js.native
  def ttl(key: KeyType, callback: js.Function2[/* err */ Error, /* res */ Double, Unit]): Pipeline = js.native
  def `type`(key: KeyType): Pipeline = js.native
  def `type`(key: KeyType, callback: js.Function2[/* err */ Error, /* res */ String, Unit]): Pipeline = js.native
  def unsubscribe(channels: String*): Pipeline = js.native
  def unwatch(): Pipeline = js.native
  def unwatch(callback: js.Function2[/* err */ Error, /* res */ String, Unit]): Pipeline = js.native
  def watch(keys: KeyType*): Pipeline = js.native
  def xack(key: KeyType, group: String, ids: String*): Pipeline = js.native
  def xadd(key: KeyType, id: String, args: String*): Pipeline = js.native
  def xclaim(key: KeyType, group: String, consumer: String, minIdleTime: Double, id: String, args: js.Any*): Pipeline = js.native
  def xdel(key: KeyType, ids: String*): Pipeline = js.native
  def xgroup(args: js.Any*): Pipeline = js.native
  def xinfo(args: js.Any*): Pipeline = js.native
  def xlen(key: KeyType): Pipeline = js.native
  def xpending(key: KeyType, group: String, args: js.Any*): Pipeline = js.native
  def xrange(key: KeyType, start: String, end: String, args: js.Any*): Pipeline = js.native
  def xread(args: js.Any*): Pipeline = js.native
  @JSName("xreadgroup")
  def xreadgroup_GROUP(command: GROUP, group: String, consumer: String, args: js.Any*): Pipeline = js.native
  @JSName("xreadgroup")
  def xreadgroup_group(command: group, group: String, consumer: String, args: js.Any*): Pipeline = js.native
  def xrevrange(key: KeyType, end: String, start: String, args: js.Any*): Pipeline = js.native
  @JSName("xtrim")
  def xtrim_MAXLEN(key: KeyType, strategy: MAXLEN, args: js.Any*): Pipeline = js.native
  @JSName("xtrim")
  def xtrim_maxlen(key: KeyType, strategy: maxlen, args: js.Any*): Pipeline = js.native
  def zadd(key: KeyType, args: String*): Pipeline = js.native
  def zcard(key: KeyType): Pipeline = js.native
  def zcard(key: KeyType, callback: js.Function2[/* err */ Error, /* res */ Double, Unit]): Pipeline = js.native
  def zcount(key: KeyType, min: String, max: String): Pipeline = js.native
  def zcount(
    key: KeyType,
    min: String,
    max: String,
    callback: js.Function2[/* err */ Error, /* res */ Double, Unit]
  ): Pipeline = js.native
  def zcount(key: KeyType, min: String, max: Double): Pipeline = js.native
  def zcount(
    key: KeyType,
    min: String,
    max: Double,
    callback: js.Function2[/* err */ Error, /* res */ Double, Unit]
  ): Pipeline = js.native
  def zcount(key: KeyType, min: Double, max: String): Pipeline = js.native
  def zcount(
    key: KeyType,
    min: Double,
    max: String,
    callback: js.Function2[/* err */ Error, /* res */ Double, Unit]
  ): Pipeline = js.native
  def zcount(key: KeyType, min: Double, max: Double): Pipeline = js.native
  def zcount(
    key: KeyType,
    min: Double,
    max: Double,
    callback: js.Function2[/* err */ Error, /* res */ Double, Unit]
  ): Pipeline = js.native
  def zincrby(key: KeyType, increment: Double, member: String): Pipeline = js.native
  def zincrby(
    key: KeyType,
    increment: Double,
    member: String,
    callback: js.Function2[/* err */ Error, /* res */ js.Any, Unit]
  ): Pipeline = js.native
  def zinterstore(destination: String, numkeys: Double, key: KeyType, args: String*): Pipeline = js.native
  def zrange(key: KeyType, start: Double, stop: Double): Pipeline = js.native
  def zrange(
    key: KeyType,
    start: Double,
    stop: Double,
    callback: js.Function2[/* err */ Error, /* res */ js.Any, Unit]
  ): Pipeline = js.native
  @JSName("zrange")
  def zrange_WITHSCORES(key: KeyType, start: Double, stop: Double, withScores: WITHSCORES): Pipeline = js.native
  @JSName("zrange")
  def zrange_WITHSCORES(
    key: KeyType,
    start: Double,
    stop: Double,
    withScores: WITHSCORES,
    callback: js.Function2[/* err */ Error, /* res */ js.Any, Unit]
  ): Pipeline = js.native
  def zrangebyscore(key: KeyType, min: String, max: String, args: String*): Pipeline = js.native
  def zrangebyscore(key: KeyType, min: String, max: Double, args: String*): Pipeline = js.native
  def zrangebyscore(key: KeyType, min: Double, max: String, args: String*): Pipeline = js.native
  def zrangebyscore(key: KeyType, min: Double, max: Double, args: String*): Pipeline = js.native
  def zrank(key: KeyType, member: String): Pipeline = js.native
  def zrank(key: KeyType, member: String, callback: js.Function2[/* err */ Error, /* res */ Double, Unit]): Pipeline = js.native
  def zrem(key: KeyType, members: js.Any*): Pipeline = js.native
  def zremrangebyrank(key: KeyType, start: Double, stop: Double): Pipeline = js.native
  def zremrangebyrank(
    key: KeyType,
    start: Double,
    stop: Double,
    callback: js.Function2[/* err */ Error, /* res */ js.Any, Unit]
  ): Pipeline = js.native
  def zremrangebyscore(key: KeyType, min: String, max: String): Pipeline = js.native
  def zremrangebyscore(
    key: KeyType,
    min: String,
    max: String,
    callback: js.Function2[/* err */ Error, /* res */ js.Any, Unit]
  ): Pipeline = js.native
  def zremrangebyscore(key: KeyType, min: String, max: Double): Pipeline = js.native
  def zremrangebyscore(
    key: KeyType,
    min: String,
    max: Double,
    callback: js.Function2[/* err */ Error, /* res */ js.Any, Unit]
  ): Pipeline = js.native
  def zremrangebyscore(key: KeyType, min: Double, max: String): Pipeline = js.native
  def zremrangebyscore(
    key: KeyType,
    min: Double,
    max: String,
    callback: js.Function2[/* err */ Error, /* res */ js.Any, Unit]
  ): Pipeline = js.native
  def zremrangebyscore(key: KeyType, min: Double, max: Double): Pipeline = js.native
  def zremrangebyscore(
    key: KeyType,
    min: Double,
    max: Double,
    callback: js.Function2[/* err */ Error, /* res */ js.Any, Unit]
  ): Pipeline = js.native
  def zrevrange(key: KeyType, start: Double, stop: Double): Pipeline = js.native
  def zrevrange(
    key: KeyType,
    start: Double,
    stop: Double,
    callback: js.Function2[/* err */ Error, /* res */ js.Any, Unit]
  ): Pipeline = js.native
  @JSName("zrevrange")
  def zrevrange_WITHSCORES(key: KeyType, start: Double, stop: Double, withScores: WITHSCORES): Pipeline = js.native
  @JSName("zrevrange")
  def zrevrange_WITHSCORES(
    key: KeyType,
    start: Double,
    stop: Double,
    withScores: WITHSCORES,
    callback: js.Function2[/* err */ Error, /* res */ js.Any, Unit]
  ): Pipeline = js.native
  def zrevrangebyscore(key: KeyType, max: String, min: String, args: String*): Pipeline = js.native
  def zrevrangebyscore(key: KeyType, max: String, min: Double, args: String*): Pipeline = js.native
  def zrevrangebyscore(key: KeyType, max: Double, min: String, args: String*): Pipeline = js.native
  def zrevrangebyscore(key: KeyType, max: Double, min: Double, args: String*): Pipeline = js.native
  def zrevrank(key: KeyType, member: String): Pipeline = js.native
  def zrevrank(key: KeyType, member: String, callback: js.Function2[/* err */ Error, /* res */ Double, Unit]): Pipeline = js.native
  def zscan(key: KeyType, cursor: Double, args: js.Any*): Pipeline = js.native
  def zscore(key: KeyType, member: String): Pipeline = js.native
  def zscore(key: KeyType, member: String, callback: js.Function2[/* err */ Error, /* res */ Double, Unit]): Pipeline = js.native
  def zunionstore(destination: String, numkeys: Double, key: KeyType, args: String*): Pipeline = js.native
}

