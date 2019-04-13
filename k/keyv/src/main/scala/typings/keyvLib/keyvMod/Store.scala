package typings
package keyvLib.keyvMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Store[TValue] extends js.Object {
  def clear(): scala.Unit | js.Promise[scala.Unit] = js.native
  def delete(key: java.lang.String): scala.Boolean | js.Promise[scala.Boolean] = js.native
  def get(key: java.lang.String): js.UndefOr[TValue | js.Promise[js.UndefOr[TValue]]] = js.native
  def set(key: java.lang.String, value: TValue): js.Any = js.native
  def set(key: java.lang.String, value: TValue, ttl: scala.Double): js.Any = js.native
}

