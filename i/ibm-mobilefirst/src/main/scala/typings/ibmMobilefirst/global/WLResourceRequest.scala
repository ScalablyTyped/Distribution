package typings.ibmMobilefirst.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WLResourceRequest")
@js.native
class WLResourceRequest protected ()
  extends typings.ibmMobilefirst.WLResourceRequest {
  def this(url: String, method: String) = this()
  def this(url: String, method: String, timeout: Double) = this()
}

/* static members */
@JSGlobal("WLResourceRequest")
@js.native
object WLResourceRequest extends js.Object {
  var CONNECT: String = js.native
  var DELETE: String = js.native
  var GET: String = js.native
  var HEAD: String = js.native
  var OPTIONS: String = js.native
  var POST: String = js.native
  var PUT: String = js.native
  var TRACE: String = js.native
}

