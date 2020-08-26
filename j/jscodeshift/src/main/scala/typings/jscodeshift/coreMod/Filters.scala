package typings.jscodeshift.coreMod

import typings.jscodeshift.jsxelementMod.FilterMethods
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Filters extends js.Object {
  var JSXElement: FilterMethods = js.native
  var VariableDeclarator: typings.jscodeshift.variableDeclaratorMod.FilterMethods = js.native
}

object Filters {
  @scala.inline
  def apply(
    JSXElement: FilterMethods,
    VariableDeclarator: typings.jscodeshift.variableDeclaratorMod.FilterMethods
  ): Filters = {
    val __obj = js.Dynamic.literal(JSXElement = JSXElement.asInstanceOf[js.Any], VariableDeclarator = VariableDeclarator.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filters]
  }
  @scala.inline
  implicit class FiltersOps[Self <: Filters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setJSXElement(value: FilterMethods): Self = this.set("JSXElement", value.asInstanceOf[js.Any])
    @scala.inline
    def setVariableDeclarator(value: typings.jscodeshift.variableDeclaratorMod.FilterMethods): Self = this.set("VariableDeclarator", value.asInstanceOf[js.Any])
  }
  
}

