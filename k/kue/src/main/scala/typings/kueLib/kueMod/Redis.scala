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

object Redis {
  @scala.inline
  def apply(
    client: () => redisLib.redisMod.RedisClient,
    configureFactory: (js.Object, Queue) => scala.Unit,
    createClient: () => redisLib.redisMod.RedisClient,
    createClientFactory: js.Object => redisLib.redisMod.RedisClient,
    pubsubClient: () => redisLib.redisMod.RedisClient,
    reset: () => scala.Unit
  ): Redis = {
    val __obj = js.Dynamic.literal(client = js.Any.fromFunction0(client), configureFactory = js.Any.fromFunction2(configureFactory), createClient = js.Any.fromFunction0(createClient), createClientFactory = js.Any.fromFunction1(createClientFactory), pubsubClient = js.Any.fromFunction0(pubsubClient), reset = js.Any.fromFunction0(reset))
  
    __obj.asInstanceOf[Redis]
  }
}

