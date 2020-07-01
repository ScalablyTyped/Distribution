package typings.materialUiCore.anon

import typings.materialUiCore.withStylesMod.ClassNameMap
import typings.materialUiCore.withStylesMod.StyleRules
import typings.materialUiCore.withStylesMod.StyleRulesCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Classes[T /* <: String | StyleRules[String] | StyleRulesCallback[String] */] extends js.Object {
  var classes: ClassNameMap[_ | T] = js.native
}

object Classes {
  @scala.inline
  def apply[/* <: java.lang.String | typings.materialUiCore.withStylesMod.StyleRules[java.lang.String] | typings.materialUiCore.withStylesMod.StyleRulesCallback[java.lang.String] */ T](classes: ClassNameMap[_ | T]): Classes[T] = {
    val __obj = js.Dynamic.literal(classes = classes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Classes[T]]
  }
}

