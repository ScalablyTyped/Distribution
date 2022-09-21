package typings.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSandboxConfig extends StObject {
  
  /**
    * Type of the sandbox to use for the node (e.g. 'gvisor')
    */
  var sandboxType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Type of the sandbox to use for the node.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaSandboxConfig {
  
  inline def apply(): SchemaSandboxConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSandboxConfig]
  }
  
  extension [Self <: SchemaSandboxConfig](x: Self) {
    
    inline def setSandboxType(value: String): Self = StObject.set(x, "sandboxType", value.asInstanceOf[js.Any])
    
    inline def setSandboxTypeNull: Self = StObject.set(x, "sandboxType", null)
    
    inline def setSandboxTypeUndefined: Self = StObject.set(x, "sandboxType", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
