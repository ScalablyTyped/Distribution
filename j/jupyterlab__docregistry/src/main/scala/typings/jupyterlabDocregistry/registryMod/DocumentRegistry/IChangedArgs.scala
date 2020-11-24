package typings.jupyterlabDocregistry.registryMod.DocumentRegistry

import typings.jupyterlabDocregistry.jupyterlabDocregistryStrings.added
import typings.jupyterlabDocregistry.jupyterlabDocregistryStrings.fileType
import typings.jupyterlabDocregistry.jupyterlabDocregistryStrings.modelFactory
import typings.jupyterlabDocregistry.jupyterlabDocregistryStrings.removed
import typings.jupyterlabDocregistry.jupyterlabDocregistryStrings.widgetExtension
import typings.jupyterlabDocregistry.jupyterlabDocregistryStrings.widgetFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An arguments object for the `changed` signal.
  */
@js.native
trait IChangedArgs extends js.Object {
  
  /**
    * Whether the item was added or removed.
    */
  val change: added | removed = js.native
  
  /**
    * The name of the item or the widget factory being extended.
    */
  val name: js.UndefOr[String] = js.native
  
  /**
    * The type of the changed item.
    */
  val `type`: widgetFactory | modelFactory | widgetExtension | fileType = js.native
}
object IChangedArgs {
  
  @scala.inline
  def apply(change: added | removed, `type`: widgetFactory | modelFactory | widgetExtension | fileType): IChangedArgs = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IChangedArgs]
  }
  
  @scala.inline
  implicit class IChangedArgsOps[Self <: IChangedArgs] (val x: Self) extends AnyVal {
    
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
    def setChange(value: added | removed): Self = this.set("change", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: widgetFactory | modelFactory | widgetExtension | fileType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
