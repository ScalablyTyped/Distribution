package typings.googleapis.trafficdirectorV2Mod.trafficdirectorV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAddress extends StObject {
  
  var pipe: js.UndefOr[SchemaPipe] = js.undefined
  
  var socketAddress: js.UndefOr[SchemaSocketAddress] = js.undefined
}
object SchemaAddress {
  
  inline def apply(): SchemaAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAddress]
  }
  
  extension [Self <: SchemaAddress](x: Self) {
    
    inline def setPipe(value: SchemaPipe): Self = StObject.set(x, "pipe", value.asInstanceOf[js.Any])
    
    inline def setPipeUndefined: Self = StObject.set(x, "pipe", js.undefined)
    
    inline def setSocketAddress(value: SchemaSocketAddress): Self = StObject.set(x, "socketAddress", value.asInstanceOf[js.Any])
    
    inline def setSocketAddressUndefined: Self = StObject.set(x, "socketAddress", js.undefined)
  }
}
