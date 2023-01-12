package typings.ipfsCoreTypes.distSrcConfigMod

import typings.ipfsCoreTypes.ipfsCoreTypesStrings.floodsub
import typings.ipfsCoreTypes.ipfsCoreTypesStrings.gossipsub
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PubsubConfig extends StObject {
  
  var Enabled: js.UndefOr[Boolean] = js.undefined
  
  var PubSubRouter: js.UndefOr[gossipsub | floodsub] = js.undefined
}
object PubsubConfig {
  
  inline def apply(): PubsubConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PubsubConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PubsubConfig] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    inline def setPubSubRouter(value: gossipsub | floodsub): Self = StObject.set(x, "PubSubRouter", value.asInstanceOf[js.Any])
    
    inline def setPubSubRouterUndefined: Self = StObject.set(x, "PubSubRouter", js.undefined)
  }
}
