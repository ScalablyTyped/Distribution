package typings.googleapis.v1beta4Mod.sqladminV1beta4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * On-premises instance configuration.
  */
trait SchemaOnPremisesConfiguration extends StObject {
  
  /**
    * The host and port of the on-premises instance in host:port format
    */
  var hostPort: js.UndefOr[String] = js.undefined
  
  /**
    * This is always sql#onPremisesConfiguration.
    */
  var kind: js.UndefOr[String] = js.undefined
}
object SchemaOnPremisesConfiguration {
  
  inline def apply(): SchemaOnPremisesConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOnPremisesConfiguration]
  }
  
  extension [Self <: SchemaOnPremisesConfiguration](x: Self) {
    
    inline def setHostPort(value: String): Self = StObject.set(x, "hostPort", value.asInstanceOf[js.Any])
    
    inline def setHostPortUndefined: Self = StObject.set(x, "hostPort", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
