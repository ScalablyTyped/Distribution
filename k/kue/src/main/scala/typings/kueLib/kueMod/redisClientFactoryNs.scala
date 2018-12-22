package typings
package kueLib.kueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kue", "redisClientFactory")
@js.native
object redisClientFactoryNs extends js.Object {
  @js.native
  class AbortError ()
    extends redisLib.redisMod.AbortError
  
  @js.native
  class AggregateError ()
    extends redisLib.redisMod.AggregateError
  
  @js.native
  class ParserError ()
    extends redisLib.redisMod.ParserError
  
  @js.native
  class RedisError ()
    extends redisLib.redisMod.RedisError
  
  @js.native
  class ReplyError ()
    extends redisLib.redisMod.ReplyError
  
  val Multi: org.scalablytyped.runtime.Instantiable0[redisLib.redisMod.Multi] = js.native
  val RedisClient: org.scalablytyped.runtime.Instantiable1[/* options */ redisLib.redisMod.ClientOpts, redisLib.redisMod.RedisClient] = js.native
  var debug_mode: scala.Boolean = js.native
  def createClient(): redisLib.redisMod.RedisClient = js.native
  def createClient(options: redisLib.redisMod.ClientOpts): redisLib.redisMod.RedisClient = js.native
  def createClient(port: scala.Double): redisLib.redisMod.RedisClient = js.native
  def createClient(port: scala.Double, host: java.lang.String): redisLib.redisMod.RedisClient = js.native
  def createClient(port: scala.Double, host: java.lang.String, options: redisLib.redisMod.ClientOpts): redisLib.redisMod.RedisClient = js.native
  def createClient(unix_socket: java.lang.String): redisLib.redisMod.RedisClient = js.native
  def createClient(unix_socket: java.lang.String, options: redisLib.redisMod.ClientOpts): redisLib.redisMod.RedisClient = js.native
  def print(err: nodeLib.Error, reply: js.Any): scala.Unit = js.native
  def print(err: scala.Null, reply: js.Any): scala.Unit = js.native
}

