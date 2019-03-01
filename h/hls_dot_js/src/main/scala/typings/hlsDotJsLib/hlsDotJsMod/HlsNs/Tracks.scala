package typings
package hlsDotJsLib.hlsDotJsMod.HlsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tracks extends js.Object {
  var codec: java.lang.String
  var container: js.Any
  var initSegment: js.Any
  var levelCodec: js.Any
  var metadata: js.Any
}

object Tracks {
  @scala.inline
  def apply(
    codec: java.lang.String,
    container: js.Any,
    initSegment: js.Any,
    levelCodec: js.Any,
    metadata: js.Any
  ): Tracks = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("codec")(codec)
    __obj.updateDynamic("container")(container)
    __obj.updateDynamic("initSegment")(initSegment)
    __obj.updateDynamic("levelCodec")(levelCodec)
    __obj.updateDynamic("metadata")(metadata)
    __obj.asInstanceOf[Tracks]
  }
}

