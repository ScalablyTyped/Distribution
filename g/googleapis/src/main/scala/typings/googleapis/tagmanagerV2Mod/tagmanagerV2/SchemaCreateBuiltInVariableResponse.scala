package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaCreateBuiltInVariableResponse extends StObject {
  
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
  implicit class SchemaCreateBuiltInVariableResponseMutableBuilder[Self <: SchemaCreateBuiltInVariableResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuiltInVariable(value: js.Array[SchemaBuiltInVariable]): Self = StObject.set(x, "builtInVariable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuiltInVariableUndefined: Self = StObject.set(x, "builtInVariable", js.undefined)
    
    @scala.inline
    def setBuiltInVariableVarargs(value: SchemaBuiltInVariable*): Self = StObject.set(x, "builtInVariable", js.Array(value :_*))
  }
}
