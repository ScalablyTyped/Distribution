package typings.jsmediatags.typesMod

import typings.jsmediatags.anon.Compression
import typings.jsmediatags.anon.Filealterpreservation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagFrameFlags extends js.Object {
  var format: Compression
  var message: Filealterpreservation
}

object TagFrameFlags {
  @scala.inline
  def apply(format: Compression, message: Filealterpreservation): TagFrameFlags = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagFrameFlags]
  }
}

