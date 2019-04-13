package typings
package jsreportDashCoreLib.jsreportDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response extends js.Object {
  var content: nodeLib.Buffer
  var headers: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean]
  var stream: nodeLib.NodeJSNs.ReadableStream
}

object Response {
  @scala.inline
  def apply(
    content: nodeLib.Buffer,
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean],
    stream: nodeLib.NodeJSNs.ReadableStream
  ): Response = {
    val __obj = js.Dynamic.literal(content = content, headers = headers, stream = stream)
  
    __obj.asInstanceOf[Response]
  }
}

