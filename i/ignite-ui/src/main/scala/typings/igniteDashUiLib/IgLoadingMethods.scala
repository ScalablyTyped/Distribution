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
    val __obj = js.Dynamic.literal(destroy = destroy, hide = hide, indicator = indicator, indicatorElement = indicatorElement, refreshPos = refreshPos, show = show)
  
    __obj.asInstanceOf[IgLoadingMethods]
  }
}

