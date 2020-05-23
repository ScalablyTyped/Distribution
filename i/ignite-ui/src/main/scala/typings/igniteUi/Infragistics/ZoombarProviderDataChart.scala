package typings.igniteUi.Infragistics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoombarProviderDataChart extends js.Object {
  def clean(): Unit
  def cleanOptsForZoom(options: js.Object): Unit
  def createClone(container: js.Object, options: js.Object): Unit
  def getBaseOpts(options: js.Object): Unit
  def setSize(width: js.Object, height: js.Object): Unit
  def syncMinWidth(minWidth: js.Object): Unit
  def targetObject(obj: js.Object): Unit
  def targetWidth(): Unit
  def update(a: js.Object, b: js.Object): Unit
  def widgetName(): Unit
}

object ZoombarProviderDataChart {
  @scala.inline
  def apply(
    clean: () => Unit,
    cleanOptsForZoom: js.Object => Unit,
    createClone: (js.Object, js.Object) => Unit,
    getBaseOpts: js.Object => Unit,
    setSize: (js.Object, js.Object) => Unit,
    syncMinWidth: js.Object => Unit,
    targetObject: js.Object => Unit,
    targetWidth: () => Unit,
    update: (js.Object, js.Object) => Unit,
    widgetName: () => Unit
  ): ZoombarProviderDataChart = {
    val __obj = js.Dynamic.literal(clean = js.Any.fromFunction0(clean), cleanOptsForZoom = js.Any.fromFunction1(cleanOptsForZoom), createClone = js.Any.fromFunction2(createClone), getBaseOpts = js.Any.fromFunction1(getBaseOpts), setSize = js.Any.fromFunction2(setSize), syncMinWidth = js.Any.fromFunction1(syncMinWidth), targetObject = js.Any.fromFunction1(targetObject), targetWidth = js.Any.fromFunction0(targetWidth), update = js.Any.fromFunction2(update), widgetName = js.Any.fromFunction0(widgetName))
    __obj.asInstanceOf[ZoombarProviderDataChart]
  }
}

