package typings.jodata.jo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InlineCountSettings extends ISettings {
  var DefaultInlineCount: String
  var InlineCount: String
}

object InlineCountSettings {
  @scala.inline
  def apply(
    DefaultInlineCount: String,
    InlineCount: String,
    isSet: () => Boolean,
    reset: () => Unit,
    toString: () => String
  ): InlineCountSettings = {
    val __obj = js.Dynamic.literal(DefaultInlineCount = DefaultInlineCount, InlineCount = InlineCount, isSet = js.Any.fromFunction0(isSet), reset = js.Any.fromFunction0(reset), toString = js.Any.fromFunction0(toString))
  
    __obj.asInstanceOf[InlineCountSettings]
  }
}

