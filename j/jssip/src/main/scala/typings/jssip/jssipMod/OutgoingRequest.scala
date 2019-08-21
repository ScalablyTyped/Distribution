package typings.jssip.jssipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutgoingRequest extends js.Object {
  var body: js.UndefOr[String] = js.undefined
  var call_id: String
  var cseq: Double
  var from: NameAddrHeader
  var method: String
  var ruri: URI
  var to: NameAddrHeader
  def getHeader(name: String): String
  def getHeaders(name: String): js.Array[String]
  def hasHeader(name: String): Boolean
  def setHeader(name: String, value: String): Unit
}

object OutgoingRequest {
  @scala.inline
  def apply(
    call_id: String,
    cseq: Double,
    from: NameAddrHeader,
    getHeader: String => String,
    getHeaders: String => js.Array[String],
    hasHeader: String => Boolean,
    method: String,
    ruri: URI,
    setHeader: (String, String) => Unit,
    to: NameAddrHeader,
    toString: () => String,
    body: String = null
  ): OutgoingRequest = {
    val __obj = js.Dynamic.literal(call_id = call_id, cseq = cseq, from = from, getHeader = js.Any.fromFunction1(getHeader), getHeaders = js.Any.fromFunction1(getHeaders), hasHeader = js.Any.fromFunction1(hasHeader), method = method, ruri = ruri, setHeader = js.Any.fromFunction2(setHeader), to = to, toString = js.Any.fromFunction0(toString))
    if (body != null) __obj.updateDynamic("body")(body)
    __obj.asInstanceOf[OutgoingRequest]
  }
}

