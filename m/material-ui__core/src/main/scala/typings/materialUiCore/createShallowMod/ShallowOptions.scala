package typings.materialUiCore.createShallowMod

import typings.enzyme.mod.EnzymeSelector
import typings.materialUiCore.anon.Fn1
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShallowOptions extends js.Object {
  var dive: Boolean = js.native
  var shallow: Fn1 = js.native
  var untilSelector: EnzymeSelector = js.native
}

object ShallowOptions {
  @scala.inline
  def apply(dive: Boolean, shallow: Fn1, untilSelector: EnzymeSelector): ShallowOptions = {
    val __obj = js.Dynamic.literal(dive = dive.asInstanceOf[js.Any], shallow = shallow.asInstanceOf[js.Any], untilSelector = untilSelector.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShallowOptions]
  }
  @scala.inline
  implicit class ShallowOptionsOps[Self <: ShallowOptions] (val x: Self) extends AnyVal {
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
    def setDive(value: Boolean): Self = this.set("dive", value.asInstanceOf[js.Any])
    @scala.inline
    def setShallow(value: Fn1): Self = this.set("shallow", value.asInstanceOf[js.Any])
    @scala.inline
    def setUntilSelectorFunction2(value: (js.Any, /* context */ js.UndefOr[js.Any]) => Element | Null): Self = this.set("untilSelector", js.Any.fromFunction2(value))
    @scala.inline
    def setUntilSelector(value: EnzymeSelector): Self = this.set("untilSelector", value.asInstanceOf[js.Any])
  }
  
}

