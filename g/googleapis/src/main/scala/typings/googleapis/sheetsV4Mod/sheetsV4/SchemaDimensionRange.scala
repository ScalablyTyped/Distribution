package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A range along a single dimension on a sheet. All indexes are zero-based.
  * Indexes are half open: the start index is inclusive and the end index is
  * exclusive. Missing indexes indicate the range is unbounded on that side.
  */
trait SchemaDimensionRange extends StObject {
  
  /**
    * The dimension of the span.
    */
  var dimension: js.UndefOr[String] = js.undefined
  
  /**
    * The end (exclusive) of the span, or not set if unbounded.
    */
  var endIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * The sheet this span is on.
    */
  var sheetId: js.UndefOr[Double] = js.undefined
  
  /**
    * The start (inclusive) of the span, or not set if unbounded.
    */
  var startIndex: js.UndefOr[Double] = js.undefined
}
object SchemaDimensionRange {
  
  @scala.inline
  def apply(): SchemaDimensionRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDimensionRange]
  }
  
  @scala.inline
  implicit class SchemaDimensionRangeMutableBuilder[Self <: SchemaDimensionRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDimension(value: String): Self = StObject.set(x, "dimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionUndefined: Self = StObject.set(x, "dimension", js.undefined)
    
    @scala.inline
    def setEndIndex(value: Double): Self = StObject.set(x, "endIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndIndexUndefined: Self = StObject.set(x, "endIndex", js.undefined)
    
    @scala.inline
    def setSheetId(value: Double): Self = StObject.set(x, "sheetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSheetIdUndefined: Self = StObject.set(x, "sheetId", js.undefined)
    
    @scala.inline
    def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
  }
}
