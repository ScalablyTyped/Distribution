package typings.googleapis.tpuV2alpha1Mod.tpuV2alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAccessConfig extends StObject {
  
  /**
    * Output only. An external IP address associated with the TPU worker.
    */
  var externalIp: js.UndefOr[String | Null] = js.undefined
}
object SchemaAccessConfig {
  
  inline def apply(): SchemaAccessConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccessConfig]
  }
  
  extension [Self <: SchemaAccessConfig](x: Self) {
    
    inline def setExternalIp(value: String): Self = StObject.set(x, "externalIp", value.asInstanceOf[js.Any])
    
    inline def setExternalIpNull: Self = StObject.set(x, "externalIp", null)
    
    inline def setExternalIpUndefined: Self = StObject.set(x, "externalIp", js.undefined)
  }
}
