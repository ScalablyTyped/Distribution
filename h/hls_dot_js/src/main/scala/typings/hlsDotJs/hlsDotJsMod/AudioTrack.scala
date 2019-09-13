package typings.hlsDotJs.hlsDotJsMod

import typings.std.SourceBuffer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AudioTrack extends js.Object {
  var buffer: SourceBuffer
  var codec: String
  var container: String
  var id: String
  var initSegment: js.UndefOr[Uint8Array] = js.undefined
  var levelCodec: String
}

object AudioTrack {
  @scala.inline
  def apply(
    buffer: SourceBuffer,
    codec: String,
    container: String,
    id: String,
    levelCodec: String,
    initSegment: Uint8Array = null
  ): AudioTrack = {
    val __obj = js.Dynamic.literal(buffer = buffer, codec = codec, container = container, id = id, levelCodec = levelCodec)
    if (initSegment != null) __obj.updateDynamic("initSegment")(initSegment)
    __obj.asInstanceOf[AudioTrack]
  }
}

