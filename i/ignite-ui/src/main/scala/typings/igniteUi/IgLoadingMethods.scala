package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgLoadingMethods extends js.Object {
  def destroy(): Unit
  def hide(): Unit
  def indicator(): Unit
  def indicatorElement(): Unit
  def refreshPos(): Unit
  def show(refresh: js.Object): Unit
}

object IgLoadingMethods {
  @scala.inline
  def apply(
    destroy: () => Unit,
    hide: () => Unit,
    indicator: () => Unit,
    indicatorElement: () => Unit,
    refreshPos: () => Unit,
    show: js.Object => Unit
  ): IgLoadingMethods = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), hide = js.Any.fromFunction0(hide), indicator = js.Any.fromFunction0(indicator), indicatorElement = js.Any.fromFunction0(indicatorElement), refreshPos = js.Any.fromFunction0(refreshPos), show = js.Any.fromFunction1(show))
  
    __obj.asInstanceOf[IgLoadingMethods]
  }
}

