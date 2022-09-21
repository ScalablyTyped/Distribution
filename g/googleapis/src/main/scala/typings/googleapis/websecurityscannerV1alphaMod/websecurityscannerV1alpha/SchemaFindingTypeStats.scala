package typings.googleapis.websecurityscannerV1alphaMod.websecurityscannerV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFindingTypeStats extends StObject {
  
  /**
    * The count of findings belonging to this finding type.
    */
  var findingCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The finding type associated with the stats.
    */
  var findingType: js.UndefOr[String | Null] = js.undefined
}
object SchemaFindingTypeStats {
  
  inline def apply(): SchemaFindingTypeStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFindingTypeStats]
  }
  
  extension [Self <: SchemaFindingTypeStats](x: Self) {
    
    inline def setFindingCount(value: Double): Self = StObject.set(x, "findingCount", value.asInstanceOf[js.Any])
    
    inline def setFindingCountNull: Self = StObject.set(x, "findingCount", null)
    
    inline def setFindingCountUndefined: Self = StObject.set(x, "findingCount", js.undefined)
    
    inline def setFindingType(value: String): Self = StObject.set(x, "findingType", value.asInstanceOf[js.Any])
    
    inline def setFindingTypeNull: Self = StObject.set(x, "findingType", null)
    
    inline def setFindingTypeUndefined: Self = StObject.set(x, "findingType", js.undefined)
  }
}
