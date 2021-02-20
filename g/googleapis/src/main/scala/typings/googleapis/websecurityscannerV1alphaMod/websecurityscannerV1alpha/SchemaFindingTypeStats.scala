package typings.googleapis.websecurityscannerV1alphaMod.websecurityscannerV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A FindingTypeStats resource represents stats regarding a specific
  * FindingType of Findings under a given ScanRun.
  */
@js.native
trait SchemaFindingTypeStats extends StObject {
  
  /**
    * Output only. The count of findings belonging to this finding type.
    */
  var findingCount: js.UndefOr[Double] = js.native
  
  /**
    * Output only. The finding type associated with the stats.
    */
  var findingType: js.UndefOr[String] = js.native
}
object SchemaFindingTypeStats {
  
  @scala.inline
  def apply(): SchemaFindingTypeStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFindingTypeStats]
  }
  
  @scala.inline
  implicit class SchemaFindingTypeStatsMutableBuilder[Self <: SchemaFindingTypeStats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFindingCount(value: Double): Self = StObject.set(x, "findingCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFindingCountUndefined: Self = StObject.set(x, "findingCount", js.undefined)
    
    @scala.inline
    def setFindingType(value: String): Self = StObject.set(x, "findingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFindingTypeUndefined: Self = StObject.set(x, "findingType", js.undefined)
  }
}
