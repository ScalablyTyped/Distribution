package typings.maximMazurokGapiClientAccesscontextmanager.gapi.client.accesscontextmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplaceAccessLevelsResponse extends StObject {
  
  /** List of the Access Level instances. */
  var accessLevels: js.UndefOr[js.Array[AccessLevel]] = js.native
}
object ReplaceAccessLevelsResponse {
  
  @scala.inline
  def apply(): ReplaceAccessLevelsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplaceAccessLevelsResponse]
  }
  
  @scala.inline
  implicit class ReplaceAccessLevelsResponseMutableBuilder[Self <: ReplaceAccessLevelsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessLevels(value: js.Array[AccessLevel]): Self = StObject.set(x, "accessLevels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessLevelsUndefined: Self = StObject.set(x, "accessLevels", js.undefined)
    
    @scala.inline
    def setAccessLevelsVarargs(value: AccessLevel*): Self = StObject.set(x, "accessLevels", js.Array(value :_*))
  }
}
