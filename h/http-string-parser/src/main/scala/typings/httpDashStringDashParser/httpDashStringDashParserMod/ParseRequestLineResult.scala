package typings.httpDashStringDashParser.httpDashStringDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseRequestLineResult extends js.Object {
  var method: String
  var protocol: String
  var uri: String
}

object ParseRequestLineResult {
  @scala.inline
  def apply(method: String, protocol: String, uri: String): ParseRequestLineResult = {
    val __obj = js.Dynamic.literal(method = method, protocol = protocol, uri = uri)
  
    __obj.asInstanceOf[ParseRequestLineResult]
  }
}

