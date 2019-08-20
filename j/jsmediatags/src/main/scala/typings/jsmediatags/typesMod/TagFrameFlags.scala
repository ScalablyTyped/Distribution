package typings.jsmediatags.typesMod

import typings.jsmediatags.Anon_Compression
import typings.jsmediatags.Anon_Filealterpreservation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagFrameFlags extends js.Object {
  var format: Anon_Compression
  var message: Anon_Filealterpreservation
}

object TagFrameFlags {
  @scala.inline
  def apply(format: Anon_Compression, message: Anon_Filealterpreservation): TagFrameFlags = {
    val __obj = js.Dynamic.literal(format = format, message = message)
  
    __obj.asInstanceOf[TagFrameFlags]
  }
}

