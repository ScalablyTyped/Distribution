package typings.jodata.jo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatSettings extends ISettings {
  var DefaultFormat: String
  var Format: String
}

object FormatSettings {
  @scala.inline
  def apply(DefaultFormat: String, Format: String, isSet: () => Boolean, reset: () => Unit): FormatSettings = {
    val __obj = js.Dynamic.literal(DefaultFormat = DefaultFormat.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], isSet = js.Any.fromFunction0(isSet), reset = js.Any.fromFunction0(reset))
    __obj.asInstanceOf[FormatSettings]
  }
}

