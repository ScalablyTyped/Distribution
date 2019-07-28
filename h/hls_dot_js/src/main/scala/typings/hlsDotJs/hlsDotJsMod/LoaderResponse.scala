package typings.hlsDotJs.hlsDotJsMod

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoaderResponse extends js.Object {
  var data: String | ArrayBuffer
  var url: String
}

object LoaderResponse {
  @scala.inline
  def apply(data: String | ArrayBuffer, url: String): LoaderResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], url = url)
  
    __obj.asInstanceOf[LoaderResponse]
  }
}

