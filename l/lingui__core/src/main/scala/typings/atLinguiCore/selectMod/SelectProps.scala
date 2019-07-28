package typings.atLinguiCore.selectMod

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
    val __obj = js.Dynamic.literal(other = other, value = value)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[SelectProps]
  }
}

