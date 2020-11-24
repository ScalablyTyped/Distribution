package typings.jupyterlabApputils.inputdialogMod.InputDialog

import typings.jupyterlabApputils.dialogMod.Dialog.Header
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Constructor options for item selection input dialogs
  */
@js.native
trait IItemOptions extends IOptions {
  
  /**
    * Default choice
    *
    * If the list is editable a string with a default value can be provided
    * otherwise the index of the default choice should be given.
    */
  var current: js.UndefOr[Double | String] = js.native
  
  /**
    * Is the item editable?
    */
  var editable: js.UndefOr[Boolean] = js.native
  
  /**
    * List of choices
    */
  var items: js.Array[String] = js.native
  
  /**
    * Placeholder text for editable input
    */
  var placeholder: js.UndefOr[String] = js.native
}
object IItemOptions {
  
  @scala.inline
  def apply(items: js.Array[String], title: Header): IItemOptions = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IItemOptions]
  }
  
  @scala.inline
  implicit class IItemOptionsOps[Self <: IItemOptions] (val x: Self) extends AnyVal {
    
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
    def setItemsVarargs(value: String*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[String]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrent(value: Double | String): Self = this.set("current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrent: Self = this.set("current", js.undefined)
    
    @scala.inline
    def setEditable(value: Boolean): Self = this.set("editable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditable: Self = this.set("editable", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
  }
}
