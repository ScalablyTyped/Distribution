package typings.materialUi.MaterialUI.Tabs

import typings.react.mod.CSSProperties
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.FormEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabsProps extends js.Object {
  
  var className: js.UndefOr[String] = js.native
  
  var contentContainerClassName: js.UndefOr[String] = js.native
  
  var contentContainerStyle: js.UndefOr[CSSProperties] = js.native
  
  var initialSelectedIndex: js.UndefOr[Double] = js.native
  
  var inkBarStyle: js.UndefOr[CSSProperties] = js.native
  
  var onChange: js.UndefOr[
    js.Function3[/* value */ js.Any, /* e */ FormEvent[js.Object], /* tab */ Tab, Unit]
  ] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var tabItemContainerStyle: js.UndefOr[CSSProperties] = js.native
  
  var tabTemplate: js.UndefOr[ComponentClass[_, ComponentState]] = js.native
  
  var tabTemplateStyle: js.UndefOr[CSSProperties] = js.native
  
  var value: js.UndefOr[js.Any] = js.native
}
object TabsProps {
  
  @scala.inline
  def apply(): TabsProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabsProps]
  }
  
  @scala.inline
  implicit class TabsPropsOps[Self <: TabsProps] (val x: Self) extends AnyVal {
    
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setContentContainerClassName(value: String): Self = this.set("contentContainerClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentContainerClassName: Self = this.set("contentContainerClassName", js.undefined)
    
    @scala.inline
    def setContentContainerStyle(value: CSSProperties): Self = this.set("contentContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentContainerStyle: Self = this.set("contentContainerStyle", js.undefined)
    
    @scala.inline
    def setInitialSelectedIndex(value: Double): Self = this.set("initialSelectedIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialSelectedIndex: Self = this.set("initialSelectedIndex", js.undefined)
    
    @scala.inline
    def setInkBarStyle(value: CSSProperties): Self = this.set("inkBarStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInkBarStyle: Self = this.set("inkBarStyle", js.undefined)
    
    @scala.inline
    def setOnChange(value: (/* value */ js.Any, /* e */ FormEvent[js.Object], /* tab */ Tab) => Unit): Self = this.set("onChange", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTabItemContainerStyle(value: CSSProperties): Self = this.set("tabItemContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabItemContainerStyle: Self = this.set("tabItemContainerStyle", js.undefined)
    
    @scala.inline
    def setTabTemplate(value: ComponentClass[_, ComponentState]): Self = this.set("tabTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabTemplate: Self = this.set("tabTemplate", js.undefined)
    
    @scala.inline
    def setTabTemplateStyle(value: CSSProperties): Self = this.set("tabTemplateStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabTemplateStyle: Self = this.set("tabTemplateStyle", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
