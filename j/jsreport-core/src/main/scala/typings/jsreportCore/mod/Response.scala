package typings.jsreportCore.mod

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Response extends js.Object {
  var content: Buffer = js.native
  var headers: StringDictionary[String | Double | Boolean] = js.native
  var stream: ReadableStream = js.native
}

object Response {
  @scala.inline
  def apply(content: Buffer, headers: StringDictionary[String | Double | Boolean], stream: ReadableStream): Response = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response]
  }
  @scala.inline
  implicit class ResponseOps[Self <: Response] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContent(value: Buffer): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaders(value: StringDictionary[String | Double | Boolean]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def setStream(value: ReadableStream): Self = this.set("stream", value.asInstanceOf[js.Any])
  }
  
}

