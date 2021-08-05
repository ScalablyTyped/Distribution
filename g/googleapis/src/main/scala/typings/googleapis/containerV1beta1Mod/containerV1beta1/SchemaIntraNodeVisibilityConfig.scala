package typings.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * IntraNodeVisibilityConfig contains the desired config of the intra-node
  * visibility on this cluster.
  */
trait SchemaIntraNodeVisibilityConfig extends StObject {
  
  /**
    * Enables intra node visibility for this cluster.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
}
object SchemaIntraNodeVisibilityConfig {
  
  inline def apply(): SchemaIntraNodeVisibilityConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIntraNodeVisibilityConfig]
  }
  
  extension [Self <: SchemaIntraNodeVisibilityConfig](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
