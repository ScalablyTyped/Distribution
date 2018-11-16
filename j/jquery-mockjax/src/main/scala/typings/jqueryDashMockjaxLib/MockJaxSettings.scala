package typings
package jqueryDashMockjaxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MockJaxSettings extends js.Object {
  var contentType: js.UndefOr[java.lang.String] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var dataType: js.UndefOr[java.lang.String] = js.undefined
  var etag: js.UndefOr[java.lang.String] = js.undefined
  var headers: js.UndefOr[MockJaxSettingsHeaders] = js.undefined
  var isTimeout: js.UndefOr[scala.Boolean] = js.undefined
  var lastModified: js.UndefOr[java.lang.String] = js.undefined
  var logLevelMethods: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var logger: js.UndefOr[MockJaxStandardLogger | MockJaxCustomLogger] = js.undefined
  var logging: js.UndefOr[scala.Boolean] = js.undefined
  var namespace: js.UndefOr[java.lang.String] = js.undefined
  var onAfterComplete: js.UndefOr[js.Function] = js.undefined
  var onAfterError: js.UndefOr[js.Function] = js.undefined
  var onAfterSuccess: js.UndefOr[js.Function] = js.undefined
  var proxy: js.UndefOr[java.lang.String] = js.undefined
  var proxyType: js.UndefOr[java.lang.String] = js.undefined
  var response: js.UndefOr[
    js.Function2[/* settings */ js.Any, /* done */ js.UndefOr[js.Function], scala.Unit]
  ] = js.undefined
  var responseText: js.UndefOr[java.lang.String | js.Object] = js.undefined
  var responseTime: js.UndefOr[scala.Double] = js.undefined
  var responseXml: js.UndefOr[java.lang.String] = js.undefined
  var retainAjaxCalls: js.UndefOr[scala.Boolean] = js.undefined
  var status: js.UndefOr[scala.Double] = js.undefined
  var statusText: js.UndefOr[java.lang.String] = js.undefined
  var throwUnmocked: js.UndefOr[scala.Boolean] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var url: js.UndefOr[java.lang.String | stdLib.RegExp] = js.undefined
  var urlParams: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

