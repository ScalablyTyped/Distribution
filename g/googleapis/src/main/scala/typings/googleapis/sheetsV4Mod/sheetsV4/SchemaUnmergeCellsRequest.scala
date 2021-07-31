package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Unmerges cells in the given range.
  */
trait SchemaUnmergeCellsRequest extends StObject {
  
  /**
    * The range within which all cells should be unmerged. If the range spans
    * multiple merges, all will be unmerged. The range must not partially span
    * any merge.
    */
  var range: js.UndefOr[SchemaGridRange] = js.undefined
}
object SchemaUnmergeCellsRequest {
  
  @scala.inline
  def apply(): SchemaUnmergeCellsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUnmergeCellsRequest]
  }
  
  @scala.inline
  implicit class SchemaUnmergeCellsRequestMutableBuilder[Self <: SchemaUnmergeCellsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRange(value: SchemaGridRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
