package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line:interface-name
trait ILBSubsettingConfig extends StObject {
  
  /** Enables l4 ILB subsetting for this cluster. */
  var enabled: js.UndefOr[Boolean] = js.undefined
}
object ILBSubsettingConfig {
  
  inline def apply(): ILBSubsettingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILBSubsettingConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ILBSubsettingConfig] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
