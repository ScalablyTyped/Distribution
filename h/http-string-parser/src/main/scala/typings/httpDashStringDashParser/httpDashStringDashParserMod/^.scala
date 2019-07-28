package typings.httpDashStringDashParser.httpDashStringDashParserMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("http-string-parser", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def parseHeaders(headerLines: js.Array[String]): StringDictionary[String] = js.native
  def parseRequest(requestString: String): ParseRequestResult = js.native
  def parseRequestLine(requestLineString: String): ParseRequestLineResult = js.native
  def parseResponse(responseString: String): ParseResponseResult = js.native
  def parseStatusLine(statusLine: String): ParseStatusLineResult = js.native
}

