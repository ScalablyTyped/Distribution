package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProviderCreatedEventUIParam extends StObject {
  
  /**
    * Gets reference to the igZoombar.
    */
  var owner: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets a reference to the created provider.
    */
  var provider: js.UndefOr[Any] = js.undefined
}
object ProviderCreatedEventUIParam {
  
  inline def apply(): ProviderCreatedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProviderCreatedEventUIParam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProviderCreatedEventUIParam] (val x: Self) extends AnyVal {
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setProvider(value: Any): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
  }
}
