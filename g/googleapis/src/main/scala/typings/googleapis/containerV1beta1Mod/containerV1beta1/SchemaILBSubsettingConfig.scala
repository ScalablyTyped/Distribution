package typings.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaILBSubsettingConfig extends StObject {
  
  /**
    * Enables l4 ILB subsetting for this cluster
    */
  var enabled: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaILBSubsettingConfig {
  
  inline def apply(): SchemaILBSubsettingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaILBSubsettingConfig]
  }
  
  extension [Self <: SchemaILBSubsettingConfig](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledNull: Self = StObject.set(x, "enabled", null)
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
