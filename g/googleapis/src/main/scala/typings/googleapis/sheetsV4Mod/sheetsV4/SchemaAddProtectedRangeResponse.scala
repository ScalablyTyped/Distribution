package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAddProtectedRangeResponse extends StObject {
  
  /**
    * The newly added protected range.
    */
  var protectedRange: js.UndefOr[SchemaProtectedRange] = js.undefined
}
object SchemaAddProtectedRangeResponse {
  
  inline def apply(): SchemaAddProtectedRangeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAddProtectedRangeResponse]
  }
  
  extension [Self <: SchemaAddProtectedRangeResponse](x: Self) {
    
    inline def setProtectedRange(value: SchemaProtectedRange): Self = StObject.set(x, "protectedRange", value.asInstanceOf[js.Any])
    
    inline def setProtectedRangeUndefined: Self = StObject.set(x, "protectedRange", js.undefined)
  }
}
