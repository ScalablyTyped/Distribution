package typings.googleapis.websecurityscannerV1betaMod.websecurityscannerV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response for the `ListFindingTypeStats` method.
  */
trait SchemaListFindingTypeStatsResponse extends StObject {
  
  /**
    * The list of FindingTypeStats returned.
    */
  var findingTypeStats: js.UndefOr[js.Array[SchemaFindingTypeStats]] = js.undefined
}
object SchemaListFindingTypeStatsResponse {
  
  @scala.inline
  def apply(): SchemaListFindingTypeStatsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListFindingTypeStatsResponse]
  }
  
  @scala.inline
  implicit class SchemaListFindingTypeStatsResponseMutableBuilder[Self <: SchemaListFindingTypeStatsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFindingTypeStats(value: js.Array[SchemaFindingTypeStats]): Self = StObject.set(x, "findingTypeStats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFindingTypeStatsUndefined: Self = StObject.set(x, "findingTypeStats", js.undefined)
    
    @scala.inline
    def setFindingTypeStatsVarargs(value: SchemaFindingTypeStats*): Self = StObject.set(x, "findingTypeStats", js.Array(value :_*))
  }
}
