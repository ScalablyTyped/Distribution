package typings.mailgunJs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTemplate extends /* templateVariable */ StringDictionary[String] {
  var template: String
}

object AnonTemplate {
  @scala.inline
  def apply(template: String, StringDictionary: /* templateVariable */ StringDictionary[String] = null): AnonTemplate = {
    val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonTemplate]
  }
}

