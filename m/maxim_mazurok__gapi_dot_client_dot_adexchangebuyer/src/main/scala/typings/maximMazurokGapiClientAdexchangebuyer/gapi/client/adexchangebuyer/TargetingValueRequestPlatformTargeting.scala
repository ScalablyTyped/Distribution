package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetingValueRequestPlatformTargeting extends StObject {
  
  var requestPlatforms: js.UndefOr[js.Array[String]] = js.native
}
object TargetingValueRequestPlatformTargeting {
  
  @scala.inline
  def apply(): TargetingValueRequestPlatformTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetingValueRequestPlatformTargeting]
  }
  
  @scala.inline
  implicit class TargetingValueRequestPlatformTargetingMutableBuilder[Self <: TargetingValueRequestPlatformTargeting] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequestPlatforms(value: js.Array[String]): Self = StObject.set(x, "requestPlatforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestPlatformsUndefined: Self = StObject.set(x, "requestPlatforms", js.undefined)
    
    @scala.inline
    def setRequestPlatformsVarargs(value: String*): Self = StObject.set(x, "requestPlatforms", js.Array(value :_*))
  }
}
