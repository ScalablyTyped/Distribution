package typings
package atKeyvRedisLib.atKeyvRedisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyvRedis
  extends nodeLib.eventsMod.EventEmitter
     with keyvLib.keyvMod.KeyvNs.Store[js.UndefOr[java.lang.String]] {
  var namespace: js.UndefOr[java.lang.String] = js.native
  val ttlSupport: atKeyvRedisLib.atKeyvRedisLibNumbers.`true` = js.native
  def set(key: java.lang.String): js.Promise[scala.Double] = js.native
  def set(key: java.lang.String, value: java.lang.String): js.Promise[scala.Double] = js.native
  def set(key: java.lang.String, value: java.lang.String, ttl: scala.Double): js.Promise[scala.Double] = js.native
}

