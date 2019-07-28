package typings.jscodeshift.srcCoreMod

import typings.jscodeshift.srcCollectionsJSXElementMod.FilterMethods
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filters extends js.Object {
  var JSXElement: FilterMethods
  var VariableDeclarator: typings.jscodeshift.srcCollectionsVariableDeclaratorMod.FilterMethods
}

object Filters {
  @scala.inline
  def apply(
    JSXElement: FilterMethods,
    VariableDeclarator: typings.jscodeshift.srcCollectionsVariableDeclaratorMod.FilterMethods
  ): Filters = {
    val __obj = js.Dynamic.literal(JSXElement = JSXElement, VariableDeclarator = VariableDeclarator)
  
    __obj.asInstanceOf[Filters]
  }
}

