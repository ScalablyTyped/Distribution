package typings
package ioredisLib.ioredisMod.IORedisNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pipeline extends js.Object {
  var _queue: js.Array[Command] = js.native
  var _result: js.Array[_] = js.native
  var _transactions: scala.Double = js.native
  var isCluster: scala.Boolean = js.native
  var options: RedisOptions = js.native
  var redis: Redis = js.native
  def append(key: KeyType, value: js.Any): Pipeline = js.native
  def append(
    key: KeyType,
    value: js.Any,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ scala.Double, scala.Unit]
  ): Pipeline = js.native
  def auth(password: java.lang.String): Pipeline = js.native
  def auth(
    password: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ java.lang.String, scala.Unit]
  ): Pipeline = js.native
  def bgrewriteaof(): Pipeline = js.native
  def bgrewriteaof(callback: js.Function2[/* err */ nodeLib.Error, /* res */ java.lang.String, scala.Unit]): Pipeline = js.native
  def bgsave(): Pipeline = js.native
  def bgsave(callback: js.Function2[/* err */ nodeLib.Error, /* res */ java.lang.String, scala.Unit]): Pipeline = js.native
  def bitcount(key: KeyType): Pipeline = js.native
  def bitcount(key: KeyType, callback: js.Function2[/* err */ nodeLib.Error, /* res */ scala.Double, scala.Unit]): Pipeline = js.native
  def bitcount(key: KeyType, start: scala.Double, end: scala.Double): Pipeline = js.native
  def bitcount(
    key: KeyType,
    start: scala.Double,
    end: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ scala.Double, scala.Unit]
  ): Pipeline = js.native
  def blpop(keys: KeyType*): Pipeline = js.native
  def brpop(keys: KeyType*): Pipeline = js.native
  def brpoplpush(source: java.lang.String, destination: java.lang.String, timeout: scala.Double): Pipeline = js.native
  def brpoplpush(
    source: java.lang.String,
    destination: java.lang.String,
    timeout: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ js.Any, scala.Unit]
  ): Pipeline = js.native
  def client(args: js.Any*): Pipeline = js.native
  def cluster(args: js.Any*): Pipeline = js.native
  def config(args: js.Any*): Pipeline = js.native
  def dbsize(): Pipeline = js.native
  def dbsize(callback: js.Function2[/* err */ nodeLib.Error, /* res */ scala.Double, scala.Unit]): Pipeline = js.native
  def debug(args: js.Any*): Pipeline = js.native
  def decr(key: KeyType): Pipeline = js.native
  def decr(key: KeyType, callback: js.Function2[/* err */ nodeLib.Error, /* res */ scala.Double, scala.Unit]): Pipeline = js.native
  def decrby(key: KeyType, decrement: scala.Double): Pipeline = js.native
  def decrby(
    key: KeyType,
    decrement: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ scala.Double, scala.Unit]
  ): Pipeline = js.native
  def del(keys: KeyType*): Pipeline = js.native
  def discard(): Pipeline = js.native
  def discard(callback: js.Function2[/* err */ nodeLib.Error, /* res */ js.Any, scala.Unit]): Pipeline = js.native
  def dump(key: KeyType): Pipeline = js.native
  def dump(
    key: KeyType,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ java.lang.String, scala.Unit]
  ): Pipeline = js.native
  def echo(message: java.lang.String): Pipeline = js.native
  def echo(
    message: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ java.lang.String, scala.Unit]
  ): Pipeline = js.native
  def eval(args: js.Any*): Pipeline = js.native
  def evalsha(args: js.Any*): Pipeline = js.native
  def exec(): js.Promise[_] = js.native
  def exec(callback: js.Function2[/* err */ nodeLib.Error, /* res */ js.Any, scala.Unit]): js.Promise[_] = js.native
  def exists(keys: KeyType*): Pipeline = js.native
  def expire(key: KeyType, seconds: scala.Double): Pipeline = js.native
  def expire(
    key: KeyType,
    seconds: scala.Double,
    callback: js.Function2[
      /* err */ nodeLib.Error, 
      /* res */ ioredisLib.ioredisLibNumbers.`0` | ioredisLib.ioredisLibNumbers.`1`, 
      scala.Unit
    ]
  ): Pipeline = js.native
  def expireat(key: KeyType, timestamp: scala.Double): Pipeline = js.native
  def expireat(
    key: KeyType,
    timestamp: scala.Double,
    callback: js.Function2[
      /* err */ nodeLib.Error, 
      /* res */ ioredisLib.ioredisLibNumbers.`0` | ioredisLib.ioredisLibNumbers.`1`, 
      scala.Unit
    ]
  ): Pipeline = js.native
  def flushall(): Pipeline = js.native
  def flushall(callback: js.Function2[/* err */ nodeLib.Error, /* res */ java.lang.String, scala.Unit]): Pipeline = js.native
  def flushdb(): Pipeline = js.native
  def flushdb(callback: js.Function2[/* err */ nodeLib.Error, /* res */ java.lang.String, scala.Unit]): Pipeline = js.native
  def get(key: KeyType): Pipeline = js.native
  def get(
    key: KeyType,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ java.lang.String, scala.Unit]
  ): Pipeline = js.native
  def getBuffer(key: KeyType): Pipeline = js.native
  def getBuffer(
    key: KeyType,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ nodeLib.Buffer, scala.Unit]
  ): Pipeline = js.native
  def getbit(key: KeyType, offset: scala.Double): Pipeline = js.native
  def getbit(
    key: KeyType,
    offset: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ scala.Double, scala.Unit]
  ): Pipeline = js.native
  def getrange(key: KeyType, start: scala.Double, end: scala.Double): Pipeline = js.native
  def getrange(
    key: KeyType,
    start: scala.Double,
    end: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ java.lang.String, scala.Unit]
  ): Pipeline = js.native
  def getset(key: KeyType, value: js.Any): Pipeline = js.native
  def getset(
    key: KeyType,
    value: js.Any,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ java.lang.String, scala.Unit]
  ): Pipeline = js.native
  def hdel(key: KeyType, fields: java.lang.String*): Pipeline = js.native
  def hexists(key: KeyType, field: java.lang.String): Pipeline = js.native
  def hexists(
    key: KeyType,
    field: java.lang.String,
    callback: js.Function2[
      /* err */ nodeLib.Error, 
      /* res */ ioredisLib.ioredisLibNumbers.`0` | ioredisLib.ioredisLibNumbers.`1`, 
      scala.Unit
    ]
  ): Pipeline = js.native
  def hget(key: KeyType, field: java.lang.String): Pipeline = js.native
  def hget(
    key: KeyType,
    field: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ java.lang.String, scala.Unit]
  ): Pipeline = js.native
  def hgetBuffer(key: KeyType, field: java.lang.String): Pipeline = js.native
  def hgetBuffer(
    key: KeyType,
    field: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ nodeLib.Buffer, scala.Unit]
  ): Pipeline = js.native
  def hgetall(key: KeyType): Pipeline = js.native
  def hgetall(key: KeyType, callback: js.Function2[/* err */ nodeLib.Error, /* res */ js.Any, scala.Unit]): Pipeline = js.native
  def hincrby(key: KeyType, field: java.lang.String, increment: scala.Double): Pipeline = js.native
  def hincrby(
    key: KeyType,
    field: java.lang.String,
    increment: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ scala.Double, scala.Unit]
  ): Pipeline = js.native
  def hincrbyfloat(key: KeyType, field: java.lang.String, increment: scala.Double): Pipeline = js.native
  def hincrbyfloat(
    key: KeyType,
    field: java.lang.String,
    increment: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ scala.Double, scala.Unit]
  ): Pipeline = js.native
  def hkeys(key: KeyType): Pipeline = js.native
  def hkeys(key: KeyType, callback: js.Function2[/* err */ nodeLib.Error, /* res */ js.Any, scala.Unit]): Pipeline = js.native
  def hlen(key: KeyType): Pipeline = js.native
  def hlen(key: KeyType, callback: js.Function2[/* err */ nodeLib.Error, /* res */ scala.Double, scala.Unit]): Pipeline = js.native
  def hmget(key: KeyType, fields: java.lang.String*): Pipeline = js.native
  def hmset(key: KeyType, args: js.Any*): Pipeline = js.native
  def hmset(key: KeyType, data: js.Any): Pipeline = js.native
  def hmset(
    key: KeyType,
    data: js.Any,
    callback: js.Function2[
      /* err */ nodeLib.Error, 
      /* res */ ioredisLib.ioredisLibNumbers.`0` | ioredisLib.ioredisLibNumbers.`1`, 
      scala.Unit
    ]
  ): Pipeline = js.native
  def hscan(key: KeyType, cursor: scala.Double, args: js.Any*): Pipeline = js.native
  def hset(key: KeyType, field: java.lang.String, value: js.Any): Pipeline = js.native
  def hset(
    key: KeyType,
    field: java.lang.String,
    value: js.Any,
    callback: js.Function2[
      /* err */ nodeLib.Error, 
      /* res */ ioredisLib.ioredisLibNumbers.`0` | ioredisLib.ioredisLibNumbers.`1`, 
      scala.Unit
    ]
  ): Pipeline = js.native
  def hsetBuffer(key: KeyType, field: java.lang.String, value: js.Any): Pipeline = js.native
  def hsetBuffer(
    key: KeyType,
    field: java.lang.String,
    value: js.Any,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ nodeLib.Buffer, scala.Unit]
  ): Pipeline = js.native
  def hsetnx(key: KeyType, field: java.lang.String, value: js.Any): Pipeline = js.native
  def hsetnx(
    key: KeyType,
    field: java.lang.String,
    value: js.Any,
    callback: js.Function2[
      /* err */ nodeLib.Error, 
      /* res */ ioredisLib.ioredisLibNumbers.`0` | ioredisLib.ioredisLibNumbers.`1`, 
      scala.Unit
    ]
  ): Pipeline = js.native
  def hvals(key: KeyType): Pipeline = js.native
  def hvals(key: KeyType, callback: js.Function2[/* err */ nodeLib.Error, /* res */ js.Any, scala.Unit]): Pipeline = js.native
  def incr(key: KeyType): Pipeline = js.native
  def incr(key: KeyType, callback: js.Function2[/* err */ nodeLib.Error, /* res */ scala.Double, scala.Unit]): Pipeline = js.native
  def incrby(key: KeyType, increment: scala.Double): Pipeline = js.native
  def incrby(
    key: KeyType,
    increment: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ scala.Double, scala.Unit]
  ): Pipeline = js.native
  def incrbyfloat(key: KeyType, increment: scala.Double): Pipeline = js.native
  def incrbyfloat(
    key: KeyType,
    increment: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ scala.Double, scala.Unit]
  ): Pipeline = js.native
  def info(): Pipeline = js.native
  def info(callback: js.Function2[/* err */ nodeLib.Error, /* res */ js.Any, scala.Unit]): Pipeline = js.native
  def info(section: java.lang.String): Pipeline = js.native
  def info(
    section: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ js.Any, scala.Unit]
  ): Pipeline = js.native
  def keys(pattern: java.lang.String): Pipeline = js.native
  def keys(
    pattern: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ js.Array[java.lang.String], scala.Unit]
  ): Pipeline = js.native
  def lastsave(): Pipeline = js.native
  def lastsave(callback: js.Function2[/* err */ nodeLib.Error, /* res */ scala.Double, scala.Unit]): Pipeline = js.native
  def lindex(key: KeyType, index: scala.Double): Pipeline = js.native
  def lindex(
    key: KeyType,
    index: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ java.lang.String, scala.Unit]
  ): Pipeline = js.native
  @JSName("linsert")
  def linsert_AFTER(
    key: KeyType,
    direction: ioredisLib.ioredisLibStrings.AFTER,
    pivot: java.lang.String,
    value: js.Any
  ): Pipeline = js.native
  @JSName("linsert")
  def linsert_AFTER(
    key: KeyType,
    direction: ioredisLib.ioredisLibStrings.AFTER,
    pivot: java.lang.String,
    value: js.Any,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ scala.Double, scala.Unit]
  ): Pipeline = js.native
  @JSName("linsert")
  def linsert_BEFORE(
    key: KeyType,
    direction: ioredisLib.ioredisLibStrings.BEFORE,
    pivot: java.lang.String,
    value: js.Any
  ): Pipeline = js.native
  @JSName("linsert")
  def linsert_BEFORE(
    key: KeyType,
    direction: ioredisLib.ioredisLibStrings.BEFORE,
    pivot: java.lang.String,
    value: js.Any,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ scala.Double, scala.Unit]
  ): Pipeline = js.native
  def llen(key: KeyType): Pipeline = js.native
  def llen(key: KeyType, callback: js.Function2[/* err */ nodeLib.Error, /* res */ scala.Double, scala.Unit]): Pipeline = js.native
  def lpop(key: KeyType): Pipeline = js.native
  def lpop(
    key: KeyType,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ java.lang.String, scala.Unit]
  ): Pipeline = js.native
  def lpush(key: KeyType, values: js.Any*): Pipeline = js.native
  def lpushx(key: KeyType, value: js.Any): Pipeline = js.native
  def lpushx(
    key: KeyType,
    value: js.Any,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ scala.Double, scala.Unit]
  ): Pipeline = js.native
  def lrange(key: KeyType, start: scala.Double, stop: scala.Double): Pipeline = js.native
  def lrange(
    key: KeyType,
    start: scala.Double,
    stop: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ js.Any, scala.Unit]
  ): Pipeline = js.native
  def lrem(key: KeyType, count: scala.Double, value: js.Any): Pipeline = js.native
  def lrem(
    key: KeyType,
    count: scala.Double,
    value: js.Any,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ scala.Double, scala.Unit]
  ): Pipeline = js.native
  def lset(key: KeyType, index: scala.Double, value: js.Any): Pipeline = js.native
  def lset(
    key: KeyType,
    index: scala.Double,
    value: js.Any,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ js.Any, scala.Unit]
  ): Pipeline = js.native
  def ltrim(key: KeyType, start: scala.Double, stop: scala.Double): Pipeline = js.native
  def ltrim(
    key: KeyType,
    start: scala.Double,
    stop: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ js.Any, scala.Unit]
  ): Pipeline = js.native
  def mget(keys: KeyType*): Pipeline = js.native
  def migrate(args: js.Any*): Pipeline = js.native
  def monitor(): Pipeline = js.native
  def monitor(
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ nodeLib.NodeJSNs.EventEmitter, scala.Unit]
  ): Pipeline = js.native
  def move(key: KeyType, db: java.lang.String): Pipeline = js.native
  def move(
    key: KeyType,
    db: java.lang.String,
    callback: js.Function2[
      /* err */ nodeLib.Error, 
      /* res */ ioredisLib.ioredisLibNumbers.`0` | ioredisLib.ioredisLibNumbers.`1`, 
      scala.Unit
    ]
  ): Pipeline = js.native
  def mset(args: js.Any*): Pipeline = js.native
  def mset(data: js.Any): Pipeline = js.native
  def mset(
    data: js.Any,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ java.lang.String, scala.Unit]
  ): Pipeline = js.native
  def msetnx(args: js.Any*): Pipeline = js.native
  def msetnx(data: js.Any): Pipeline = js.native
  def msetnx(
    data: js.Any,
    callback: js.Function2[
      /* err */ nodeLib.Error, 
      /* res */ ioredisLib.ioredisLibNumbers.`0` | ioredisLib.ioredisLibNumbers.`1`, 
      scala.Unit
    ]
  ): Pipeline = js.native
  def multi(): Pipeline = js.native
  def multi(callback: js.Function2[/* err */ nodeLib.Error, /* res */ java.lang.String, scala.Unit]): Pipeline = js.native
  def `object`(subcommand: java.lang.String, args: js.Any*): Pipeline = js.native
  def persist(key: KeyType): Pipeline = js.native
  def persist(
    key: KeyType,
    callback: js.Function2[
      /* err */ nodeLib.Error, 
      /* res */ ioredisLib.ioredisLibNumbers.`0` | ioredisLib.ioredisLibNumbers.`1`, 
      scala.Unit
    ]
  ): Pipeline = js.native
  def pexpire(key: KeyType, milliseconds: scala.Double): Pipeline = js.native
  def pexpire(
    key: KeyType,
    milliseconds: scala.Double,
    callback: js.Function2[
      /* err */ nodeLib.Error, 
      /* res */ ioredisLib.ioredisLibNumbers.`0` | ioredisLib.ioredisLibNumbers.`1`, 
      scala.Unit
    ]
  ): Pipeline = js.native
  def pexpireat(key: KeyType, millisecondsTimestamp: scala.Double): Pipeline = js.native
  def pexpireat(
    key: KeyType,
    millisecondsTimestamp: scala.Double,
    callback: js.Function2[
      /* err */ nodeLib.Error, 
      /* res */ ioredisLib.ioredisLibNumbers.`0` | ioredisLib.ioredisLibNumbers.`1`, 
      scala.Unit
    ]
  ): Pipeline = js.native
  def pfadd(key: KeyType, elements: java.lang.String*): Pipeline = js.native
  def pfcount(keys: KeyType*): Pipeline = js.native
  def pfmerge(destkey: KeyType, sourcekeys: KeyType*): Pipeline = js.native
  def ping(): Pipeline = js.native
  def ping(callback: js.Function2[/* err */ nodeLib.Error, /* res */ java.lang.String, scala.Unit]): Pipeline = js.native
  def ping(message: java.lang.String): Pipeline = js.native
  def ping(
    message: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ java.lang.String, scala.Unit]
  ): Pipeline = js.native
  def psetex(key: KeyType, milliseconds: scala.Double, value: js.Any): Pipeline = js.native
  def psetex(
    key: KeyType,
    milliseconds: scala.Double,
    value: js.Any,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ js.Any, scala.Unit]
  ): Pipeline = js.native
  def psubscribe(patterns: java.lang.String*): Pipeline = js.native
  def publish(channel: java.lang.String, message: java.lang.String): Pipeline = js.native
  def publish(
    channel: java.lang.String,
    message: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ scala.Double, scala.Unit]
  ): Pipeline = js.native
  def punsubscribe(patterns: java.lang.String*): Pipeline = js.native
  def quit(): Pipeline = js.native
  def quit(callback: js.Function2[/* err */ nodeLib.Error, /* res */ java.lang.String, scala.Unit]): Pipeline = js.native
  def randomkey(): Pipeline = js.native
  def randomkey(callback: js.Function2[/* err */ nodeLib.Error, /* res */ java.lang.String, scala.Unit]): Pipeline = js.native
  def rename(key: KeyType, newkey: KeyType): Pipeline = js.native
  def rename(
    key: KeyType,
    newkey: KeyType,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ java.lang.String, scala.Unit]
  ): Pipeline = js.native
  def renamenx(key: KeyType, newkey: KeyType): Pipeline = js.native
  def renamenx(
    key: KeyType,
    newkey: KeyType,
    callback: js.Function2[
      /* err */ nodeLib.Error, 
      /* res */ ioredisLib.ioredisLibNumbers.`0` | ioredisLib.ioredisLibNumbers.`1`, 
      scala.Unit
    ]
  ): Pipeline = js.native
  def restore(args: js.Any*): Pipeline = js.native
  def rpop(key: KeyType): Pipeline = js.native
  def rpop(
    key: KeyType,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ java.lang.String, scala.Unit]
  ): Pipeline = js.native
  def rpoplpush(source: java.lang.String, destination: java.lang.String): Pipeline = js.native
  def rpoplpush(
    source: java.lang.String,
    destination: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ java.lang.String, scala.Unit]
  ): Pipeline = js.native
  def rpush(key: KeyType, values: js.Any*): Pipeline = js.native
  def rpushx(key: KeyType, value: js.Any): Pipeline = js.native
  def rpushx(
    key: KeyType,
    value: js.Any,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ scala.Double, scala.Unit]
  ): Pipeline = js.native
  def sadd(key: KeyType, members: js.Any*): Pipeline = js.native
  def save(): Pipeline = js.native
  def save(callback: js.Function2[/* err */ nodeLib.Error, /* res */ java.lang.String, scala.Unit]): Pipeline = js.native
  def scan(cursor: scala.Double): Pipeline = js.native
  def scan(
    cursor: scala.Double,
    countOption: ioredisLib.ioredisLibStrings.COUNT,
    count: scala.Double,
    matchOption: ioredisLib.ioredisLibStrings.MATCH,
    pattern: java.lang.String
  ): Pipeline = js.native
  def scan(
    cursor: scala.Double,
    countOption: ioredisLib.ioredisLibStrings.COUNT,
    count: scala.Double,
    matchOption: ioredisLib.ioredisLibStrings.`match`,
    pattern: java.lang.String
  ): Pipeline = js.native
  def scan(
    cursor: scala.Double,
    countOption: ioredisLib.ioredisLibStrings.count,
    count: scala.Double,
    matchOption: ioredisLib.ioredisLibStrings.MATCH,
    pattern: java.lang.String
  ): Pipeline = js.native
  def scan(
    cursor: scala.Double,
    countOption: ioredisLib.ioredisLibStrings.count,
    count: scala.Double,
    matchOption: ioredisLib.ioredisLibStrings.`match`,
    pattern: java.lang.String
  ): Pipeline = js.native
  def scan(
    cursor: scala.Double,
    matchOption: ioredisLib.ioredisLibStrings.MATCH,
    pattern: java.lang.String,
    countOption: ioredisLib.ioredisLibStrings.COUNT,
    count: scala.Double
  ): Pipeline = js.native
  def scan(
    cursor: scala.Double,
    matchOption: ioredisLib.ioredisLibStrings.MATCH,
    pattern: java.lang.String,
    countOption: ioredisLib.ioredisLibStrings.count,
    count: scala.Double
  ): Pipeline = js.native
  def scan(
    cursor: scala.Double,
    matchOption: ioredisLib.ioredisLibStrings.`match`,
    pattern: java.lang.String,
    countOption: ioredisLib.ioredisLibStrings.COUNT,
    count: scala.Double
  ): Pipeline = js.native
  def scan(
    cursor: scala.Double,
    matchOption: ioredisLib.ioredisLibStrings.`match`,
    pattern: java.lang.String,
    countOption: ioredisLib.ioredisLibStrings.count,
    count: scala.Double
  ): Pipeline = js.native
  @JSName("scan")
  def scan_COUNT(cursor: scala.Double, countOption: ioredisLib.ioredisLibStrings.COUNT, count: scala.Double): Pipeline = js.native
  @JSName("scan")
  def scan_MATCH(cursor: scala.Double, matchOption: ioredisLib.ioredisLibStrings.MATCH, pattern: java.lang.String): Pipeline = js.native
  @JSName("scan")
  def scan_count(cursor: scala.Double, countOption: ioredisLib.ioredisLibStrings.count, count: scala.Double): Pipeline = js.native
  @JSName("scan")
  def scan_match(cursor: scala.Double, matchOption: ioredisLib.ioredisLibStrings.`match`, pattern: java.lang.String): Pipeline = js.native
  def scard(key: KeyType): Pipeline = js.native
  def scard(key: KeyType, callback: js.Function2[/* err */ nodeLib.Error, /* res */ scala.Double, scala.Unit]): Pipeline = js.native
  def script(args: js.Any*): Pipeline = js.native
  def sdiff(keys: KeyType*): Pipeline = js.native
  def sdiffstore(destination: java.lang.String, keys: KeyType*): Pipeline = js.native
  def select(index: scala.Double): Pipeline = js.native
  def select(
    index: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ java.lang.String, scala.Unit]
  ): Pipeline = js.native
  def set(key: KeyType, value: js.Any): Pipeline = js.native
  def set(
    key: KeyType,
    value: js.Any,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ java.lang.String, scala.Unit]
  ): Pipeline = js.native
  def set(key: KeyType, value: js.Any, expiryMode: java.lang.String, time: scala.Double): Pipeline = js.native
  def set(
    key: KeyType,
    value: js.Any,
    expiryMode: java.lang.String,
    time: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ java.lang.String, scala.Unit]
  ): Pipeline = js.native
  def set(
    key: KeyType,
    value: js.Any,
    expiryMode: java.lang.String,
    time: scala.Double,
    setMode: java.lang.String
  ): Pipeline = js.native
  def set(
    key: KeyType,
    value: js.Any,
    expiryMode: java.lang.String,
    time: scala.Double,
    setMode: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ java.lang.String, scala.Unit]
  ): Pipeline = js.native
  def set(key: KeyType, value: js.Any, setMode: java.lang.String): Pipeline = js.native
  def set(
    key: KeyType,
    value: js.Any,
    setMode: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ java.lang.String, scala.Unit]
  ): Pipeline = js.native
  def setBuffer(key: KeyType, value: js.Any): Pipeline = js.native
  def setBuffer(
    key: KeyType,
    value: js.Any,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ nodeLib.Buffer, scala.Unit]
  ): Pipeline = js.native
  def setBuffer(key: KeyType, value: js.Any, expiryMode: java.lang.String, time: scala.Double): Pipeline = js.native
  def setBuffer(
    key: KeyType,
    value: js.Any,
    expiryMode: java.lang.String,
    time: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ nodeLib.Buffer, scala.Unit]
  ): Pipeline = js.native
  def setBuffer(
    key: KeyType,
    value: js.Any,
    expiryMode: java.lang.String,
    time: scala.Double,
    setMode: java.lang.String
  ): Pipeline = js.native
  def setBuffer(
    key: KeyType,
    value: js.Any,
    expiryMode: java.lang.String,
    time: scala.Double,
    setMode: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ nodeLib.Buffer, scala.Unit]
  ): Pipeline = js.native
  def setBuffer(key: KeyType, value: js.Any, setMode: java.lang.String): Pipeline = js.native
  def setBuffer(
    key: KeyType,
    value: js.Any,
    setMode: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ nodeLib.Buffer, scala.Unit]
  ): Pipeline = js.native
  def setbit(key: KeyType, offset: scala.Double, value: js.Any): Pipeline = js.native
  def setbit(
    key: KeyType,
    offset: scala.Double,
    value: js.Any,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ scala.Double, scala.Unit]
  ): Pipeline = js.native
  def setex(key: KeyType, seconds: scala.Double, value: js.Any): Pipeline = js.native
  def setex(
    key: KeyType,
    seconds: scala.Double,
    value: js.Any,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ js.Any, scala.Unit]
  ): Pipeline = js.native
  def setnx(key: KeyType, value: js.Any): Pipeline = js.native
  def setnx(
    key: KeyType,
    value: js.Any,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ js.Any, scala.Unit]
  ): Pipeline = js.native
  def setrange(key: KeyType, offset: scala.Double, value: js.Any): Pipeline = js.native
  def setrange(
    key: KeyType,
    offset: scala.Double,
    value: js.Any,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ scala.Double, scala.Unit]
  ): Pipeline = js.native
  @JSName("shutdown")
  def shutdown_NOSAVE(save: ioredisLib.ioredisLibStrings.NOSAVE): Pipeline = js.native
  @JSName("shutdown")
  def shutdown_NOSAVE(
    save: ioredisLib.ioredisLibStrings.NOSAVE,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ js.Any, scala.Unit]
  ): Pipeline = js.native
  @JSName("shutdown")
  def shutdown_SAVE(save: ioredisLib.ioredisLibStrings.SAVE): Pipeline = js.native
  @JSName("shutdown")
  def shutdown_SAVE(
    save: ioredisLib.ioredisLibStrings.SAVE,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ js.Any, scala.Unit]
  ): Pipeline = js.native
  def sinter(keys: KeyType*): Pipeline = js.native
  def sinterstore(destination: java.lang.String, keys: KeyType*): Pipeline = js.native
  def sismember(key: KeyType, member: java.lang.String): Pipeline = js.native
  def sismember(
    key: KeyType,
    member: java.lang.String,
    callback: js.Function2[
      /* err */ nodeLib.Error, 
      /* res */ ioredisLib.ioredisLibNumbers.`1` | ioredisLib.ioredisLibNumbers.`0`, 
      scala.Unit
    ]
  ): Pipeline = js.native
  def slaveof(host: java.lang.String, port: scala.Double): Pipeline = js.native
  def slaveof(
    host: java.lang.String,
    port: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ java.lang.String, scala.Unit]
  ): Pipeline = js.native
  def smembers(key: KeyType): Pipeline = js.native
  def smembers(key: KeyType, callback: js.Function2[/* err */ nodeLib.Error, /* res */ js.Any, scala.Unit]): Pipeline = js.native
  def smove(source: java.lang.String, destination: java.lang.String, member: java.lang.String): Pipeline = js.native
  def smove(
    source: java.lang.String,
    destination: java.lang.String,
    member: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ java.lang.String, scala.Unit]
  ): Pipeline = js.native
  def sort(key: KeyType, args: java.lang.String*): Pipeline = js.native
  def spop(key: KeyType): Pipeline = js.native
  def spop(key: KeyType, callback: js.Function2[/* err */ nodeLib.Error, /* res */ js.Any, scala.Unit]): Pipeline = js.native
  def spop(key: KeyType, count: scala.Double): Pipeline = js.native
  def spop(
    key: KeyType,
    count: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ js.Any, scala.Unit]
  ): Pipeline = js.native
  def srandmember(key: KeyType): Pipeline = js.native
  def srandmember(key: KeyType, callback: js.Function2[/* err */ nodeLib.Error, /* res */ js.Any, scala.Unit]): Pipeline = js.native
  def srandmember(key: KeyType, count: scala.Double): Pipeline = js.native
  def srandmember(
    key: KeyType,
    count: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ js.Any, scala.Unit]
  ): Pipeline = js.native
  def srem(key: KeyType, members: js.Any*): Pipeline = js.native
  def sscan(key: KeyType, cursor: scala.Double, args: js.Any*): Pipeline = js.native
  def strlen(key: KeyType): Pipeline = js.native
  def strlen(key: KeyType, callback: js.Function2[/* err */ nodeLib.Error, /* res */ scala.Double, scala.Unit]): Pipeline = js.native
  def subscribe(channels: js.Any*): Pipeline = js.native
  def substr(key: KeyType, start: scala.Double, end: scala.Double): Pipeline = js.native
  def substr(
    key: KeyType,
    start: scala.Double,
    end: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ java.lang.String, scala.Unit]
  ): Pipeline = js.native
  def sunion(keys: KeyType*): Pipeline = js.native
  def sunionstore(destination: java.lang.String, keys: KeyType*): Pipeline = js.native
  def sync(): Pipeline = js.native
  def sync(callback: js.Function2[/* err */ nodeLib.Error, /* res */ js.Any, scala.Unit]): Pipeline = js.native
  def time(): Pipeline = js.native
  def time(callback: js.Function2[/* err */ nodeLib.Error, /* res */ js.Any, scala.Unit]): Pipeline = js.native
  def ttl(key: KeyType): Pipeline = js.native
  def ttl(key: KeyType, callback: js.Function2[/* err */ nodeLib.Error, /* res */ scala.Double, scala.Unit]): Pipeline = js.native
  def `type`(key: KeyType): Pipeline = js.native
  def `type`(
    key: KeyType,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ java.lang.String, scala.Unit]
  ): Pipeline = js.native
  def unsubscribe(channels: java.lang.String*): Pipeline = js.native
  def unwatch(): Pipeline = js.native
  def unwatch(callback: js.Function2[/* err */ nodeLib.Error, /* res */ java.lang.String, scala.Unit]): Pipeline = js.native
  def watch(keys: KeyType*): Pipeline = js.native
  def xack(key: KeyType, group: java.lang.String, ids: java.lang.String*): Pipeline = js.native
  def xadd(key: KeyType, id: java.lang.String, args: java.lang.String*): Pipeline = js.native
  def xclaim(
    key: KeyType,
    group: java.lang.String,
    consumer: java.lang.String,
    minIdleTime: scala.Double,
    id: java.lang.String,
    args: js.Any*
  ): Pipeline = js.native
  def xdel(key: KeyType, ids: java.lang.String*): Pipeline = js.native
  def xgroup(args: js.Any*): Pipeline = js.native
  def xinfo(args: js.Any*): Pipeline = js.native
  def xlen(key: KeyType): Pipeline = js.native
  def xpending(key: KeyType, group: java.lang.String, args: js.Any*): Pipeline = js.native
  def xrange(key: KeyType, start: java.lang.String, end: java.lang.String, args: js.Any*): Pipeline = js.native
  def xread(args: js.Any*): Pipeline = js.native
  @JSName("xreadgroup")
  def xreadgroup_GROUP(
    command: ioredisLib.ioredisLibStrings.GROUP,
    group: java.lang.String,
    consumer: java.lang.String,
    args: js.Any*
  ): Pipeline = js.native
  @JSName("xreadgroup")
  def xreadgroup_group(
    command: ioredisLib.ioredisLibStrings.group,
    group: java.lang.String,
    consumer: java.lang.String,
    args: js.Any*
  ): Pipeline = js.native
  def xrevrange(key: KeyType, end: java.lang.String, start: java.lang.String, args: js.Any*): Pipeline = js.native
  @JSName("xtrim")
  def xtrim_MAXLEN(key: KeyType, strategy: ioredisLib.ioredisLibStrings.MAXLEN, args: js.Any*): Pipeline = js.native
  @JSName("xtrim")
  def xtrim_maxlen(key: KeyType, strategy: ioredisLib.ioredisLibStrings.maxlen, args: js.Any*): Pipeline = js.native
  def zadd(key: KeyType, args: java.lang.String*): Pipeline = js.native
  def zcard(key: KeyType): Pipeline = js.native
  def zcard(key: KeyType, callback: js.Function2[/* err */ nodeLib.Error, /* res */ scala.Double, scala.Unit]): Pipeline = js.native
  def zcount(key: KeyType, min: java.lang.String, max: java.lang.String): Pipeline = js.native
  def zcount(
    key: KeyType,
    min: java.lang.String,
    max: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ scala.Double, scala.Unit]
  ): Pipeline = js.native
  def zcount(key: KeyType, min: java.lang.String, max: scala.Double): Pipeline = js.native
  def zcount(
    key: KeyType,
    min: java.lang.String,
    max: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ scala.Double, scala.Unit]
  ): Pipeline = js.native
  def zcount(key: KeyType, min: scala.Double, max: java.lang.String): Pipeline = js.native
  def zcount(
    key: KeyType,
    min: scala.Double,
    max: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ scala.Double, scala.Unit]
  ): Pipeline = js.native
  def zcount(key: KeyType, min: scala.Double, max: scala.Double): Pipeline = js.native
  def zcount(
    key: KeyType,
    min: scala.Double,
    max: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ scala.Double, scala.Unit]
  ): Pipeline = js.native
  def zincrby(key: KeyType, increment: scala.Double, member: java.lang.String): Pipeline = js.native
  def zincrby(
    key: KeyType,
    increment: scala.Double,
    member: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ js.Any, scala.Unit]
  ): Pipeline = js.native
  def zinterstore(destination: java.lang.String, numkeys: scala.Double, key: KeyType, args: java.lang.String*): Pipeline = js.native
  def zrange(key: KeyType, start: scala.Double, stop: scala.Double): Pipeline = js.native
  def zrange(
    key: KeyType,
    start: scala.Double,
    stop: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ js.Any, scala.Unit]
  ): Pipeline = js.native
  @JSName("zrange")
  def zrange_WITHSCORES(
    key: KeyType,
    start: scala.Double,
    stop: scala.Double,
    withScores: ioredisLib.ioredisLibStrings.WITHSCORES
  ): Pipeline = js.native
  @JSName("zrange")
  def zrange_WITHSCORES(
    key: KeyType,
    start: scala.Double,
    stop: scala.Double,
    withScores: ioredisLib.ioredisLibStrings.WITHSCORES,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ js.Any, scala.Unit]
  ): Pipeline = js.native
  def zrangebyscore(key: KeyType, min: java.lang.String, max: java.lang.String, args: java.lang.String*): Pipeline = js.native
  def zrangebyscore(key: KeyType, min: java.lang.String, max: scala.Double, args: java.lang.String*): Pipeline = js.native
  def zrangebyscore(key: KeyType, min: scala.Double, max: java.lang.String, args: java.lang.String*): Pipeline = js.native
  def zrangebyscore(key: KeyType, min: scala.Double, max: scala.Double, args: java.lang.String*): Pipeline = js.native
  def zrank(key: KeyType, member: java.lang.String): Pipeline = js.native
  def zrank(
    key: KeyType,
    member: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ scala.Double, scala.Unit]
  ): Pipeline = js.native
  def zrem(key: KeyType, members: js.Any*): Pipeline = js.native
  def zremrangebyrank(key: KeyType, start: scala.Double, stop: scala.Double): Pipeline = js.native
  def zremrangebyrank(
    key: KeyType,
    start: scala.Double,
    stop: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ js.Any, scala.Unit]
  ): Pipeline = js.native
  def zremrangebyscore(key: KeyType, min: java.lang.String, max: java.lang.String): Pipeline = js.native
  def zremrangebyscore(
    key: KeyType,
    min: java.lang.String,
    max: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ js.Any, scala.Unit]
  ): Pipeline = js.native
  def zremrangebyscore(key: KeyType, min: java.lang.String, max: scala.Double): Pipeline = js.native
  def zremrangebyscore(
    key: KeyType,
    min: java.lang.String,
    max: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ js.Any, scala.Unit]
  ): Pipeline = js.native
  def zremrangebyscore(key: KeyType, min: scala.Double, max: java.lang.String): Pipeline = js.native
  def zremrangebyscore(
    key: KeyType,
    min: scala.Double,
    max: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ js.Any, scala.Unit]
  ): Pipeline = js.native
  def zremrangebyscore(key: KeyType, min: scala.Double, max: scala.Double): Pipeline = js.native
  def zremrangebyscore(
    key: KeyType,
    min: scala.Double,
    max: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ js.Any, scala.Unit]
  ): Pipeline = js.native
  def zrevrange(key: KeyType, start: scala.Double, stop: scala.Double): Pipeline = js.native
  def zrevrange(
    key: KeyType,
    start: scala.Double,
    stop: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ js.Any, scala.Unit]
  ): Pipeline = js.native
  @JSName("zrevrange")
  def zrevrange_WITHSCORES(
    key: KeyType,
    start: scala.Double,
    stop: scala.Double,
    withScores: ioredisLib.ioredisLibStrings.WITHSCORES
  ): Pipeline = js.native
  @JSName("zrevrange")
  def zrevrange_WITHSCORES(
    key: KeyType,
    start: scala.Double,
    stop: scala.Double,
    withScores: ioredisLib.ioredisLibStrings.WITHSCORES,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ js.Any, scala.Unit]
  ): Pipeline = js.native
  def zrevrangebyscore(key: KeyType, max: java.lang.String, min: java.lang.String, args: java.lang.String*): Pipeline = js.native
  def zrevrangebyscore(key: KeyType, max: java.lang.String, min: scala.Double, args: java.lang.String*): Pipeline = js.native
  def zrevrangebyscore(key: KeyType, max: scala.Double, min: java.lang.String, args: java.lang.String*): Pipeline = js.native
  def zrevrangebyscore(key: KeyType, max: scala.Double, min: scala.Double, args: java.lang.String*): Pipeline = js.native
  def zrevrank(key: KeyType, member: java.lang.String): Pipeline = js.native
  def zrevrank(
    key: KeyType,
    member: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ scala.Double, scala.Unit]
  ): Pipeline = js.native
  def zscan(key: KeyType, cursor: scala.Double, args: js.Any*): Pipeline = js.native
  def zscore(key: KeyType, member: java.lang.String): Pipeline = js.native
  def zscore(
    key: KeyType,
    member: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ scala.Double, scala.Unit]
  ): Pipeline = js.native
  def zunionstore(destination: java.lang.String, numkeys: scala.Double, key: KeyType, args: java.lang.String*): Pipeline = js.native
}

