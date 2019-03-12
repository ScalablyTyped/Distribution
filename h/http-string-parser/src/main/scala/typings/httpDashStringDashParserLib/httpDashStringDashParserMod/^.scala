package typings
package httpDashStringDashParserLib.httpDashStringDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("http-string-parser", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def parseHeaders(headerLines: js.Array[java.lang.String]): org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
  def parseRequest(requestString: java.lang.String): ParseRequestResult = js.native
  def parseRequestLine(requestLineString: java.lang.String): ParseRequestLineResult = js.native
  def parseResponse(responseString: java.lang.String): ParseResponseResult = js.native
  def parseStatusLine(statusLine: java.lang.String): ParseStatusLineResult = js.native
}

