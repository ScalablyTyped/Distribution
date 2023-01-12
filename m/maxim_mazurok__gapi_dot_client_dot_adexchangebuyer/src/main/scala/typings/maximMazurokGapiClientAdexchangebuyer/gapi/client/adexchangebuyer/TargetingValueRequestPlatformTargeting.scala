package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetingValueRequestPlatformTargeting extends StObject {
  
  var requestPlatforms: js.UndefOr[js.Array[String]] = js.undefined
}
object TargetingValueRequestPlatformTargeting {
  
  inline def apply(): TargetingValueRequestPlatformTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetingValueRequestPlatformTargeting]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TargetingValueRequestPlatformTargeting] (val x: Self) extends AnyVal {
    
    inline def setRequestPlatforms(value: js.Array[String]): Self = StObject.set(x, "requestPlatforms", value.asInstanceOf[js.Any])
    
    inline def setRequestPlatformsUndefined: Self = StObject.set(x, "requestPlatforms", js.undefined)
    
    inline def setRequestPlatformsVarargs(value: String*): Self = StObject.set(x, "requestPlatforms", js.Array(value*))
  }
}
