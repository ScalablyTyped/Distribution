package typings.googleapis.transcoderV1Mod.transcoderV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDeblock extends StObject {
  
  /**
    * Enable deblocker. The default is `false`.
    */
  var enabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Set strength of the deblocker. Enter a value between 0 and 1. The higher the value, the stronger the block removal. 0 is no deblocking. The default is 0.
    */
  var strength: js.UndefOr[Double | Null] = js.undefined
}
object SchemaDeblock {
  
  inline def apply(): SchemaDeblock = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeblock]
  }
  
  extension [Self <: SchemaDeblock](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledNull: Self = StObject.set(x, "enabled", null)
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setStrength(value: Double): Self = StObject.set(x, "strength", value.asInstanceOf[js.Any])
    
    inline def setStrengthNull: Self = StObject.set(x, "strength", null)
    
    inline def setStrengthUndefined: Self = StObject.set(x, "strength", js.undefined)
  }
}
