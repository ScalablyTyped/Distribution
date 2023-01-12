package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SandboxConfig extends StObject {
  
  /** Type of the sandbox to use for the node. */
  var `type`: js.UndefOr[String] = js.undefined
}
object SandboxConfig {
  
  inline def apply(): SandboxConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SandboxConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SandboxConfig] (val x: Self) extends AnyVal {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
