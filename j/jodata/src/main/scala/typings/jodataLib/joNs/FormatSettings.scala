package typings
package jodataLib.joNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatSettings extends ISettings {
  var DefaultFormat: java.lang.String
  var Format: java.lang.String
}

object FormatSettings {
  @scala.inline
  def apply(
    DefaultFormat: java.lang.String,
    Format: java.lang.String,
    isSet: () => scala.Boolean,
    reset: () => scala.Unit,
    toString: () => java.lang.String
  ): FormatSettings = {
    val __obj = js.Dynamic.literal(DefaultFormat = DefaultFormat, Format = Format, isSet = js.Any.fromFunction0(isSet), reset = js.Any.fromFunction0(reset), toString = js.Any.fromFunction0(toString))
  
    __obj.asInstanceOf[FormatSettings]
  }
}

