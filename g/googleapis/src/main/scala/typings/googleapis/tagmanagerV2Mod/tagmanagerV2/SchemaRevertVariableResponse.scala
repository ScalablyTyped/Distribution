package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The result of reverting a variable in a workspace.
  */
@js.native
trait SchemaRevertVariableResponse extends StObject {
  
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
  implicit class SchemaRevertVariableResponseMutableBuilder[Self <: SchemaRevertVariableResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVariable(value: SchemaVariable): Self = StObject.set(x, "variable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariableUndefined: Self = StObject.set(x, "variable", js.undefined)
  }
}
