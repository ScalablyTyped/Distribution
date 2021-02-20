package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.maximMazurokGapiClientCompute.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RoutersScopedList extends StObject {
  
  /** A list of routers contained in this scope. */
  var routers: js.UndefOr[js.Array[Router]] = js.native
  
  /** Informational warning which replaces the list of routers when the list is empty. */
  var warning: js.UndefOr[Code] = js.native
}
object RoutersScopedList {
  
  @scala.inline
  def apply(): RoutersScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoutersScopedList]
  }
  
  @scala.inline
  implicit class RoutersScopedListMutableBuilder[Self <: RoutersScopedList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRouters(value: js.Array[Router]): Self = StObject.set(x, "routers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutersUndefined: Self = StObject.set(x, "routers", js.undefined)
    
    @scala.inline
    def setRoutersVarargs(value: Router*): Self = StObject.set(x, "routers", js.Array(value :_*))
    
    @scala.inline
    def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
