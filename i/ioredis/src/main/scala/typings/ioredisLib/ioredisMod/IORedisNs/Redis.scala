package typings
package ioredisLib.ioredisMod.IORedisNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Redis
  extends nodeLib.NodeJSNs.EventEmitter
     with ioredisLib.ioredisMod.Commander {
  var Promise: stdLib.PromiseConstructor = js.native
  var status: java.lang.String = js.native
  def append(key: KeyType, value: js.Any): js.Promise[scala.Double] = js.native
  def append(
    key: KeyType,
    value: js.Any,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def auth(password: java.lang.String): js.Promise[java.lang.String] = js.native
  def auth(
    password: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def bgrewriteaof(): js.Promise[java.lang.String] = js.native
  def bgrewriteaof(callback: js.Function2[/* err */ nodeLib.Error, /* res */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def bgsave(): js.Promise[java.lang.String] = js.native
  def bgsave(callback: js.Function2[/* err */ nodeLib.Error, /* res */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def bitcount(key: KeyType): js.Promise[scala.Double] = js.native
  def bitcount(key: KeyType, callback: js.Function2[/* err */ nodeLib.Error, /* res */ scala.Double, scala.Unit]): scala.Unit = js.native
  def bitcount(key: KeyType, start: scala.Double, end: scala.Double): js.Promise[scala.Double] = js.native
  def bitcount(
    key: KeyType,
    start: scala.Double,
    end: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def blpop(keys: KeyType*): js.Any = js.native
  def brpop(keys: KeyType*): js.Any = js.native
  def brpoplpush(source: java.lang.String, destination: java.lang.String, timeout: scala.Double): js.Promise[_] = js.native
  def brpoplpush(
    source: java.lang.String,
    destination: java.lang.String,
    timeout: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def client(args: js.Any*): js.Any = js.native
  def cluster(args: js.Any*): js.Any = js.native
  def config(args: js.Any*): js.Any = js.native
  def connect(): js.Promise[_] = js.native
  def connect(callback: js.Function0[scala.Unit]): js.Promise[_] = js.native
  def dbsize(): js.Promise[scala.Double] = js.native
  def dbsize(callback: js.Function2[/* err */ nodeLib.Error, /* res */ scala.Double, scala.Unit]): scala.Unit = js.native
  def debug(args: js.Any*): js.Any = js.native
  def decr(key: KeyType): js.Promise[scala.Double] = js.native
  def decr(key: KeyType, callback: js.Function2[/* err */ nodeLib.Error, /* res */ scala.Double, scala.Unit]): scala.Unit = js.native
  def decrby(key: KeyType, decrement: scala.Double): js.Promise[scala.Double] = js.native
  def decrby(
    key: KeyType,
    decrement: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def del(keys: KeyType*): js.Promise[scala.Double] = js.native
  def discard(): js.Promise[_] = js.native
  def discard(callback: js.Function2[/* err */ nodeLib.Error, /* res */ js.Any, scala.Unit]): scala.Unit = js.native
  def disconnect(): scala.Unit = js.native
  def dump(key: KeyType): js.Promise[java.lang.String] = js.native
  def dump(
    key: KeyType,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def duplicate(): Redis = js.native
  def echo(message: java.lang.String): js.Promise[java.lang.String] = js.native
  def echo(
    message: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def eval(args: js.Any*): js.Any = js.native
  def evalsha(args: js.Any*): js.Any = js.native
  def exec(): js.Promise[_] = js.native
  def exec(callback: js.Function2[/* err */ nodeLib.Error, /* res */ js.Any, scala.Unit]): scala.Unit = js.native
  def exists(keys: KeyType*): js.Promise[scala.Double] = js.native
  def expire(key: KeyType, seconds: scala.Double): js.Promise[ioredisLib.ioredisLibNumbers.`0` | ioredisLib.ioredisLibNumbers.`1`] = js.native
  def expire(
    key: KeyType,
    seconds: scala.Double,
    callback: js.Function2[
      /* err */ nodeLib.Error, 
      /* res */ ioredisLib.ioredisLibNumbers.`0` | ioredisLib.ioredisLibNumbers.`1`, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def expireat(key: KeyType, timestamp: scala.Double): js.Promise[ioredisLib.ioredisLibNumbers.`0` | ioredisLib.ioredisLibNumbers.`1`] = js.native
  def expireat(
    key: KeyType,
    timestamp: scala.Double,
    callback: js.Function2[
      /* err */ nodeLib.Error, 
      /* res */ ioredisLib.ioredisLibNumbers.`0` | ioredisLib.ioredisLibNumbers.`1`, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def flushall(): js.Promise[java.lang.String] = js.native
  def flushall(callback: js.Function2[/* err */ nodeLib.Error, /* res */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def flushdb(): js.Promise[java.lang.String] = js.native
  def flushdb(callback: js.Function2[/* err */ nodeLib.Error, /* res */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def get(key: KeyType): js.Promise[java.lang.String | scala.Null] = js.native
  def get(
    key: KeyType,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ java.lang.String | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  def getBuffer(key: KeyType): js.Promise[nodeLib.Buffer] = js.native
  def getBuffer(
    key: KeyType,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def getbit(key: KeyType, offset: scala.Double): js.Promise[scala.Double] = js.native
  def getbit(
    key: KeyType,
    offset: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def getrange(key: KeyType, start: scala.Double, end: scala.Double): js.Promise[java.lang.String] = js.native
  def getrange(
    key: KeyType,
    start: scala.Double,
    end: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def getset(key: KeyType, value: js.Any): js.Promise[java.lang.String | scala.Null] = js.native
  def getset(
    key: KeyType,
    value: js.Any,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ java.lang.String | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  def hdel(key: KeyType, fields: java.lang.String*): js.Any = js.native
  def hexists(key: KeyType, field: java.lang.String): js.Promise[ioredisLib.ioredisLibNumbers.`0` | ioredisLib.ioredisLibNumbers.`1`] = js.native
  def hexists(
    key: KeyType,
    field: java.lang.String,
    callback: js.Function2[
      /* err */ nodeLib.Error, 
      /* res */ ioredisLib.ioredisLibNumbers.`0` | ioredisLib.ioredisLibNumbers.`1`, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def hget(key: KeyType, field: java.lang.String): js.Promise[java.lang.String | scala.Null] = js.native
  def hget(
    key: KeyType,
    field: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ java.lang.String | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  def hgetBuffer(key: KeyType, field: java.lang.String): js.Promise[nodeLib.Buffer] = js.native
  def hgetBuffer(
    key: KeyType,
    field: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def hgetall(key: KeyType): js.Promise[_] = js.native
  def hgetall(key: KeyType, callback: js.Function2[/* err */ nodeLib.Error, /* res */ js.Any, scala.Unit]): scala.Unit = js.native
  def hincrby(key: KeyType, field: java.lang.String, increment: scala.Double): js.Promise[scala.Double] = js.native
  def hincrby(
    key: KeyType,
    field: java.lang.String,
    increment: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def hincrbyfloat(key: KeyType, field: java.lang.String, increment: scala.Double): js.Promise[scala.Double] = js.native
  def hincrbyfloat(
    key: KeyType,
    field: java.lang.String,
    increment: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def hkeys(key: KeyType): js.Promise[_] = js.native
  def hkeys(key: KeyType, callback: js.Function2[/* err */ nodeLib.Error, /* res */ js.Any, scala.Unit]): scala.Unit = js.native
  def hlen(key: KeyType): js.Promise[scala.Double] = js.native
  def hlen(key: KeyType, callback: js.Function2[/* err */ nodeLib.Error, /* res */ scala.Double, scala.Unit]): scala.Unit = js.native
  def hmget(key: KeyType, fields: java.lang.String*): js.Any = js.native
  def hmset(key: KeyType, data: js.Any): js.Promise[ioredisLib.ioredisLibNumbers.`0` | ioredisLib.ioredisLibNumbers.`1`] = js.native
  def hmset(
    key: KeyType,
    data: js.Any,
    callback: js.Function2[
      /* err */ nodeLib.Error, 
      /* res */ ioredisLib.ioredisLibNumbers.`0` | ioredisLib.ioredisLibNumbers.`1`, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def hmset(key: KeyType, field: java.lang.String, value: js.Any, args: java.lang.String*): js.Promise[ioredisLib.ioredisLibNumbers.`0` | ioredisLib.ioredisLibNumbers.`1`] = js.native
  def hscan(key: KeyType, cursor: scala.Double, args: js.Any*): js.Any = js.native
  def hscanStream(key: KeyType): nodeLib.NodeJSNs.EventEmitter = js.native
  def hscanStream(key: KeyType, options: ScanStreamOption): nodeLib.NodeJSNs.EventEmitter = js.native
  def hset(key: KeyType, field: java.lang.String, value: js.Any): js.Promise[ioredisLib.ioredisLibNumbers.`0` | ioredisLib.ioredisLibNumbers.`1`] = js.native
  def hset(
    key: KeyType,
    field: java.lang.String,
    value: js.Any,
    callback: js.Function2[
      /* err */ nodeLib.Error, 
      /* res */ ioredisLib.ioredisLibNumbers.`0` | ioredisLib.ioredisLibNumbers.`1`, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def hsetBuffer(key: KeyType, field: java.lang.String, value: js.Any): js.Promise[nodeLib.Buffer] = js.native
  def hsetBuffer(
    key: KeyType,
    field: java.lang.String,
    value: js.Any,
    callback: js.Function2[
      /* err */ nodeLib.Error, 
      /* res */ ioredisLib.ioredisLibNumbers.`0` | ioredisLib.ioredisLibNumbers.`1`, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def hsetnx(key: KeyType, field: java.lang.String, value: js.Any): js.Promise[ioredisLib.ioredisLibNumbers.`0` | ioredisLib.ioredisLibNumbers.`1`] = js.native
  def hsetnx(
    key: KeyType,
    field: java.lang.String,
    value: js.Any,
    callback: js.Function2[
      /* err */ nodeLib.Error, 
      /* res */ ioredisLib.ioredisLibNumbers.`0` | ioredisLib.ioredisLibNumbers.`1`, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def hvals(key: KeyType): js.Promise[_] = js.native
  def hvals(key: KeyType, callback: js.Function2[/* err */ nodeLib.Error, /* res */ js.Any, scala.Unit]): scala.Unit = js.native
  def incr(key: KeyType): js.Promise[scala.Double] = js.native
  def incr(key: KeyType, callback: js.Function2[/* err */ nodeLib.Error, /* res */ scala.Double, scala.Unit]): scala.Unit = js.native
  def incrby(key: KeyType, increment: scala.Double): js.Promise[scala.Double] = js.native
  def incrby(
    key: KeyType,
    increment: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def incrbyfloat(key: KeyType, increment: scala.Double): js.Promise[scala.Double] = js.native
  def incrbyfloat(
    key: KeyType,
    increment: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def info(): js.Promise[java.lang.String] = js.native
  def info(callback: js.Function2[/* err */ nodeLib.Error, /* res */ js.Any, scala.Unit]): scala.Unit = js.native
  def info(section: java.lang.String): js.Promise[java.lang.String] = js.native
  def info(
    section: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def keys(pattern: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  def keys(
    pattern: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ js.Array[java.lang.String], scala.Unit]
  ): scala.Unit = js.native
  def lastsave(): js.Promise[scala.Double] = js.native
  def lastsave(callback: js.Function2[/* err */ nodeLib.Error, /* res */ scala.Double, scala.Unit]): scala.Unit = js.native
  def lindex(key: KeyType, index: scala.Double): js.Promise[java.lang.String] = js.native
  def lindex(
    key: KeyType,
    index: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  @JSName("linsert")
  def linsert_AFTER(
    key: KeyType,
    direction: ioredisLib.ioredisLibStrings.AFTER,
    pivot: java.lang.String,
    value: js.Any
  ): js.Promise[scala.Double] = js.native
  @JSName("linsert")
  def linsert_AFTER(
    key: KeyType,
    direction: ioredisLib.ioredisLibStrings.AFTER,
    pivot: java.lang.String,
    value: js.Any,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  @JSName("linsert")
  def linsert_BEFORE(
    key: KeyType,
    direction: ioredisLib.ioredisLibStrings.BEFORE,
    pivot: java.lang.String,
    value: js.Any
  ): js.Promise[scala.Double] = js.native
  @JSName("linsert")
  def linsert_BEFORE(
    key: KeyType,
    direction: ioredisLib.ioredisLibStrings.BEFORE,
    pivot: java.lang.String,
    value: js.Any,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def llen(key: KeyType): js.Promise[scala.Double] = js.native
  def llen(key: KeyType, callback: js.Function2[/* err */ nodeLib.Error, /* res */ scala.Double, scala.Unit]): scala.Unit = js.native
  def lpop(key: KeyType): js.Promise[java.lang.String] = js.native
  def lpop(
    key: KeyType,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def lpush(key: KeyType, values: js.Any*): js.Any = js.native
  def lpushx(key: KeyType, value: js.Any): js.Promise[scala.Double] = js.native
  def lpushx(
    key: KeyType,
    value: js.Any,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def lrange(key: KeyType, start: scala.Double, stop: scala.Double): js.Promise[_] = js.native
  def lrange(
    key: KeyType,
    start: scala.Double,
    stop: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def lrem(key: KeyType, count: scala.Double, value: js.Any): js.Promise[scala.Double] = js.native
  def lrem(
    key: KeyType,
    count: scala.Double,
    value: js.Any,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def lset(key: KeyType, index: scala.Double, value: js.Any): js.Promise[_] = js.native
  def lset(
    key: KeyType,
    index: scala.Double,
    value: js.Any,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def ltrim(key: KeyType, start: scala.Double, stop: scala.Double): js.Promise[_] = js.native
  def ltrim(
    key: KeyType,
    start: scala.Double,
    stop: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def mget(keys: KeyType*): js.Any = js.native
  def migrate(args: js.Any*): js.Any = js.native
  def monitor(): js.Promise[nodeLib.NodeJSNs.EventEmitter] = js.native
  def monitor(
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ nodeLib.NodeJSNs.EventEmitter, scala.Unit]
  ): scala.Unit = js.native
  def move(key: KeyType, db: java.lang.String): js.Promise[ioredisLib.ioredisLibNumbers.`0` | ioredisLib.ioredisLibNumbers.`1`] = js.native
  def move(
    key: KeyType,
    db: java.lang.String,
    callback: js.Function2[
      /* err */ nodeLib.Error, 
      /* res */ ioredisLib.ioredisLibNumbers.`0` | ioredisLib.ioredisLibNumbers.`1`, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def mset(key: KeyType, value: js.Any, args: java.lang.String*): js.Any = js.native
  def msetnx(key: KeyType, value: js.Any, args: java.lang.String*): js.Any = js.native
  def multi(): Pipeline = js.native
  def multi(commands: js.Array[js.Array[java.lang.String]]): Pipeline = js.native
  def multi(commands: js.Array[js.Array[java.lang.String]], options: MultiOptions): Pipeline = js.native
  def multi(options: ioredisLib.Anon_Pipeline): js.Promise[java.lang.String] = js.native
  def `object`(subcommand: java.lang.String, args: js.Any*): js.Any = js.native
  def persist(key: KeyType): js.Promise[ioredisLib.ioredisLibNumbers.`0` | ioredisLib.ioredisLibNumbers.`1`] = js.native
  def persist(
    key: KeyType,
    callback: js.Function2[
      /* err */ nodeLib.Error, 
      /* res */ ioredisLib.ioredisLibNumbers.`0` | ioredisLib.ioredisLibNumbers.`1`, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def pexpire(key: KeyType, milliseconds: scala.Double): js.Promise[ioredisLib.ioredisLibNumbers.`0` | ioredisLib.ioredisLibNumbers.`1`] = js.native
  def pexpire(
    key: KeyType,
    milliseconds: scala.Double,
    callback: js.Function2[
      /* err */ nodeLib.Error, 
      /* res */ ioredisLib.ioredisLibNumbers.`0` | ioredisLib.ioredisLibNumbers.`1`, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def pexpireat(key: KeyType, millisecondsTimestamp: scala.Double): js.Promise[ioredisLib.ioredisLibNumbers.`0` | ioredisLib.ioredisLibNumbers.`1`] = js.native
  def pexpireat(
    key: KeyType,
    millisecondsTimestamp: scala.Double,
    callback: js.Function2[
      /* err */ nodeLib.Error, 
      /* res */ ioredisLib.ioredisLibNumbers.`0` | ioredisLib.ioredisLibNumbers.`1`, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def pfadd(key: KeyType, elements: java.lang.String*): js.Any = js.native
  def pfcount(keys: KeyType*): js.Any = js.native
  def pfmerge(destkey: KeyType, sourcekeys: KeyType*): js.Any = js.native
  def ping(): js.Promise[java.lang.String] = js.native
  def ping(callback: js.Function2[/* err */ nodeLib.Error, /* res */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def ping(message: java.lang.String): js.Promise[java.lang.String] = js.native
  def ping(
    message: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def pipeline(): Pipeline = js.native
  def pipeline(commands: js.Array[js.Array[java.lang.String]]): Pipeline = js.native
  def psetex(key: KeyType, milliseconds: scala.Double, value: js.Any): js.Promise[_] = js.native
  def psetex(
    key: KeyType,
    milliseconds: scala.Double,
    value: js.Any,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def psubscribe(patterns: java.lang.String*): js.Any = js.native
  def publish(channel: java.lang.String, message: java.lang.String): js.Promise[scala.Double] = js.native
  def publish(
    channel: java.lang.String,
    message: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def punsubscribe(patterns: java.lang.String*): js.Any = js.native
  def quit(): js.Promise[java.lang.String] = js.native
  def quit(callback: js.Function2[/* err */ nodeLib.Error, /* res */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def randomkey(): js.Promise[java.lang.String] = js.native
  def randomkey(callback: js.Function2[/* err */ nodeLib.Error, /* res */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def rename(key: KeyType, newkey: KeyType): js.Promise[java.lang.String] = js.native
  def rename(
    key: KeyType,
    newkey: KeyType,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def renamenx(key: KeyType, newkey: KeyType): js.Promise[ioredisLib.ioredisLibNumbers.`0` | ioredisLib.ioredisLibNumbers.`1`] = js.native
  def renamenx(
    key: KeyType,
    newkey: KeyType,
    callback: js.Function2[
      /* err */ nodeLib.Error, 
      /* res */ ioredisLib.ioredisLibNumbers.`0` | ioredisLib.ioredisLibNumbers.`1`, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def restore(args: js.Any*): js.Any = js.native
  def rpop(key: KeyType): js.Promise[java.lang.String] = js.native
  def rpop(
    key: KeyType,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def rpoplpush(source: java.lang.String, destination: java.lang.String): js.Promise[java.lang.String] = js.native
  def rpoplpush(
    source: java.lang.String,
    destination: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def rpush(key: KeyType, values: js.Any*): js.Any = js.native
  def rpushx(key: KeyType, value: js.Any): js.Promise[scala.Double] = js.native
  def rpushx(
    key: KeyType,
    value: js.Any,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def sadd(key: KeyType, members: js.Any*): js.Any = js.native
  def save(): js.Promise[java.lang.String] = js.native
  def save(callback: js.Function2[/* err */ nodeLib.Error, /* res */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def scan(cursor: scala.Double): js.Promise[js.Tuple2[java.lang.String, js.Array[java.lang.String]]] = js.native
  def scan(
    cursor: scala.Double,
    countOption: ioredisLib.ioredisLibStrings.COUNT,
    count: scala.Double,
    matchOption: ioredisLib.ioredisLibStrings.MATCH,
    pattern: java.lang.String
  ): js.Promise[js.Tuple2[java.lang.String, js.Array[java.lang.String]]] = js.native
  def scan(
    cursor: scala.Double,
    countOption: ioredisLib.ioredisLibStrings.COUNT,
    count: scala.Double,
    matchOption: ioredisLib.ioredisLibStrings.`match`,
    pattern: java.lang.String
  ): js.Promise[js.Tuple2[java.lang.String, js.Array[java.lang.String]]] = js.native
  def scan(
    cursor: scala.Double,
    countOption: ioredisLib.ioredisLibStrings.count,
    count: scala.Double,
    matchOption: ioredisLib.ioredisLibStrings.MATCH,
    pattern: java.lang.String
  ): js.Promise[js.Tuple2[java.lang.String, js.Array[java.lang.String]]] = js.native
  def scan(
    cursor: scala.Double,
    countOption: ioredisLib.ioredisLibStrings.count,
    count: scala.Double,
    matchOption: ioredisLib.ioredisLibStrings.`match`,
    pattern: java.lang.String
  ): js.Promise[js.Tuple2[java.lang.String, js.Array[java.lang.String]]] = js.native
  def scan(
    cursor: scala.Double,
    matchOption: ioredisLib.ioredisLibStrings.MATCH,
    pattern: java.lang.String,
    countOption: ioredisLib.ioredisLibStrings.COUNT,
    count: scala.Double
  ): js.Promise[js.Tuple2[java.lang.String, js.Array[java.lang.String]]] = js.native
  def scan(
    cursor: scala.Double,
    matchOption: ioredisLib.ioredisLibStrings.MATCH,
    pattern: java.lang.String,
    countOption: ioredisLib.ioredisLibStrings.count,
    count: scala.Double
  ): js.Promise[js.Tuple2[java.lang.String, js.Array[java.lang.String]]] = js.native
  def scan(
    cursor: scala.Double,
    matchOption: ioredisLib.ioredisLibStrings.`match`,
    pattern: java.lang.String,
    countOption: ioredisLib.ioredisLibStrings.COUNT,
    count: scala.Double
  ): js.Promise[js.Tuple2[java.lang.String, js.Array[java.lang.String]]] = js.native
  def scan(
    cursor: scala.Double,
    matchOption: ioredisLib.ioredisLibStrings.`match`,
    pattern: java.lang.String,
    countOption: ioredisLib.ioredisLibStrings.count,
    count: scala.Double
  ): js.Promise[js.Tuple2[java.lang.String, js.Array[java.lang.String]]] = js.native
  def scanStream(): nodeLib.NodeJSNs.EventEmitter = js.native
  def scanStream(options: ScanStreamOption): nodeLib.NodeJSNs.EventEmitter = js.native
  @JSName("scan")
  def scan_COUNT(cursor: scala.Double, countOption: ioredisLib.ioredisLibStrings.COUNT, count: scala.Double): js.Promise[js.Tuple2[java.lang.String, js.Array[java.lang.String]]] = js.native
  @JSName("scan")
  def scan_MATCH(cursor: scala.Double, matchOption: ioredisLib.ioredisLibStrings.MATCH, pattern: java.lang.String): js.Promise[js.Tuple2[java.lang.String, js.Array[java.lang.String]]] = js.native
  @JSName("scan")
  def scan_count(cursor: scala.Double, countOption: ioredisLib.ioredisLibStrings.count, count: scala.Double): js.Promise[js.Tuple2[java.lang.String, js.Array[java.lang.String]]] = js.native
  @JSName("scan")
  def scan_match(cursor: scala.Double, matchOption: ioredisLib.ioredisLibStrings.`match`, pattern: java.lang.String): js.Promise[js.Tuple2[java.lang.String, js.Array[java.lang.String]]] = js.native
  def scard(key: KeyType): js.Promise[scala.Double] = js.native
  def scard(key: KeyType, callback: js.Function2[/* err */ nodeLib.Error, /* res */ scala.Double, scala.Unit]): scala.Unit = js.native
  def script(args: js.Any*): js.Any = js.native
  def sdiff(keys: KeyType*): js.Any = js.native
  def sdiffstore(destination: java.lang.String, keys: KeyType*): js.Any = js.native
  def select(index: scala.Double): js.Promise[java.lang.String] = js.native
  def select(
    index: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def send_command(command: java.lang.String, args: js.Any*): js.Any = js.native
  def set(key: KeyType, value: js.Any): js.Promise[java.lang.String] = js.native
  def set(
    key: KeyType,
    value: js.Any,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def set(key: KeyType, value: js.Any, expiryMode: java.lang.String): js.Promise[java.lang.String] = js.native
  def set(key: KeyType, value: js.Any, expiryMode: java.lang.String, time: java.lang.String): js.Promise[java.lang.String] = js.native
  def set(
    key: KeyType,
    value: js.Any,
    expiryMode: java.lang.String,
    time: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def set(
    key: KeyType,
    value: js.Any,
    expiryMode: java.lang.String,
    time: java.lang.String,
    setMode: java.lang.String
  ): js.Promise[java.lang.String] = js.native
  def set(
    key: KeyType,
    value: js.Any,
    expiryMode: java.lang.String,
    time: java.lang.String,
    setMode: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def set(
    key: KeyType,
    value: js.Any,
    expiryMode: java.lang.String,
    time: java.lang.String,
    setMode: scala.Double
  ): js.Promise[java.lang.String] = js.native
  def set(
    key: KeyType,
    value: js.Any,
    expiryMode: java.lang.String,
    time: java.lang.String,
    setMode: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def set(key: KeyType, value: js.Any, expiryMode: java.lang.String, time: scala.Double): js.Promise[java.lang.String] = js.native
  def set(
    key: KeyType,
    value: js.Any,
    expiryMode: java.lang.String,
    time: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def set(
    key: KeyType,
    value: js.Any,
    expiryMode: java.lang.String,
    time: scala.Double,
    setMode: java.lang.String
  ): js.Promise[java.lang.String] = js.native
  def set(
    key: KeyType,
    value: js.Any,
    expiryMode: java.lang.String,
    time: scala.Double,
    setMode: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def set(
    key: KeyType,
    value: js.Any,
    expiryMode: java.lang.String,
    time: scala.Double,
    setMode: scala.Double
  ): js.Promise[java.lang.String] = js.native
  def set(
    key: KeyType,
    value: js.Any,
    expiryMode: java.lang.String,
    time: scala.Double,
    setMode: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def set(key: KeyType, value: js.Any, expiryMode: js.Array[_]): js.Promise[java.lang.String] = js.native
  def set(key: KeyType, value: js.Any, expiryMode: js.Array[_], time: java.lang.String): js.Promise[java.lang.String] = js.native
  def set(
    key: KeyType,
    value: js.Any,
    expiryMode: js.Array[_],
    time: java.lang.String,
    setMode: java.lang.String
  ): js.Promise[java.lang.String] = js.native
  def set(
    key: KeyType,
    value: js.Any,
    expiryMode: js.Array[_],
    time: java.lang.String,
    setMode: scala.Double
  ): js.Promise[java.lang.String] = js.native
  def set(key: KeyType, value: js.Any, expiryMode: js.Array[_], time: scala.Double): js.Promise[java.lang.String] = js.native
  def set(
    key: KeyType,
    value: js.Any,
    expiryMode: js.Array[_],
    time: scala.Double,
    setMode: java.lang.String
  ): js.Promise[java.lang.String] = js.native
  def set(key: KeyType, value: js.Any, expiryMode: js.Array[_], time: scala.Double, setMode: scala.Double): js.Promise[java.lang.String] = js.native
  def set(
    key: KeyType,
    value: js.Any,
    setMode: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def set(
    key: KeyType,
    value: js.Any,
    setMode: js.Array[_],
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def setBuffer(key: KeyType, value: js.Any): js.Promise[nodeLib.Buffer] = js.native
  def setBuffer(
    key: KeyType,
    value: js.Any,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def setBuffer(key: KeyType, value: js.Any, expiryMode: java.lang.String): js.Promise[nodeLib.Buffer] = js.native
  def setBuffer(key: KeyType, value: js.Any, expiryMode: java.lang.String, time: java.lang.String): js.Promise[nodeLib.Buffer] = js.native
  def setBuffer(
    key: KeyType,
    value: js.Any,
    expiryMode: java.lang.String,
    time: java.lang.String,
    setMode: java.lang.String
  ): js.Promise[nodeLib.Buffer] = js.native
  def setBuffer(
    key: KeyType,
    value: js.Any,
    expiryMode: java.lang.String,
    time: java.lang.String,
    setMode: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def setBuffer(
    key: KeyType,
    value: js.Any,
    expiryMode: java.lang.String,
    time: java.lang.String,
    setMode: scala.Double
  ): js.Promise[nodeLib.Buffer] = js.native
  def setBuffer(
    key: KeyType,
    value: js.Any,
    expiryMode: java.lang.String,
    time: java.lang.String,
    setMode: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def setBuffer(key: KeyType, value: js.Any, expiryMode: java.lang.String, time: scala.Double): js.Promise[nodeLib.Buffer] = js.native
  def setBuffer(
    key: KeyType,
    value: js.Any,
    expiryMode: java.lang.String,
    time: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def setBuffer(
    key: KeyType,
    value: js.Any,
    expiryMode: java.lang.String,
    time: scala.Double,
    setMode: java.lang.String
  ): js.Promise[nodeLib.Buffer] = js.native
  def setBuffer(
    key: KeyType,
    value: js.Any,
    expiryMode: java.lang.String,
    time: scala.Double,
    setMode: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def setBuffer(
    key: KeyType,
    value: js.Any,
    expiryMode: java.lang.String,
    time: scala.Double,
    setMode: scala.Double
  ): js.Promise[nodeLib.Buffer] = js.native
  def setBuffer(
    key: KeyType,
    value: js.Any,
    expiryMode: java.lang.String,
    time: scala.Double,
    setMode: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def setBuffer(key: KeyType, value: js.Any, expiryMode: js.Array[_]): js.Promise[nodeLib.Buffer] = js.native
  def setBuffer(key: KeyType, value: js.Any, expiryMode: js.Array[_], time: java.lang.String): js.Promise[nodeLib.Buffer] = js.native
  def setBuffer(
    key: KeyType,
    value: js.Any,
    expiryMode: js.Array[_],
    time: java.lang.String,
    setMode: java.lang.String
  ): js.Promise[nodeLib.Buffer] = js.native
  def setBuffer(
    key: KeyType,
    value: js.Any,
    expiryMode: js.Array[_],
    time: java.lang.String,
    setMode: scala.Double
  ): js.Promise[nodeLib.Buffer] = js.native
  def setBuffer(key: KeyType, value: js.Any, expiryMode: js.Array[_], time: scala.Double): js.Promise[nodeLib.Buffer] = js.native
  def setBuffer(
    key: KeyType,
    value: js.Any,
    expiryMode: js.Array[_],
    time: scala.Double,
    setMode: java.lang.String
  ): js.Promise[nodeLib.Buffer] = js.native
  def setBuffer(key: KeyType, value: js.Any, expiryMode: js.Array[_], time: scala.Double, setMode: scala.Double): js.Promise[nodeLib.Buffer] = js.native
  def setBuffer(
    key: KeyType,
    value: js.Any,
    setMode: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def setbit(key: KeyType, offset: scala.Double, value: js.Any): js.Promise[scala.Double] = js.native
  def setbit(
    key: KeyType,
    offset: scala.Double,
    value: js.Any,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def setex(key: KeyType, seconds: scala.Double, value: js.Any): js.Promise[_] = js.native
  def setex(
    key: KeyType,
    seconds: scala.Double,
    value: js.Any,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def setnx(key: KeyType, value: js.Any): js.Promise[_] = js.native
  def setnx(
    key: KeyType,
    value: js.Any,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def setrange(key: KeyType, offset: scala.Double, value: js.Any): js.Promise[scala.Double] = js.native
  def setrange(
    key: KeyType,
    offset: scala.Double,
    value: js.Any,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  @JSName("shutdown")
  def shutdown_NOSAVE(save: ioredisLib.ioredisLibStrings.NOSAVE): js.Promise[_] = js.native
  @JSName("shutdown")
  def shutdown_NOSAVE(
    save: ioredisLib.ioredisLibStrings.NOSAVE,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  @JSName("shutdown")
  def shutdown_SAVE(save: ioredisLib.ioredisLibStrings.SAVE): js.Promise[_] = js.native
  @JSName("shutdown")
  def shutdown_SAVE(
    save: ioredisLib.ioredisLibStrings.SAVE,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def sinter(keys: KeyType*): js.Any = js.native
  def sinterstore(destination: java.lang.String, keys: KeyType*): js.Any = js.native
  def sismember(key: KeyType, member: java.lang.String): js.Promise[ioredisLib.ioredisLibNumbers.`1` | ioredisLib.ioredisLibNumbers.`0`] = js.native
  def sismember(
    key: KeyType,
    member: java.lang.String,
    callback: js.Function2[
      /* err */ nodeLib.Error, 
      /* res */ ioredisLib.ioredisLibNumbers.`1` | ioredisLib.ioredisLibNumbers.`0`, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def slaveof(host: java.lang.String, port: scala.Double): js.Promise[java.lang.String] = js.native
  def slaveof(
    host: java.lang.String,
    port: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def smembers(key: KeyType): js.Promise[_] = js.native
  def smembers(key: KeyType, callback: js.Function2[/* err */ nodeLib.Error, /* res */ js.Any, scala.Unit]): scala.Unit = js.native
  def smove(source: java.lang.String, destination: java.lang.String, member: java.lang.String): js.Promise[java.lang.String] = js.native
  def smove(
    source: java.lang.String,
    destination: java.lang.String,
    member: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def sort(key: KeyType, args: java.lang.String*): js.Any = js.native
  def spop(key: KeyType): js.Promise[_] = js.native
  def spop(key: KeyType, callback: js.Function2[/* err */ nodeLib.Error, /* res */ js.Any, scala.Unit]): scala.Unit = js.native
  def spop(key: KeyType, count: scala.Double): js.Promise[_] = js.native
  def spop(
    key: KeyType,
    count: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def srandmember(key: KeyType): js.Promise[_] = js.native
  def srandmember(key: KeyType, callback: js.Function2[/* err */ nodeLib.Error, /* res */ js.Any, scala.Unit]): scala.Unit = js.native
  def srandmember(key: KeyType, count: scala.Double): js.Promise[_] = js.native
  def srandmember(
    key: KeyType,
    count: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def srem(key: KeyType, members: js.Any*): js.Any = js.native
  def sscan(key: KeyType, cursor: scala.Double, args: js.Any*): js.Any = js.native
  def sscanStream(key: KeyType): nodeLib.NodeJSNs.EventEmitter = js.native
  def sscanStream(key: KeyType, options: ScanStreamOption): nodeLib.NodeJSNs.EventEmitter = js.native
  def strlen(key: KeyType): js.Promise[scala.Double] = js.native
  def strlen(key: KeyType, callback: js.Function2[/* err */ nodeLib.Error, /* res */ scala.Double, scala.Unit]): scala.Unit = js.native
  def subscribe(channels: js.Any*): js.Any = js.native
  def substr(key: KeyType, start: scala.Double, end: scala.Double): js.Promise[java.lang.String] = js.native
  def substr(
    key: KeyType,
    start: scala.Double,
    end: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def sunion(keys: KeyType*): js.Any = js.native
  def sunionstore(destination: java.lang.String, keys: KeyType*): js.Any = js.native
  def sync(): js.Promise[_] = js.native
  def sync(callback: js.Function2[/* err */ nodeLib.Error, /* res */ js.Any, scala.Unit]): scala.Unit = js.native
  def time(): js.Promise[_] = js.native
  def time(callback: js.Function2[/* err */ nodeLib.Error, /* res */ js.Any, scala.Unit]): scala.Unit = js.native
  def ttl(key: KeyType): js.Promise[scala.Double] = js.native
  def ttl(key: KeyType, callback: js.Function2[/* err */ nodeLib.Error, /* res */ scala.Double, scala.Unit]): scala.Unit = js.native
  def `type`(key: KeyType): js.Promise[java.lang.String] = js.native
  def `type`(
    key: KeyType,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def unsubscribe(channels: java.lang.String*): js.Any = js.native
  def unwatch(): js.Promise[java.lang.String] = js.native
  def unwatch(callback: js.Function2[/* err */ nodeLib.Error, /* res */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def watch(keys: KeyType*): js.Any = js.native
  def xack(key: KeyType, group: java.lang.String, ids: java.lang.String*): js.Any = js.native
  def xadd(key: KeyType, id: java.lang.String, args: java.lang.String*): js.Any = js.native
  def xclaim(
    key: KeyType,
    group: java.lang.String,
    consumer: java.lang.String,
    minIdleTime: scala.Double,
    args: js.Any*
  ): js.Any = js.native
  def xdel(key: KeyType, ids: java.lang.String*): js.Any = js.native
  def xgroup(args: js.Any*): js.Any = js.native
  def xinfo(args: js.Any*): js.Any = js.native
  def xlen(key: KeyType): js.Any = js.native
  def xpending(key: KeyType, group: java.lang.String, args: js.Any*): js.Any = js.native
  def xrange(key: KeyType, start: java.lang.String, end: java.lang.String, args: js.Any*): js.Any = js.native
  def xread(args: js.Any*): js.Any = js.native
  @JSName("xreadgroup")
  def xreadgroup_GROUP(
    groupOption: ioredisLib.ioredisLibStrings.GROUP,
    group: java.lang.String,
    consumer: java.lang.String,
    args: js.Any*
  ): js.Any = js.native
  @JSName("xreadgroup")
  def xreadgroup_group(
    groupOption: ioredisLib.ioredisLibStrings.group,
    group: java.lang.String,
    consumer: java.lang.String,
    args: js.Any*
  ): js.Any = js.native
  def xrevrange(key: KeyType, end: java.lang.String, start: java.lang.String, args: js.Any*): js.Any = js.native
  @JSName("xtrim")
  def xtrim_MAXLEN(key: KeyType, maxLenOption: ioredisLib.ioredisLibStrings.MAXLEN, args: js.Any*): js.Any = js.native
  @JSName("xtrim")
  def xtrim_maxlen(key: KeyType, maxLenOption: ioredisLib.ioredisLibStrings.maxlen, args: js.Any*): js.Any = js.native
  def zadd(key: KeyType, args: java.lang.String*): js.Promise[scala.Double | java.lang.String] = js.native
  def zcard(key: KeyType): js.Promise[scala.Double] = js.native
  def zcard(key: KeyType, callback: js.Function2[/* err */ nodeLib.Error, /* res */ scala.Double, scala.Unit]): scala.Unit = js.native
  def zcount(key: KeyType, min: java.lang.String, max: java.lang.String): js.Promise[scala.Double] = js.native
  def zcount(
    key: KeyType,
    min: java.lang.String,
    max: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def zcount(key: KeyType, min: java.lang.String, max: scala.Double): js.Promise[scala.Double] = js.native
  def zcount(
    key: KeyType,
    min: java.lang.String,
    max: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def zcount(key: KeyType, min: scala.Double, max: java.lang.String): js.Promise[scala.Double] = js.native
  def zcount(
    key: KeyType,
    min: scala.Double,
    max: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def zcount(key: KeyType, min: scala.Double, max: scala.Double): js.Promise[scala.Double] = js.native
  def zcount(
    key: KeyType,
    min: scala.Double,
    max: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def zincrby(key: KeyType, increment: scala.Double, member: java.lang.String): js.Promise[_] = js.native
  def zincrby(
    key: KeyType,
    increment: scala.Double,
    member: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def zinterstore(destination: java.lang.String, numkeys: scala.Double, key: KeyType, args: java.lang.String*): js.Any = js.native
  def zrange(key: KeyType, start: scala.Double, stop: scala.Double): js.Promise[_] = js.native
  def zrange(
    key: KeyType,
    start: scala.Double,
    stop: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  @JSName("zrange")
  def zrange_WITHSCORES(
    key: KeyType,
    start: scala.Double,
    stop: scala.Double,
    withScores: ioredisLib.ioredisLibStrings.WITHSCORES
  ): js.Promise[_] = js.native
  @JSName("zrange")
  def zrange_WITHSCORES(
    key: KeyType,
    start: scala.Double,
    stop: scala.Double,
    withScores: ioredisLib.ioredisLibStrings.WITHSCORES,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def zrangebyscore(key: KeyType, min: java.lang.String, max: java.lang.String, args: java.lang.String*): js.Any = js.native
  def zrangebyscore(key: KeyType, min: java.lang.String, max: scala.Double, args: java.lang.String*): js.Any = js.native
  def zrangebyscore(key: KeyType, min: scala.Double, max: java.lang.String, args: java.lang.String*): js.Any = js.native
  def zrangebyscore(key: KeyType, min: scala.Double, max: scala.Double, args: java.lang.String*): js.Any = js.native
  def zrank(key: KeyType, member: java.lang.String): js.Promise[scala.Double] = js.native
  def zrank(
    key: KeyType,
    member: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def zrem(key: KeyType, members: js.Any*): js.Any = js.native
  def zremrangebyrank(key: KeyType, start: scala.Double, stop: scala.Double): js.Promise[_] = js.native
  def zremrangebyrank(
    key: KeyType,
    start: scala.Double,
    stop: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def zremrangebyscore(key: KeyType, min: java.lang.String, max: java.lang.String): js.Promise[_] = js.native
  def zremrangebyscore(
    key: KeyType,
    min: java.lang.String,
    max: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def zremrangebyscore(key: KeyType, min: java.lang.String, max: scala.Double): js.Promise[_] = js.native
  def zremrangebyscore(
    key: KeyType,
    min: java.lang.String,
    max: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def zremrangebyscore(key: KeyType, min: scala.Double, max: java.lang.String): js.Promise[_] = js.native
  def zremrangebyscore(
    key: KeyType,
    min: scala.Double,
    max: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def zremrangebyscore(key: KeyType, min: scala.Double, max: scala.Double): js.Promise[_] = js.native
  def zremrangebyscore(
    key: KeyType,
    min: scala.Double,
    max: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def zrevrange(key: KeyType, start: scala.Double, stop: scala.Double): js.Promise[_] = js.native
  def zrevrange(
    key: KeyType,
    start: scala.Double,
    stop: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  @JSName("zrevrange")
  def zrevrange_WITHSCORES(
    key: KeyType,
    start: scala.Double,
    stop: scala.Double,
    withScores: ioredisLib.ioredisLibStrings.WITHSCORES
  ): js.Promise[_] = js.native
  @JSName("zrevrange")
  def zrevrange_WITHSCORES(
    key: KeyType,
    start: scala.Double,
    stop: scala.Double,
    withScores: ioredisLib.ioredisLibStrings.WITHSCORES,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def zrevrangebyscore(key: KeyType, max: java.lang.String, min: java.lang.String, args: java.lang.String*): js.Any = js.native
  def zrevrangebyscore(key: KeyType, max: java.lang.String, min: scala.Double, args: java.lang.String*): js.Any = js.native
  def zrevrangebyscore(key: KeyType, max: scala.Double, min: java.lang.String, args: java.lang.String*): js.Any = js.native
  def zrevrangebyscore(key: KeyType, max: scala.Double, min: scala.Double, args: java.lang.String*): js.Any = js.native
  def zrevrank(key: KeyType, member: java.lang.String): js.Promise[scala.Double] = js.native
  def zrevrank(
    key: KeyType,
    member: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def zscan(key: KeyType, cursor: scala.Double, args: js.Any*): js.Any = js.native
  def zscanStream(key: KeyType): nodeLib.NodeJSNs.EventEmitter = js.native
  def zscanStream(key: KeyType, options: ScanStreamOption): nodeLib.NodeJSNs.EventEmitter = js.native
  def zscore(key: KeyType, member: java.lang.String): js.Promise[java.lang.String] = js.native
  def zscore(
    key: KeyType,
    member: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error, /* res */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def zunionstore(destination: java.lang.String, numkeys: scala.Double, key: KeyType, args: java.lang.String*): js.Any = js.native
}

