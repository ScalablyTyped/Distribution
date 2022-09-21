package typings.googleapis.containerV1Mod.containerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConfidentialNodes extends StObject {
  
  /**
    * Whether Confidential Nodes feature is enabled.
    */
  var enabled: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaConfidentialNodes {
  
  inline def apply(): SchemaConfidentialNodes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConfidentialNodes]
  }
  
  extension [Self <: SchemaConfidentialNodes](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledNull: Self = StObject.set(x, "enabled", null)
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
