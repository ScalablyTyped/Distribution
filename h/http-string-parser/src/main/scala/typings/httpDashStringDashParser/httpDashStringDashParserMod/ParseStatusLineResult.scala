package typings.httpDashStringDashParser.httpDashStringDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseStatusLineResult extends js.Object {
  var protocol: String
  var statusCode: String
  var statusMessage: String
}

object ParseStatusLineResult {
  @scala.inline
  def apply(protocol: String, statusCode: String, statusMessage: String): ParseStatusLineResult = {
    val __obj = js.Dynamic.literal(protocol = protocol.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ParseStatusLineResult]
  }
}

