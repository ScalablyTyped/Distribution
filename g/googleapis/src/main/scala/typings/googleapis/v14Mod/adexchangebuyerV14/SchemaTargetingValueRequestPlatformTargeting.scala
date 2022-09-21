package typings.googleapis.v14Mod.adexchangebuyerV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTargetingValueRequestPlatformTargeting extends StObject {
  
  var requestPlatforms: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaTargetingValueRequestPlatformTargeting {
  
  inline def apply(): SchemaTargetingValueRequestPlatformTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetingValueRequestPlatformTargeting]
  }
  
  extension [Self <: SchemaTargetingValueRequestPlatformTargeting](x: Self) {
    
    inline def setRequestPlatforms(value: js.Array[String]): Self = StObject.set(x, "requestPlatforms", value.asInstanceOf[js.Any])
    
    inline def setRequestPlatformsNull: Self = StObject.set(x, "requestPlatforms", null)
    
    inline def setRequestPlatformsUndefined: Self = StObject.set(x, "requestPlatforms", js.undefined)
    
    inline def setRequestPlatformsVarargs(value: String*): Self = StObject.set(x, "requestPlatforms", js.Array(value*))
  }
}
