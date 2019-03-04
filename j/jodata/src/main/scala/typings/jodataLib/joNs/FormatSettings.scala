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
    isSet: js.Function0[scala.Boolean],
    reset: js.Function0[scala.Unit],
    toString: js.Function0[java.lang.String]
  ): FormatSettings = {
    val __obj = js.Dynamic.literal(DefaultFormat = DefaultFormat, Format = Format, isSet = isSet, reset = reset, toString = toString)
  
    __obj.asInstanceOf[FormatSettings]
  }
}

