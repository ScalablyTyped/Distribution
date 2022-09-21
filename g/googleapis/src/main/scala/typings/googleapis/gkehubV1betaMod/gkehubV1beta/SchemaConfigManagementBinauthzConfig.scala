package typings.googleapis.gkehubV1betaMod.gkehubV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConfigManagementBinauthzConfig extends StObject {
  
  /**
    * Whether binauthz is enabled in this cluster.
    */
  var enabled: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaConfigManagementBinauthzConfig {
  
  inline def apply(): SchemaConfigManagementBinauthzConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConfigManagementBinauthzConfig]
  }
  
  extension [Self <: SchemaConfigManagementBinauthzConfig](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledNull: Self = StObject.set(x, "enabled", null)
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
