package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaResultDebugInfo extends StObject {
  
  /**
    * General debug info formatted for display.
    */
  var formattedDebugInfo: js.UndefOr[String | Null] = js.undefined
}
object SchemaResultDebugInfo {
  
  inline def apply(): SchemaResultDebugInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResultDebugInfo]
  }
  
  extension [Self <: SchemaResultDebugInfo](x: Self) {
    
    inline def setFormattedDebugInfo(value: String): Self = StObject.set(x, "formattedDebugInfo", value.asInstanceOf[js.Any])
    
    inline def setFormattedDebugInfoNull: Self = StObject.set(x, "formattedDebugInfo", null)
    
    inline def setFormattedDebugInfoUndefined: Self = StObject.set(x, "formattedDebugInfo", js.undefined)
  }
}
