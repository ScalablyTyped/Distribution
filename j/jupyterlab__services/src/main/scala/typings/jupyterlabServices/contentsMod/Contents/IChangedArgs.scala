package typings.jupyterlabServices.contentsMod.Contents

import typings.jupyterlabServices.anon.PartialIModel
import typings.jupyterlabServices.jupyterlabServicesStrings.`new`
import typings.jupyterlabServices.jupyterlabServicesStrings.delete
import typings.jupyterlabServices.jupyterlabServicesStrings.rename
import typings.jupyterlabServices.jupyterlabServicesStrings.save
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The change args for a file change.
  */
@js.native
trait IChangedArgs extends js.Object {
  
  /**
    * The old contents.
    */
  var newValue: PartialIModel | Null = js.native
  
  /**
    * The new contents.
    */
  var oldValue: PartialIModel | Null = js.native
  
  /**
    * The type of change.
    */
  var `type`: `new` | delete | rename | save = js.native
}
object IChangedArgs {
  
  @scala.inline
  def apply(`type`: `new` | delete | rename | save): IChangedArgs = {
    val __obj = js.Dynamic.literal()
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
    def setType(value: `new` | delete | rename | save): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewValue(value: PartialIModel): Self = this.set("newValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewValueNull: Self = this.set("newValue", null)
    
    @scala.inline
    def setOldValue(value: PartialIModel): Self = this.set("oldValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldValueNull: Self = this.set("oldValue", null)
  }
}
