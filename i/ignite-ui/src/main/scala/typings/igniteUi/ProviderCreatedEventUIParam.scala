package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProviderCreatedEventUIParam extends StObject {
  
  /**
    * Gets reference to the igZoombar.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets a reference to the created provider.
    */
  var provider: js.UndefOr[js.Any] = js.undefined
}
object ProviderCreatedEventUIParam {
  
  inline def apply(): ProviderCreatedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProviderCreatedEventUIParam]
  }
  
  extension [Self <: ProviderCreatedEventUIParam](x: Self) {
    
    inline def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setProvider(value: js.Any): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
  }
}
