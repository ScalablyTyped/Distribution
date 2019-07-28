package typings.httpDashStringDashParser.httpDashStringDashParserMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseResponseResult extends js.Object {
  var body: String
  var headers: StringDictionary[String]
  var statusCode: String
  var statusMessage: String
}

object ParseResponseResult {
  @scala.inline
  def apply(body: String, headers: StringDictionary[String], statusCode: String, statusMessage: String): ParseResponseResult = {
    val __obj = js.Dynamic.literal(body = body, headers = headers, statusCode = statusCode, statusMessage = statusMessage)
  
    __obj.asInstanceOf[ParseResponseResult]
  }
}

