package typings.googleapis.iapV1Mod.iapV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCsmSettings extends StObject {
  
  /**
    * Audience claim set in the generated RCToken. This value is not validated by IAP.
    */
  var rctokenAud: js.UndefOr[String | Null] = js.undefined
}
object SchemaCsmSettings {
  
  inline def apply(): SchemaCsmSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCsmSettings]
  }
  
  extension [Self <: SchemaCsmSettings](x: Self) {
    
    inline def setRctokenAud(value: String): Self = StObject.set(x, "rctokenAud", value.asInstanceOf[js.Any])
    
    inline def setRctokenAudNull: Self = StObject.set(x, "rctokenAud", null)
    
    inline def setRctokenAudUndefined: Self = StObject.set(x, "rctokenAud", js.undefined)
  }
}
