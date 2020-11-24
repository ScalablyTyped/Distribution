package typings.luminoWidgets.titleMod.Title

import typings.luminoVirtualdom.mod.VirtualElement.IRenderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An options object for initializing a title.
  */
@js.native
trait IOptions[T] extends js.Object {
  
  /**
    * The caption for the title.
    */
  var caption: js.UndefOr[String] = js.native
  
  /**
    * The extra class name for the title.
    */
  var className: js.UndefOr[String] = js.native
  
  /**
    * The closable state for the title.
    */
  var closable: js.UndefOr[Boolean] = js.native
  
  /**
    * The dataset for the title.
    */
  var dataset: js.UndefOr[Dataset] = js.native
  
  /**
    * The icon renderer for the title.
    *
    * DEPRECATED: if set to a string value, the .icon field will function as
    * an alias for the .iconClass field, for backwards compatibility
    */
  var icon: js.UndefOr[IRenderer | String] = js.native
  
  /**
    * The icon class name for the title.
    */
  var iconClass: js.UndefOr[String] = js.native
  
  /**
    * The icon label for the title.
    */
  var iconLabel: js.UndefOr[String] = js.native
  
  /**
    * @deprecated Use `icon` instead.
    */
  var iconRenderer: js.UndefOr[IRenderer] = js.native
  
  /**
    * The label for the title.
    */
  var label: js.UndefOr[String] = js.native
  
  /**
    * The mnemonic index for the title.
    */
  var mnemonic: js.UndefOr[Double] = js.native
  
  /**
    * The object which owns the title.
    */
  var owner: T = js.native
}
object IOptions {
  
  @scala.inline
  def apply[T](owner: T): IOptions[T] = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions[T]]
  }
  
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions[_], T] (val x: Self with IOptions[T]) extends AnyVal {
    
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
    def setOwner(value: T): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaption(value: String): Self = this.set("caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaption: Self = this.set("caption", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setClosable(value: Boolean): Self = this.set("closable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClosable: Self = this.set("closable", js.undefined)
    
    @scala.inline
    def setDataset(value: Dataset): Self = this.set("dataset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataset: Self = this.set("dataset", js.undefined)
    
    @scala.inline
    def setIcon(value: IRenderer | String): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setIconClass(value: String): Self = this.set("iconClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconClass: Self = this.set("iconClass", js.undefined)
    
    @scala.inline
    def setIconLabel(value: String): Self = this.set("iconLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconLabel: Self = this.set("iconLabel", js.undefined)
    
    @scala.inline
    def setIconRenderer(value: IRenderer): Self = this.set("iconRenderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconRenderer: Self = this.set("iconRenderer", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setMnemonic(value: Double): Self = this.set("mnemonic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMnemonic: Self = this.set("mnemonic", js.undefined)
  }
}
