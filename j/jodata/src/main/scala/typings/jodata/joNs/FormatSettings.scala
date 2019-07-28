package typings.jodata.joNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatSettings extends ISettings {
  var DefaultFormat: String
  var Format: String
}

object FormatSettings {
  @scala.inline
  def apply(
    DefaultFormat: String,
    Format: String,
    isSet: () => Boolean,
    reset: () => Unit,
    toString: () => String
  ): FormatSettings = {
    val __obj = js.Dynamic.literal(DefaultFormat = DefaultFormat, Format = Format, isSet = js.Any.fromFunction0(isSet), reset = js.Any.fromFunction0(reset), toString = js.Any.fromFunction0(toString))
  
    __obj.asInstanceOf[FormatSettings]
  }
}

