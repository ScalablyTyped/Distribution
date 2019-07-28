package typings.jsend.jsendNs

import typings.jsend.Anon_Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait jsendCore extends js.Object {
  def error(message: String): JSendObject = js.native
  def error(message: Anon_Code): JSendObject = js.native
  def fail(data: js.Object): JSendObject = js.native
  def success(data: js.Object): JSendObject = js.native
}

