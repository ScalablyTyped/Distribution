package typings
package httpDashStringDashParserLib.httpDashStringDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("http-string-parser", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def parseHeaders(headerLines: js.Array[java.lang.String]): org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
  def parseRequest(requestString: java.lang.String): httpDashStringDashParserLib.httpDashStringDashParserMod.ParseRequestResult = js.native
  def parseRequestLine(requestLineString: java.lang.String): httpDashStringDashParserLib.httpDashStringDashParserMod.ParseRequestLineResult = js.native
  def parseResponse(responseString: java.lang.String): httpDashStringDashParserLib.httpDashStringDashParserMod.ParseResponseResult = js.native
  def parseStatusLine(statusLine: java.lang.String): httpDashStringDashParserLib.httpDashStringDashParserMod.ParseStatusLineResult = js.native
}

