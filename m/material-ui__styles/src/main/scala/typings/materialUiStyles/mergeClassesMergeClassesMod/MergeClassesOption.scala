package typings.materialUiStyles.mergeClassesMergeClassesMod

import typings.react.mod.ElementType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MergeClassesOption extends js.Object {
  var Component: ElementType[_]
  var baseClasses: Classes
  var newClasses: Classes
}

object MergeClassesOption {
  @scala.inline
  def apply(Component: ElementType[_], baseClasses: Classes, newClasses: Classes): MergeClassesOption = {
    val __obj = js.Dynamic.literal(Component = Component.asInstanceOf[js.Any], baseClasses = baseClasses.asInstanceOf[js.Any], newClasses = newClasses.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MergeClassesOption]
  }
}

