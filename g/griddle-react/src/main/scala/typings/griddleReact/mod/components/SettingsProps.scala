package typings.griddleReact.mod.components

import typings.griddleReact.mod.GriddleComponent
import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SettingsProps extends js.Object {
  
  var className: js.UndefOr[String] = js.native
  
  var settingsComponents: js.UndefOr[js.Array[GriddleComponent[_]]] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
}
object SettingsProps {
  
  @scala.inline
  def apply(): SettingsProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SettingsProps]
  }
  
  @scala.inline
  implicit class SettingsPropsOps[Self <: SettingsProps] (val x: Self) extends AnyVal {
    
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
    def setSettingsComponentsVarargs(value: GriddleComponent[js.Any]*): Self = this.set("settingsComponents", js.Array(value :_*))
    
    @scala.inline
    def setSettingsComponents(value: js.Array[GriddleComponent[_]]): Self = this.set("settingsComponents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSettingsComponents: Self = this.set("settingsComponents", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
