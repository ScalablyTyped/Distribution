package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaintenanceExclusionOptions extends StObject {
  
  /** Scope specifies the upgrade scope which upgrades are blocked by the exclusion. */
  var scope: js.UndefOr[String] = js.undefined
}
object MaintenanceExclusionOptions {
  
  inline def apply(): MaintenanceExclusionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaintenanceExclusionOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MaintenanceExclusionOptions] (val x: Self) extends AnyVal {
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
  }
}
