package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies a contiguous range of text.
  */
trait SchemaRange extends StObject {
  
  /**
    * The zero-based end index of this range, exclusive, in UTF-16 code units.
    * In all current uses, an end index must be provided. This field is an
    * Int32Value in order to accommodate future use cases with open-ended
    * ranges.
    */
  var endIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * The ID of the header, footer or footnote that this range is contained in.
    * An empty segment ID signifies the document&#39;s body.
    */
  var segmentId: js.UndefOr[String] = js.undefined
  
  /**
    * The zero-based start index of this range, in UTF-16 code units.  In all
    * current uses, a start index must be provided. This field is an Int32Value
    * in order to accommodate future use cases with open-ended ranges.
    */
  var startIndex: js.UndefOr[Double] = js.undefined
}
object SchemaRange {
  
  @scala.inline
  def apply(): SchemaRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRange]
  }
  
  @scala.inline
  implicit class SchemaRangeMutableBuilder[Self <: SchemaRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndIndex(value: Double): Self = StObject.set(x, "endIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndIndexUndefined: Self = StObject.set(x, "endIndex", js.undefined)
    
    @scala.inline
    def setSegmentId(value: String): Self = StObject.set(x, "segmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentIdUndefined: Self = StObject.set(x, "segmentId", js.undefined)
    
    @scala.inline
    def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
  }
}
