package typings.keyv.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Store[TValue] extends js.Object {
  def clear(): Unit | js.Promise[Unit] = js.native
  def delete(key: String): Boolean | js.Promise[Boolean] = js.native
  def get(key: String): js.UndefOr[TValue | js.Promise[js.UndefOr[TValue]]] = js.native
  def set(key: String, value: TValue): js.Any = js.native
  def set(key: String, value: TValue, ttl: Double): js.Any = js.native
}

