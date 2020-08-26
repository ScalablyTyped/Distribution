package typings.knockout.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualElementsAllowedBindings extends /* name */ StringDictionary[Boolean] {
  var component: Boolean = js.native
  var foreach: Boolean = js.native
  var `if`: Boolean = js.native
  var ifnot: Boolean = js.native
  var let: Boolean = js.native
  var template: Boolean = js.native
  var text: Boolean = js.native
  var using: Boolean = js.native
  var `with`: Boolean = js.native
}

object VirtualElementsAllowedBindings {
  @scala.inline
  def apply(
    component: Boolean,
    foreach: Boolean,
    `if`: Boolean,
    ifnot: Boolean,
    let: Boolean,
    template: Boolean,
    text: Boolean,
    using: Boolean,
    `with`: Boolean
  ): VirtualElementsAllowedBindings = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], foreach = foreach.asInstanceOf[js.Any], ifnot = ifnot.asInstanceOf[js.Any], let = let.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], using = using.asInstanceOf[js.Any])
    __obj.updateDynamic("if")(`if`.asInstanceOf[js.Any])
    __obj.updateDynamic("with")(`with`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualElementsAllowedBindings]
  }
  @scala.inline
  implicit class VirtualElementsAllowedBindingsOps[Self <: VirtualElementsAllowedBindings] (val x: Self) extends AnyVal {
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
    def setComponent(value: Boolean): Self = this.set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def setForeach(value: Boolean): Self = this.set("foreach", value.asInstanceOf[js.Any])
    @scala.inline
    def setIf(value: Boolean): Self = this.set("if", value.asInstanceOf[js.Any])
    @scala.inline
    def setIfnot(value: Boolean): Self = this.set("ifnot", value.asInstanceOf[js.Any])
    @scala.inline
    def setLet(value: Boolean): Self = this.set("let", value.asInstanceOf[js.Any])
    @scala.inline
    def setTemplate(value: Boolean): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: Boolean): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsing(value: Boolean): Self = this.set("using", value.asInstanceOf[js.Any])
    @scala.inline
    def setWith(value: Boolean): Self = this.set("with", value.asInstanceOf[js.Any])
  }
  
}

