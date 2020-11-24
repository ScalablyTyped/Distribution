package typings.inkSelectInput.mod

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectInputProps[T /* <: ItemOfSelectInput */] extends js.Object {
  
  var focus: js.UndefOr[Boolean] = js.native
  
  var indicatorComponent: js.UndefOr[Component[js.Object, js.Object, _]] = js.native
  
  var initialIndex: js.UndefOr[Double] = js.native
  
  var itemComponent: js.UndefOr[Component[js.Object, js.Object, _]] = js.native
  
  var items: js.UndefOr[js.Array[T]] = js.native
  
  var limit: js.UndefOr[Double] = js.native
  
  var onSelect: js.UndefOr[js.Function1[/* item */ T, Unit]] = js.native
}
object SelectInputProps {
  
  @scala.inline
  def apply[T /* <: ItemOfSelectInput */](): SelectInputProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectInputProps[T]]
  }
  
  @scala.inline
  implicit class SelectInputPropsOps[Self <: SelectInputProps[_], T /* <: ItemOfSelectInput */] (val x: Self with SelectInputProps[T]) extends AnyVal {
    
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
    def setFocus(value: Boolean): Self = this.set("focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocus: Self = this.set("focus", js.undefined)
    
    @scala.inline
    def setIndicatorComponent(value: Component[js.Object, js.Object, _]): Self = this.set("indicatorComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndicatorComponent: Self = this.set("indicatorComponent", js.undefined)
    
    @scala.inline
    def setInitialIndex(value: Double): Self = this.set("initialIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialIndex: Self = this.set("initialIndex", js.undefined)
    
    @scala.inline
    def setItemComponent(value: Component[js.Object, js.Object, _]): Self = this.set("itemComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemComponent: Self = this.set("itemComponent", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: T*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[T]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    
    @scala.inline
    def setOnSelect(value: /* item */ T => Unit): Self = this.set("onSelect", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
  }
}
