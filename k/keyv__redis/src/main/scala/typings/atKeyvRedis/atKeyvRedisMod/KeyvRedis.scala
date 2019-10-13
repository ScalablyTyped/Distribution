package typings.atKeyvRedis.atKeyvRedisMod

import typings.atKeyvRedis.atKeyvRedisNumbers.`true`
import typings.keyv.keyvMod.Store
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyvRedis
  extends EventEmitter
     with Store[js.UndefOr[String]] {
  var namespace: js.UndefOr[String] = js.native
  val ttlSupport: `true` = js.native
  def set(key: String): js.Promise[Double] = js.native
  def set(key: String, value: String): js.Promise[Double] = js.native
  def set(key: String, value: String, ttl: Double): js.Promise[Double] = js.native
}

