package typings.googleapis.connectorsV1Mod.connectorsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDestinationConfig extends StObject {
  
  /**
    * The destinations for the key.
    */
  var destinations: js.UndefOr[js.Array[SchemaDestination]] = js.undefined
  
  /**
    * The key is the destination identifier that is supported by the Connector.
    */
  var key: js.UndefOr[String | Null] = js.undefined
}
object SchemaDestinationConfig {
  
  inline def apply(): SchemaDestinationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDestinationConfig]
  }
  
  extension [Self <: SchemaDestinationConfig](x: Self) {
    
    inline def setDestinations(value: js.Array[SchemaDestination]): Self = StObject.set(x, "destinations", value.asInstanceOf[js.Any])
    
    inline def setDestinationsUndefined: Self = StObject.set(x, "destinations", js.undefined)
    
    inline def setDestinationsVarargs(value: SchemaDestination*): Self = StObject.set(x, "destinations", js.Array(value*))
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
  }
}
