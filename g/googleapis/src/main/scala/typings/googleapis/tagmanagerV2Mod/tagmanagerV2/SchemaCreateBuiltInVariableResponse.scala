package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaCreateBuiltInVariableResponse extends js.Object {
  
  /**
    * List of created built-in variables.
    */
  var builtInVariable: js.UndefOr[js.Array[SchemaBuiltInVariable]] = js.native
}
object SchemaCreateBuiltInVariableResponse {
  
  @scala.inline
  def apply(): SchemaCreateBuiltInVariableResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateBuiltInVariableResponse]
  }
  
  @scala.inline
  implicit class SchemaCreateBuiltInVariableResponseOps[Self <: SchemaCreateBuiltInVariableResponse] (val x: Self) extends AnyVal {
    
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
    def setBuiltInVariableVarargs(value: SchemaBuiltInVariable*): Self = this.set("builtInVariable", js.Array(value :_*))
    
    @scala.inline
    def setBuiltInVariable(value: js.Array[SchemaBuiltInVariable]): Self = this.set("builtInVariable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuiltInVariable: Self = this.set("builtInVariable", js.undefined)
  }
}
