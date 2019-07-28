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
    val __obj = js.Dynamic.literal(body = body, headers = headers, method = method, uri = uri)
  
    __obj.asInstanceOf[ParseRequestResult]
  }
}

