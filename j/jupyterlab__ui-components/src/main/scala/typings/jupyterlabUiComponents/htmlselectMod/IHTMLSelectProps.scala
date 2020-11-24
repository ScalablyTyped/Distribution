package typings.jupyterlabUiComponents.htmlselectMod

import typings.jupyterlabUiComponents.iconMod.LabIcon
import typings.jupyterlabUiComponents.interfaceMod.IElementRefProps
import typings.jupyterlabUiComponents.labiconMod.LabIcon.IProps
import typings.react.mod.SelectHTMLAttributes
import typings.std.HTMLSelectElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHTMLSelectProps
  extends SelectHTMLAttributes[HTMLSelectElement]
     with IElementRefProps[HTMLSelectElement] {
  
  var defaultStyle: js.UndefOr[Boolean] = js.native
  
  var icon: js.UndefOr[LabIcon] = js.native
  
  var iconProps: js.UndefOr[IProps] = js.native
  
  var options: js.UndefOr[js.Array[String | Double | IOptionProps]] = js.native
}
object IHTMLSelectProps {
  
  @scala.inline
  def apply(): IHTMLSelectProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHTMLSelectProps]
  }
  
  @scala.inline
  implicit class IHTMLSelectPropsOps[Self <: IHTMLSelectProps] (val x: Self) extends AnyVal {
    
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
    def setDefaultStyle(value: Boolean): Self = this.set("defaultStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultStyle: Self = this.set("defaultStyle", js.undefined)
    
    @scala.inline
    def setIcon(value: LabIcon): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setIconProps(value: IProps): Self = this.set("iconProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconProps: Self = this.set("iconProps", js.undefined)
    
    @scala.inline
    def setOptionsVarargs(value: (String | Double | IOptionProps)*): Self = this.set("options", js.Array(value :_*))
    
    @scala.inline
    def setOptions(value: js.Array[String | Double | IOptionProps]): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
}
