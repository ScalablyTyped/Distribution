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
    client: js.Function0[redisLib.redisMod.RedisClient],
    configureFactory: js.Function2[js.Object, Queue, scala.Unit],
    createClient: js.Function0[redisLib.redisMod.RedisClient],
    createClientFactory: js.Function1[js.Object, redisLib.redisMod.RedisClient],
    pubsubClient: js.Function0[redisLib.redisMod.RedisClient],
    reset: js.Function0[scala.Unit]
  ): Redis = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("client")(client)
    __obj.updateDynamic("configureFactory")(configureFactory)
    __obj.updateDynamic("createClient")(createClient)
    __obj.updateDynamic("createClientFactory")(createClientFactory)
    __obj.updateDynamic("pubsubClient")(pubsubClient)
    __obj.updateDynamic("reset")(reset)
    __obj.asInstanceOf[Redis]
  }
}

