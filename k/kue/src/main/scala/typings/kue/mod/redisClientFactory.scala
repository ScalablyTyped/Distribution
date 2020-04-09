package typings.kue.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.redis.mod.ClientOpts
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kue", "redisClientFactory")
@js.native
object redisClientFactory extends js.Object {
  @js.native
  class AbortError ()
    extends typings.redis.mod.RedisError
  
  @js.native
  class AggregateError ()
    extends typings.redis.mod.RedisError
  
  @js.native
  class ParserError ()
    extends typings.redis.mod.ParserError
  
  @js.native
  class RedisError ()
    extends typings.redis.mod.RedisError
  
  @js.native
  class ReplyError ()
    extends typings.redis.mod.RedisError
  
  val Multi: Instantiable0[typings.redis.mod.Multi] = js.native
  val RedisClient: Instantiable1[/* options */ ClientOpts, typings.redis.mod.RedisClient] = js.native
  @JSName("debug_mode")
  var debugMode: Boolean = js.native
  def createClient(): typings.redis.mod.RedisClient = js.native
  def createClient(options: ClientOpts): typings.redis.mod.RedisClient = js.native
  def createClient(port: Double): typings.redis.mod.RedisClient = js.native
  def createClient(port: Double, host: String): typings.redis.mod.RedisClient = js.native
  def createClient(port: Double, host: String, options: ClientOpts): typings.redis.mod.RedisClient = js.native
  def createClient(unix_socket: String): typings.redis.mod.RedisClient = js.native
  def createClient(unix_socket: String, options: ClientOpts): typings.redis.mod.RedisClient = js.native
  def print(err: Null, reply: js.Any): Unit = js.native
  def print(err: Error, reply: js.Any): Unit = js.native
}

