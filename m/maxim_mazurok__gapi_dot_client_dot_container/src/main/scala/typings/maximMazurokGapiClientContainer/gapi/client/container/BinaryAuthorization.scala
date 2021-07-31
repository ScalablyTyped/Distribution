package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BinaryAuthorization extends StObject {
  
  /** Enable Binary Authorization for this cluster. If enabled, all container images will be validated by Binary Authorization. */
  var enabled: js.UndefOr[Boolean] = js.undefined
}
object BinaryAuthorization {
  
  @scala.inline
  def apply(): BinaryAuthorization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BinaryAuthorization]
  }
  
  @scala.inline
  implicit class BinaryAuthorizationMutableBuilder[Self <: BinaryAuthorization] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
