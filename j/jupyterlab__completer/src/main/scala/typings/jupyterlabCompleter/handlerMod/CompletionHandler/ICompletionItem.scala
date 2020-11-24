package typings.jupyterlabCompleter.handlerMod.CompletionHandler

import typings.jupyterlabUiComponents.mod.LabIcon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Completion item object based off of LSP CompletionItem.
  * Compared to the old kernel completions interface, this enhances the completions UI to support:
  * - differentiation between inserted text and user facing text
  * - documentation for each completion item to be displayed adjacently
  * - deprecation styling
  * - custom icons
  * and other potential new features.
  */
@js.native
trait ICompletionItem extends js.Object {
  
  /**
    * Indicates if the item is deprecated.
    */
  var deprecated: js.UndefOr[Boolean] = js.native
  
  /**
    * A human-readable string with additional information
    * about this item, like type or symbol information.
    */
  var documentation: js.UndefOr[String] = js.native
  
  /**
    * LabIcon object for icon to be rendered with completion type.
    */
  var icon: js.UndefOr[LabIcon] = js.native
  
  /**
    * Completion to be inserted.
    */
  var insertText: js.UndefOr[String] = js.native
  
  /**
    * User facing completion.
    * If insertText is not set, this will be inserted.
    */
  var label: String = js.native
  
  /**
    * Type of this completion item.
    */
  var `type`: js.UndefOr[String] = js.native
}
object ICompletionItem {
  
  @scala.inline
  def apply(label: String): ICompletionItem = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICompletionItem]
  }
  
  @scala.inline
  implicit class ICompletionItemOps[Self <: ICompletionItem] (val x: Self) extends AnyVal {
    
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
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeprecated(value: Boolean): Self = this.set("deprecated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeprecated: Self = this.set("deprecated", js.undefined)
    
    @scala.inline
    def setDocumentation(value: String): Self = this.set("documentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentation: Self = this.set("documentation", js.undefined)
    
    @scala.inline
    def setIcon(value: LabIcon): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setInsertText(value: String): Self = this.set("insertText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertText: Self = this.set("insertText", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
