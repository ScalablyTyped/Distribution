package typings.jsreportDashCore.jsreportDashCoreMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response extends js.Object {
  var content: Buffer
  var headers: StringDictionary[String | Double | Boolean]
  var stream: ReadableStream
}

object Response {
  @scala.inline
  def apply(content: Buffer, headers: StringDictionary[String | Double | Boolean], stream: ReadableStream): Response = {
    val __obj = js.Dynamic.literal(content = content, headers = headers, stream = stream)
  
    __obj.asInstanceOf[Response]
  }
}

