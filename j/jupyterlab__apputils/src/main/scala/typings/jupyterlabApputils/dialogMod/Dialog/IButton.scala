package typings.jupyterlabApputils.dialogMod.Dialog

import typings.jupyterlabApputils.jupyterlabApputilsStrings.default
import typings.jupyterlabApputils.jupyterlabApputilsStrings.warn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The options used to make a button item.
  */
@js.native
trait IButton extends js.Object {
  
  /**
    * The dialog action to perform when the button is clicked.
    */
  var accept: Boolean = js.native
  
  /**
    * The caption for the button.
    */
  var caption: String = js.native
  
  /**
    * The extra class name for the button.
    */
  var className: String = js.native
  
  /**
    * The button display type.
    */
  var displayType: default | warn = js.native
  
  /**
    * The icon class for the button.
    */
  var iconClass: String = js.native
  
  /**
    * The icon label for the button.
    */
  var iconLabel: String = js.native
  
  /**
    * The label for the button.
    */
  var label: String = js.native
}
object IButton {
  
  @scala.inline
  def apply(
    accept: Boolean,
    caption: String,
    className: String,
    displayType: default | warn,
    iconClass: String,
    iconLabel: String,
    label: String
  ): IButton = {
    val __obj = js.Dynamic.literal(accept = accept.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], displayType = displayType.asInstanceOf[js.Any], iconClass = iconClass.asInstanceOf[js.Any], iconLabel = iconLabel.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[IButton]
  }
  
  @scala.inline
  implicit class IButtonOps[Self <: IButton] (val x: Self) extends AnyVal {
    
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
    def setAccept(value: Boolean): Self = this.set("accept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaption(value: String): Self = this.set("caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayType(value: default | warn): Self = this.set("displayType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconClass(value: String): Self = this.set("iconClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconLabel(value: String): Self = this.set("iconLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
