package typings.kue.mod

import typings.redis.mod.RedisClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Redis extends js.Object {
  def client(): RedisClient
  def configureFactory(options: js.Object, queue: Queue): Unit
  def createClient(): RedisClient
  def createClientFactory(options: js.Object): RedisClient
  def pubsubClient(): RedisClient
  def reset(): Unit
}

object Redis {
  @scala.inline
  def apply(
    client: () => RedisClient,
    configureFactory: (js.Object, Queue) => Unit,
    createClient: () => RedisClient,
    createClientFactory: js.Object => RedisClient,
    pubsubClient: () => RedisClient,
    reset: () => Unit
  ): Redis = {
    val __obj = js.Dynamic.literal(client = js.Any.fromFunction0(client), configureFactory = js.Any.fromFunction2(configureFactory), createClient = js.Any.fromFunction0(createClient), createClientFactory = js.Any.fromFunction1(createClientFactory), pubsubClient = js.Any.fromFunction0(pubsubClient), reset = js.Any.fromFunction0(reset))
  
    __obj.asInstanceOf[Redis]
  }
}

