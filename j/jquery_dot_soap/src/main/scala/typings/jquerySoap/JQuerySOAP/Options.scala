package typings.jquerySoap.JQuerySOAP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var HTTPHeaders: js.UndefOr[js.Object] = js.undefined
  var SOAPAction: js.UndefOr[String] = js.undefined
  var SOAPHeader: js.UndefOr[js.Object] = js.undefined
  var appendMethodToURL: js.UndefOr[Boolean] = js.undefined
  var async: js.UndefOr[Boolean] = js.undefined
  var beforeSend: js.UndefOr[js.Function1[/* SOAPEnvelope */ SOAPEnvelope, Unit]] = js.undefined
  var context: js.UndefOr[js.Any] = js.undefined
  var data: js.UndefOr[js.Object] = js.undefined
  var elementName: js.UndefOr[String] = js.undefined
  var enableLogging: js.UndefOr[Boolean] = js.undefined
  var envAttributes: js.UndefOr[js.Any] = js.undefined
  var error: js.UndefOr[js.Function1[/* SOAPResponse */ SOAPResponse, Unit]] = js.undefined
  var method: js.UndefOr[String] = js.undefined
  var namespaceQualifier: js.UndefOr[String] = js.undefined
  var namespaceURL: js.UndefOr[String] = js.undefined
  var noPrefix: js.UndefOr[Boolean] = js.undefined
  var request: js.UndefOr[js.Function1[/* SOAPEnvelope */ SOAPEnvelope, Unit]] = js.undefined
  var soap12: js.UndefOr[Boolean] = js.undefined
  var statusCode: js.UndefOr[js.Object] = js.undefined
  var success: js.UndefOr[js.Function1[/* SOAPResponse */ SOAPResponse, Unit]] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  var wss: js.UndefOr[js.Object] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    HTTPHeaders: js.Object = null,
    SOAPAction: String = null,
    SOAPHeader: js.Object = null,
    appendMethodToURL: js.UndefOr[Boolean] = js.undefined,
    async: js.UndefOr[Boolean] = js.undefined,
    beforeSend: /* SOAPEnvelope */ SOAPEnvelope => Unit = null,
    context: js.Any = null,
    data: js.Object = null,
    elementName: String = null,
    enableLogging: js.UndefOr[Boolean] = js.undefined,
    envAttributes: js.Any = null,
    error: /* SOAPResponse */ SOAPResponse => Unit = null,
    method: String = null,
    namespaceQualifier: String = null,
    namespaceURL: String = null,
    noPrefix: js.UndefOr[Boolean] = js.undefined,
    request: /* SOAPEnvelope */ SOAPEnvelope => Unit = null,
    soap12: js.UndefOr[Boolean] = js.undefined,
    statusCode: js.Object = null,
    success: /* SOAPResponse */ SOAPResponse => Unit = null,
    timeout: Int | Double = null,
    url: String = null,
    wss: js.Object = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (HTTPHeaders != null) __obj.updateDynamic("HTTPHeaders")(HTTPHeaders.asInstanceOf[js.Any])
    if (SOAPAction != null) __obj.updateDynamic("SOAPAction")(SOAPAction.asInstanceOf[js.Any])
    if (SOAPHeader != null) __obj.updateDynamic("SOAPHeader")(SOAPHeader.asInstanceOf[js.Any])
    if (!js.isUndefined(appendMethodToURL)) __obj.updateDynamic("appendMethodToURL")(appendMethodToURL.asInstanceOf[js.Any])
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async.asInstanceOf[js.Any])
    if (beforeSend != null) __obj.updateDynamic("beforeSend")(js.Any.fromFunction1(beforeSend))
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (elementName != null) __obj.updateDynamic("elementName")(elementName.asInstanceOf[js.Any])
    if (!js.isUndefined(enableLogging)) __obj.updateDynamic("enableLogging")(enableLogging.asInstanceOf[js.Any])
    if (envAttributes != null) __obj.updateDynamic("envAttributes")(envAttributes.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1(error))
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (namespaceQualifier != null) __obj.updateDynamic("namespaceQualifier")(namespaceQualifier.asInstanceOf[js.Any])
    if (namespaceURL != null) __obj.updateDynamic("namespaceURL")(namespaceURL.asInstanceOf[js.Any])
    if (!js.isUndefined(noPrefix)) __obj.updateDynamic("noPrefix")(noPrefix.asInstanceOf[js.Any])
    if (request != null) __obj.updateDynamic("request")(js.Any.fromFunction1(request))
    if (!js.isUndefined(soap12)) __obj.updateDynamic("soap12")(soap12.asInstanceOf[js.Any])
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (wss != null) __obj.updateDynamic("wss")(wss.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

