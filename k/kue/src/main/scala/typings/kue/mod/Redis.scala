package typings.kue.mod

import typings.redis.mod.RedisClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Redis extends js.Object {
  def client(): RedisClient = js.native
  def configureFactory(options: js.Object, queue: Queue): Unit = js.native
  def createClient(): RedisClient = js.native
  def createClientFactory(options: js.Object): RedisClient = js.native
  def pubsubClient(): RedisClient = js.native
  def reset(): Unit = js.native
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
  @scala.inline
  implicit class RedisOps[Self <: Redis] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClient(value: () => RedisClient): Self = this.set("client", js.Any.fromFunction0(value))
    @scala.inline
    def setConfigureFactory(value: (js.Object, Queue) => Unit): Self = this.set("configureFactory", js.Any.fromFunction2(value))
    @scala.inline
    def setCreateClient(value: () => RedisClient): Self = this.set("createClient", js.Any.fromFunction0(value))
    @scala.inline
    def setCreateClientFactory(value: js.Object => RedisClient): Self = this.set("createClientFactory", js.Any.fromFunction1(value))
    @scala.inline
    def setPubsubClient(value: () => RedisClient): Self = this.set("pubsubClient", js.Any.fromFunction0(value))
    @scala.inline
    def setReset(value: () => Unit): Self = this.set("reset", js.Any.fromFunction0(value))
  }
  
}

