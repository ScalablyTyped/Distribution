package typings.linguiMacro.selectMod

import org.scalablytyped.runtime.StringDictionary
import typings.linguiCore.i18nMod.MessageDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectProps extends /* selectForm */ StringDictionary[String | MessageDescriptor] {
  var other: String | MessageDescriptor
  var value: String
}

object SelectProps {
  @scala.inline
  def apply(
    other: String | MessageDescriptor,
    value: String,
    StringDictionary: /* selectForm */ StringDictionary[String | MessageDescriptor] = null
  ): SelectProps = {
    val __obj = js.Dynamic.literal(other = other.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[SelectProps]
  }
}

