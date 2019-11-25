package typings.httpDashStringDashParser.httpDashStringDashParserMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseRequestResult extends js.Object {
  var body: String
  var headers: StringDictionary[String]
  var method: String
  var uri: String
}

object ParseRequestResult {
  @scala.inline
  def apply(body: String, headers: StringDictionary[String], method: String, uri: String): ParseRequestResult = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ParseRequestResult]
  }
}

