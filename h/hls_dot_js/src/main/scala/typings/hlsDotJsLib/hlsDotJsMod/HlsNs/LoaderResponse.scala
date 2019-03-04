package typings
package hlsDotJsLib.hlsDotJsMod.HlsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoaderResponse extends js.Object {
  var data: java.lang.String | stdLib.ArrayBuffer
  var url: java.lang.String
}

object LoaderResponse {
  @scala.inline
  def apply(data: java.lang.String | stdLib.ArrayBuffer, url: java.lang.String): LoaderResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], url = url)
  
    __obj.asInstanceOf[LoaderResponse]
  }
}

