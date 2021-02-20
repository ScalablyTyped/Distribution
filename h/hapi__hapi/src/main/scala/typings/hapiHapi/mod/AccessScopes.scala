package typings.hapiHapi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccessScopes extends StObject {
  
  var forbidden: js.UndefOr[js.Array[String]] = js.native
  
  var required: js.UndefOr[js.Array[String]] = js.native
  
  var selection: js.UndefOr[js.Array[String]] = js.native
}
object AccessScopes {
  
  @scala.inline
  def apply(): AccessScopes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessScopes]
  }
  
  @scala.inline
  implicit class AccessScopesMutableBuilder[Self <: AccessScopes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setForbidden(value: js.Array[String]): Self = StObject.set(x, "forbidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForbiddenUndefined: Self = StObject.set(x, "forbidden", js.undefined)
    
    @scala.inline
    def setForbiddenVarargs(value: String*): Self = StObject.set(x, "forbidden", js.Array(value :_*))
    
    @scala.inline
    def setRequired(value: js.Array[String]): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    @scala.inline
    def setRequiredVarargs(value: String*): Self = StObject.set(x, "required", js.Array(value :_*))
    
    @scala.inline
    def setSelection(value: js.Array[String]): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionUndefined: Self = StObject.set(x, "selection", js.undefined)
    
    @scala.inline
    def setSelectionVarargs(value: String*): Self = StObject.set(x, "selection", js.Array(value :_*))
  }
}
