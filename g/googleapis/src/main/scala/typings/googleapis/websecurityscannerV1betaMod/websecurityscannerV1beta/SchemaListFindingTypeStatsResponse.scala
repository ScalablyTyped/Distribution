package typings.googleapis.websecurityscannerV1betaMod.websecurityscannerV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListFindingTypeStatsResponse extends StObject {
  
  /**
    * The list of FindingTypeStats returned.
    */
  var findingTypeStats: js.UndefOr[js.Array[SchemaFindingTypeStats]] = js.undefined
}
object SchemaListFindingTypeStatsResponse {
  
  inline def apply(): SchemaListFindingTypeStatsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListFindingTypeStatsResponse]
  }
  
  extension [Self <: SchemaListFindingTypeStatsResponse](x: Self) {
    
    inline def setFindingTypeStats(value: js.Array[SchemaFindingTypeStats]): Self = StObject.set(x, "findingTypeStats", value.asInstanceOf[js.Any])
    
    inline def setFindingTypeStatsUndefined: Self = StObject.set(x, "findingTypeStats", js.undefined)
    
    inline def setFindingTypeStatsVarargs(value: SchemaFindingTypeStats*): Self = StObject.set(x, "findingTypeStats", js.Array(value*))
  }
}
