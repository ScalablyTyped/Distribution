package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAddNamedRangeResponse extends StObject {
  
  /**
    * The named range to add.
    */
  var namedRange: js.UndefOr[SchemaNamedRange] = js.undefined
}
object SchemaAddNamedRangeResponse {
  
  inline def apply(): SchemaAddNamedRangeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAddNamedRangeResponse]
  }
  
  extension [Self <: SchemaAddNamedRangeResponse](x: Self) {
    
    inline def setNamedRange(value: SchemaNamedRange): Self = StObject.set(x, "namedRange", value.asInstanceOf[js.Any])
    
    inline def setNamedRangeUndefined: Self = StObject.set(x, "namedRange", js.undefined)
  }
}
