package typings.ioredis.mod

import typings.ioredis.ioredisStrings.AFTER
import typings.ioredis.ioredisStrings.BEFORE
import typings.ioredis.ioredisStrings.COUNT
import typings.ioredis.ioredisStrings.GROUP
import typings.ioredis.ioredisStrings.LIMIT
import typings.ioredis.ioredisStrings.MATCH
import typings.ioredis.ioredisStrings.MAXLEN
import typings.ioredis.ioredisStrings.NOSAVE
import typings.ioredis.ioredisStrings.SAVE
import typings.ioredis.ioredisStrings.USAGE
import typings.ioredis.ioredisStrings.WITHSCORES
import typings.ioredis.ioredisStrings.count_
import typings.ioredis.ioredisStrings.group_
import typings.ioredis.ioredisStrings.match_
import typings.ioredis.ioredisStrings.maxlen_
import typings.node.Buffer
import typings.node.eventsMod.EventEmitter
import typings.std.Error
import typings.std.Map
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pipeline extends StObject {
  
  def append(key: KeyType, value: ValueType): Pipeline = js.native
  def append(key: KeyType, value: ValueType, callback: Callback[Double]): Pipeline = js.native
  
  def auth(password: String): Pipeline = js.native
  def auth(password: String, callback: Callback[String]): Pipeline = js.native
  def auth(username: String, password: String): Pipeline = js.native
  def auth(username: String, password: String, callback: Callback[String]): Pipeline = js.native
  
  def bgrewriteaof(): Pipeline = js.native
  def bgrewriteaof(callback: Callback[String]): Pipeline = js.native
  
  def bgsave(): Pipeline = js.native
  def bgsave(callback: Callback[String]): Pipeline = js.native
  
  def bitcount(key: KeyType): Pipeline = js.native
  def bitcount(key: KeyType, callback: Callback[Double]): Pipeline = js.native
  def bitcount(key: KeyType, start: Double, end: Double): Pipeline = js.native
  def bitcount(key: KeyType, start: Double, end: Double, callback: Callback[Double]): Pipeline = js.native
  
  def blpop(keys: KeyType*): Pipeline = js.native
  
  def brpop(keys: KeyType*): Pipeline = js.native
  
  def brpoplpush(source: String, destination: String, timeout: Double): Pipeline = js.native
  def brpoplpush(source: String, destination: String, timeout: Double, callback: Callback[String]): Pipeline = js.native
  
  def bzpopmax(args: (String | Double | (Callback[js.Tuple3[String, String, String]]))*): Pipeline = js.native
  
  def bzpopmin(args: (String | Double | (Callback[js.Tuple3[String, String, String]]))*): Pipeline = js.native
  
  def client(args: ValueType*): Pipeline = js.native
  
  def cluster(args: ValueType*): Pipeline = js.native
  
  def config(args: ValueType*): Pipeline = js.native
  
  def dbsize(): Pipeline = js.native
  def dbsize(callback: Callback[Double]): Pipeline = js.native
  
  def debug(args: ValueType*): Pipeline = js.native
  
  def decr(key: KeyType): Pipeline = js.native
  def decr(key: KeyType, callback: Callback[Double]): Pipeline = js.native
  
  def decrby(key: KeyType, decrement: Double): Pipeline = js.native
  def decrby(key: KeyType, decrement: Double, callback: Callback[Double]): Pipeline = js.native
  
  def del(keys: KeyType*): Pipeline = js.native
  
  def discard(): Pipeline = js.native
  def discard(callback: Callback[js.Any]): Pipeline = js.native
  
  def dump(key: KeyType): Pipeline = js.native
  def dump(key: KeyType, callback: Callback[String]): Pipeline = js.native
  
  def echo(message: String): Pipeline = js.native
  def echo(message: String, callback: Callback[String]): Pipeline = js.native
  
  def eval(script: String, numKeys: Double, args: ValueType*): Pipeline = js.native
  
  def evalsha(scriptSha: String, numKeys: String, args: ValueType*): Pipeline = js.native
  
  def exec(): js.Promise[js.Array[js.Tuple2[Error | Null, js.Any]]] = js.native
  def exec(callback: Callback[js.Array[js.Tuple2[Error | Null, js.Any]]]): js.Promise[js.Array[js.Tuple2[Error | Null, js.Any]]] = js.native
  
  def exists(keys: KeyType*): Pipeline = js.native
  
  def expire(key: KeyType, seconds: Double): Pipeline = js.native
  def expire(key: KeyType, seconds: Double, callback: Callback[BooleanResponse]): Pipeline = js.native
  
  def expireat(key: KeyType, timestamp: Double): Pipeline = js.native
  def expireat(key: KeyType, timestamp: Double, callback: Callback[BooleanResponse]): Pipeline = js.native
  
  def flushall(): Pipeline = js.native
  def flushall(callback: Callback[String]): Pipeline = js.native
  
  def flushdb(): Pipeline = js.native
  def flushdb(callback: Callback[String]): Pipeline = js.native
  
  def get(key: KeyType): Pipeline = js.native
  def get(key: KeyType, callback: Callback[String]): Pipeline = js.native
  
  def getBuffer(key: KeyType): Pipeline = js.native
  def getBuffer(key: KeyType, callback: Callback[Buffer]): Pipeline = js.native
  
  def getbit(key: KeyType, offset: Double): Pipeline = js.native
  def getbit(key: KeyType, offset: Double, callback: Callback[Double]): Pipeline = js.native
  
  def getrange(key: KeyType, start: Double, end: Double): Pipeline = js.native
  def getrange(key: KeyType, start: Double, end: Double, callback: Callback[String]): Pipeline = js.native
  
  def getrangeBuffer(key: KeyType, start: Double, end: Double): Pipeline = js.native
  def getrangeBuffer(key: KeyType, start: Double, end: Double, callback: Callback[Buffer]): Pipeline = js.native
  
  def getset(key: KeyType, value: ValueType): Pipeline = js.native
  def getset(key: KeyType, value: ValueType, callback: Callback[String]): Pipeline = js.native
  
  def hdel(key: KeyType, fields: String*): Pipeline = js.native
  
  def hexists(key: KeyType, field: String): Pipeline = js.native
  def hexists(key: KeyType, field: String, callback: Callback[BooleanResponse]): Pipeline = js.native
  
  def hget(key: KeyType, field: String): Pipeline = js.native
  def hget(key: KeyType, field: String, callback: Callback[String]): Pipeline = js.native
  
  def hgetBuffer(key: KeyType, field: String): Pipeline = js.native
  def hgetBuffer(key: KeyType, field: String, callback: Callback[Buffer]): Pipeline = js.native
  
  def hgetall(key: KeyType): Pipeline = js.native
  def hgetall(key: KeyType, callback: Callback[Record[String, String]]): Pipeline = js.native
  
  def hincrby(key: KeyType, field: String, increment: Double): Pipeline = js.native
  def hincrby(key: KeyType, field: String, increment: Double, callback: Callback[Double]): Pipeline = js.native
  
  def hincrbyfloat(key: KeyType, field: String, increment: Double): Pipeline = js.native
  def hincrbyfloat(key: KeyType, field: String, increment: Double, callback: Callback[Double]): Pipeline = js.native
  
  def hkeys(key: KeyType): Pipeline = js.native
  def hkeys(key: KeyType, callback: Callback[js.Array[String]]): Pipeline = js.native
  
  def hlen(key: KeyType): Pipeline = js.native
  def hlen(key: KeyType, callback: Callback[Double]): Pipeline = js.native
  
  def hmget(key: KeyType, fields: String*): Pipeline = js.native
  
  def hmset(key: KeyType, args: ValueType*): Pipeline = js.native
  def hmset(key: KeyType, data: js.Object): Pipeline = js.native
  def hmset(key: KeyType, data: js.Object, callback: Callback[BooleanResponse]): Pipeline = js.native
  def hmset(key: KeyType, data: Map[String, js.Any]): Pipeline = js.native
  def hmset(key: KeyType, data: Map[String, js.Any], callback: Callback[BooleanResponse]): Pipeline = js.native
  
  def hscan(key: KeyType, cursor: String, args: ValueType*): Pipeline = js.native
  def hscan(key: KeyType, cursor: Double, args: ValueType*): Pipeline = js.native
  
  def hset(key: KeyType, args: ValueType*): Pipeline = js.native
  def hset(key: KeyType, data: js.Object): Pipeline = js.native
  def hset(key: KeyType, data: js.Object, callback: Callback[BooleanResponse]): Pipeline = js.native
  def hset(key: KeyType, data: Map[String, js.Any]): Pipeline = js.native
  def hset(key: KeyType, data: Map[String, js.Any], callback: Callback[BooleanResponse]): Pipeline = js.native
  def hset(key: KeyType, field: String, value: ValueType): Pipeline = js.native
  def hset(key: KeyType, field: String, value: ValueType, callback: Callback[BooleanResponse]): Pipeline = js.native
  
  def hsetBuffer(key: KeyType, field: String, value: ValueType): Pipeline = js.native
  def hsetBuffer(key: KeyType, field: String, value: ValueType, callback: Callback[Buffer]): Pipeline = js.native
  
  def hsetnx(key: KeyType, field: String, value: ValueType): Pipeline = js.native
  def hsetnx(key: KeyType, field: String, value: ValueType, callback: Callback[BooleanResponse]): Pipeline = js.native
  
  def hstrlen(key: KeyType, field: String): Pipeline = js.native
  def hstrlen(key: KeyType, field: String, callback: Callback[Double]): Pipeline = js.native
  
  def hvals(key: KeyType): Pipeline = js.native
  def hvals(key: KeyType, callback: Callback[js.Array[String]]): Pipeline = js.native
  
  def incr(key: KeyType): Pipeline = js.native
  def incr(key: KeyType, callback: Callback[Double]): Pipeline = js.native
  
  def incrby(key: KeyType, increment: Double): Pipeline = js.native
  def incrby(key: KeyType, increment: Double, callback: Callback[Double]): Pipeline = js.native
  
  def incrbyfloat(key: KeyType, increment: Double): Pipeline = js.native
  def incrbyfloat(key: KeyType, increment: Double, callback: Callback[Double]): Pipeline = js.native
  
  def info(): Pipeline = js.native
  def info(callback: Callback[String]): Pipeline = js.native
  def info(section: String): Pipeline = js.native
  def info(section: String, callback: Callback[String]): Pipeline = js.native
  
  val isCluster: Boolean = js.native
  
  def keys(pattern: String): Pipeline = js.native
  def keys(pattern: String, callback: Callback[js.Array[String]]): Pipeline = js.native
  
  def lastsave(): Pipeline = js.native
  def lastsave(callback: Callback[Double]): Pipeline = js.native
  
  val length: Double = js.native
  
  def lindex(key: KeyType, index: Double): Pipeline = js.native
  def lindex(key: KeyType, index: Double, callback: Callback[String]): Pipeline = js.native
  
  @JSName("linsert")
  def linsert_AFTER(key: KeyType, direction: AFTER, pivot: String, value: ValueType): Pipeline = js.native
  @JSName("linsert")
  def linsert_AFTER(key: KeyType, direction: AFTER, pivot: String, value: ValueType, callback: Callback[Double]): Pipeline = js.native
  @JSName("linsert")
  def linsert_BEFORE(key: KeyType, direction: BEFORE, pivot: String, value: ValueType): Pipeline = js.native
  @JSName("linsert")
  def linsert_BEFORE(key: KeyType, direction: BEFORE, pivot: String, value: ValueType, callback: Callback[Double]): Pipeline = js.native
  
  def llen(key: KeyType): Pipeline = js.native
  def llen(key: KeyType, callback: Callback[Double]): Pipeline = js.native
  
  def lpop(key: KeyType): Pipeline = js.native
  def lpop(key: KeyType, callback: Callback[String]): Pipeline = js.native
  
  def lpopBuffer(key: KeyType): Pipeline = js.native
  def lpopBuffer(key: KeyType, callback: Callback[Buffer]): Pipeline = js.native
  
  def lpush(key: KeyType, values: ValueType*): Pipeline = js.native
  
  def lpushx(key: KeyType, value: ValueType): Pipeline = js.native
  def lpushx(key: KeyType, value: ValueType, callback: Callback[Double]): Pipeline = js.native
  
  def lrange(key: KeyType, start: Double, stop: Double): Pipeline = js.native
  def lrange(key: KeyType, start: Double, stop: Double, callback: Callback[js.Array[String]]): Pipeline = js.native
  
  def lrangeBuffer(key: KeyType, start: Double, stop: Double): Pipeline = js.native
  def lrangeBuffer(key: KeyType, start: Double, stop: Double, callback: Callback[js.Array[Buffer]]): Pipeline = js.native
  
  def lrem(key: KeyType, count: Double, value: ValueType): Pipeline = js.native
  def lrem(key: KeyType, count: Double, value: ValueType, callback: Callback[Double]): Pipeline = js.native
  
  def lset(key: KeyType, index: Double, value: ValueType): Pipeline = js.native
  def lset(key: KeyType, index: Double, value: ValueType, callback: Callback[Ok]): Pipeline = js.native
  
  def ltrim(key: KeyType, start: Double, stop: Double): Pipeline = js.native
  def ltrim(key: KeyType, start: Double, stop: Double, callback: Callback[Ok]): Pipeline = js.native
  
  @JSName("memory")
  def memory_USAGE(argument: USAGE, key: KeyType): Pipeline = js.native
  @JSName("memory")
  def memory_USAGE(argument: USAGE, key: KeyType, callback: Callback[Double]): Pipeline = js.native
  
  def mget(keys: KeyType*): Pipeline = js.native
  
  def migrate(args: ValueType*): Pipeline = js.native
  
  def monitor(): Pipeline = js.native
  def monitor(callback: Callback[EventEmitter]): Pipeline = js.native
  
  def move(key: KeyType, db: String): Pipeline = js.native
  def move(key: KeyType, db: String, callback: Callback[BooleanResponse]): Pipeline = js.native
  
  def mset(args: ValueType*): Pipeline = js.native
  def mset(data: js.Object): Pipeline = js.native
  def mset(data: js.Object, callback: Callback[String]): Pipeline = js.native
  def mset(data: Map[String, js.Any]): Pipeline = js.native
  def mset(data: Map[String, js.Any], callback: Callback[String]): Pipeline = js.native
  
  def msetnx(args: ValueType*): Pipeline = js.native
  def msetnx(data: js.Object): Pipeline = js.native
  def msetnx(data: js.Object, callback: Callback[BooleanResponse]): Pipeline = js.native
  def msetnx(data: Map[String, js.Any]): Pipeline = js.native
  def msetnx(data: Map[String, js.Any], callback: Callback[BooleanResponse]): Pipeline = js.native
  
  def multi(): Pipeline = js.native
  def multi(callback: Callback[String]): Pipeline = js.native
  
  def `object`(subcommand: String, args: ValueType*): Pipeline = js.native
  
  val options: RedisOptions | ClusterOptions = js.native
  
  def persist(key: KeyType): Pipeline = js.native
  def persist(key: KeyType, callback: Callback[BooleanResponse]): Pipeline = js.native
  
  def pexpire(key: KeyType, milliseconds: Double): Pipeline = js.native
  def pexpire(key: KeyType, milliseconds: Double, callback: Callback[BooleanResponse]): Pipeline = js.native
  
  def pexpireat(key: KeyType, millisecondsTimestamp: Double): Pipeline = js.native
  def pexpireat(key: KeyType, millisecondsTimestamp: Double, callback: Callback[BooleanResponse]): Pipeline = js.native
  
  def pfadd(key: KeyType, elements: String*): Pipeline = js.native
  
  def pfcount(keys: KeyType*): Pipeline = js.native
  
  def pfmerge(destkey: KeyType, sourcekeys: KeyType*): Pipeline = js.native
  
  def ping(): Pipeline = js.native
  def ping(callback: Callback[String]): Pipeline = js.native
  def ping(message: String): Pipeline = js.native
  def ping(message: String, callback: Callback[String]): Pipeline = js.native
  
  def psetex(key: KeyType, milliseconds: Double, value: ValueType): Pipeline = js.native
  def psetex(key: KeyType, milliseconds: Double, value: ValueType, callback: Callback[Ok]): Pipeline = js.native
  
  def psubscribe(patterns: String*): Pipeline = js.native
  
  def pttl(key: KeyType): Pipeline = js.native
  def pttl(key: KeyType, callback: Callback[Double]): Pipeline = js.native
  
  def publish(channel: String, message: String): Pipeline = js.native
  def publish(channel: String, message: String, callback: Callback[Double]): Pipeline = js.native
  
  def punsubscribe(patterns: String*): Pipeline = js.native
  
  def quit(): Pipeline = js.native
  def quit(callback: Callback[String]): Pipeline = js.native
  
  def randomkey(): Pipeline = js.native
  def randomkey(callback: Callback[String]): Pipeline = js.native
  
  val redis: Redis | Cluster = js.native
  
  def rename(key: KeyType, newkey: KeyType): Pipeline = js.native
  def rename(key: KeyType, newkey: KeyType, callback: Callback[String]): Pipeline = js.native
  
  def renamenx(key: KeyType, newkey: KeyType): Pipeline = js.native
  def renamenx(key: KeyType, newkey: KeyType, callback: Callback[BooleanResponse]): Pipeline = js.native
  
  def restore(args: ValueType*): Pipeline = js.native
  
  def rpop(key: KeyType): Pipeline = js.native
  def rpop(key: KeyType, callback: Callback[String]): Pipeline = js.native
  
  def rpoplpush(source: String, destination: String): Pipeline = js.native
  def rpoplpush(source: String, destination: String, callback: Callback[String]): Pipeline = js.native
  
  def rpush(key: KeyType, values: ValueType*): Pipeline = js.native
  
  def rpushBuffer(key: String, values: Buffer*): Pipeline = js.native
  
  def rpushx(key: KeyType, value: ValueType): Pipeline = js.native
  def rpushx(key: KeyType, value: ValueType, callback: Callback[Double]): Pipeline = js.native
  
  def sadd(key: KeyType, members: ValueType*): Pipeline = js.native
  
  def save(): Pipeline = js.native
  def save(callback: Callback[String]): Pipeline = js.native
  
  def scan(cursor: String): Pipeline = js.native
  def scan(cursor: String, countOption: COUNT, count: Double, matchOption: MATCH, pattern: String): Pipeline = js.native
  def scan(cursor: String, countOption: COUNT, count: Double, matchOption: match_, pattern: String): Pipeline = js.native
  def scan(cursor: String, countOption: count_, count: Double, matchOption: MATCH, pattern: String): Pipeline = js.native
  def scan(cursor: String, countOption: count_, count: Double, matchOption: match_, pattern: String): Pipeline = js.native
  def scan(cursor: String, matchOption: MATCH, pattern: String, countOption: COUNT, count: Double): Pipeline = js.native
  def scan(cursor: String, matchOption: MATCH, pattern: String, countOption: count_, count: Double): Pipeline = js.native
  def scan(cursor: String, matchOption: match_, pattern: String, countOption: COUNT, count: Double): Pipeline = js.native
  def scan(cursor: String, matchOption: match_, pattern: String, countOption: count_, count: Double): Pipeline = js.native
  def scan(cursor: Double): Pipeline = js.native
  def scan(cursor: Double, countOption: COUNT, count: Double, matchOption: MATCH, pattern: String): Pipeline = js.native
  def scan(cursor: Double, countOption: COUNT, count: Double, matchOption: match_, pattern: String): Pipeline = js.native
  def scan(cursor: Double, countOption: count_, count: Double, matchOption: MATCH, pattern: String): Pipeline = js.native
  def scan(cursor: Double, countOption: count_, count: Double, matchOption: match_, pattern: String): Pipeline = js.native
  def scan(cursor: Double, matchOption: MATCH, pattern: String, countOption: COUNT, count: Double): Pipeline = js.native
  def scan(cursor: Double, matchOption: MATCH, pattern: String, countOption: count_, count: Double): Pipeline = js.native
  def scan(cursor: Double, matchOption: match_, pattern: String, countOption: COUNT, count: Double): Pipeline = js.native
  def scan(cursor: Double, matchOption: match_, pattern: String, countOption: count_, count: Double): Pipeline = js.native
  @JSName("scan")
  def scan_COUNT(cursor: String, countOption: COUNT, count: Double): Pipeline = js.native
  @JSName("scan")
  def scan_COUNT(cursor: Double, countOption: COUNT, count: Double): Pipeline = js.native
  @JSName("scan")
  def scan_MATCH(cursor: String, matchOption: MATCH, pattern: String): Pipeline = js.native
  @JSName("scan")
  def scan_MATCH(cursor: Double, matchOption: MATCH, pattern: String): Pipeline = js.native
  @JSName("scan")
  def scan_count(cursor: String, countOption: count_, count: Double): Pipeline = js.native
  @JSName("scan")
  def scan_count(cursor: Double, countOption: count_, count: Double): Pipeline = js.native
  @JSName("scan")
  def scan_match(cursor: String, matchOption: match_, pattern: String): Pipeline = js.native
  @JSName("scan")
  def scan_match(cursor: Double, matchOption: match_, pattern: String): Pipeline = js.native
  
  def scard(key: KeyType): Pipeline = js.native
  def scard(key: KeyType, callback: Callback[Double]): Pipeline = js.native
  
  def script(args: ValueType*): Pipeline = js.native
  
  def sdiff(keys: KeyType*): Pipeline = js.native
  
  def sdiffstore(destination: String, keys: KeyType*): Pipeline = js.native
  
  def select(index: Double): Pipeline = js.native
  def select(index: Double, callback: Callback[String]): Pipeline = js.native
  
  def set(key: KeyType, value: ValueType): Pipeline = js.native
  def set(key: KeyType, value: ValueType, callback: Callback[String]): Pipeline = js.native
  def set(key: KeyType, value: ValueType, expiryMode: String, time: Double): Pipeline = js.native
  def set(key: KeyType, value: ValueType, expiryMode: String, time: Double, callback: Callback[String]): Pipeline = js.native
  def set(key: KeyType, value: ValueType, expiryMode: String, time: Double, setMode: String): Pipeline = js.native
  def set(
    key: KeyType,
    value: ValueType,
    expiryMode: String,
    time: Double,
    setMode: String,
    callback: Callback[String]
  ): Pipeline = js.native
  def set(key: KeyType, value: ValueType, setMode: String): Pipeline = js.native
  def set(key: KeyType, value: ValueType, setMode: String, callback: Callback[String]): Pipeline = js.native
  
  def setBuffer(key: KeyType, value: ValueType): Pipeline = js.native
  def setBuffer(key: KeyType, value: ValueType, callback: Callback[Buffer]): Pipeline = js.native
  def setBuffer(key: KeyType, value: ValueType, expiryMode: String, time: Double): Pipeline = js.native
  def setBuffer(key: KeyType, value: ValueType, expiryMode: String, time: Double, callback: Callback[Buffer]): Pipeline = js.native
  def setBuffer(key: KeyType, value: ValueType, expiryMode: String, time: Double, setMode: String): Pipeline = js.native
  def setBuffer(
    key: KeyType,
    value: ValueType,
    expiryMode: String,
    time: Double,
    setMode: String,
    callback: Callback[Buffer]
  ): Pipeline = js.native
  def setBuffer(key: KeyType, value: ValueType, setMode: String): Pipeline = js.native
  def setBuffer(key: KeyType, value: ValueType, setMode: String, callback: Callback[Buffer]): Pipeline = js.native
  
  def setbit(key: KeyType, offset: Double, value: ValueType): Pipeline = js.native
  def setbit(key: KeyType, offset: Double, value: ValueType, callback: Callback[Double]): Pipeline = js.native
  
  def setex(key: KeyType, seconds: Double, value: ValueType): Pipeline = js.native
  def setex(key: KeyType, seconds: Double, value: ValueType, callback: Callback[Ok]): Pipeline = js.native
  
  def setnx(key: KeyType, value: ValueType): Pipeline = js.native
  def setnx(key: KeyType, value: ValueType, callback: Callback[BooleanResponse]): Pipeline = js.native
  
  def setrange(key: KeyType, offset: Double, value: ValueType): Pipeline = js.native
  def setrange(key: KeyType, offset: Double, value: ValueType, callback: Callback[Double]): Pipeline = js.native
  
  @JSName("shutdown")
  def shutdown_NOSAVE(save: NOSAVE): Pipeline = js.native
  @JSName("shutdown")
  def shutdown_NOSAVE(save: NOSAVE, callback: Callback[scala.Nothing]): Pipeline = js.native
  @JSName("shutdown")
  def shutdown_SAVE(save: SAVE): Pipeline = js.native
  @JSName("shutdown")
  def shutdown_SAVE(save: SAVE, callback: Callback[scala.Nothing]): Pipeline = js.native
  
  def sinter(keys: KeyType*): Pipeline = js.native
  
  def sinterstore(destination: String, keys: KeyType*): Pipeline = js.native
  
  def sismember(key: KeyType, member: String): Pipeline = js.native
  def sismember(key: KeyType, member: String, callback: Callback[BooleanResponse]): Pipeline = js.native
  
  def slaveof(host: String, port: Double): Pipeline = js.native
  def slaveof(host: String, port: Double, callback: Callback[String]): Pipeline = js.native
  
  def smembers(key: KeyType): Pipeline = js.native
  def smembers(key: KeyType, callback: Callback[js.Array[String]]): Pipeline = js.native
  
  def smove(source: String, destination: String, member: String): Pipeline = js.native
  def smove(source: String, destination: String, member: String, callback: Callback[String]): Pipeline = js.native
  
  def sort(key: KeyType, args: String*): Pipeline = js.native
  
  def spop(key: KeyType): Pipeline = js.native
  def spop(key: KeyType, callback: Callback[String | Null]): Pipeline = js.native
  def spop(key: KeyType, count: Double): Pipeline = js.native
  def spop(key: KeyType, count: Double, callback: Callback[js.Array[String]]): Pipeline = js.native
  
  def srandmember(key: KeyType): Pipeline = js.native
  def srandmember(key: KeyType, callback: Callback[String | Null]): Pipeline = js.native
  def srandmember(key: KeyType, count: Double): Pipeline = js.native
  def srandmember(key: KeyType, count: Double, callback: Callback[js.Array[String]]): Pipeline = js.native
  
  def srem(key: KeyType, members: ValueType*): Pipeline = js.native
  
  def sscan(key: KeyType, cursor: String, args: ValueType*): Pipeline = js.native
  def sscan(key: KeyType, cursor: Double, args: ValueType*): Pipeline = js.native
  
  def strlen(key: KeyType): Pipeline = js.native
  def strlen(key: KeyType, callback: Callback[Double]): Pipeline = js.native
  
  def subscribe(channels: ValueType*): Pipeline = js.native
  
  def substr(key: KeyType, start: Double, end: Double): Pipeline = js.native
  def substr(key: KeyType, start: Double, end: Double, callback: Callback[String]): Pipeline = js.native
  
  def sunion(keys: KeyType*): Pipeline = js.native
  
  def sunionstore(destination: String, keys: KeyType*): Pipeline = js.native
  
  def sync(): Pipeline = js.native
  def sync(callback: Callback[js.Any]): Pipeline = js.native
  
  def time(): Pipeline = js.native
  def time(callback: Callback[js.Tuple2[String, String]]): Pipeline = js.native
  
  def ttl(key: KeyType): Pipeline = js.native
  def ttl(key: KeyType, callback: Callback[Double]): Pipeline = js.native
  
  def `type`(key: KeyType): Pipeline = js.native
  def `type`(key: KeyType, callback: Callback[String]): Pipeline = js.native
  
  def unlink(keys: KeyType*): Pipeline = js.native
  
  def unsubscribe(channels: String*): Pipeline = js.native
  
  def unwatch(): Pipeline = js.native
  def unwatch(callback: Callback[String]): Pipeline = js.native
  
  def watch(keys: KeyType*): Pipeline = js.native
  
  def xack(key: KeyType, group: String, ids: String*): Pipeline = js.native
  
  def xadd(key: KeyType, id: String, args: String*): Pipeline = js.native
  
  def xclaim(key: KeyType, group: String, consumer: String, minIdleTime: Double, id: String, args: ValueType*): Pipeline = js.native
  
  def xdel(key: KeyType, ids: String*): Pipeline = js.native
  
  def xgroup(args: ValueType*): Pipeline = js.native
  
  def xinfo(args: ValueType*): Pipeline = js.native
  
  def xlen(key: KeyType): Pipeline = js.native
  
  def xpending(key: KeyType, group: String, args: ValueType*): Pipeline = js.native
  
  def xrange(key: KeyType, start: String, end: String, args: ValueType*): Pipeline = js.native
  
  def xread(args: ValueType*): Pipeline = js.native
  
  @JSName("xreadgroup")
  def xreadgroup_GROUP(command: GROUP, group: String, consumer: String, args: ValueType*): Pipeline = js.native
  @JSName("xreadgroup")
  def xreadgroup_group(command: group_, group: String, consumer: String, args: ValueType*): Pipeline = js.native
  
  def xrevrange(key: KeyType, end: String, start: String, args: ValueType*): Pipeline = js.native
  
  @JSName("xtrim")
  def xtrim_MAXLEN(key: KeyType, strategy: MAXLEN, args: ValueType*): Pipeline = js.native
  @JSName("xtrim")
  def xtrim_maxlen(key: KeyType, strategy: maxlen_, args: ValueType*): Pipeline = js.native
  
  def zadd(key: KeyType, args: String*): Pipeline = js.native
  
  def zcard(key: KeyType): Pipeline = js.native
  def zcard(key: KeyType, callback: Callback[Double]): Pipeline = js.native
  
  def zcount(key: KeyType, min: String, max: String): Pipeline = js.native
  def zcount(key: KeyType, min: String, max: String, callback: Callback[Double]): Pipeline = js.native
  def zcount(key: KeyType, min: String, max: Double): Pipeline = js.native
  def zcount(key: KeyType, min: String, max: Double, callback: Callback[Double]): Pipeline = js.native
  def zcount(key: KeyType, min: Double, max: String): Pipeline = js.native
  def zcount(key: KeyType, min: Double, max: String, callback: Callback[Double]): Pipeline = js.native
  def zcount(key: KeyType, min: Double, max: Double): Pipeline = js.native
  def zcount(key: KeyType, min: Double, max: Double, callback: Callback[Double]): Pipeline = js.native
  
  def zincrby(key: KeyType, increment: Double, member: String): Pipeline = js.native
  def zincrby(key: KeyType, increment: Double, member: String, callback: Callback[String]): Pipeline = js.native
  
  def zinterstore(destination: String, numkeys: Double, key: KeyType, args: String*): Pipeline = js.native
  
  def zpopmax(key: KeyType, count: Double): Pipeline = js.native
  def zpopmax(key: KeyType, count: Double, callback: Callback[js.Array[String]]): Pipeline = js.native
  
  def zpopmin(key: KeyType, count: Double): Pipeline = js.native
  def zpopmin(key: KeyType, count: Double, callback: Callback[js.Array[String]]): Pipeline = js.native
  
  def zrange(key: KeyType, start: Double, stop: Double): Pipeline = js.native
  def zrange(key: KeyType, start: Double, stop: Double, callback: Callback[js.Array[String]]): Pipeline = js.native
  @JSName("zrange")
  def zrange_WITHSCORES(key: KeyType, start: Double, stop: Double, withScores: WITHSCORES): Pipeline = js.native
  @JSName("zrange")
  def zrange_WITHSCORES(
    key: KeyType,
    start: Double,
    stop: Double,
    withScores: WITHSCORES,
    callback: Callback[js.Array[String]]
  ): Pipeline = js.native
  
  def zrangebylex(key: KeyType, min: String, max: String): Pipeline = js.native
  def zrangebylex(key: KeyType, min: String, max: String, callback: Callback[js.Array[String]]): Pipeline = js.native
  @JSName("zrangebylex")
  def zrangebylex_LIMIT(key: KeyType, min: String, max: String, limit: LIMIT, offset: Double, count: Double): Pipeline = js.native
  @JSName("zrangebylex")
  def zrangebylex_LIMIT(
    key: KeyType,
    min: String,
    max: String,
    limit: LIMIT,
    offset: Double,
    count: Double,
    callback: Callback[js.Array[String]]
  ): Pipeline = js.native
  
  def zrangebyscore(key: KeyType, min: String, max: String, args: String*): Pipeline = js.native
  def zrangebyscore(key: KeyType, min: String, max: Double, args: String*): Pipeline = js.native
  def zrangebyscore(key: KeyType, min: Double, max: String, args: String*): Pipeline = js.native
  def zrangebyscore(key: KeyType, min: Double, max: Double, args: String*): Pipeline = js.native
  
  def zrank(key: KeyType, member: String): Pipeline = js.native
  def zrank(key: KeyType, member: String, callback: Callback[Double]): Pipeline = js.native
  
  def zrem(key: KeyType, members: ValueType*): Pipeline = js.native
  
  def zremrangebylex(key: KeyType, min: String, max: String): Pipeline = js.native
  def zremrangebylex(key: KeyType, min: String, max: String, callback: Callback[Double]): Pipeline = js.native
  
  def zremrangebyrank(key: KeyType, start: Double, stop: Double): Pipeline = js.native
  def zremrangebyrank(key: KeyType, start: Double, stop: Double, callback: Callback[Double]): Pipeline = js.native
  
  def zremrangebyscore(key: KeyType, min: String, max: String): Pipeline = js.native
  def zremrangebyscore(key: KeyType, min: String, max: String, callback: Callback[Double]): Pipeline = js.native
  def zremrangebyscore(key: KeyType, min: String, max: Double): Pipeline = js.native
  def zremrangebyscore(key: KeyType, min: String, max: Double, callback: Callback[Double]): Pipeline = js.native
  def zremrangebyscore(key: KeyType, min: Double, max: String): Pipeline = js.native
  def zremrangebyscore(key: KeyType, min: Double, max: String, callback: Callback[Double]): Pipeline = js.native
  def zremrangebyscore(key: KeyType, min: Double, max: Double): Pipeline = js.native
  def zremrangebyscore(key: KeyType, min: Double, max: Double, callback: Callback[Double]): Pipeline = js.native
  
  def zrevrange(key: KeyType, start: Double, stop: Double): Pipeline = js.native
  def zrevrange(key: KeyType, start: Double, stop: Double, callback: Callback[js.Array[String]]): Pipeline = js.native
  @JSName("zrevrange")
  def zrevrange_WITHSCORES(key: KeyType, start: Double, stop: Double, withScores: WITHSCORES): Pipeline = js.native
  @JSName("zrevrange")
  def zrevrange_WITHSCORES(
    key: KeyType,
    start: Double,
    stop: Double,
    withScores: WITHSCORES,
    callback: Callback[js.Array[String]]
  ): Pipeline = js.native
  
  def zrevrangebylex(key: KeyType, min: String, max: String): Pipeline = js.native
  def zrevrangebylex(key: KeyType, min: String, max: String, callback: Callback[js.Array[String]]): Pipeline = js.native
  @JSName("zrevrangebylex")
  def zrevrangebylex_LIMIT(key: KeyType, min: String, max: String, limit: LIMIT, offset: Double, count: Double): Pipeline = js.native
  @JSName("zrevrangebylex")
  def zrevrangebylex_LIMIT(
    key: KeyType,
    min: String,
    max: String,
    limit: LIMIT,
    offset: Double,
    count: Double,
    callback: Callback[js.Array[String]]
  ): Pipeline = js.native
  
  def zrevrangebyscore(key: KeyType, max: String, min: String, args: String*): Pipeline = js.native
  def zrevrangebyscore(key: KeyType, max: String, min: Double, args: String*): Pipeline = js.native
  def zrevrangebyscore(key: KeyType, max: Double, min: String, args: String*): Pipeline = js.native
  def zrevrangebyscore(key: KeyType, max: Double, min: Double, args: String*): Pipeline = js.native
  
  def zrevrank(key: KeyType, member: String): Pipeline = js.native
  def zrevrank(key: KeyType, member: String, callback: Callback[Double]): Pipeline = js.native
  
  def zscan(key: KeyType, cursor: String, args: ValueType*): Pipeline = js.native
  def zscan(key: KeyType, cursor: Double, args: ValueType*): Pipeline = js.native
  
  def zscore(key: KeyType, member: String): Pipeline = js.native
  def zscore(key: KeyType, member: String, callback: Callback[Double]): Pipeline = js.native
  
  def zunionstore(destination: String, numkeys: Double, key: KeyType, args: String*): Pipeline = js.native
}
