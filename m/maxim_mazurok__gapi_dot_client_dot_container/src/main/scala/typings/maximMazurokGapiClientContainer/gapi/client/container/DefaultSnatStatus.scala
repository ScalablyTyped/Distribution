package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultSnatStatus extends StObject {
  
  /** Disables cluster default sNAT rules. */
  var disabled: js.UndefOr[Boolean] = js.undefined
}
object DefaultSnatStatus {
  
  @scala.inline
  def apply(): DefaultSnatStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultSnatStatus]
  }
  
  @scala.inline
  implicit class DefaultSnatStatusMutableBuilder[Self <: DefaultSnatStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
  }
}
