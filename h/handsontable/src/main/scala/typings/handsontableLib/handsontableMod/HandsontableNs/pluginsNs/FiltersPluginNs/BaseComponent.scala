package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs.FiltersPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseComponent extends js.Object {
  var elements: js.Array[_]
  var hidden: scala.Boolean
  def destroy(): scala.Boolean
  def hide(): scala.Unit
  def isHidden(): scala.Boolean
  def reset(): scala.Unit
  def show(): scala.Unit
}

object BaseComponent {
  @scala.inline
  def apply(
    destroy: js.Function0[scala.Boolean],
    elements: js.Array[_],
    hidden: scala.Boolean,
    hide: js.Function0[scala.Unit],
    isHidden: js.Function0[scala.Boolean],
    reset: js.Function0[scala.Unit],
    show: js.Function0[scala.Unit]
  ): BaseComponent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destroy")(destroy)
    __obj.updateDynamic("elements")(elements)
    __obj.updateDynamic("hidden")(hidden)
    __obj.updateDynamic("hide")(hide)
    __obj.updateDynamic("isHidden")(isHidden)
    __obj.updateDynamic("reset")(reset)
    __obj.updateDynamic("show")(show)
    __obj.asInstanceOf[BaseComponent]
  }
}

