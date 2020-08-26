package typings.jquerySoap.JQuerySOAP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var HTTPHeaders: js.UndefOr[js.Object] = js.native
  var SOAPAction: js.UndefOr[String] = js.native
  var SOAPHeader: js.UndefOr[js.Object] = js.native
  var appendMethodToURL: js.UndefOr[Boolean] = js.native
  var async: js.UndefOr[Boolean] = js.native
  var beforeSend: js.UndefOr[js.Function1[/* SOAPEnvelope */ SOAPEnvelope, Unit]] = js.native
  var context: js.UndefOr[js.Any] = js.native
  var data: js.UndefOr[js.Object] = js.native
  var elementName: js.UndefOr[String] = js.native
  var enableLogging: js.UndefOr[Boolean] = js.native
  var envAttributes: js.UndefOr[js.Any] = js.native
  var error: js.UndefOr[js.Function1[/* SOAPResponse */ SOAPResponse, Unit]] = js.native
  var method: js.UndefOr[String] = js.native
  var namespaceQualifier: js.UndefOr[String] = js.native
  var namespaceURL: js.UndefOr[String] = js.native
  var noPrefix: js.UndefOr[Boolean] = js.native
  var request: js.UndefOr[js.Function1[/* SOAPEnvelope */ SOAPEnvelope, Unit]] = js.native
  var soap12: js.UndefOr[Boolean] = js.native
  var statusCode: js.UndefOr[js.Object] = js.native
  var success: js.UndefOr[js.Function1[/* SOAPResponse */ SOAPResponse, Unit]] = js.native
  var timeout: js.UndefOr[Double] = js.native
  var url: js.UndefOr[String] = js.native
  var wss: js.UndefOr[js.Object] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setHTTPHeaders(value: js.Object): Self = this.set("HTTPHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHTTPHeaders: Self = this.set("HTTPHeaders", js.undefined)
    @scala.inline
    def setSOAPAction(value: String): Self = this.set("SOAPAction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSOAPAction: Self = this.set("SOAPAction", js.undefined)
    @scala.inline
    def setSOAPHeader(value: js.Object): Self = this.set("SOAPHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSOAPHeader: Self = this.set("SOAPHeader", js.undefined)
    @scala.inline
    def setAppendMethodToURL(value: Boolean): Self = this.set("appendMethodToURL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppendMethodToURL: Self = this.set("appendMethodToURL", js.undefined)
    @scala.inline
    def setAsync(value: Boolean): Self = this.set("async", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsync: Self = this.set("async", js.undefined)
    @scala.inline
    def setBeforeSend(value: /* SOAPEnvelope */ SOAPEnvelope => Unit): Self = this.set("beforeSend", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforeSend: Self = this.set("beforeSend", js.undefined)
    @scala.inline
    def setContext(value: js.Any): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setData(value: js.Object): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setElementName(value: String): Self = this.set("elementName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElementName: Self = this.set("elementName", js.undefined)
    @scala.inline
    def setEnableLogging(value: Boolean): Self = this.set("enableLogging", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableLogging: Self = this.set("enableLogging", js.undefined)
    @scala.inline
    def setEnvAttributes(value: js.Any): Self = this.set("envAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnvAttributes: Self = this.set("envAttributes", js.undefined)
    @scala.inline
    def setError(value: /* SOAPResponse */ SOAPResponse => Unit): Self = this.set("error", js.Any.fromFunction1(value))
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    @scala.inline
    def setNamespaceQualifier(value: String): Self = this.set("namespaceQualifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamespaceQualifier: Self = this.set("namespaceQualifier", js.undefined)
    @scala.inline
    def setNamespaceURL(value: String): Self = this.set("namespaceURL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamespaceURL: Self = this.set("namespaceURL", js.undefined)
    @scala.inline
    def setNoPrefix(value: Boolean): Self = this.set("noPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoPrefix: Self = this.set("noPrefix", js.undefined)
    @scala.inline
    def setRequest(value: /* SOAPEnvelope */ SOAPEnvelope => Unit): Self = this.set("request", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRequest: Self = this.set("request", js.undefined)
    @scala.inline
    def setSoap12(value: Boolean): Self = this.set("soap12", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSoap12: Self = this.set("soap12", js.undefined)
    @scala.inline
    def setStatusCode(value: js.Object): Self = this.set("statusCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusCode: Self = this.set("statusCode", js.undefined)
    @scala.inline
    def setSuccess(value: /* SOAPResponse */ SOAPResponse => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    @scala.inline
    def setWss(value: js.Object): Self = this.set("wss", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWss: Self = this.set("wss", js.undefined)
  }
  
}

