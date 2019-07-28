package typings.ibmDashMobilefirst

import org.scalablytyped.runtime.StringDictionary
import typings.jquery.JQueryDeferred
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WLResourceRequest")
@js.native
class WLResourceRequest protected () extends js.Object {
  def this(url: String, method: String) = this()
  def this(url: String, method: String, timeout: Double) = this()
  def addHeader(name: String, value: String): Unit = js.native
  def addHeader(name: String, value: Boolean): Unit = js.native
  def addHeader(name: String, value: Double): Unit = js.native
  def getHeader(name: String): String = js.native
  def getHeaderNames(): js.Array[String] = js.native
  def getHeaders(name: String): js.Array[String] = js.native
  def getMethod(): String = js.native
  def getQueryParameters(): js.Any = js.native
   // JSON
  def getTimeout(): Double = js.native
  def getUrl(): String = js.native
  def send(): JQueryDeferred[_] = js.native
  def send(content: js.Any): JQueryDeferred[_] = js.native
  def sendFormParameters(json: js.Object): JQueryDeferred[_] = js.native
  def setHeader(name: String, value: String): Unit = js.native
  def setHeader(name: String, value: Boolean): Unit = js.native
  def setHeader(name: String, value: Double): Unit = js.native
  def setHeaders(): Unit = js.native
  def setHeaders(requestHeaders: StringDictionary[String | js.Array[String]]): Unit = js.native
  def setQueryParameter(name: String, value: String): Unit = js.native
  def setQueryParameter(name: String, value: js.Object): Unit = js.native
  def setQueryParameter(name: String, value: Boolean): Unit = js.native
  def setQueryParameter(name: String, value: Double): Unit = js.native
  def setQueryParameters(): Unit = js.native
  def setQueryParameters(parameters: StringDictionary[String | Double | Boolean | js.Object]): Unit = js.native
  def setTimeout(requestTimeout: Double): Unit = js.native
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

