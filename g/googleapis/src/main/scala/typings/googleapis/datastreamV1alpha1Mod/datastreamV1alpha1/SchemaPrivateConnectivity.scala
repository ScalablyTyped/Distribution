package typings.googleapis.datastreamV1alpha1Mod.datastreamV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPrivateConnectivity extends StObject {
  
  var privateConnectionName: js.UndefOr[String | Null] = js.undefined
}
object SchemaPrivateConnectivity {
  
  inline def apply(): SchemaPrivateConnectivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPrivateConnectivity]
  }
  
  extension [Self <: SchemaPrivateConnectivity](x: Self) {
    
    inline def setPrivateConnectionName(value: String): Self = StObject.set(x, "privateConnectionName", value.asInstanceOf[js.Any])
    
    inline def setPrivateConnectionNameNull: Self = StObject.set(x, "privateConnectionName", null)
    
    inline def setPrivateConnectionNameUndefined: Self = StObject.set(x, "privateConnectionName", js.undefined)
  }
}
