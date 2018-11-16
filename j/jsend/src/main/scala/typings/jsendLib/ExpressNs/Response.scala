package typings
package jsendLib.ExpressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Response extends js.Object {
  @JSName("jsend")
  var jsend_Original: jsendLib.jsendNs.jsendExpress = js.native
  def jsend(err: java.lang.String): scala.Unit = js.native
  def jsend(err: java.lang.String, json: js.Object): scala.Unit = js.native
  def jsend(err: js.Object): scala.Unit = js.native
  def jsend(err: js.Object, json: js.Object): scala.Unit = js.native
}

