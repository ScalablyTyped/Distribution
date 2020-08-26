package typings.jsmediatags.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagFrameHeader extends js.Object {
  var flags: js.UndefOr[TagFrameFlags] = js.native
  var headerSize: Double = js.native
  var id: String = js.native
  var size: Double = js.native
}

object TagFrameHeader {
  @scala.inline
  def apply(headerSize: Double, id: String, size: Double): TagFrameHeader = {
    val __obj = js.Dynamic.literal(headerSize = headerSize.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagFrameHeader]
  }
  @scala.inline
  implicit class TagFrameHeaderOps[Self <: TagFrameHeader] (val x: Self) extends AnyVal {
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
    def setHeaderSize(value: Double): Self = this.set("headerSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlags(value: TagFrameFlags): Self = this.set("flags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlags: Self = this.set("flags", js.undefined)
  }
  
}

