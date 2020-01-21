package typings.jsend.jsend

import typings.jsend.AnonCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait jsendCore extends js.Object {
  def error(message: String): JSendObject = js.native
  def error(message: AnonCode): JSendObject = js.native
  def fail(data: js.Object): JSendObject = js.native
  def success(data: js.Object): JSendObject = js.native
}

