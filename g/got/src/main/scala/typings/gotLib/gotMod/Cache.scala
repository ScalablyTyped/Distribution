package typings
package gotLib.gotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cache extends js.Object {
  def delete(key: java.lang.String): js.Any = js.native
  def get(key: java.lang.String): js.Any = js.native
  def set(key: java.lang.String, value: js.Any): js.Any = js.native
  def set(key: java.lang.String, value: js.Any, ttl: scala.Double): js.Any = js.native
}

