package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgLoadingMethods extends js.Object {
  def destroy(): scala.Unit
  def hide(): scala.Unit
  def indicator(): scala.Unit
  def indicatorElement(): scala.Unit
  def refreshPos(): scala.Unit
  def show(refresh: js.Object): scala.Unit
}

object IgLoadingMethods {
  @scala.inline
  def apply(
    destroy: js.Function0[scala.Unit],
    hide: js.Function0[scala.Unit],
    indicator: js.Function0[scala.Unit],
    indicatorElement: js.Function0[scala.Unit],
    refreshPos: js.Function0[scala.Unit],
    show: js.Function1[js.Object, scala.Unit]
  ): IgLoadingMethods = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destroy")(destroy)
    __obj.updateDynamic("hide")(hide)
    __obj.updateDynamic("indicator")(indicator)
    __obj.updateDynamic("indicatorElement")(indicatorElement)
    __obj.updateDynamic("refreshPos")(refreshPos)
    __obj.updateDynamic("show")(show)
    __obj.asInstanceOf[IgLoadingMethods]
  }
}

