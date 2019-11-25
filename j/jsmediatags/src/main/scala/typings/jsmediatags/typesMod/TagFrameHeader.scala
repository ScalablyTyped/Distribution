package typings.jsmediatags.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagFrameHeader extends js.Object {
  var flags: js.UndefOr[TagFrameFlags] = js.undefined
  var headerSize: Double
  var id: String
  var size: Double
}

object TagFrameHeader {
  @scala.inline
  def apply(headerSize: Double, id: String, size: Double, flags: TagFrameFlags = null): TagFrameHeader = {
    val __obj = js.Dynamic.literal(headerSize = headerSize.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    if (flags != null) __obj.updateDynamic("flags")(flags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagFrameHeader]
  }
}

