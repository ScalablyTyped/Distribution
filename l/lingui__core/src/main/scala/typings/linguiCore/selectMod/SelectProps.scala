package typings.linguiCore.selectMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectProps extends /* selectForm */ StringDictionary[String] {
  var other: String
  var value: String
}

object SelectProps {
  @scala.inline
  def apply(other: String, value: String, StringDictionary: /* selectForm */ StringDictionary[String] = null): SelectProps = {
    val __obj = js.Dynamic.literal(other = other.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[SelectProps]
  }
}

