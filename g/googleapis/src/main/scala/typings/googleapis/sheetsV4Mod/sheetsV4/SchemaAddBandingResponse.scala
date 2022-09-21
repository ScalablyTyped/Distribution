package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAddBandingResponse extends StObject {
  
  /**
    * The banded range that was added.
    */
  var bandedRange: js.UndefOr[SchemaBandedRange] = js.undefined
}
object SchemaAddBandingResponse {
  
  inline def apply(): SchemaAddBandingResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAddBandingResponse]
  }
  
  extension [Self <: SchemaAddBandingResponse](x: Self) {
    
    inline def setBandedRange(value: SchemaBandedRange): Self = StObject.set(x, "bandedRange", value.asInstanceOf[js.Any])
    
    inline def setBandedRangeUndefined: Self = StObject.set(x, "bandedRange", js.undefined)
  }
}
