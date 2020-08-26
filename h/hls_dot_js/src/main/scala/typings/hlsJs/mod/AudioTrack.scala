package typings.hlsJs.mod

import typings.std.SourceBuffer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AudioTrack extends js.Object {
  var buffer: SourceBuffer = js.native
  var codec: String = js.native
  var container: String = js.native
  var id: String = js.native
  var initSegment: js.UndefOr[Uint8Array] = js.native
  var levelCodec: String = js.native
}

object AudioTrack {
  @scala.inline
  def apply(buffer: SourceBuffer, codec: String, container: String, id: String, levelCodec: String): AudioTrack = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], codec = codec.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], levelCodec = levelCodec.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioTrack]
  }
  @scala.inline
  implicit class AudioTrackOps[Self <: AudioTrack] (val x: Self) extends AnyVal {
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
    def setBuffer(value: SourceBuffer): Self = this.set("buffer", value.asInstanceOf[js.Any])
    @scala.inline
    def setCodec(value: String): Self = this.set("codec", value.asInstanceOf[js.Any])
    @scala.inline
    def setContainer(value: String): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLevelCodec(value: String): Self = this.set("levelCodec", value.asInstanceOf[js.Any])
    @scala.inline
    def setInitSegment(value: Uint8Array): Self = this.set("initSegment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitSegment: Self = this.set("initSegment", js.undefined)
  }
  
}

