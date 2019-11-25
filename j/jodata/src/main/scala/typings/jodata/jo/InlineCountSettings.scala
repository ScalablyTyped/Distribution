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
  def apply(DefaultInlineCount: String, InlineCount: String, isSet: () => Boolean, reset: () => Unit): InlineCountSettings = {
    val __obj = js.Dynamic.literal(DefaultInlineCount = DefaultInlineCount.asInstanceOf[js.Any], InlineCount = InlineCount.asInstanceOf[js.Any], isSet = js.Any.fromFunction0(isSet), reset = js.Any.fromFunction0(reset))
  
    __obj.asInstanceOf[InlineCountSettings]
  }
}

