package typings.googleapis.websecurityscannerV1alphaMod.websecurityscannerV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A FindingTypeStats resource represents stats regarding a specific
  * FindingType of Findings under a given ScanRun.
  */
trait SchemaFindingTypeStats extends StObject {
  
  /**
    * Output only. The count of findings belonging to this finding type.
    */
  var findingCount: js.UndefOr[Double] = js.undefined
  
  /**
    * Output only. The finding type associated with the stats.
    */
  var findingType: js.UndefOr[String] = js.undefined
}
object SchemaFindingTypeStats {
  
  inline def apply(): SchemaFindingTypeStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFindingTypeStats]
  }
  
  extension [Self <: SchemaFindingTypeStats](x: Self) {
    
    inline def setFindingCount(value: Double): Self = StObject.set(x, "findingCount", value.asInstanceOf[js.Any])
    
    inline def setFindingCountUndefined: Self = StObject.set(x, "findingCount", js.undefined)
    
    inline def setFindingType(value: String): Self = StObject.set(x, "findingType", value.asInstanceOf[js.Any])
    
    inline def setFindingTypeUndefined: Self = StObject.set(x, "findingType", js.undefined)
  }
}
