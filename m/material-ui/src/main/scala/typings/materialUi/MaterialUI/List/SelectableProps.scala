package typings.materialUi.MaterialUI.List

import typings.react.mod.CSSProperties
import typings.react.mod.SyntheticEvent
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectableProps extends js.Object {
  
  var onChange: js.UndefOr[js.Function2[/* e */ SyntheticEvent[js.Object, Event], /* value */ js.Any, Unit]] = js.native
  
  var selectedItemStyle: js.UndefOr[CSSProperties] = js.native
  
  var value: js.UndefOr[js.Any] = js.native
}
object SelectableProps {
  
  @scala.inline
  def apply(): SelectableProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectableProps]
  }
  
  @scala.inline
  implicit class SelectablePropsOps[Self <: SelectableProps] (val x: Self) extends AnyVal {
    
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
    def setOnChange(value: (/* e */ SyntheticEvent[js.Object, Event], /* value */ js.Any) => Unit): Self = this.set("onChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setSelectedItemStyle(value: CSSProperties): Self = this.set("selectedItemStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedItemStyle: Self = this.set("selectedItemStyle", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
