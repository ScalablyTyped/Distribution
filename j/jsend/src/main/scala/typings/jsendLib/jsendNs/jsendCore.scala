package typings
package jsendLib.jsendNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait jsendCore extends js.Object {
  def error(message: java.lang.String): JSendObject = js.native
  def error(message: jsendLib.Anon_Data): JSendObject = js.native
  def fail(data: js.Object): JSendObject = js.native
  def success(data: js.Object): JSendObject = js.native
}

