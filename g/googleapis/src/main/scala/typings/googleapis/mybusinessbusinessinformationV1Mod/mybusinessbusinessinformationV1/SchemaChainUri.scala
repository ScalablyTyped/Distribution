package typings.googleapis.mybusinessbusinessinformationV1Mod.mybusinessbusinessinformationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaChainUri extends StObject {
  
  /**
    * The uri for this chain.
    */
  var uri: js.UndefOr[String | Null] = js.undefined
}
object SchemaChainUri {
  
  inline def apply(): SchemaChainUri = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChainUri]
  }
  
  extension [Self <: SchemaChainUri](x: Self) {
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriNull: Self = StObject.set(x, "uri", null)
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
