package typings.hlsDotJs.hlsDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tracks extends js.Object {
  var codec: String
  var container: js.Any
  var initSegment: js.Any
  var levelCodec: js.Any
  var metadata: js.Any
}

object Tracks {
  @scala.inline
  def apply(codec: String, container: js.Any, initSegment: js.Any, levelCodec: js.Any, metadata: js.Any): Tracks = {
    val __obj = js.Dynamic.literal(codec = codec.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], initSegment = initSegment.asInstanceOf[js.Any], levelCodec = levelCodec.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Tracks]
  }
}

