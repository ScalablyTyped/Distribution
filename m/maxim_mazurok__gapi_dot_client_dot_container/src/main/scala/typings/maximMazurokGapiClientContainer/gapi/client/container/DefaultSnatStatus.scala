package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultSnatStatus extends StObject {
  
  /** Disables cluster default sNAT rules. */
  var disabled: js.UndefOr[Boolean] = js.undefined
}
object DefaultSnatStatus {
  
  inline def apply(): DefaultSnatStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultSnatStatus]
  }
  
  extension [Self <: DefaultSnatStatus](x: Self) {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
  }
}
