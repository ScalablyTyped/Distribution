package typings.googleapis.runV1Mod.runV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAddressable extends StObject {
  
  var url: js.UndefOr[String | Null] = js.undefined
}
object SchemaAddressable {
  
  inline def apply(): SchemaAddressable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAddressable]
  }
  
  extension [Self <: SchemaAddressable](x: Self) {
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlNull: Self = StObject.set(x, "url", null)
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
