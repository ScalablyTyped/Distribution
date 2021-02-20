package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Merges cells in a Table.
  */
@js.native
trait SchemaMergeTableCellsRequest extends StObject {
  
  /**
    * The object ID of the table.
    */
  var objectId: js.UndefOr[String] = js.native
  
  /**
    * The table range specifying which cells of the table to merge.  Any text
    * in the cells being merged will be concatenated and stored in the
    * upper-left (&quot;head&quot;) cell of the range. If the range is
    * non-rectangular (which can occur in some cases where the range covers
    * cells that are already merged), a 400 bad request error is returned.
    */
  var tableRange: js.UndefOr[SchemaTableRange] = js.native
}
object SchemaMergeTableCellsRequest {
  
  @scala.inline
  def apply(): SchemaMergeTableCellsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMergeTableCellsRequest]
  }
  
  @scala.inline
  implicit class SchemaMergeTableCellsRequestMutableBuilder[Self <: SchemaMergeTableCellsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    
    @scala.inline
    def setTableRange(value: SchemaTableRange): Self = StObject.set(x, "tableRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableRangeUndefined: Self = StObject.set(x, "tableRange", js.undefined)
  }
}
