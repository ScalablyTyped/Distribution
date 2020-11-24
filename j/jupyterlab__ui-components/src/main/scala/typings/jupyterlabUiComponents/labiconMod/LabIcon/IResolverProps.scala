package typings.jupyterlabUiComponents.labiconMod.LabIcon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IResolverProps extends js.Object {
  
  var fallback: js.UndefOr[typings.jupyterlabUiComponents.labiconMod.LabIcon] = js.native
  
  var icon: js.UndefOr[IMaybeResolvable] = js.native
  
  var iconClass: js.UndefOr[String] = js.native
}
object IResolverProps {
  
  @scala.inline
  def apply(): IResolverProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IResolverProps]
  }
  
  @scala.inline
  implicit class IResolverPropsOps[Self <: IResolverProps] (val x: Self) extends AnyVal {
    
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
    def setFallback(value: typings.jupyterlabUiComponents.labiconMod.LabIcon): Self = this.set("fallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFallback: Self = this.set("fallback", js.undefined)
    
    @scala.inline
    def setIcon(value: IMaybeResolvable): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setIconClass(value: String): Self = this.set("iconClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconClass: Self = this.set("iconClass", js.undefined)
  }
}
