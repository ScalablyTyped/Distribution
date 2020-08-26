package typings.linkifyIt.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Match extends js.Object {
  var index: Double = js.native
  var lastIndex: Double = js.native
  var raw: String = js.native
  var schema: String = js.native
  var text: String = js.native
  var url: String = js.native
}

object Match {
  @scala.inline
  def apply(index: Double, lastIndex: Double, raw: String, schema: String, text: String, url: String): Match = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], lastIndex = lastIndex.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Match]
  }
  @scala.inline
  implicit class MatchOps[Self <: Match] (val x: Self) extends AnyVal {
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
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastIndex(value: Double): Self = this.set("lastIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setRaw(value: String): Self = this.set("raw", value.asInstanceOf[js.Any])
    @scala.inline
    def setSchema(value: String): Self = this.set("schema", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

