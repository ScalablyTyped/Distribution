package typings.materialUiCore.anon

import typings.enzyme.mod.EnzymeSelector
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/test-utils/createShallow.ShallowOptions> */
@js.native
trait PartialShallowOptions extends js.Object {
  var dive: js.UndefOr[Boolean] = js.native
  var shallow: js.UndefOr[Fn2] = js.native
  var untilSelector: js.UndefOr[EnzymeSelector] = js.native
}

object PartialShallowOptions {
  @scala.inline
  def apply(): PartialShallowOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialShallowOptions]
  }
  @scala.inline
  implicit class PartialShallowOptionsOps[Self <: PartialShallowOptions] (val x: Self) extends AnyVal {
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
    def deleteDive: Self = this.set("dive", js.undefined)
    @scala.inline
    def setShallow(value: Fn2): Self = this.set("shallow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShallow: Self = this.set("shallow", js.undefined)
    @scala.inline
    def setUntilSelectorFunction2(value: (js.Any, /* context */ js.UndefOr[js.Any]) => Element | Null): Self = this.set("untilSelector", js.Any.fromFunction2(value))
    @scala.inline
    def setUntilSelector(value: EnzymeSelector): Self = this.set("untilSelector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUntilSelector: Self = this.set("untilSelector", js.undefined)
  }
  
}

