package typings.jupyterlabServices.contentsMod.Contents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Checkpoint model.
  */
@js.native
trait ICheckpointModel extends js.Object {
  
  /**
    * The unique identifier for the checkpoint.
    */
  val id: String = js.native
  
  /**
    * Last modified timestamp.
    */
  val last_modified: String = js.native
}
object ICheckpointModel {
  
  @scala.inline
  def apply(id: String, last_modified: String): ICheckpointModel = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], last_modified = last_modified.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICheckpointModel]
  }
  
  @scala.inline
  implicit class ICheckpointModelOps[Self <: ICheckpointModel] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast_modified(value: String): Self = this.set("last_modified", value.asInstanceOf[js.Any])
  }
}
