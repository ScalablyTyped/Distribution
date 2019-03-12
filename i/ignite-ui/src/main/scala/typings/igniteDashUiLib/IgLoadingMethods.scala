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
    destroy: () => scala.Unit,
    hide: () => scala.Unit,
    indicator: () => scala.Unit,
    indicatorElement: () => scala.Unit,
    refreshPos: () => scala.Unit,
    show: js.Object => scala.Unit
  ): IgLoadingMethods = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), hide = js.Any.fromFunction0(hide), indicator = js.Any.fromFunction0(indicator), indicatorElement = js.Any.fromFunction0(indicatorElement), refreshPos = js.Any.fromFunction0(refreshPos), show = js.Any.fromFunction1(show))
  
    __obj.asInstanceOf[IgLoadingMethods]
  }
}

