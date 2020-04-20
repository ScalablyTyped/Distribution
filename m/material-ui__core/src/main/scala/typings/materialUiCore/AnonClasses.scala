package typings.materialUiCore

import typings.materialUiCore.withStylesMod.ClassNameMap
import typings.materialUiCore.withStylesMod.StyleRules
import typings.materialUiCore.withStylesMod.StyleRulesCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonClasses[T /* <: String | StyleRules[String] | StyleRulesCallback[String] */] extends js.Object {
  var classes: ClassNameMap[_ | T] = js.native
}

object AnonClasses {
  @scala.inline
  def apply[T /* <: String | StyleRules[String] | StyleRulesCallback[String] */](classes: ClassNameMap[_ | T]): AnonClasses[T] = {
    val __obj = js.Dynamic.literal(classes = classes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClasses[T]]
  }
}

