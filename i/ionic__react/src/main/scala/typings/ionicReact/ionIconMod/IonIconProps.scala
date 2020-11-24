package typings.ionicReact.ionIconMod

import typings.ionicReact.ionicReactStrings.ios
import typings.ionicReact.ionicReactStrings.md
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IonIconProps extends js.Object {
  
  var ariaLabel: js.UndefOr[String] = js.native
  
  var color: js.UndefOr[String] = js.native
  
  var flipRtl: js.UndefOr[Boolean] = js.native
  
  var icon: js.UndefOr[String] = js.native
  
  var ios: js.UndefOr[String] = js.native
  
  var `lazy`: js.UndefOr[Boolean] = js.native
  
  var md: js.UndefOr[String] = js.native
  
  var mode: js.UndefOr[ios | md] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var size: js.UndefOr[String] = js.native
  
  var src: js.UndefOr[String] = js.native
}
object IonIconProps {
  
  @scala.inline
  def apply(): IonIconProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonIconProps]
  }
  
  @scala.inline
  implicit class IonIconPropsOps[Self <: IonIconProps] (val x: Self) extends AnyVal {
    
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
    def setAriaLabel(value: String): Self = this.set("ariaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaLabel: Self = this.set("ariaLabel", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setFlipRtl(value: Boolean): Self = this.set("flipRtl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlipRtl: Self = this.set("flipRtl", js.undefined)
    
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setIos(value: String): Self = this.set("ios", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIos: Self = this.set("ios", js.undefined)
    
    @scala.inline
    def setLazy(value: Boolean): Self = this.set("lazy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLazy: Self = this.set("lazy", js.undefined)
    
    @scala.inline
    def setMd(value: String): Self = this.set("md", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMd: Self = this.set("md", js.undefined)
    
    @scala.inline
    def setMode(value: ios | md): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSrc: Self = this.set("src", js.undefined)
  }
}
