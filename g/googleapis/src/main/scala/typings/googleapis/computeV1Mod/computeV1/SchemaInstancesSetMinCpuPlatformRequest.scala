package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInstancesSetMinCpuPlatformRequest extends StObject {
  
  /**
    * Minimum cpu/platform this instance should be started at.
    */
  var minCpuPlatform: js.UndefOr[String | Null] = js.undefined
}
object SchemaInstancesSetMinCpuPlatformRequest {
  
  inline def apply(): SchemaInstancesSetMinCpuPlatformRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstancesSetMinCpuPlatformRequest]
  }
  
  extension [Self <: SchemaInstancesSetMinCpuPlatformRequest](x: Self) {
    
    inline def setMinCpuPlatform(value: String): Self = StObject.set(x, "minCpuPlatform", value.asInstanceOf[js.Any])
    
    inline def setMinCpuPlatformNull: Self = StObject.set(x, "minCpuPlatform", null)
    
    inline def setMinCpuPlatformUndefined: Self = StObject.set(x, "minCpuPlatform", js.undefined)
  }
}
