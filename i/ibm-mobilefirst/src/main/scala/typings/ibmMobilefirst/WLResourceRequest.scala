package typings.ibmMobilefirst

import org.scalablytyped.runtime.StringDictionary
import typings.jquery.JQueryDeferred
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WLResourceRequest extends StObject {
  
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
  
  def send(): JQueryDeferred[js.Any] = js.native
  def send(content: js.Any): JQueryDeferred[js.Any] = js.native
  
  def sendFormParameters(json: js.Object): JQueryDeferred[js.Any] = js.native
  
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
