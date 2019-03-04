package typings
package httpDashStringDashParserLib.httpDashStringDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseResponseResult extends js.Object {
  var body: java.lang.String
  var headers: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var statusCode: java.lang.String
  var statusMessage: java.lang.String
}

object ParseResponseResult {
  @scala.inline
  def apply(
    body: java.lang.String,
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    statusCode: java.lang.String,
    statusMessage: java.lang.String
  ): ParseResponseResult = {
    val __obj = js.Dynamic.literal(body = body, headers = headers, statusCode = statusCode, statusMessage = statusMessage)
  
    __obj.asInstanceOf[ParseResponseResult]
  }
}

