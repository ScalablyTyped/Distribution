package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The result of reverting a variable in a workspace.
  */
@js.native
trait SchemaRevertVariableResponse extends js.Object {
  
  /**
    * Variable as it appears in the latest container version since the last
    * workspace synchronization operation. If no variable is present, that
    * means the variable was deleted in the latest container version.
    */
  var variable: js.UndefOr[SchemaVariable] = js.native
}
object SchemaRevertVariableResponse {
  
  @scala.inline
  def apply(): SchemaRevertVariableResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRevertVariableResponse]
  }
  
  @scala.inline
  implicit class SchemaRevertVariableResponseOps[Self <: SchemaRevertVariableResponse] (val x: Self) extends AnyVal {
    
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
    def setVariable(value: SchemaVariable): Self = this.set("variable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVariable: Self = this.set("variable", js.undefined)
  }
}
