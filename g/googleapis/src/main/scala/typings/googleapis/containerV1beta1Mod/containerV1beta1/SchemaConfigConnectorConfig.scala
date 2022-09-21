package typings.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConfigConnectorConfig extends StObject {
  
  /**
    * Whether Cloud Connector is enabled for this cluster.
    */
  var enabled: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaConfigConnectorConfig {
  
  inline def apply(): SchemaConfigConnectorConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConfigConnectorConfig]
  }
  
  extension [Self <: SchemaConfigConnectorConfig](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledNull: Self = StObject.set(x, "enabled", null)
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
