package typings
package kueLib.kueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Redis extends js.Object {
  def client(): redisLib.redisMod.RedisClient
  def configureFactory(options: js.Object, queue: Queue): scala.Unit
  def createClient(): redisLib.redisMod.RedisClient
  def createClientFactory(options: js.Object): redisLib.redisMod.RedisClient
  def pubsubClient(): redisLib.redisMod.RedisClient
  def reset(): scala.Unit
}

