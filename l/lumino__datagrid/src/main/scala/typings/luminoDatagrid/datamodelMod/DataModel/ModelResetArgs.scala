package typings.luminoDatagrid.datamodelMod.DataModel

import typings.luminoDatagrid.luminoDatagridStrings.`model-reset`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An arguments object for the `changed` signal.
  *
  * #### Notes
  * Data models should emit the `changed` signal with this args object
  * type when the model has changed in a fashion that cannot be easily
  * expressed by the other args object types.
  *
  * This is the "big hammer" approach, and will cause any associated
  * data grid to perform a full reset. The other changed args types
  * should be used whenever possible.
  */
@js.native
trait ModelResetArgs extends ChangedArgs {
  
  /**
    * The discriminated type of the args object.
    */
  val `type`: `model-reset` = js.native
}
object ModelResetArgs {
  
  @scala.inline
  def apply(`type`: `model-reset`): ModelResetArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelResetArgs]
  }
  
  @scala.inline
  implicit class ModelResetArgsOps[Self <: ModelResetArgs] (val x: Self) extends AnyVal {
    
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
    def setType(value: `model-reset`): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
