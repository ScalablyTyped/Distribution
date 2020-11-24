package typings.handsontable.mod.Handsontable.plugins.FiltersPlugin

import typings.handsontable.mod.Handsontable.plugins.EventManager
import typings.handsontable.mod._Handsontable.Core
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseUI extends js.Object {
  
  def build(): Unit = js.native
  
  var buildState: Boolean = js.native
  
  def destroy(): Unit = js.native
  
  def element(): Element = js.native
  
  var eventManager: EventManager = js.native
  
  def focus(): Unit = js.native
  
  def getValue(): js.Any = js.native
  
  def hide(): Unit = js.native
  
  var hot: Core = js.native
  
  def isBuilt(): Boolean = js.native
  
  var options: js.Object = js.native
  
  def reset(): Unit = js.native
  
  def setValue(value: js.Any): js.Any = js.native
  
  def show(): Unit = js.native
  
  def update(): Unit = js.native
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
  
  @scala.inline
  implicit class BaseUIOps[Self <: BaseUI] (val x: Self) extends AnyVal {
    
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
    def setBuild(value: () => Unit): Self = this.set("build", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBuildState(value: Boolean): Self = this.set("buildState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setElement(value: () => Element): Self = this.set("element", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEventManager(value: EventManager): Self = this.set("eventManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocus(value: () => Unit): Self = this.set("focus", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetValue(value: () => js.Any): Self = this.set("getValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHide(value: () => Unit): Self = this.set("hide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHot(value: Core): Self = this.set("hot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsBuilt(value: () => Boolean): Self = this.set("isBuilt", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOptions(value: js.Object): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReset(value: () => Unit): Self = this.set("reset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetValue(value: js.Any => js.Any): Self = this.set("setValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShow(value: () => Unit): Self = this.set("show", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUpdate(value: () => Unit): Self = this.set("update", js.Any.fromFunction0(value))
  }
}
