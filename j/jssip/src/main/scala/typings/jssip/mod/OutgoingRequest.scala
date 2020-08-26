package typings.jssip.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutgoingRequest extends js.Object {
  var body: js.UndefOr[String] = js.native
  var call_id: String = js.native
  var cseq: Double = js.native
  var from: NameAddrHeader = js.native
  var method: String = js.native
  var ruri: URI = js.native
  var to: NameAddrHeader = js.native
  def getHeader(name: String): String = js.native
  def getHeaders(name: String): js.Array[String] = js.native
  def hasHeader(name: String): Boolean = js.native
  def setHeader(name: String, value: String): Unit = js.native
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
    to: NameAddrHeader
  ): OutgoingRequest = {
    val __obj = js.Dynamic.literal(call_id = call_id.asInstanceOf[js.Any], cseq = cseq.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], getHeader = js.Any.fromFunction1(getHeader), getHeaders = js.Any.fromFunction1(getHeaders), hasHeader = js.Any.fromFunction1(hasHeader), method = method.asInstanceOf[js.Any], ruri = ruri.asInstanceOf[js.Any], setHeader = js.Any.fromFunction2(setHeader), to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutgoingRequest]
  }
  @scala.inline
  implicit class OutgoingRequestOps[Self <: OutgoingRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCall_id(value: String): Self = this.set("call_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setCseq(value: Double): Self = this.set("cseq", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrom(value: NameAddrHeader): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetHeader(value: String => String): Self = this.set("getHeader", js.Any.fromFunction1(value))
    @scala.inline
    def setGetHeaders(value: String => js.Array[String]): Self = this.set("getHeaders", js.Any.fromFunction1(value))
    @scala.inline
    def setHasHeader(value: String => Boolean): Self = this.set("hasHeader", js.Any.fromFunction1(value))
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def setRuri(value: URI): Self = this.set("ruri", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetHeader(value: (String, String) => Unit): Self = this.set("setHeader", js.Any.fromFunction2(value))
    @scala.inline
    def setTo(value: NameAddrHeader): Self = this.set("to", value.asInstanceOf[js.Any])
    @scala.inline
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
  }
  
}

