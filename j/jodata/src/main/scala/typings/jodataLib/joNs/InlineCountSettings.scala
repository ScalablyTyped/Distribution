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
    isSet: () => scala.Boolean,
    reset: () => scala.Unit,
    toString: () => java.lang.String
  ): InlineCountSettings = {
    val __obj = js.Dynamic.literal(DefaultInlineCount = DefaultInlineCount, InlineCount = InlineCount, isSet = js.Any.fromFunction0(isSet), reset = js.Any.fromFunction0(reset), toString = js.Any.fromFunction0(toString))
  
    __obj.asInstanceOf[InlineCountSettings]
  }
}

