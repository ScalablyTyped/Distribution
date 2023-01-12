package typings.ipfsCoreTypes.distSrcConfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RoutingConfig extends StObject {
  
  var Type: js.UndefOr[String] = js.undefined
}
object RoutingConfig {
  
  inline def apply(): RoutingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoutingConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RoutingConfig] (val x: Self) extends AnyVal {
    
    inline def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
