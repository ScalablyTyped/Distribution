package typings.handsontable.mod.Handsontable.plugins.FiltersPlugin

import typings.handsontable.mod.Handsontable.plugins.EventManager
import typings.handsontable.mod._Handsontable.Core
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseUI extends js.Object {
  var buildState: Boolean
  var eventManager: EventManager
  var hot: Core
  var options: js.Object
  def build(): Unit
  def destroy(): Unit
  def element(): Element
  def focus(): Unit
  def getValue(): js.Any
  def hide(): Unit
  def isBuilt(): Boolean
  def reset(): Unit
  def setValue(value: js.Any): js.Any
  def show(): Unit
  def update(): Unit
}

object BaseUI {
  @scala.inline
  def apply(
    build: () => Unit,
    buildState: Boolean,
    destroy: () => Unit,
    element: () => Element,
    eventManager: EventManager,
    focus: () => Unit,
    getValue: () => js.Any,
    hide: () => Unit,
    hot: Core,
    isBuilt: () => Boolean,
    options: js.Object,
    reset: () => Unit,
    setValue: js.Any => js.Any,
    show: () => Unit,
    update: () => Unit
  ): BaseUI = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), buildState = buildState.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), element = js.Any.fromFunction0(element), eventManager = eventManager.asInstanceOf[js.Any], focus = js.Any.fromFunction0(focus), getValue = js.Any.fromFunction0(getValue), hide = js.Any.fromFunction0(hide), hot = hot.asInstanceOf[js.Any], isBuilt = js.Any.fromFunction0(isBuilt), options = options.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), setValue = js.Any.fromFunction1(setValue), show = js.Any.fromFunction0(show), update = js.Any.fromFunction0(update))
  
    __obj.asInstanceOf[BaseUI]
  }
}

