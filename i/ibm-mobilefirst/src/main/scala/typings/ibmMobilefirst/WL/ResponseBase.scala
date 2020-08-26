package typings.ibmMobilefirst.WL

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResponseBase extends js.Object {
  var errorCode: Double = js.native
  var errorMsg: String = js.native
  var headerJSON: StringDictionary[js.Any] = js.native
  var invocationContext: js.Any = js.native
   // JSON Object
  var readyState: Double = js.native
  var request: js.Any = js.native
  var responseJSON: StringDictionary[js.Any] = js.native
   // JSON Object
  var responseText: String = js.native
  var responseXML: String = js.native
  var status: Double = js.native
  var statusText: String = js.native
}

object ResponseBase {
  @scala.inline
  def apply(
    errorCode: Double,
    errorMsg: String,
    headerJSON: StringDictionary[js.Any],
    invocationContext: js.Any,
    readyState: Double,
    request: js.Any,
    responseJSON: StringDictionary[js.Any],
    responseText: String,
    responseXML: String,
    status: Double,
    statusText: String
  ): ResponseBase = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], errorMsg = errorMsg.asInstanceOf[js.Any], headerJSON = headerJSON.asInstanceOf[js.Any], invocationContext = invocationContext.asInstanceOf[js.Any], readyState = readyState.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], responseJSON = responseJSON.asInstanceOf[js.Any], responseText = responseText.asInstanceOf[js.Any], responseXML = responseXML.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseBase]
  }
  @scala.inline
  implicit class ResponseBaseOps[Self <: ResponseBase] (val x: Self) extends AnyVal {
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
    def setErrorCode(value: Double): Self = this.set("errorCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorMsg(value: String): Self = this.set("errorMsg", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaderJSON(value: StringDictionary[js.Any]): Self = this.set("headerJSON", value.asInstanceOf[js.Any])
    @scala.inline
    def setInvocationContext(value: js.Any): Self = this.set("invocationContext", value.asInstanceOf[js.Any])
    @scala.inline
    def setReadyState(value: Double): Self = this.set("readyState", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: js.Any): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponseJSON(value: StringDictionary[js.Any]): Self = this.set("responseJSON", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponseText(value: String): Self = this.set("responseText", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponseXML(value: String): Self = this.set("responseXML", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: Double): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatusText(value: String): Self = this.set("statusText", value.asInstanceOf[js.Any])
  }
  
}

