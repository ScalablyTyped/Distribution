package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The result of reverting a built-in variable in a workspace.
  */
@js.native
trait SchemaRevertBuiltInVariableResponse extends StObject {
  
  /**
    * Whether the built-in variable is enabled after reversion.
    */
  var enabled: js.UndefOr[Boolean] = js.native
}
object SchemaRevertBuiltInVariableResponse {
  
  @scala.inline
  def apply(): SchemaRevertBuiltInVariableResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRevertBuiltInVariableResponse]
  }
  
  @scala.inline
  implicit class SchemaRevertBuiltInVariableResponseMutableBuilder[Self <: SchemaRevertBuiltInVariableResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
