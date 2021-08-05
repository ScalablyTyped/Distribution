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
  
  inline def apply(): SchemaUnmergeCellsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUnmergeCellsRequest]
  }
  
  extension [Self <: SchemaUnmergeCellsRequest](x: Self) {
    
    inline def setRange(value: SchemaGridRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
