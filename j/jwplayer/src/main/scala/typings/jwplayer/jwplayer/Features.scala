package typings.jwplayer.jwplayer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Features extends js.Object {
  var flash: Boolean
  var flashVersion: Double
  var iframe: Boolean
}

object Features {
  @scala.inline
  def apply(flash: Boolean, flashVersion: Double, iframe: Boolean): Features = {
    val __obj = js.Dynamic.literal(flash = flash, flashVersion = flashVersion, iframe = iframe)
  
    __obj.asInstanceOf[Features]
  }
}

