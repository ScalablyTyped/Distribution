package typings.materialUi.MaterialUI.Styles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MuiThemeProviderProps extends js.Object {
  
  var muiTheme: js.UndefOr[MuiTheme] = js.native
}
object MuiThemeProviderProps {
  
  @scala.inline
  def apply(): MuiThemeProviderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MuiThemeProviderProps]
  }
  
  @scala.inline
  implicit class MuiThemeProviderPropsOps[Self <: MuiThemeProviderProps] (val x: Self) extends AnyVal {
    
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
    def setMuiTheme(value: MuiTheme): Self = this.set("muiTheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMuiTheme: Self = this.set("muiTheme", js.undefined)
  }
}
