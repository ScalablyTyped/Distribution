package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDeleteBandingRequest extends StObject {
  
  /**
    * The ID of the banded range to delete.
    */
  var bandedRangeId: js.UndefOr[Double | Null] = js.undefined
}
object SchemaDeleteBandingRequest {
  
  inline def apply(): SchemaDeleteBandingRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeleteBandingRequest]
  }
  
  extension [Self <: SchemaDeleteBandingRequest](x: Self) {
    
    inline def setBandedRangeId(value: Double): Self = StObject.set(x, "bandedRangeId", value.asInstanceOf[js.Any])
    
    inline def setBandedRangeIdNull: Self = StObject.set(x, "bandedRangeId", null)
    
    inline def setBandedRangeIdUndefined: Self = StObject.set(x, "bandedRangeId", js.undefined)
  }
}
