package typings.googleapis.composerV1beta1Mod.composerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaWebServerNetworkAccessControl extends StObject {
  
  /**
    * A collection of allowed IP ranges with descriptions.
    */
  var allowedIpRanges: js.UndefOr[js.Array[SchemaAllowedIpRange]] = js.undefined
}
object SchemaWebServerNetworkAccessControl {
  
  inline def apply(): SchemaWebServerNetworkAccessControl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWebServerNetworkAccessControl]
  }
  
  extension [Self <: SchemaWebServerNetworkAccessControl](x: Self) {
    
    inline def setAllowedIpRanges(value: js.Array[SchemaAllowedIpRange]): Self = StObject.set(x, "allowedIpRanges", value.asInstanceOf[js.Any])
    
    inline def setAllowedIpRangesUndefined: Self = StObject.set(x, "allowedIpRanges", js.undefined)
    
    inline def setAllowedIpRangesVarargs(value: SchemaAllowedIpRange*): Self = StObject.set(x, "allowedIpRanges", js.Array(value*))
  }
}
