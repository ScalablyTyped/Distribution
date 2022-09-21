package typings.maximMazurokGapiClientAccesscontextmanager.gapi.client.accesscontextmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplaceAccessLevelsResponse extends StObject {
  
  /** List of the Access Level instances. */
  var accessLevels: js.UndefOr[js.Array[AccessLevel]] = js.undefined
}
object ReplaceAccessLevelsResponse {
  
  inline def apply(): ReplaceAccessLevelsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplaceAccessLevelsResponse]
  }
  
  extension [Self <: ReplaceAccessLevelsResponse](x: Self) {
    
    inline def setAccessLevels(value: js.Array[AccessLevel]): Self = StObject.set(x, "accessLevels", value.asInstanceOf[js.Any])
    
    inline def setAccessLevelsUndefined: Self = StObject.set(x, "accessLevels", js.undefined)
    
    inline def setAccessLevelsVarargs(value: AccessLevel*): Self = StObject.set(x, "accessLevels", js.Array(value*))
  }
}
