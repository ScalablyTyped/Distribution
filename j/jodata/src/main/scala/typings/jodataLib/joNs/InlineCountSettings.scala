package typings
package jodataLib.joNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InlineCountSettings extends ISettings {
  var DefaultInlineCount: java.lang.String
  var InlineCount: java.lang.String
}

object InlineCountSettings {
  @scala.inline
  def apply(
    DefaultInlineCount: java.lang.String,
    InlineCount: java.lang.String,
    isSet: js.Function0[scala.Boolean],
    reset: js.Function0[scala.Unit],
    toString: js.Function0[java.lang.String]
  ): InlineCountSettings = {
    val __obj = js.Dynamic.literal(DefaultInlineCount = DefaultInlineCount, InlineCount = InlineCount, isSet = isSet, reset = reset, toString = toString)
  
    __obj.asInstanceOf[InlineCountSettings]
  }
}

