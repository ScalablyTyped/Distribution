package typings
package ibmDashMobilefirstLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WLResourceRequest")
@js.native
class WLResourceRequest protected () extends js.Object {
  def this(url: java.lang.String, method: java.lang.String) = this()
  def this(url: java.lang.String, method: java.lang.String, timeout: scala.Double) = this()
  def addHeader(name: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def addHeader(name: java.lang.String, value: scala.Boolean): scala.Unit = js.native
  def addHeader(name: java.lang.String, value: scala.Double): scala.Unit = js.native
  def getHeader(name: java.lang.String): java.lang.String = js.native
  def getHeaderNames(): js.Array[java.lang.String] = js.native
  def getHeaders(name: java.lang.String): js.Array[java.lang.String] = js.native
  def getMethod(): java.lang.String = js.native
  def getQueryParameters(): js.Any = js.native
   // JSON
  def getTimeout(): scala.Double = js.native
  def getUrl(): java.lang.String = js.native
  def send(): jqueryLib.JQueryDeferred[_] = js.native
  def send(content: js.Any): jqueryLib.JQueryDeferred[_] = js.native
  def sendFormParameters(json: js.Object): jqueryLib.JQueryDeferred[_] = js.native
  def setHeader(name: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def setHeader(name: java.lang.String, value: scala.Boolean): scala.Unit = js.native
  def setHeader(name: java.lang.String, value: scala.Double): scala.Unit = js.native
  def setHeaders(): scala.Unit = js.native
  def setHeaders(
    requestHeaders: org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]]
  ): scala.Unit = js.native
  def setQueryParameter(name: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def setQueryParameter(name: java.lang.String, value: js.Object): scala.Unit = js.native
  def setQueryParameter(name: java.lang.String, value: scala.Boolean): scala.Unit = js.native
  def setQueryParameter(name: java.lang.String, value: scala.Double): scala.Unit = js.native
  def setQueryParameters(): scala.Unit = js.native
  def setQueryParameters(
    parameters: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean | js.Object]
  ): scala.Unit = js.native
  def setTimeout(requestTimeout: scala.Double): scala.Unit = js.native
}

@JSGlobal("WLResourceRequest")
@js.native
object WLResourceRequest extends js.Object {
  var CONNECT: java.lang.String = js.native
  var DELETE: java.lang.String = js.native
  var GET: java.lang.String = js.native
  var HEAD: java.lang.String = js.native
  var OPTIONS: java.lang.String = js.native
  var POST: java.lang.String = js.native
  var PUT: java.lang.String = js.native
  var TRACE: java.lang.String = js.native
}

