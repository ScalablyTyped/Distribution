package typings.jsend.ExpressNs

import typings.jsend.jsendNs.jsendExpress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Response extends js.Object {
  @JSName("jsend")
  var jsend_Original: jsendExpress = js.native
  def jsend(err: String): Unit = js.native
  def jsend(err: String, json: js.Object): Unit = js.native
  def jsend(err: js.Object): Unit = js.native
  def jsend(err: js.Object, json: js.Object): Unit = js.native
}

