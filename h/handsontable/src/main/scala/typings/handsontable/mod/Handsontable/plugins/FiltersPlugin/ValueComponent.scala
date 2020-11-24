package typings.handsontable.mod.Handsontable.plugins.FiltersPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValueComponent extends BaseComponent {
  
  def getMenuItemDescriptor(): js.Object = js.native
  
  def getMultipleSelectElement(): MultipleSelectUI = js.native
  
  def getState(): js.Object = js.native
  
  def setState(value: js.Object): Unit = js.native
  
  def updateState(stateInfo: js.Object): Unit = js.native
}
object ValueComponent {
  
  @scala.inline
  def apply(
    destroy: () => Boolean,
    elements: js.Array[_],
    getMenuItemDescriptor: () => js.Object,
    getMultipleSelectElement: () => MultipleSelectUI,
    getState: () => js.Object,
    hidden: Boolean,
    hide: () => Unit,
    isHidden: () => Boolean,
    reset: () => Unit,
    setState: js.Object => Unit,
    show: () => Unit,
    updateState: js.Object => Unit
  ): ValueComponent = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), elements = elements.asInstanceOf[js.Any], getMenuItemDescriptor = js.Any.fromFunction0(getMenuItemDescriptor), getMultipleSelectElement = js.Any.fromFunction0(getMultipleSelectElement), getState = js.Any.fromFunction0(getState), hidden = hidden.asInstanceOf[js.Any], hide = js.Any.fromFunction0(hide), isHidden = js.Any.fromFunction0(isHidden), reset = js.Any.fromFunction0(reset), setState = js.Any.fromFunction1(setState), show = js.Any.fromFunction0(show), updateState = js.Any.fromFunction1(updateState))
    __obj.asInstanceOf[ValueComponent]
  }
  
  @scala.inline
  implicit class ValueComponentOps[Self <: ValueComponent] (val x: Self) extends AnyVal {
    
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
    def setGetMenuItemDescriptor(value: () => js.Object): Self = this.set("getMenuItemDescriptor", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMultipleSelectElement(value: () => MultipleSelectUI): Self = this.set("getMultipleSelectElement", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetState(value: () => js.Object): Self = this.set("getState", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetState(value: js.Object => Unit): Self = this.set("setState", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdateState(value: js.Object => Unit): Self = this.set("updateState", js.Any.fromFunction1(value))
  }
}
