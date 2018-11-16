package typings
package kueLib.kueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kue", "redisClientFactory")
@js.native
object redisClientFactoryNs extends js.Object {
  val Multi: redisLib.Anon_Multi = js.native
  val RedisClient: redisLib.Anon_Options = js.native
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

