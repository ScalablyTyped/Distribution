package typings
package httpDashStringDashParserLib.httpDashStringDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseRequestResult extends js.Object {
  var body: java.lang.String
  var headers: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var method: java.lang.String
  var uri: java.lang.String
}

object ParseRequestResult {
  @scala.inline
  def apply(
    body: java.lang.String,
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    method: java.lang.String,
    uri: java.lang.String
  ): ParseRequestResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("body")(body)
    __obj.updateDynamic("headers")(headers)
    __obj.updateDynamic("method")(method)
    __obj.updateDynamic("uri")(uri)
    __obj.asInstanceOf[ParseRequestResult]
  }
}

