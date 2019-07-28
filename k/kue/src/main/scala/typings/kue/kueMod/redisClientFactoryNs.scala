package typings.kue.kueMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.redis.redisMod.ClientOpts
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kue", "redisClientFactory")
@js.native
object redisClientFactoryNs extends js.Object {
  @js.native
  class AbortError ()
    extends typings.redis.redisMod.AbortError
  
  @js.native
  class AggregateError ()
    extends typings.redis.redisMod.AggregateError
  
  @js.native
  class ParserError ()
    extends typings.redis.redisMod.ParserError
  
  @js.native
  class RedisError ()
    extends typings.redis.redisMod.RedisError
  
  @js.native
  class ReplyError ()
    extends typings.redis.redisMod.ReplyError
  
  val Multi: Instantiable0[typings.redis.redisMod.Multi] = js.native
  val RedisClient: Instantiable1[/* options */ ClientOpts, typings.redis.redisMod.RedisClient] = js.native
  var debug_mode: Boolean = js.native
  def createClient(): typings.redis.redisMod.RedisClient = js.native
  def createClient(options: ClientOpts): typings.redis.redisMod.RedisClient = js.native
  def createClient(port: Double): typings.redis.redisMod.RedisClient = js.native
  def createClient(port: Double, host: String): typings.redis.redisMod.RedisClient = js.native
  def createClient(port: Double, host: String, options: ClientOpts): typings.redis.redisMod.RedisClient = js.native
  def createClient(unix_socket: String): typings.redis.redisMod.RedisClient = js.native
  def createClient(unix_socket: String, options: ClientOpts): typings.redis.redisMod.RedisClient = js.native
  def print(err: Null, reply: js.Any): Unit = js.native
  def print(err: Error, reply: js.Any): Unit = js.native
}

