package typings
package k6Lib.wsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response extends js.Object {
  var body: java.lang.String
  var error: java.lang.String
  var headers: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var status: scala.Double
  var url: java.lang.String
}

object Response {
  @scala.inline
  def apply(
    body: java.lang.String,
    error: java.lang.String,
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    status: scala.Double,
    url: java.lang.String
  ): Response = {
    val __obj = js.Dynamic.literal(body = body, error = error, headers = headers, status = status, url = url)
  
    __obj.asInstanceOf[Response]
  }
}

