package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs.FiltersPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionBarComponent extends BaseComponent {
  def accept(): scala.Unit
  def cancel(): scala.Unit
  def getMenuItemDescriptor(): js.Object
}

object ActionBarComponent {
  @scala.inline
  def apply(
    accept: js.Function0[scala.Unit],
    cancel: js.Function0[scala.Unit],
    destroy: js.Function0[scala.Boolean],
    elements: js.Array[_],
    getMenuItemDescriptor: js.Function0[js.Object],
    hidden: scala.Boolean,
    hide: js.Function0[scala.Unit],
    isHidden: js.Function0[scala.Boolean],
    reset: js.Function0[scala.Unit],
    show: js.Function0[scala.Unit]
  ): ActionBarComponent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("accept")(accept)
    __obj.updateDynamic("cancel")(cancel)
    __obj.updateDynamic("destroy")(destroy)
    __obj.updateDynamic("elements")(elements)
    __obj.updateDynamic("getMenuItemDescriptor")(getMenuItemDescriptor)
    __obj.updateDynamic("hidden")(hidden)
    __obj.updateDynamic("hide")(hide)
    __obj.updateDynamic("isHidden")(isHidden)
    __obj.updateDynamic("reset")(reset)
    __obj.updateDynamic("show")(show)
    __obj.asInstanceOf[ActionBarComponent]
  }
}

