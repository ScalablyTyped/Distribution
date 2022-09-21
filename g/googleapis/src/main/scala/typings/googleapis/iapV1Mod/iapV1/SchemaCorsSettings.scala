package typings.googleapis.iapV1Mod.iapV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCorsSettings extends StObject {
  
  /**
    * Configuration to allow HTTP OPTIONS calls to skip authorization. If undefined, IAP will not apply any special logic to OPTIONS requests.
    */
  var allowHttpOptions: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaCorsSettings {
  
  inline def apply(): SchemaCorsSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCorsSettings]
  }
  
  extension [Self <: SchemaCorsSettings](x: Self) {
    
    inline def setAllowHttpOptions(value: Boolean): Self = StObject.set(x, "allowHttpOptions", value.asInstanceOf[js.Any])
    
    inline def setAllowHttpOptionsNull: Self = StObject.set(x, "allowHttpOptions", null)
    
    inline def setAllowHttpOptionsUndefined: Self = StObject.set(x, "allowHttpOptions", js.undefined)
  }
}
