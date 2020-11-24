package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgButtonIcons
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  var primary: js.UndefOr[js.Any] = js.native
  
  var secondary: js.UndefOr[js.Any] = js.native
}
object IgButtonIcons {
  
  @scala.inline
  def apply(): IgButtonIcons = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgButtonIcons]
  }
  
  @scala.inline
  implicit class IgButtonIconsOps[Self <: IgButtonIcons] (val x: Self) extends AnyVal {
    
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
    def setPrimary(value: js.Any): Self = this.set("primary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimary: Self = this.set("primary", js.undefined)
    
    @scala.inline
    def setSecondary(value: js.Any): Self = this.set("secondary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecondary: Self = this.set("secondary", js.undefined)
  }
}
