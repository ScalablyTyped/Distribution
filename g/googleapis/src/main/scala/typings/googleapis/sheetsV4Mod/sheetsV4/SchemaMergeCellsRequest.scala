package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Merges all cells in the range.
  */
@js.native
trait SchemaMergeCellsRequest extends StObject {
  
  /**
    * How the cells should be merged.
    */
  var mergeType: js.UndefOr[String] = js.native
  
  /**
    * The range of cells to merge.
    */
  var range: js.UndefOr[SchemaGridRange] = js.native
}
object SchemaMergeCellsRequest {
  
  @scala.inline
  def apply(): SchemaMergeCellsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMergeCellsRequest]
  }
  
  @scala.inline
  implicit class SchemaMergeCellsRequestMutableBuilder[Self <: SchemaMergeCellsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMergeType(value: String): Self = StObject.set(x, "mergeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergeTypeUndefined: Self = StObject.set(x, "mergeType", js.undefined)
    
    @scala.inline
    def setRange(value: SchemaGridRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
