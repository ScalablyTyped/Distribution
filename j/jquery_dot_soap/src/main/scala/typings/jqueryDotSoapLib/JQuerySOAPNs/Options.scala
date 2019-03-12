package typings
package jqueryDotSoapLib.JQuerySOAPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var HTTPHeaders: js.UndefOr[js.Object] = js.undefined
  var SOAPAction: js.UndefOr[java.lang.String] = js.undefined
  var SOAPHeader: js.UndefOr[js.Object] = js.undefined
  var appendMethodToURL: js.UndefOr[scala.Boolean] = js.undefined
  var async: js.UndefOr[scala.Boolean] = js.undefined
  var beforeSend: js.UndefOr[js.Function1[/* SOAPEnvelope */ SOAPEnvelope, scala.Unit]] = js.undefined
  var context: js.UndefOr[js.Any] = js.undefined
  var data: js.UndefOr[js.Object] = js.undefined
  var elementName: js.UndefOr[java.lang.String] = js.undefined
  var enableLogging: js.UndefOr[scala.Boolean] = js.undefined
  var envAttributes: js.UndefOr[js.Any] = js.undefined
  var error: js.UndefOr[js.Function1[/* SOAPResponse */ SOAPResponse, scala.Unit]] = js.undefined
  var method: js.UndefOr[java.lang.String] = js.undefined
  var namespaceQualifier: js.UndefOr[java.lang.String] = js.undefined
  var namespaceURL: js.UndefOr[java.lang.String] = js.undefined
  var noPrefix: js.UndefOr[scala.Boolean] = js.undefined
  var request: js.UndefOr[js.Function1[/* SOAPEnvelope */ SOAPEnvelope, scala.Unit]] = js.undefined
  var soap12: js.UndefOr[scala.Boolean] = js.undefined
  var statusCode: js.UndefOr[js.Object] = js.undefined
  var success: js.UndefOr[js.Function1[/* SOAPResponse */ SOAPResponse, scala.Unit]] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
  var wss: js.UndefOr[js.Object] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    HTTPHeaders: js.Object = null,
    SOAPAction: java.lang.String = null,
    SOAPHeader: js.Object = null,
    appendMethodToURL: js.UndefOr[scala.Boolean] = js.undefined,
    async: js.UndefOr[scala.Boolean] = js.undefined,
    beforeSend: /* SOAPEnvelope */ SOAPEnvelope => scala.Unit = null,
    context: js.Any = null,
    data: js.Object = null,
    elementName: java.lang.String = null,
    enableLogging: js.UndefOr[scala.Boolean] = js.undefined,
    envAttributes: js.Any = null,
    error: /* SOAPResponse */ SOAPResponse => scala.Unit = null,
    method: java.lang.String = null,
    namespaceQualifier: java.lang.String = null,
    namespaceURL: java.lang.String = null,
    noPrefix: js.UndefOr[scala.Boolean] = js.undefined,
    request: /* SOAPEnvelope */ SOAPEnvelope => scala.Unit = null,
    soap12: js.UndefOr[scala.Boolean] = js.undefined,
    statusCode: js.Object = null,
    success: /* SOAPResponse */ SOAPResponse => scala.Unit = null,
    timeout: scala.Int | scala.Double = null,
    url: java.lang.String = null,
    wss: js.Object = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (HTTPHeaders != null) __obj.updateDynamic("HTTPHeaders")(HTTPHeaders)
    if (SOAPAction != null) __obj.updateDynamic("SOAPAction")(SOAPAction)
    if (SOAPHeader != null) __obj.updateDynamic("SOAPHeader")(SOAPHeader)
    if (!js.isUndefined(appendMethodToURL)) __obj.updateDynamic("appendMethodToURL")(appendMethodToURL)
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async)
    if (beforeSend != null) __obj.updateDynamic("beforeSend")(js.Any.fromFunction1(beforeSend))
    if (context != null) __obj.updateDynamic("context")(context)
    if (data != null) __obj.updateDynamic("data")(data)
    if (elementName != null) __obj.updateDynamic("elementName")(elementName)
    if (!js.isUndefined(enableLogging)) __obj.updateDynamic("enableLogging")(enableLogging)
    if (envAttributes != null) __obj.updateDynamic("envAttributes")(envAttributes)
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1(error))
    if (method != null) __obj.updateDynamic("method")(method)
    if (namespaceQualifier != null) __obj.updateDynamic("namespaceQualifier")(namespaceQualifier)
    if (namespaceURL != null) __obj.updateDynamic("namespaceURL")(namespaceURL)
    if (!js.isUndefined(noPrefix)) __obj.updateDynamic("noPrefix")(noPrefix)
    if (request != null) __obj.updateDynamic("request")(js.Any.fromFunction1(request))
    if (!js.isUndefined(soap12)) __obj.updateDynamic("soap12")(soap12)
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode)
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url)
    if (wss != null) __obj.updateDynamic("wss")(wss)
    __obj.asInstanceOf[Options]
  }
}

