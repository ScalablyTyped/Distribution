package typings.loadableServer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Chunk extends js.Object {
  var chunk: String = js.native
  var filename: String = js.native
  var linkType: String = js.native
  var path: String = js.native
  var scriptType: String = js.native
  var `type`: String = js.native
  var url: String = js.native
}

object Chunk {
  @scala.inline
  def apply(
    chunk: String,
    filename: String,
    linkType: String,
    path: String,
    scriptType: String,
    `type`: String,
    url: String
  ): Chunk = {
    val __obj = js.Dynamic.literal(chunk = chunk.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], linkType = linkType.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], scriptType = scriptType.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Chunk]
  }
  @scala.inline
  implicit class ChunkOps[Self <: Chunk] (val x: Self) extends AnyVal {
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
    def setChunk(value: String): Self = this.set("chunk", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    @scala.inline
    def setLinkType(value: String): Self = this.set("linkType", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setScriptType(value: String): Self = this.set("scriptType", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

