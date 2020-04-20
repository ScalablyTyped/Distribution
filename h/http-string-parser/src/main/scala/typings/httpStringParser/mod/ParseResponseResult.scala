package typings.httpStringParser.mod

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
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseResponseResult]
  }
}

