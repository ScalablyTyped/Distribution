package typings.mailgunDashJs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Template extends /* templateVariable */ StringDictionary[String] {
  var template: String
}

object Anon_Template {
  @scala.inline
  def apply(template: String, StringDictionary: /* templateVariable */ StringDictionary[String] = null): Anon_Template = {
    val __obj = js.Dynamic.literal(template = template)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_Template]
  }
}

