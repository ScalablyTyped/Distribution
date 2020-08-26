package typings.jsmediatags.typesMod

import typings.jsmediatags.anon.Compression
import typings.jsmediatags.anon.Filealterpreservation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagFrameFlags extends js.Object {
  var format: Compression = js.native
  var message: Filealterpreservation = js.native
}

object TagFrameFlags {
  @scala.inline
  def apply(format: Compression, message: Filealterpreservation): TagFrameFlags = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagFrameFlags]
  }
  @scala.inline
  implicit class TagFrameFlagsOps[Self <: TagFrameFlags] (val x: Self) extends AnyVal {
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
    def setFormat(value: Compression): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: Filealterpreservation): Self = this.set("message", value.asInstanceOf[js.Any])
  }
  
}

